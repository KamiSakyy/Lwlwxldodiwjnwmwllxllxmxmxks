package com.kamisakyy.noxchat;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.OpenableColumns;
import android.util.Base64;

import org.json.JSONObject;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * One two-device room: Firebase REST/SSE signaling and a reliable WebRTC DataChannel.
 * All room/signaling decisions are serialized on actorThread; large file I/O is off-thread.
 */
final class ChatSession {
    static final long MAX_FILE_BYTES = 150L * 1024L * 1024L;
    private static final int CHUNK_BYTES = 8 * 1024;
    private static final long BUFFERED_AMOUNT_LIMIT = 512L * 1024L;
    private static final long HEARTBEAT_MS = 25_000L;
    private static final long MEMBER_TTL_MS = 90_000L;

    interface Listener {
        default void onState(String state, String detail) { }
        default void onParticipants(int activeCount, String peerName) { }
        default void onHistory(List<ChatMessage> messages) { }
        default void onMessage(ChatMessage message) { }
        default void onError(String message) { }
    }

    private static PeerConnectionFactory sharedFactory;
    private static boolean factoryInitialized;

    private final Context context;
    private final String roomCode;
    private final String displayName;
    private final Handler main = new Handler(android.os.Looper.getMainLooper());
    private final HandlerThread actorThread = new HandlerThread("nox-room-actor");
    private final ExecutorService network = Executors.newSingleThreadExecutor(r -> new Thread(r, "nox-rtdb-rest"));
    private final ExecutorService outgoingFiles = Executors.newFixedThreadPool(3, r -> new Thread(r, "nox-file-send"));
    private final ExecutorService incomingFiles = Executors.newSingleThreadExecutor(r -> new Thread(r, "nox-file-receive"));
    private final CopyOnWriteArrayList<Listener> listeners = new CopyOnWriteArrayList<>();
    private final Map<String, Member> members = new ConcurrentHashMap<>();
    private final Map<String, IncomingTransfer> incomingTransfers = new ConcurrentHashMap<>();
    private final Map<String, OutgoingTransfer> outgoingTransfers = new ConcurrentHashMap<>();
    private final Map<String, ResumeRequest> resumeRequests = new ConcurrentHashMap<>();
    private final Map<String, String> pendingTransferControls = new ConcurrentHashMap<>();
    private final ArrayList<IceCandidate> pendingRemoteCandidates = new ArrayList<>();
    private final Map<String, ArrayList<IceCandidate>> pendingRemoteByEpoch = new HashMap<>();
    private final ArrayList<IceCandidate> pendingLocalCandidates = new ArrayList<>();
    private final MessageStore messageStore;
    private final SignalCrypto signalCrypto;
    private final FirebaseAuthClient auth;
    private final FirebaseRealtimeDatabase database;

    private Handler actor;
    private FirebaseRestStream memberStream;
    private FirebaseRestStream signalStream;
    private volatile String uid;
    private volatile String remoteUid;
    private String remoteName = "";
    private String peerEpoch;
    private PeerConnection peerConnection;
    private volatile DataChannel dataChannel;
    private boolean localDescriptionPublished;
    private boolean remoteDescriptionSet;
    private volatile boolean closed;
    private volatile boolean signalSessionReady;
    private boolean signalHandshakeSent;
    private boolean connected;
    private boolean reconnectQueued;
    private int joinRetryCount;

    private final Runnable heartbeat = new Runnable() {
        @Override public void run() {
            if (closed || uid == null) return;
            publishPresence();
            actor.postDelayed(this, HEARTBEAT_MS);
        }
    };

    ChatSession(Context context, String roomCode, String displayName) {
        this.context = context.getApplicationContext();
        this.roomCode = roomCode;
        this.displayName = cleanDisplayName(displayName);
        this.auth = new FirebaseAuthClient(this.context);
        this.database = new FirebaseRealtimeDatabase(auth);
        this.messageStore = new MessageStore(this.context, roomCode);
        SignalCrypto crypto = null;
        try { crypto = new SignalCrypto(this.context); }
        catch (RuntimeException ex) { emitError("Не удалось безопасно инициализировать Signal Protocol: " + friendly(ex)); }
        this.signalCrypto = crypto;
        actorThread.start();
        actor = new Handler(actorThread.getLooper());
        if (signalCrypto == null) {
            notifyState("error", "Signal Protocol недоступен · безопасное соединение не установлено");
            return;
        }
        initializeFactory(this.context);
        notifyState("signing_in", "Подключаемся к Firebase…");
        actor.post(this::signInAndJoin);
    }

    String roomCode() { return roomCode; }

    void addListener(Listener listener) {
        if (listener == null) return;
        listeners.addIfAbsent(listener);
        main.post(() -> {
            if (!listeners.contains(listener)) return;
            listener.onHistory(messageStore.all());
            listener.onState(currentState, currentDetail);
            listener.onParticipants(lastActiveCount, remoteName);
        });
    }

    void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    void sendText(String value) {
        String text = value == null ? "" : value.trim();
        if (text.isEmpty()) return;
        if (text.length() > 4_000) {
            emitError("Сообщение слишком длинное (максимум 4000 символов).");
            return;
        }
        actor.post(() -> {
            if (!isChannelOpen()) {
                emitError("Собеседник ещё не подключён. Сообщение не отправлено.");
                return;
            }
            if (!signalSessionReady) {
                emitError("Проверяем Signal-шифрование собеседника. Попробуйте отправить сообщение через секунду.");
                return;
            }
            if (!isSecureConversationVerified()) {
                emitError("Сначала сверьте отпечаток в строке состояния и дождитесь подтверждения собеседника.");
                return;
            }
            String id = UUID.randomUUID().toString();
            long now = System.currentTimeMillis();
            JSONObject packet = new JSONObject();
            try {
                packet.put("t", "text");
                packet.put("id", id);
                packet.put("text", text);
                packet.put("time", now);
            } catch (Exception ignored) { }
            if (!sendPacket(dataChannel, packet)) {
                emitError("Не удалось передать сообщение. Проверьте соединение.");
                return;
            }
            ChatMessage message = new ChatMessage(id, text, ChatMessage.TEXT, "", "text/plain",
                    "", true, now, 0, ChatMessage.SENDING);
            messageStore.add(message);
            emitMessage(message);
        });
    }

    void sendAttachment(Uri source, String forcedKind) {
        if (source == null) return;
        actor.post(() -> {
            if (!isChannelOpen()) {
                emitError("Сначала дождитесь подключения собеседника, затем отправьте файл.");
                return;
            }
            if (!signalSessionReady) {
                emitError("Проверяем Signal-шифрование собеседника. Попробуйте отправить файл через секунду.");
                return;
            }
            if (!isSecureConversationVerified()) {
                emitError("Перед отправкой файла сверите отпечатки в строке состояния и дождитесь подтверждения собеседника.");
                return;
            }
            try {
                outgoingFiles.execute(() -> prepareAndSendFile(source, forcedKind));
            } catch (java.util.concurrent.RejectedExecutionException ignored) {
                emitError("Комната уже отключена.");
            }
        });
    }

    void pauseTransfer(String id) {
        if (id == null || id.isEmpty()) return;
        OutgoingTransfer outgoing = outgoingTransfers.get(id);
        if (outgoing != null) {
            synchronized (outgoing) {
                outgoing.paused = true;
                outgoing.notifyAll();
            }
            setTransferStatus(outgoing.message, ChatMessage.PAUSED);
            sendTransferControl("pause", id);
            return;
        }
        IncomingTransfer incoming = incomingTransfers.get(id);
        if (incoming != null) {
            incoming.message.status = ChatMessage.PAUSED;
            messageStore.update(incoming.message);
            emitMessage(incoming.message);
            sendTransferControl("pause", id);
        }
    }

    void resumeTransfer(String id) {
        if (id == null || id.isEmpty()) return;
        IncomingTransfer incoming = incomingTransfers.get(id);
        if (incoming == null) incoming = restoreIncomingTransfer(id);
        if (incoming != null) {
            incoming.message.status = ChatMessage.RECEIVING;
            messageStore.update(incoming.message);
            emitMessage(incoming.message);
            sendTransferControl("resume", id);
            return;
        }
        OutgoingTransfer outgoing = outgoingTransfers.get(id);
        if (outgoing == null) outgoing = restoreOutgoingTransfer(id);
        if (outgoing != null) resumeOutgoingTransfer(outgoing);
    }

    boolean canSendUserContent() {
        return !closed && isChannelOpen() && isSecureConversationVerified();
    }

    boolean canControlTransfer(ChatMessage message) {
        if (message == null || !message.isAttachment()) return false;
        if (message.status == ChatMessage.PAUSED) return true;
        if (message.outgoing) {
            OutgoingTransfer transfer = outgoingTransfers.get(message.id);
            return transfer != null && !transfer.completed;
        }
        return incomingTransfers.containsKey(message.id) && message.status == ChatMessage.RECEIVING;
    }

    void close(boolean removePresence) {
        actor.post(() -> closeOnActor(removePresence));
    }

    private OutgoingTransfer restoreOutgoingTransfer(String id) {
        for (ChatMessage message : messageStore.all()) {
            if (!id.equals(message.id) || !message.outgoing || !message.isAttachment()
                    || (message.status != ChatMessage.PAUSED && message.status != ChatMessage.SENDING)) continue;
            File file = new File(message.attachmentUri);
            byte[] fileKey = signalCrypto.loadTransferKey(id);
            if (!file.isFile() || file.length() != message.sizeBytes || fileKey == null) return null;
            OutgoingTransfer restored = new OutgoingTransfer(file, message, fileKey);
            OutgoingTransfer existing = outgoingTransfers.putIfAbsent(id, restored);
            return existing == null ? restored : existing;
        }
        return null;
    }

    private IncomingTransfer restoreIncomingTransfer(String id) {
        IncomingTransfer existing = incomingTransfers.get(id);
        if (existing != null) return existing;
        for (ChatMessage message : messageStore.all()) {
            if (!id.equals(message.id) || message.outgoing || !message.isAttachment()
                    || (message.status != ChatMessage.PAUSED && message.status != ChatMessage.RECEIVING)) continue;
            File file = new File(message.attachmentUri);
            byte[] fileKey = signalCrypto.loadTransferKey(id);
            if (!file.isFile() || file.length() > message.sizeBytes || fileKey == null) return null;
            try {
                long onDisk = file.length();
                int nextChunk;
                long received;
                if (onDisk == message.sizeBytes) {
                    received = onDisk;
                    nextChunk = (int) ((received + CHUNK_BYTES - 1) / CHUNK_BYTES);
                } else {
                    nextChunk = (int) (onDisk / CHUNK_BYTES);
                    received = (long) nextChunk * CHUNK_BYTES;
                    if (received != onDisk) {
                        try (java.io.RandomAccessFile partial = new java.io.RandomAccessFile(file, "rw")) {
                            partial.setLength(received);
                        }
                    }
                }
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(file, true), CHUNK_BYTES);
                IncomingTransfer restored = new IncomingTransfer(file, stream, message.sizeBytes, message, fileKey);
                restored.received = received;
                restored.nextChunk = nextChunk;
                restored.message.status = ChatMessage.PAUSED;
                messageStore.update(restored.message);
                IncomingTransfer raced = incomingTransfers.putIfAbsent(id, restored);
                if (raced != null) {
                    try { stream.close(); } catch (Exception ignored) { }
                    return raced;
                }
                return restored;
            } catch (Exception ex) {
                emitError("Не удалось восстановить файл: " + friendly(ex));
                return null;
            }
        }
        return null;
    }

    private void resumeOutgoingTransfer(OutgoingTransfer transfer) {
        synchronized (transfer) {
            transfer.paused = false;
            transfer.notifyAll();
            if (transfer.running) {
                setTransferStatus(transfer.message, ChatMessage.SENDING);
                return;
            }
            transfer.running = true;
        }
        setTransferStatus(transfer.message, ChatMessage.SENDING);
        try {
            outgoingFiles.execute(() -> transmitTransfer(transfer));
        } catch (java.util.concurrent.RejectedExecutionException ex) {
            synchronized (transfer) { transfer.running = false; transfer.paused = true; }
            setTransferStatus(transfer.message, ChatMessage.PAUSED);
        }
    }

    private void setTransferStatus(ChatMessage message, int status) {
        message.status = status;
        messageStore.update(message);
        emitMessage(message);
    }

    private void sendTransferControl(String type, String id) {
        actor.post(() -> {
            if (!isChannelOpen()) {
                pendingTransferControls.put(id, type);
                return;
            }
            JSONObject packet = new JSONObject();
            put(packet, "t", type);
            put(packet, "id", id);
            if (!sendPacket(dataChannel, packet)) pendingTransferControls.put(id, type);
        });
    }

    private void flushPendingTransferControls() {
        if (!isChannelOpen()) return;
        for (Map.Entry<String, String> entry : pendingTransferControls.entrySet()) {
            JSONObject packet = new JSONObject();
            put(packet, "t", entry.getValue());
            put(packet, "id", entry.getKey());
            if (sendPacket(dataChannel, packet)) pendingTransferControls.remove(entry.getKey(), entry.getValue());
        }
    }

    private void handleRemoteTransferControl(String type, String id) {
        if (id == null || id.isEmpty()) return;
        if ("pause".equals(type)) {
            OutgoingTransfer transfer = outgoingTransfers.get(id);
            if (transfer == null) transfer = restoreOutgoingTransfer(id);
            if (transfer != null) {
                synchronized (transfer) {
                    transfer.paused = true;
                    transfer.notifyAll();
                }
                setTransferStatus(transfer.message, ChatMessage.PAUSED);
                return;
            }
            IncomingTransfer incoming = incomingTransfers.get(id);
            if (incoming != null) {
                incoming.message.status = ChatMessage.PAUSED;
                messageStore.update(incoming.message);
                emitMessage(incoming.message);
            }
        } else if ("resume".equals(type)) {
            OutgoingTransfer transfer = outgoingTransfers.get(id);
            if (transfer == null) transfer = restoreOutgoingTransfer(id);
            if (transfer != null) {
                resumeOutgoingTransfer(transfer);
                return;
            }
            IncomingTransfer incoming = incomingTransfers.get(id);
            if (incoming != null) {
                incoming.message.status = ChatMessage.RECEIVING;
                messageStore.update(incoming.message);
                emitMessage(incoming.message);
            }
        }
    }

    private void signInAndJoin() {
        network.execute(() -> {
            try {
                FirebaseAuthClient.User user = auth.authenticate();
                JSONObject presence = presenceValue();
                database.put(roomPath("members/" + user.uid), presence);
                actor.post(() -> {
                    if (closed) return;
                    uid = user.uid;
                    joinRetryCount = 0;
                    startStreams();
                    actor.removeCallbacks(heartbeat);
                    actor.postDelayed(heartbeat, HEARTBEAT_MS);
                    notifyState("waiting", "Комната готова · ожидаем собеседника");
                });
            } catch (Exception ex) {
                actor.post(() -> {
                    if (closed) return;
                    int attempt = Math.min(joinRetryCount++, 5);
                    long delay = Math.min(30_000L, 1_000L << attempt);
                    notifyState("reconnecting", "Firebase недоступен · повтор через " + (delay / 1000) + " с: " + friendly(ex));
                    actor.postDelayed(() -> {
                        if (!closed && uid == null) signInAndJoin();
                    }, delay);
                });
            }
        });
    }

    private void startStreams() {
        memberStream = new FirebaseRestStream(database, roomPath("members"), new FirebaseRestStream.Listener() {
            @Override public void onEvent(String event, String data) {
                actor.post(() -> handleMembersEvent(event, data));
            }
            @Override public void onStreamError(String message) {
                actor.post(() -> {
                    if (!closed && !connected) notifyState("waiting", "Переподключаем сигналинг…");
                });
            }
        });
        signalStream = new FirebaseRestStream(database, roomPath("signals/" + uid), new FirebaseRestStream.Listener() {
            @Override public void onEvent(String event, String data) {
                actor.post(() -> handleSignalsEvent(event, data));
            }
            @Override public void onStreamError(String message) {
                actor.post(() -> {
                    if (!closed && !connected) notifyState("reconnecting", "Восстанавливаем канал сигналинга…");
                });
            }
        });
        memberStream.start();
        signalStream.start();
    }

    private void publishPresence() {
        if (closed || uid == null) return;
        network.execute(() -> {
            try {
                database.put(roomPath("members/" + uid), presenceValue());
            } catch (Exception ex) {
                actor.post(() -> {
                    if (!closed && !connected) notifyState("reconnecting", "Нет связи с Firebase · повторяем подключение");
                });
            }
        });
    }

    private JSONObject presenceValue() {
        JSONObject value = new JSONObject();
        JSONObject serverTimestamp = new JSONObject();
        try {
            serverTimestamp.put(".sv", "timestamp");
            value.put("name", displayName);
            value.put("lastSeen", serverTimestamp);
            value.put("signal", signalCrypto.publicBundle());
        } catch (Exception ignored) { }
        return value;
    }

    private void handleMembersEvent(String event, String raw) {
        if (closed) return;
        if ("cancel".equals(event) || "auth_revoked".equals(event)) {
            notifyState("reconnecting", "Обновляем подключение Firebase…");
            return;
        }
        try {
            JSONObject envelope = new JSONObject(raw);
            String path = envelope.optString("path", "/");
            Object data = envelope.opt("data");
            if (data == JSONObject.NULL) data = null;
            if ("/".equals(path)) {
                members.clear();
                if (data instanceof JSONObject) {
                    JSONObject all = (JSONObject) data;
                    java.util.Iterator<String> keys = all.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        Member member = parseMember(all.optJSONObject(key));
                        if (member != null) members.put(key, member);
                    }
                }
            } else {
                String relative = path.startsWith("/") ? path.substring(1) : path;
                String[] parts = relative.split("/");
                if (parts.length == 1) {
                    if (data == null) members.remove(parts[0]);
                    else {
                        Member member = parseMember(data instanceof JSONObject ? (JSONObject) data : null);
                        if (member != null) members.put(parts[0], member);
                    }
                } else {
                    Member member = members.get(parts[0]);
                    if (member != null && parts.length == 2 && "name".equals(parts[1])) {
                        member.name = String.valueOf(data);
                    } else if (member != null && parts.length == 2 && "lastSeen".equals(parts[1])) {
                        member.lastSeen = asLong(data);
                    }
                }
            }
            reconcileMembers();
        } catch (Exception ex) {
            // A malformed server event is ignored; the stream's next full snapshot repairs state.
        }
    }

    private Member parseMember(JSONObject object) {
        if (object == null) return null;
        return new Member(object.optString("name", "Собеседник"), object.optLong("lastSeen", 0L),
                object.optJSONObject("signal"));
    }

    private long asLong(Object value) {
        if (value instanceof Number) return ((Number) value).longValue();
        try { return Long.parseLong(String.valueOf(value)); } catch (Exception ignored) { return 0L; }
    }

    private void reconcileMembers() {
        long now = System.currentTimeMillis();
        ArrayList<String> active = new ArrayList<>();
        for (Map.Entry<String, Member> entry : members.entrySet()) {
            Member member = entry.getValue();
            if (member.lastSeen > 0 && now - member.lastSeen <= MEMBER_TTL_MS) {
                active.add(entry.getKey());
            } else if (!entry.getKey().equals(uid) && member.lastSeen > 0) {
                String staleUid = entry.getKey();
                network.execute(() -> {
                    try { database.delete(roomPath("members/" + staleUid)); } catch (Exception ignored) { }
                });
            }
        }
        Collections.sort(active);
        String nextRemote = null;
        for (String candidate : active) {
            if (!candidate.equals(uid)) { nextRemote = candidate; break; }
        }
        lastActiveCount = active.size();
        if (nextRemote == null) {
            remoteName = "";
            emitParticipants(active.size(), "");
            if (remoteUid != null) {
                remoteUid = null;
                resetPeer();
            }
            if (!connected) notifyState("waiting", "Комната готова · ожидаем собеседника");
            return;
        }

        Member selected = members.get(nextRemote);
        remoteName = selected == null ? "Собеседник" : selected.name;
        emitParticipants(active.size(), remoteName);
        if (!nextRemote.equals(remoteUid)) {
            remoteUid = nextRemote;
            resetPeer();
        }
        if (uid != null && uid.compareTo(remoteUid) < 0 && peerConnection == null) {
            createOffer(false);
        } else if (!connected) {
            notifyState("connecting", "Собеседник найден · устанавливаем P2P-связь");
        }
        if (isChannelOpen()) startSignalHandshake();
    }

    private int lastActiveCount;
    private String currentState = "signing_in";
    private String currentDetail = "Подключаемся к Firebase…";

    private void handleSignalsEvent(String event, String raw) {
        if (closed) return;
        if ("cancel".equals(event) || "auth_revoked".equals(event)) return;
        try {
            JSONObject envelope = new JSONObject(raw);
            String path = envelope.optString("path", "/");
            Object data = envelope.opt("data");
            if (data == JSONObject.NULL || data == null) return;
            if ("/".equals(path) && data instanceof JSONObject) {
                JSONObject items = (JSONObject) data;
                java.util.Iterator<String> keys = items.keys();
                while (keys.hasNext()) {
                    String id = keys.next();
                    handleSignalItem(id, items.optJSONObject(id));
                }
            } else {
                String relative = path.startsWith("/") ? path.substring(1) : path;
                String[] parts = relative.split("/");
                if (parts.length > 0 && data instanceof JSONObject) handleSignalItem(parts[0], (JSONObject) data);
            }
        } catch (Exception ignored) { }
    }

    private void handleSignalItem(String signalId, JSONObject signal) {
        if (signal == null || uid == null) return;
        String from = signal.optString("from", "");
        String type = signal.optString("type", "");
        String epoch = signal.optString("epoch", "");
        String signalPath = roomPath("signals/" + uid + "/" + signalId);
        if (from.isEmpty() || from.equals(uid) || epoch.isEmpty()) {
            deleteSignal(signalPath);
            return;
        }
        if (remoteUid != null && !remoteUid.equals(from)) {
            deleteSignal(signalPath);
            return;
        }
        if (remoteUid == null) remoteUid = from;
        if ("offer".equals(type)) {
            receiveOffer(from, epoch, signal.optString("sdp", ""));
        } else if ("answer".equals(type)) {
            receiveAnswer(from, epoch, signal.optString("sdp", ""));
        } else if ("candidate".equals(type)) {
            receiveCandidate(from, epoch, signal);
        }
        deleteSignal(signalPath);
    }

    private void receiveOffer(String from, String epoch, String sdp) {
        if (sdp.isEmpty()) return;
        if (!epoch.equals(peerEpoch)) {
            remoteUid = from;
            ArrayList<IceCandidate> earlyCandidates = pendingRemoteByEpoch.remove(epoch);
            resetPeer();
            if (earlyCandidates != null) pendingRemoteCandidates.addAll(earlyCandidates);
            peerEpoch = epoch;
            createPeer(false, epoch);
        }
        if (peerConnection == null || remoteDescriptionSet) return;
        notifyState("connecting", "Получено приглашение · настраиваем P2P-канал");
        SessionDescription description = new SessionDescription(SessionDescription.Type.OFFER, sdp);
        PeerConnection current = peerConnection;
        current.setRemoteDescription(new SimpleSdpObserver() {
            @Override public void onSetSuccess() {
                actor.post(() -> {
                    if (closed || peerConnection != current) return;
                    remoteDescriptionSet = true;
                    drainRemoteCandidates();
                    createAnswer(current, epoch);
                });
            }
            @Override public void onSetFailure(String error) {
                actor.post(() -> emitError("Не удалось принять SDP offer: " + error));
            }
        }, description);
    }

    private void receiveAnswer(String from, String epoch, String sdp) {
        if (peerConnection == null || !epoch.equals(peerEpoch) || sdp.isEmpty()) return;
        PeerConnection current = peerConnection;
        SessionDescription description = new SessionDescription(SessionDescription.Type.ANSWER, sdp);
        current.setRemoteDescription(new SimpleSdpObserver() {
            @Override public void onSetSuccess() {
                actor.post(() -> {
                    if (peerConnection != current) return;
                    remoteDescriptionSet = true;
                    drainRemoteCandidates();
                });
            }
            @Override public void onSetFailure(String error) {
                actor.post(() -> emitError("Не удалось принять SDP answer: " + error));
            }
        }, description);
    }

    private void receiveCandidate(String from, String epoch, JSONObject signal) {
        String mid = signal.optString("mid", "0");
        int line = signal.optInt("line", 0);
        String candidateText = signal.optString("candidate", "");
        if (candidateText.isEmpty()) return;
        IceCandidate candidate = new IceCandidate(mid, line, candidateText);
        if (!epoch.equals(peerEpoch)) {
            if (peerEpoch == null) {
                ArrayList<IceCandidate> early = pendingRemoteByEpoch.get(epoch);
                if (early == null) {
                    early = new ArrayList<>();
                    pendingRemoteByEpoch.put(epoch, early);
                }
                if (early.size() < 128) early.add(candidate);
            }
            return;
        }
        if (peerConnection == null || !remoteDescriptionSet) {
            if (pendingRemoteCandidates.size() < 128) pendingRemoteCandidates.add(candidate);
            return;
        }
        peerConnection.addIceCandidate(candidate);
    }

    private void createOffer(boolean restart) {
        if (closed || uid == null || remoteUid == null || !uid.equals(minUid(uid, remoteUid))) return;
        if (restart) notifyState("reconnecting", "Перезапускаем WebRTC-соединение…");
        resetPeer();
        String epoch = UUID.randomUUID().toString();
        peerEpoch = epoch;
        createPeer(true, epoch);
        PeerConnection current = peerConnection;
        if (current == null) return;
        current.createOffer(new SimpleSdpObserver() {
            @Override public void onCreateSuccess(SessionDescription description) {
                actor.post(() -> {
                    if (closed || peerConnection != current || !epoch.equals(peerEpoch)) return;
                    current.setLocalDescription(new SimpleSdpObserver() {
                        @Override public void onSetSuccess() {
                            actor.post(() -> {
                                if (peerConnection != current || !epoch.equals(peerEpoch)) return;
                                localDescriptionPublished = true;
                                publishSignal(remoteUid, signalWith("offer", epoch, "sdp", description.description));
                                flushLocalCandidates();
                            });
                        }
                        @Override public void onSetFailure(String error) {
                            actor.post(() -> emitError("Не удалось подготовить P2P offer: " + error));
                        }
                    }, description);
                });
            }
            @Override public void onCreateFailure(String error) {
                actor.post(() -> emitError("Не удалось создать P2P offer: " + error));
            }
        }, new MediaConstraints());
    }

    private void createAnswer(PeerConnection current, String epoch) {
        current.createAnswer(new SimpleSdpObserver() {
            @Override public void onCreateSuccess(SessionDescription description) {
                actor.post(() -> {
                    if (closed || peerConnection != current || !epoch.equals(peerEpoch)) return;
                    current.setLocalDescription(new SimpleSdpObserver() {
                        @Override public void onSetSuccess() {
                            actor.post(() -> {
                                if (peerConnection != current || !epoch.equals(peerEpoch)) return;
                                localDescriptionPublished = true;
                                publishSignal(remoteUid, signalWith("answer", epoch, "sdp", description.description));
                                flushLocalCandidates();
                            });
                        }
                        @Override public void onSetFailure(String error) {
                            actor.post(() -> emitError("Не удалось подготовить P2P answer: " + error));
                        }
                    }, description);
                });
            }
            @Override public void onCreateFailure(String error) {
                actor.post(() -> emitError("Не удалось создать P2P answer: " + error));
            }
        }, new MediaConstraints());
    }

    private void createPeer(boolean offerer, String epoch) {
        if (peerConnection != null) return;
        peerEpoch = epoch;
        localDescriptionPublished = false;
        remoteDescriptionSet = false;
        pendingLocalCandidates.clear();
        PeerConnection.RTCConfiguration configuration =
                new PeerConnection.RTCConfiguration(IceServerConfig.create());
        configuration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        configuration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        configuration.iceTransportsType = PeerConnection.IceTransportsType.ALL;
        try {
            PeerConnection created = sharedFactory.createPeerConnection(configuration, new PeerObserver(epoch));
            peerConnection = created;
            if (created == null) {
                notifyState("error", "WebRTC не смог создать соединение.");
                return;
            }
            if (offerer) {
                DataChannel.Init options = new DataChannel.Init();
                options.ordered = true;
                DataChannel channel = created.createDataChannel("nox-chat-v1", options);
                attachDataChannel(channel, epoch);
            }
            if (!pendingRemoteCandidates.isEmpty()) drainRemoteCandidates();
        } catch (Exception ex) {
            notifyState("error", "Ошибка инициализации WebRTC: " + friendly(ex));
        }
    }

    private void drainRemoteCandidates() {
        if (peerConnection == null || !remoteDescriptionSet) return;
        ArrayList<IceCandidate> copy = new ArrayList<>(pendingRemoteCandidates);
        pendingRemoteCandidates.clear();
        for (IceCandidate candidate : copy) peerConnection.addIceCandidate(candidate);
    }

    private void onLocalCandidate(String epoch, IceCandidate candidate) {
        if (closed || !epoch.equals(peerEpoch) || remoteUid == null) return;
        if (!localDescriptionPublished) {
            if (pendingLocalCandidates.size() < 128) pendingLocalCandidates.add(candidate);
            return;
        }
        publishCandidate(epoch, candidate);
    }

    private void flushLocalCandidates() {
        if (!localDescriptionPublished || remoteUid == null) return;
        ArrayList<IceCandidate> copy = new ArrayList<>(pendingLocalCandidates);
        pendingLocalCandidates.clear();
        for (IceCandidate candidate : copy) publishCandidate(peerEpoch, candidate);
    }

    private void publishCandidate(String epoch, IceCandidate candidate) {
JSONObject value = signalWith("candidate", epoch, "mid", candidate.sdpMid);
        put(value, "line", candidate.sdpMLineIndex);
        put(value, "candidate", candidate.sdp);
        publishSignal(remoteUid, value);
    }

    private JSONObject signal(String type, String epoch) {
        JSONObject value = new JSONObject();
        try {
            value.put("from", uid);
            value.put("type", type);
            value.put("epoch", epoch);
            value.put("createdAt", System.currentTimeMillis());
        } catch (Exception ignored) { }
        return value;
    }

    private JSONObject signalWith(String type, String epoch, String key, Object value) {
        JSONObject signal = signal(type, epoch);
        put(signal, key, value);
        return signal;
    }

    private static void put(JSONObject object, String key, Object value) {
        try { object.put(key, value); } catch (Exception ignored) { }
    }

    private void publishSignal(String targetUid, JSONObject value) {
        if (targetUid == null || targetUid.isEmpty() || uid == null) return;
        String id = UUID.randomUUID().toString().replace("-", "");
        network.execute(() -> {
            Exception lastFailure = null;
            for (int attempt = 0; attempt < 3; attempt++) {
                try {
                    database.put(roomPath("signals/" + targetUid + "/" + id), value);
                    return;
                } catch (Exception ex) {
                    lastFailure = ex;
                    if (attempt < 2) {
                        try { Thread.sleep(350L * (attempt + 1)); }
                        catch (InterruptedException interrupted) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }
                }
            }
            String reason = lastFailure == null ? "ошибка сети" : friendly(lastFailure);
            actor.post(() -> {
                if (!closed) notifyState("reconnecting", "Сигналинг не отправлен · повторите соединение: " + reason);
            });
        });
    }

    private void deleteSignal(String path) {
        network.execute(() -> {
            try { database.delete(path); } catch (Exception ignored) { }
        });
    }

    private void attachDataChannel(DataChannel channel, String epoch) {
        if (channel == null) return;
        if (dataChannel != null && dataChannel != channel) {
            try { dataChannel.unregisterObserver(); dataChannel.close(); dataChannel.dispose(); } catch (Exception ignored) { }
        }
        dataChannel = channel;
        channel.registerObserver(new DataChannel.Observer() {
            @Override public void onBufferedAmountChange(long previousAmount) { }
            @Override public void onStateChange() {
                actor.post(() -> {
                    if (closed || !epoch.equals(peerEpoch) || dataChannel != channel) return;
                    if (channel.state() == DataChannel.State.OPEN) {
                        connected = true;
                        reconnectQueued = false;
                        notifyState("connecting", "P2P-канал активен · проверяем сквозное Signal-шифрование");
                        startSignalHandshake();
                        flushPendingTransferControls();
                    } else if (channel.state() == DataChannel.State.CLOSED) {
                        connected = false;
                        notifyState("reconnecting", "Канал закрыт · ожидаем восстановления");
                        scheduleReconnect();
                    }
                });
            }
            @Override public void onMessage(DataChannel.Buffer buffer) {
                if (buffer == null || buffer.data == null) return;
                ByteBuffer bytes = buffer.data;
                if (bytes.remaining() > CHUNK_BYTES * 4) {
                    actor.post(() -> emitError("Получен чрезмерно большой пакет, он отброшен."));
                    return;
                }
                byte[] copy = new byte[bytes.remaining()];
                bytes.get(copy);
                String packet = new String(copy, StandardCharsets.UTF_8);
                if (buffer.binary) {
                    actor.post(() -> emitError("Получен неподдерживаемый формат вложения."));
                    return;
                }
                receivePacket(packet);
            }
        });
        if (channel.state() == DataChannel.State.OPEN) {
            connected = true;
            notifyState("connecting", "P2P-канал активен · проверяем сквозное Signal-шифрование");
            startSignalHandshake();
            flushPendingTransferControls();
        }
    }

    private void startSignalHandshake() {
        if (closed || signalCrypto == null || !isChannelOpen() || uid == null || remoteUid == null
                || signalHandshakeSent || uid.compareTo(remoteUid) > 0) return;
        Member peer = members.get(remoteUid);
        if (peer == null || peer.signalBundle == null) {
            notifyState("error", "У собеседника нет Signal Protocol · обновите приложение на обоих устройствах");
            return;
        }
        try {
            signalCrypto.establishOutbound(uid, remoteUid, peer.signalBundle);
            JSONObject hello = new JSONObject();
            put(hello, "t", "secure_hello");
            put(hello, "protocol", "libsignal-pqxdh-v1");
            put(hello, "nonce", UUID.randomUUID().toString());
            if (!sendPacket(dataChannel, hello)) {
                notifyState("error", "Не удалось начать Signal-шифрование · проверьте подключение");
                return;
            }
            signalHandshakeSent = true;
            notifyState("connecting", "Signal PQXDH · ждём подтверждения собеседника");
        } catch (Exception ex) {
            signalSessionReady = false;
            notifyState("error", "Signal-шифрование не установлено · соединение заблокировано");
            emitError("Не удалось установить Signal Protocol: " + friendly(ex));
        }
    }

    String remoteFingerprintForVerification() {
        if (signalCrypto == null || remoteUid == null) return "";
        Member peer = members.get(remoteUid);
        String advertised = peer == null ? "" : signalCrypto.advertisedFingerprint(peer.signalBundle);
        if (!advertised.isEmpty()) return advertised;
        return signalCrypto.trustedRemoteFingerprint(uid, remoteUid);
    }

    boolean markRemoteFingerprintVerified() {
        if (signalCrypto == null || !signalSessionReady || uid == null || remoteUid == null) return false;
        Member peer = members.get(remoteUid);
        String advertised = peer == null ? "" : signalCrypto.advertisedFingerprint(peer.signalBundle);
        String trusted = signalCrypto.trustedRemoteFingerprint(uid, remoteUid);
        if (advertised.isEmpty() || !advertised.equals(trusted)
                || !signalCrypto.markRemoteFingerprintVerified(uid, remoteUid, advertised)) return false;
        actor.post(() -> {
            if (closed) return;
            sendVerificationProof();
            updateVerificationState();
            if (isSecureConversationVerified()) flushPendingTransferControls();
        });
        return true;
    }

    private boolean isSecureConversationVerified() {
        return signalSessionReady && signalCrypto != null && uid != null && remoteUid != null
                && signalCrypto.isRemoteFingerprintVerified(uid, remoteUid)
                && signalCrypto.hasRemoteVerifiedLocalFingerprint(uid, remoteUid);
    }

    private void sendVerificationProof() {
        if (!signalSessionReady || signalCrypto == null || uid == null || remoteUid == null
                || !signalCrypto.isRemoteFingerprintVerified(uid, remoteUid)) return;
        JSONObject proof = new JSONObject();
        put(proof, "t", "verify");
        put(proof, "fingerprint", signalCrypto.trustedRemoteFingerprint(uid, remoteUid));
        sendPacket(dataChannel, proof);
    }

    private void updateVerificationState() {
        if (!signalSessionReady || signalCrypto == null || uid == null || remoteUid == null) return;
        if (isSecureConversationVerified()) {
            notifyState("connected", "Signal E2EE · отпечатки сверены обоими устройствами");
        } else if (!signalCrypto.isRemoteFingerprintVerified(uid, remoteUid)) {
            notifyState("waiting", "Signal активен · сверяйте отпечатки в строке состояния");
        } else {
            notifyState("waiting", "Вы сверили ключ · ожидаем подтверждения собеседника");
        }
    }

    String securitySummary() {
        String local = signalCrypto == null ? "недоступен" : signalCrypto.localFingerprint();
        String advertised = "нет ключа собеседника";
        String trusted = "";
        boolean changed = false;
        if (signalCrypto != null && remoteUid != null) {
            Member peer = members.get(remoteUid);
            if (peer != null) advertised = signalCrypto.advertisedFingerprint(peer.signalBundle);
            trusted = signalCrypto.trustedRemoteFingerprint(uid, remoteUid);
            changed = !trusted.isEmpty() && !advertised.isEmpty() && !trusted.equals(advertised);
        }
        String remote = trusted.isEmpty() ? advertised : trusted;
        String verificationStatus;
        if (!signalSessionReady) verificationStatus = "Signal-сеанс ещё не установлен";
        else if (isSecureConversationVerified()) verificationStatus = "оба отпечатка вручную сверены; обмен открыт";
        else if (signalCrypto != null && uid != null && remoteUid != null
                && signalCrypto.isRemoteFingerprintVerified(uid, remoteUid)) {
            verificationStatus = "вы сверили ключ; ожидаем подтверждения собеседника";
        } else verificationStatus = "шифрование установлено, но отпечаток собеседника не сверён";
        return "Протокол: Signal PQXDH + Double Ratchet\n"
                + "Состояние: " + verificationStatus + "\n\n"
                + "Ваш ключ:\n" + local + "\n\n"
                + (changed ? "ВНИМАНИЕ: объявленный ключ изменился! Сообщения блокируются.\n"
                        + "Ранее принятый ключ:\n" + trusted + "\n\n"
                        + "Новый объявленный ключ:\n" + advertised + "\n\n"
                        : "Ключ собеседника:\n" + remote + "\n\n")
                + "Сверьте отпечатки с собеседником лично или по независимому каналу. Проверка через тот же Firebase сама по себе не защищает первый контакт от подмены. После сверки оба участника должны нажать «Я сверил отпечатки»; отправка контента заблокирована до обоих подтверждений.";
    }

    private void receivePacket(String raw) {
        try {
            JSONObject envelope = new JSONObject(raw);
            String type = envelope.optString("t", "");
            if ("e2ee".equals(type)) {
                if (signalCrypto == null || uid == null || remoteUid == null) return;
                int messageType = envelope.optInt("k", -1);
                byte[] ciphertext = Base64.decode(envelope.optString("d", ""), Base64.NO_WRAP);
                byte[] plaintext = signalCrypto.decrypt(uid, remoteUid, messageType, ciphertext);
                String authenticated = new String(plaintext, StandardCharsets.UTF_8);
                actor.post(() -> {
                    if (!closed) receiveAuthenticatedPacket(authenticated);
                });
            } else if ("chunk_secure".equals(type)) {
                if (!isSecureConversationVerified()) return;
                incomingFiles.execute(() -> receiveSecureChunk(envelope));
            } else {
                actor.post(() -> {
                    signalSessionReady = false;
                    notifyState("error", "Отклонён незашифрованный пакет · обновите приложение на обоих устройствах");
                    emitError("Сообщение без Signal-шифрования заблокировано.");
                });
            }
        } catch (Exception ex) {
            actor.post(() -> {
                signalSessionReady = false;
                notifyState("error", "Не удалось проверить Signal-сообщение · данные заблокированы");
                emitError("Сообщение не прошло проверку Signal Protocol: " + friendly(ex));
            });
        }
    }

    private void receiveAuthenticatedPacket(String raw) {
        try {
            JSONObject packet = new JSONObject(raw);
            String type = packet.optString("t", "");
            if ("secure_hello".equals(type)) {
                if (!"libsignal-pqxdh-v1".equals(packet.optString("protocol", ""))) {
                    notifyState("error", "Несовместимая версия Signal Protocol");
                    return;
                }
                if (!trustedRemoteMatchesAnnouncement()) return;
                signalSessionReady = true;
                updateVerificationState();
                JSONObject ready = new JSONObject();
                put(ready, "t", "secure_ready");
                put(ready, "protocol", "libsignal-pqxdh-v1");
                if (!sendPacket(dataChannel, ready)) {
                    signalSessionReady = false;
                    notifyState("error", "Не удалось подтвердить Signal-шифрование");
                    return;
                }
                sendVerificationProof();
                updateVerificationState();
                if (isSecureConversationVerified()) flushPendingTransferControls();
            } else if ("secure_ready".equals(type)) {
                if (!"libsignal-pqxdh-v1".equals(packet.optString("protocol", ""))
                        || !trustedRemoteMatchesAnnouncement()) return;
                signalSessionReady = true;
                sendVerificationProof();
                updateVerificationState();
                if (isSecureConversationVerified()) flushPendingTransferControls();
            } else if ("verify".equals(type)) {
                String fingerprint = packet.optString("fingerprint", "");
                if (!signalCrypto.recordRemoteFingerprintVerification(uid, remoteUid, fingerprint)) {
                    notifyState("error", "Не удалось проверить подтверждение отпечатка собеседника");
                    return;
                }
                updateVerificationState();
                if (isSecureConversationVerified()) flushPendingTransferControls();
            } else if (!signalSessionReady) {
                notifyState("error", "Получено защищённое сообщение до завершения Signal-handshake");
            } else if (!isSecureConversationVerified()) {
                updateVerificationState();
            } else if ("file".equals(type) || "chunk".equals(type) || "done".equals(type)) {
                incomingFiles.execute(() -> receiveFilePacket(packet));
            } else if ("resume_at".equals(type)) {
                String id = packet.optString("id", "");
                ResumeRequest request = resumeRequests.remove(id);
                if (request != null) {
                    request.nextChunk = Math.max(0, packet.optInt("i", 0));
                    request.ready.countDown();
                }
            } else if ("pause".equals(type) || "resume".equals(type)) {
                String id = packet.optString("id", "");
                actor.post(() -> handleRemoteTransferControl(type, id));
            } else if ("text".equals(type)) {
                actor.post(() -> {
                    String id = packet.optString("id", UUID.randomUUID().toString());
                    String text = packet.optString("text", "");
                    if (text.isEmpty() || text.length() > 4_000) return;
                    ChatMessage message = new ChatMessage(id, text, ChatMessage.TEXT, "", "text/plain",
                            "", false, packet.optLong("time", System.currentTimeMillis()), 0,
                            ChatMessage.READY);
                    messageStore.add(message);
                    emitMessage(message);
                    sendAck(id);
                });
            } else if ("ack".equals(type)) {
                String id = packet.optString("id", "");
                actor.post(() -> markDelivered(id));
            }
        } catch (Exception ex) {
            actor.post(() -> emitError("Не удалось разобрать зашифрованный пакет чата."));
        }
    }

    private boolean trustedRemoteMatchesAnnouncement() {
        if (signalCrypto == null || uid == null || remoteUid == null) return false;
        Member peer = members.get(remoteUid);
        if (peer == null || peer.signalBundle == null) {
            signalSessionReady = false;
            notifyState("error", "В Firebase отсутствует Signal-ключ собеседника · соединение заблокировано");
            return false;
        }
        String advertised = signalCrypto.advertisedFingerprint(peer.signalBundle);
        String trusted = signalCrypto.trustedRemoteFingerprint(uid, remoteUid);
        if (!advertised.isEmpty() && !trusted.isEmpty() && !advertised.equals(trusted)) {
            signalSessionReady = false;
            notifyState("error", "Ключ Signal собеседника изменился · соединение заблокировано");
            emitError("Объявленный ключ не совпадает с ключом в Signal-сеансе. Сверьте отпечаток лично.");
            return false;
        }
        return true;
    }

    private void receiveSecureChunk(JSONObject packet) {
        String id = packet.optString("id", "");
        if (id.isEmpty()) return;
        IncomingTransfer transfer = incomingTransfers.get(id);
        if (transfer == null) transfer = restoreIncomingTransfer(id);
        try {
            if (transfer == null || transfer.fileKey == null) throw new java.io.IOException("Нет ключа для зашифрованного фрагмента");
            int index = packet.optInt("i", -1);
            byte[] nonce = Base64.decode(packet.optString("n", ""), Base64.NO_WRAP);
            byte[] ciphertext = Base64.decode(packet.optString("d", ""), Base64.NO_WRAP);
            byte[] plaintext = signalCrypto.decryptFileChunk(transfer.fileKey, id, index, nonce, ciphertext);
            JSONObject chunk = new JSONObject();
            put(chunk, "t", "chunk");
            put(chunk, "id", id);
            put(chunk, "i", index);
            put(chunk, "d", Base64.encodeToString(plaintext, Base64.NO_WRAP));
            receiveFilePacket(chunk);
        } catch (Exception ex) {
            if (transfer != null) {
                incomingTransfers.remove(id, transfer);
                try { if (transfer.stream != null) transfer.stream.close(); } catch (Exception ignored) { }
                transfer.stream = null;
                transfer.message.status = ChatMessage.PAUSED;
                messageStore.update(transfer.message);
                emitMessage(transfer.message);
            }
            actor.post(() -> emitError("Зашифрованный фрагмент файла не прошёл проверку: " + friendly(ex)));
        }
    }

    private void receiveFilePacket(JSONObject packet) {
        String type = packet.optString("t", "");
        String id = packet.optString("id", "");
        if (id.isEmpty()) return;
        try {
            if ("file".equals(type)) {
                long size = packet.optLong("size", -1L);
                if (size <= 0 || size > MAX_FILE_BYTES) {
                    actor.post(() -> emitError("Вложение отклонено: допустимый размер — до 150 МБ."));
                    return;
                }
                int totalChunks = (int) ((size + CHUNK_BYTES - 1) / CHUNK_BYTES);
                for (ChatMessage saved : messageStore.all()) {
                    if (id.equals(saved.id) && !saved.outgoing && saved.status == ChatMessage.READY) {
                        sendResumeAt(id, totalChunks);
                        return;
                    }
                }

                byte[] fileKey = Base64.decode(packet.optString("key", ""), Base64.NO_WRAP);
                if (fileKey.length != 32) throw new java.io.IOException("Invalid encrypted file key");
                IncomingTransfer transfer = incomingTransfers.get(id);
                if (transfer == null) transfer = restoreIncomingTransfer(id);
                if (transfer != null) {
                    if (transfer.expectedBytes != size || !Arrays.equals(transfer.fileKey, fileKey)) {
                        actor.post(() -> emitError("Повторная передача не совпадает с исходным зашифрованным файлом."));
                        return;
                    }
                    transfer.message.status = ChatMessage.RECEIVING;
                    messageStore.update(transfer.message);
                    emitMessage(transfer.message);
                    sendResumeAt(id, transfer.nextChunk);
                    return;
                }

                signalCrypto.storeTransferKey(id, fileKey);
                File directory = new File(context.getFilesDir(), "media/received");
                if (!directory.exists() && !directory.mkdirs()) throw new java.io.IOException("Не удалось создать папку вложений");
                File file = new File(directory, UUID.randomUUID().toString() + ".bin");
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file), CHUNK_BYTES);
                String name = safeFileName(packet.optString("name", "attachment"));
                String mime = packet.optString("mime", "application/octet-stream");
                if (mime.length() > 128) mime = "application/octet-stream";
                String kind = packet.optString("kind", ChatMessage.FILE);
                if (!isAttachmentKind(kind)) kind = ChatMessage.FILE;
                ChatMessage message = new ChatMessage(id, "", kind, name, mime,
                        file.getAbsolutePath(), false, packet.optLong("time", System.currentTimeMillis()),
                        size, ChatMessage.RECEIVING);
                transfer = new IncomingTransfer(file, stream, size, message, fileKey);
                incomingTransfers.put(id, transfer);
                messageStore.add(message);
                emitMessage(message);
                sendResumeAt(id, 0);
            } else if ("chunk".equals(type)) {
                IncomingTransfer transfer = incomingTransfers.get(id);
                if (transfer == null || transfer.stream == null) return;
                int index = packet.optInt("i", -1);
                if (index < transfer.nextChunk) return;
                if (index > transfer.nextChunk) {
                    sendResumeAt(id, transfer.nextChunk);
                    return;
                }
                String encoded = packet.optString("d", "");
                if (encoded.length() > ((CHUNK_BYTES + 2) / 3) * 4) {
                    throw new java.io.IOException("Chunk exceeds the allowed size");
                }
                byte[] bytes = Base64.decode(encoded, Base64.NO_WRAP);
                if (bytes.length == 0 || bytes.length > CHUNK_BYTES ||
                        transfer.received + bytes.length > transfer.expectedBytes ||
                        transfer.received + bytes.length > MAX_FILE_BYTES) {
                    throw new java.io.IOException("Incoming file exceeded its declared size");
                }
                transfer.stream.write(bytes);
                transfer.stream.flush();
                transfer.received += bytes.length;
                transfer.nextChunk++;
            } else if ("done".equals(type)) {
                IncomingTransfer transfer = incomingTransfers.get(id);
                if (transfer == null) {
                    sendAck(id);
                    return;
                }
                if (transfer.stream != null) {
                    transfer.stream.flush();
                    transfer.stream.close();
                    transfer.stream = null;
                }
                if (transfer.received != transfer.expectedBytes) {
                    transfer.message.status = ChatMessage.PAUSED;
                    messageStore.update(transfer.message);
                    incomingTransfers.remove(id, transfer);
                    emitMessage(transfer.message);
                    sendResumeAt(id, transfer.nextChunk);
                    return;
                }
                incomingTransfers.remove(id, transfer);
                transfer.message.attachmentUri = transfer.file.getAbsolutePath();
                transfer.message.status = ChatMessage.READY;
                messageStore.update(transfer.message);
                signalCrypto.removeTransferKey(id);
                emitMessage(transfer.message);
                sendAck(id);
            }
        } catch (Exception ex) {
            IncomingTransfer transfer = incomingTransfers.remove(id);
            if (transfer != null) {
                try { if (transfer.stream != null) transfer.stream.close(); } catch (Exception ignored) { }
                transfer.stream = null;
                transfer.message.status = ChatMessage.PAUSED;
                messageStore.update(transfer.message);
                emitMessage(transfer.message);
            }
            actor.post(() -> {
                if (!closed) emitError("Передача файла приостановлена: " + friendly(ex));
            });
        }
    }

    private boolean isAttachmentKind(String kind) {
        return ChatMessage.PHOTO.equals(kind) || ChatMessage.VIDEO.equals(kind)
                || ChatMessage.CIRCLE.equals(kind) || ChatMessage.VOICE.equals(kind)
                || ChatMessage.AUDIO.equals(kind) || ChatMessage.FILE.equals(kind);
    }

    private void sendResumeAt(String id, int nextChunk) {
        if (!isChannelOpen()) return;
        JSONObject response = new JSONObject();
        put(response, "t", "resume_at");
        put(response, "id", id);
        put(response, "i", nextChunk);
        sendPacket(dataChannel, response);
    }

    private void prepareAndSendFile(Uri source, String forcedKind) {
        String name = queryName(source);
        String mime;
        try { mime = context.getContentResolver().getType(source); }
        catch (Exception ignored) { mime = null; }
        if (mime == null || mime.isEmpty()) mime = guessMime(name);
        String kind = chooseKind(forcedKind, mime);
        File copy = null;
        try {
            File directory = new File(context.getFilesDir(), "media/sent");
            if (!directory.exists() && !directory.mkdirs()) throw new java.io.IOException("Не удалось создать папку отправки");
            copy = new File(directory, UUID.randomUUID().toString() + extensionFor(name, mime));
            long total = 0L;
            InputStream sourceStream = context.getContentResolver().openInputStream(source);
            if (sourceStream == null) throw new java.io.IOException("Не удалось открыть выбранный файл");
            try (InputStream input = new BufferedInputStream(sourceStream);
                 FileOutputStream output = new FileOutputStream(copy)) {
                byte[] buffer = new byte[64 * 1024];
                int read;
                while ((read = input.read(buffer)) != -1) {
                    total += read;
                    if (total > MAX_FILE_BYTES) throw new java.io.IOException("Размер файла превышает 150 МБ");
                    output.write(buffer, 0, read);
                }
                output.flush();
            }
            if (total == 0) throw new java.io.IOException("Выбран пустой файл");
            if (closed) throw new java.io.IOException("Комната уже отключена");
            String id = UUID.randomUUID().toString();
            ChatMessage message = new ChatMessage(id, "", kind, safeFileName(name), mime,
                    copy.getAbsolutePath(), true, System.currentTimeMillis(), total, ChatMessage.SENDING);
            byte[] fileKey = signalCrypto.newTransferKey(id);
            OutgoingTransfer transfer = new OutgoingTransfer(copy, message, fileKey);
            outgoingTransfers.put(id, transfer);
            messageStore.add(message);
            emitMessage(message);
            resumeOutgoingTransfer(transfer);
        } catch (Exception ex) {
            if (copy != null && !outgoingTransfers.containsKey(findTransferId(copy))) copy.delete();
            emitError("Файл не отправлен: " + friendly(ex));
        }
    }

    private String findTransferId(File file) {
        for (Map.Entry<String, OutgoingTransfer> entry : outgoingTransfers.entrySet()) {
            if (entry.getValue().file.equals(file)) return entry.getKey();
        }
        return "";
    }

    private void transmitTransfer(OutgoingTransfer transfer) {
        boolean completed = false;
        try {
            int totalChunks = (int) ((transfer.message.sizeBytes + CHUNK_BYTES - 1) / CHUNK_BYTES);
            int noAckAttempts = 0;
            while (!closed && !transfer.cancelled) {
                waitUntilResumed(transfer);
                DataChannel channel = awaitOpenChannel(transfer);
                ResumeRequest request = new ResumeRequest();
                resumeRequests.put(transfer.message.id, request);
                JSONObject start = new JSONObject();
                put(start, "t", "file");
                put(start, "id", transfer.message.id);
                put(start, "name", transfer.message.fileName);
                put(start, "mime", transfer.message.mimeType);
                put(start, "kind", transfer.message.kind);
                put(start, "size", transfer.message.sizeBytes);
                put(start, "time", transfer.message.timeMs);
                put(start, "key", Base64.encodeToString(transfer.fileKey, Base64.NO_WRAP));
                if (!sendPacket(channel, start)) {
                    resumeRequests.remove(transfer.message.id, request);
                    continue;
                }
                boolean gotOffset;
                try {
                    gotOffset = request.ready.await(15, TimeUnit.SECONDS);
                } finally {
                    resumeRequests.remove(transfer.message.id, request);
                }
                if (!gotOffset) {
                    if (++noAckAttempts >= 10) throw new java.io.IOException("Собеседник не подтвердил продолжение передачи");
                    continue;
                }
                noAckAttempts = 0;
                int nextChunk = Math.min(totalChunks, request.nextChunk);
                transfer.nextChunk = nextChunk;
                boolean reconnect = false;
                try (InputStream input = new BufferedInputStream(new FileInputStream(transfer.file))) {
                    skipFully(input, Math.min(transfer.message.sizeBytes, (long) nextChunk * CHUNK_BYTES));
                    int index = nextChunk;
                    byte[] buffer = new byte[CHUNK_BYTES];
                    while (index < totalChunks) {
                        waitUntilResumed(transfer);
                        if (closed || transfer.cancelled) throw new java.io.IOException("Комната отключена");
                        DataChannel active = awaitOpenChannel(transfer);
                        if (active != channel) {
                            reconnect = true;
                            break;
                        }
                        try {
                            waitForCapacity(channel);
                        } catch (java.io.IOException ex) {
                            if (channel.state() != DataChannel.State.OPEN && !closed) {
                                reconnect = true;
                                break;
                            }
                            throw ex;
                        }
                        waitUntilResumed(transfer);
                        if (channel.state() != DataChannel.State.OPEN) {
                            reconnect = true;
                            break;
                        }
                        int read = input.read(buffer);
                        if (read < 0) throw new java.io.IOException("Исходный файл неожиданно закончился");
                        byte[] chunk = new byte[read];
                        System.arraycopy(buffer, 0, chunk, 0, read);
                        JSONObject packet = new JSONObject();
                        put(packet, "t", "chunk");
                        put(packet, "id", transfer.message.id);
                        put(packet, "i", index);
                        put(packet, "d", Base64.encodeToString(chunk, Base64.NO_WRAP));
                        if (!sendPacket(channel, packet)) {
                            reconnect = true;
                            break;
                        }
                        transfer.nextChunk = ++index;
                    }
                }
                if (reconnect) continue;
                waitUntilResumed(transfer);
                DataChannel active = awaitOpenChannel(transfer);
                if (active != channel) continue;
                JSONObject end = new JSONObject();
                put(end, "t", "done");
                put(end, "id", transfer.message.id);
                if (!sendPacket(channel, end)) continue;
                completed = true;
                transfer.completed = true;
                messageStore.update(transfer.message);
                emitMessage(transfer.message);
                return;
            }
            throw new java.io.IOException("Комната отключена");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        } catch (Exception ex) {
            if (!closed) emitError("Передача приостановлена. Нажмите «Продолжить», чтобы возобновить её: " + friendly(ex));
        } finally {
            synchronized (transfer) {
                transfer.running = false;
                transfer.notifyAll();
            }
            if (!completed && transfer.message.status != ChatMessage.READY) {
                setTransferStatus(transfer.message, ChatMessage.PAUSED);
            }
        }
    }

    private void waitUntilResumed(OutgoingTransfer transfer) throws InterruptedException, java.io.IOException {
        synchronized (transfer) {
            while (transfer.paused && !closed && !transfer.cancelled) transfer.wait(500L);
        }
        if (closed || transfer.cancelled) throw new java.io.IOException("Комната отключена");
    }

    private DataChannel awaitOpenChannel(OutgoingTransfer transfer) throws InterruptedException, java.io.IOException {
        long deadline = System.currentTimeMillis() + 10L * 60L * 1000L;
        while (!closed && !transfer.cancelled) {
            waitUntilResumed(transfer);
            DataChannel channel = dataChannel;
            if (channel != null && channel.state() == DataChannel.State.OPEN && signalSessionReady) return channel;
            if (System.currentTimeMillis() >= deadline) throw new java.io.IOException("Нет P2P-соединения более 10 минут");
            Thread.sleep(200L);
        }
        throw new java.io.IOException("Комната отключена");
    }

    private void skipFully(InputStream input, long bytes) throws java.io.IOException {
        long skipped = 0L;
        while (skipped < bytes) {
            long count = input.skip(bytes - skipped);
            if (count > 0) {
                skipped += count;
            } else {
                if (input.read() < 0) throw new java.io.IOException("Не удалось перейти к сохранённому фрагменту файла");
                skipped++;
            }
        }
    }

    private void waitForCapacity(DataChannel channel) throws InterruptedException, java.io.IOException {
        long started = System.currentTimeMillis();
        while (channel.bufferedAmount() > BUFFERED_AMOUNT_LIMIT) {
            if (closed || channel.state() != DataChannel.State.OPEN) throw new java.io.IOException("P2P-соединение потеряно");
            if (System.currentTimeMillis() - started > 120_000L) throw new java.io.IOException("Слишком медленная передача");
            Thread.sleep(25L);
        }
    }

    private boolean sendPacket(DataChannel channel, JSONObject packet) {
        if (channel == null || channel.state() != DataChannel.State.OPEN || signalCrypto == null
                || uid == null || remoteUid == null) return false;
        String innerType = packet.optString("t", "");
        boolean handshakePacket = "secure_hello".equals(innerType) || "secure_ready".equals(innerType);
        if (!signalSessionReady && !handshakePacket) return false;
        if ("verify".equals(innerType)) {
            if (!signalCrypto.isRemoteFingerprintVerified(uid, remoteUid)) return false;
        } else if (!handshakePacket && !isSecureConversationVerified()) {
            return false;
        }
        try {
            if ("chunk".equals(innerType)) {
                String id = packet.optString("id", "");
                int index = packet.optInt("i", -1);
                OutgoingTransfer transfer = outgoingTransfers.get(id);
                if (transfer == null || transfer.fileKey == null || index < 0) return false;
                byte[] plaintext = Base64.decode(packet.optString("d", ""), Base64.NO_WRAP);
                SignalCrypto.ChunkCiphertext chunk = signalCrypto.encryptFileChunk(transfer.fileKey, id, index, plaintext);
                JSONObject envelope = new JSONObject();
                put(envelope, "t", "chunk_secure");
                put(envelope, "id", id);
                put(envelope, "i", index);
                put(envelope, "n", Base64.encodeToString(chunk.nonce, Base64.NO_WRAP));
                put(envelope, "d", Base64.encodeToString(chunk.data, Base64.NO_WRAP));
                return sendRawPacket(channel, envelope);
            }
            byte[] plaintext = packet.toString().getBytes(StandardCharsets.UTF_8);
            SignalCrypto.SealedMessage sealed = signalCrypto.encrypt(uid, remoteUid, plaintext);
            JSONObject envelope = new JSONObject();
            put(envelope, "t", "e2ee");
            put(envelope, "k", sealed.type);
            put(envelope, "d", Base64.encodeToString(sealed.data, Base64.NO_WRAP));
            return sendRawPacket(channel, envelope);
        } catch (Exception ex) {
            actor.post(() -> {
                if (!closed) {
                    notifyState("error", "Не удалось зашифровать Signal-сообщение · передача заблокирована");
                    emitError("Signal Protocol отклонил пакет: " + friendly(ex));
                }
            });
            return false;
        }
    }

    private boolean sendRawPacket(DataChannel channel, JSONObject packet) {
        if (channel == null || channel.state() != DataChannel.State.OPEN) return false;
        byte[] bytes = packet.toString().getBytes(StandardCharsets.UTF_8);
        return channel.send(new DataChannel.Buffer(ByteBuffer.wrap(bytes), false));
    }

    private void sendAck(String id) {
        if (!isChannelOpen() || id == null || id.isEmpty()) return;
        JSONObject ack = new JSONObject();
        put(ack, "t", "ack");
        put(ack, "id", id);
        sendPacket(dataChannel, ack);
    }

    private void markDelivered(String id) {
        if (id == null || id.isEmpty()) return;
        for (ChatMessage message : messageStore.all()) {
            if (message.id.equals(id) && message.outgoing &&
                    (message.status == ChatMessage.SENDING || (message.isAttachment() && message.status == ChatMessage.PAUSED))) {
                message.status = ChatMessage.READY;
                messageStore.update(message);
                outgoingTransfers.remove(id);
                if (message.isAttachment()) signalCrypto.removeTransferKey(id);
                emitMessage(message);
                return;
            }
        }
    }

    private boolean isChannelOpen() {
        return dataChannel != null && dataChannel.state() == DataChannel.State.OPEN;
    }

    private String queryName(Uri uri) {
        String fallback = "attachment";
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            String name = new File(uri.getPath() == null ? "attachment" : uri.getPath()).getName();
            return name.isEmpty() ? fallback : name;
        }
        try (Cursor cursor = context.getContentResolver().query(uri,
                new String[]{OpenableColumns.DISPLAY_NAME}, null, null, null)) {
            if (cursor != null && cursor.moveToFirst()) {
                int index = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
                if (index >= 0) {
                    String name = cursor.getString(index);
                    if (name != null && !name.isEmpty()) return name;
                }
            }
        } catch (Exception ignored) { }
        return fallback;
    }

    private String roomPath(String suffix) {
        return "rooms/" + roomCode + "/" + suffix;
    }

    private void resetPeer() {
        connected = false;
        signalSessionReady = false;
        signalHandshakeSent = false;
        remoteDescriptionSet = false;
        localDescriptionPublished = false;
        pendingRemoteCandidates.clear();
        pendingRemoteByEpoch.clear();
        pendingLocalCandidates.clear();
        reconnectQueued = false;
        if (dataChannel != null) {
            try { dataChannel.unregisterObserver(); dataChannel.close(); dataChannel.dispose(); } catch (Exception ignored) { }
            dataChannel = null;
        }
        if (peerConnection != null) {
            try { peerConnection.close(); peerConnection.dispose(); } catch (Exception ignored) { }
            peerConnection = null;
        }
        peerEpoch = null;
    }

    private void scheduleReconnect() {
        if (closed || reconnectQueued || remoteUid == null || uid == null || uid.compareTo(remoteUid) > 0) return;
        reconnectQueued = true;
        actor.postDelayed(() -> {
            reconnectQueued = false;
            if (!closed && remoteUid != null && !connected) createOffer(true);
        }, 5_000L);
    }

    private void closeOnActor(boolean removePresence) {
        if (closed) return;
        closed = true;
        actor.removeCallbacks(heartbeat);
        if (memberStream != null) memberStream.close();
        if (signalStream != null) signalStream.close();
        resetPeer();
        for (IncomingTransfer transfer : incomingTransfers.values()) {
            try { if (transfer.stream != null) transfer.stream.close(); } catch (Exception ignored) { }
            transfer.stream = null;
            transfer.message.status = ChatMessage.PAUSED;
            messageStore.update(transfer.message);
            emitMessage(transfer.message);
        }
        incomingTransfers.clear();
        for (OutgoingTransfer transfer : outgoingTransfers.values()) {
            synchronized (transfer) {
                transfer.cancelled = true;
                transfer.notifyAll();
            }
            if (!transfer.completed) setTransferStatus(transfer.message, ChatMessage.PAUSED);
        }
        for (ResumeRequest request : resumeRequests.values()) request.ready.countDown();
        resumeRequests.clear();
        pendingTransferControls.clear();
        if (removePresence && uid != null) {
            network.execute(() -> {
                try { database.delete(roomPath("members/" + uid)); } catch (Exception ignored) { }
                try { database.delete(roomPath("signals/" + uid)); } catch (Exception ignored) { }
            });
        }
        notifyState("closed", "Комната отключена");
        network.shutdown();
        outgoingFiles.shutdownNow();
        incomingFiles.shutdownNow();
        actorThread.quitSafely();
    }

    private void notifyState(String state, String detail) {
        currentState = state;
        currentDetail = detail == null ? "" : detail;
        main.post(() -> {
            for (Listener listener : listeners) listener.onState(currentState, currentDetail);
        });
    }

    private void emitParticipants(int count, String name) {
        lastActiveCount = count;
        main.post(() -> {
            for (Listener listener : listeners) listener.onParticipants(count, name == null ? "" : name);
        });
    }

    private void emitMessage(ChatMessage message) {
        main.post(() -> {
            for (Listener listener : listeners) listener.onMessage(message);
        });
    }

    private void emitError(String message) {
        main.post(() -> {
            for (Listener listener : listeners) listener.onError(message);
        });
    }

    private static void initializeFactory(Context context) {
        synchronized (ChatSession.class) {
            if (sharedFactory != null) return;
            if (!factoryInitialized) {
                PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(context)
                        .createInitializationOptions());
                factoryInitialized = true;
            }
            sharedFactory = PeerConnectionFactory.builder().createPeerConnectionFactory();
        }
    }

    private static String minUid(String a, String b) {
        return a.compareTo(b) <= 0 ? a : b;
    }

    private static String cleanDisplayName(String name) {
        if (name == null) return "Гость";
        String clean = name.trim().replaceAll("[\\p{Cntrl}]", "");
        if (clean.isEmpty()) return "Гость";
        return clean.length() > 32 ? clean.substring(0, 32) : clean;
    }

    private static String safeFileName(String name) {
        String clean = name == null ? "attachment" : name.replaceAll("[\\\\/:*?\"<>|\\p{Cntrl}]", "_").trim();
        if (clean.isEmpty()) clean = "attachment";
        if (clean.length() > 96) clean = clean.substring(clean.length() - 96);
        return clean;
    }

    private static String guessMime(String name) {
        String lower = name == null ? "" : name.toLowerCase(java.util.Locale.ROOT);
        if (lower.endsWith(".jpg") || lower.endsWith(".jpeg")) return "image/jpeg";
        if (lower.endsWith(".png")) return "image/png";
        if (lower.endsWith(".webp")) return "image/webp";
        if (lower.endsWith(".mp4") || lower.endsWith(".mov")) return "video/mp4";
        if (lower.endsWith(".mp3")) return "audio/mpeg";
        if (lower.endsWith(".m4a") || lower.endsWith(".aac")) return "audio/mp4";
        if (lower.endsWith(".ogg")) return "audio/ogg";
        return "application/octet-stream";
    }

    private static String chooseKind(String forced, String mime) {
        if (ChatMessage.CIRCLE.equals(forced) || ChatMessage.VOICE.equals(forced)) return forced;
        if (mime != null && mime.startsWith("image/")) return ChatMessage.PHOTO;
        if (mime != null && mime.startsWith("video/")) return ChatMessage.VIDEO;
        if (mime != null && mime.startsWith("audio/")) return ChatMessage.AUDIO;
        return ChatMessage.FILE;
    }

    private static String extensionFor(String name, String mime) {
        String safe = name == null ? "" : name;
        int dot = safe.lastIndexOf('.');
        if (dot >= 0 && dot < safe.length() - 1 && safe.length() - dot <= 12) {
            return safe.substring(dot).replaceAll("[^A-Za-z0-9.]", "");
        }
        if (mime != null && mime.equals("image/jpeg")) return ".jpg";
        if (mime != null && mime.equals("video/mp4")) return ".mp4";
        if (mime != null && mime.startsWith("audio/")) return ".m4a";
        return ".bin";
    }

    private static String friendly(Exception ex) {
        String message = ex.getMessage();
        if (message == null || message.trim().isEmpty()) return "неизвестная ошибка";
        return message.length() > 180 ? message.substring(0, 180) : message;
    }

    private final class PeerObserver implements PeerConnection.Observer {
        private final String epoch;
        PeerObserver(String epoch) { this.epoch = epoch; }
        @Override public void onSignalingChange(PeerConnection.SignalingState state) { }
        @Override public void onIceConnectionChange(PeerConnection.IceConnectionState state) {
            actor.post(() -> {
                if (closed || !epoch.equals(peerEpoch)) return;
                if (state == PeerConnection.IceConnectionState.CONNECTED || state == PeerConnection.IceConnectionState.COMPLETED) {
                    if (isChannelOpen()) {
                        connected = true;
                        if (signalSessionReady) notifyState("connected", "Signal PQXDH + Double Ratchet · E2EE активно");
                        else {
                            notifyState("connecting", "P2P активен · устанавливаем Signal E2EE");
                            startSignalHandshake();
                        }
                    }
                } else if (state == PeerConnection.IceConnectionState.DISCONNECTED) {
                    connected = false;
                    notifyState("reconnecting", "Сеть временно прервана · восстанавливаем P2P");
                    scheduleReconnect();
                } else if (state == PeerConnection.IceConnectionState.FAILED) {
                    connected = false;
                    notifyState("reconnecting", "Не удалось пройти NAT · пробуем переподключиться");
                    scheduleReconnect();
                }
            });
        }
        @Override public void onIceConnectionReceivingChange(boolean receiving) { }
        @Override public void onIceGatheringChange(PeerConnection.IceGatheringState state) { }
        @Override public void onIceCandidate(IceCandidate candidate) {
            actor.post(() -> onLocalCandidate(epoch, candidate));
        }
        @Override public void onIceCandidatesRemoved(IceCandidate[] candidates) { }
        @Override public void onAddStream(org.webrtc.MediaStream stream) { }
        @Override public void onRemoveStream(org.webrtc.MediaStream stream) { }
        @Override public void onDataChannel(DataChannel channel) {
            actor.post(() -> {
                if (!closed && epoch.equals(peerEpoch)) attachDataChannel(channel, epoch);
                else {
                    try { channel.close(); channel.dispose(); } catch (Exception ignored) { }
                }
            });
        }
        @Override public void onRenegotiationNeeded() { }
        public void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState state) { }
        public void onConnectionChange(PeerConnection.PeerConnectionState state) { }
        public void onAddTrack(org.webrtc.RtpReceiver receiver, org.webrtc.MediaStream[] streams) { }
        public void onTrack(org.webrtc.RtpTransceiver transceiver) { }
    }

    private abstract static class SimpleSdpObserver implements SdpObserver {
        @Override public void onCreateSuccess(SessionDescription description) { }
        @Override public void onSetSuccess() { }
        @Override public void onCreateFailure(String error) { }
        @Override public void onSetFailure(String error) { }
    }

    private static final class Member {
        String name;
        long lastSeen;
        volatile JSONObject signalBundle;
        Member(String name, long lastSeen, JSONObject signalBundle) {
            this.name = name;
            this.lastSeen = lastSeen;
            this.signalBundle = signalBundle;
        }
    }

    private static final class IncomingTransfer {
        final File file;
        volatile BufferedOutputStream stream;
        final long expectedBytes;
        final ChatMessage message;
        final byte[] fileKey;
        volatile long received;
        volatile int nextChunk;
        IncomingTransfer(File file, BufferedOutputStream stream, long expectedBytes, ChatMessage message, byte[] fileKey) {
            this.file = file;
            this.stream = stream;
            this.expectedBytes = expectedBytes;
            this.message = message;
            this.fileKey = fileKey;
        }
    }

    private static final class OutgoingTransfer {
        final File file;
        final ChatMessage message;
        final byte[] fileKey;
        volatile int nextChunk;
        volatile boolean paused;
        volatile boolean running;
        volatile boolean completed;
        volatile boolean cancelled;
        OutgoingTransfer(File file, ChatMessage message, byte[] fileKey) {
            this.file = file;
            this.message = message;
            this.fileKey = fileKey;
        }
    }

    private static final class ResumeRequest {
        final CountDownLatch ready = new CountDownLatch(1);
        volatile int nextChunk;
    }
}
