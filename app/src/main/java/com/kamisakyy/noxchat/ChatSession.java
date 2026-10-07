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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
    private final Map<String, Member> members = new HashMap<>();
    private final Map<String, IncomingTransfer> incomingTransfers = new ConcurrentHashMap<>();
    private final ArrayList<IceCandidate> pendingRemoteCandidates = new ArrayList<>();
    private final Map<String, ArrayList<IceCandidate>> pendingRemoteByEpoch = new HashMap<>();
    private final ArrayList<IceCandidate> pendingLocalCandidates = new ArrayList<>();
    private final MessageStore messageStore;
    private final FirebaseAuthClient auth;
    private final FirebaseRealtimeDatabase database;

    private Handler actor;
    private FirebaseRestStream memberStream;
    private FirebaseRestStream signalStream;
    private String uid;
    private String remoteUid;
    private String remoteName = "";
    private String peerEpoch;
    private PeerConnection peerConnection;
    private DataChannel dataChannel;
    private boolean localDescriptionPublished;
    private boolean remoteDescriptionSet;
    private boolean closed;
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
        actorThread.start();
        actor = new Handler(actorThread.getLooper());
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
            final DataChannel channel = dataChannel;
            outgoingFiles.execute(() -> prepareAndSendFile(source, forcedKind, channel));
        });
    }

    void close(boolean removePresence) {
        actor.post(() -> closeOnActor(removePresence));
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
        return new Member(object.optString("name", "Собеседник"), object.optLong("lastSeen", 0L));
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
                        notifyState("connected", "Зашифрованный P2P-канал активен");
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
            notifyState("connected", "Зашифрованный P2P-канал активен");
        }
    }

    private void receivePacket(String raw) {
        try {
            JSONObject packet = new JSONObject(raw);
            String type = packet.optString("t", "");
            if ("file".equals(type) || "chunk".equals(type) || "done".equals(type)) {
                incomingFiles.execute(() -> receiveFilePacket(packet));
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
        } catch (Exception ignored) {
            actor.post(() -> emitError("Не удалось прочитать пакет чата."));
        }
    }

    private void receiveFilePacket(JSONObject packet) {
        String type = packet.optString("t", "");
        String id = packet.optString("id", "");
        if (id.isEmpty()) return;
        try {
            if ("file".equals(type)) {
                long size = packet.optLong("size", -1L);
                if (size < 0 || size > MAX_FILE_BYTES) {
                    actor.post(() -> emitError("Вложение отклонено: допустимый размер — до 150 МБ."));
                    return;
                }
                File directory = new File(context.getFilesDir(), "media/received");
                if (!directory.exists() && !directory.mkdirs()) throw new java.io.IOException("Не удалось создать папку вложений");
                File file = new File(directory, UUID.randomUUID().toString() + ".bin");
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file));
                String name = safeFileName(packet.optString("name", "attachment"));
                String mime = packet.optString("mime", "application/octet-stream");
                String kind = packet.optString("kind", ChatMessage.FILE);
                ChatMessage message = new ChatMessage(id, "", kind, name, mime, "", false,
                        packet.optLong("time", System.currentTimeMillis()), size, ChatMessage.RECEIVING);
                IncomingTransfer transfer = new IncomingTransfer(file, stream, size, message);
                incomingTransfers.put(id, transfer);
                actor.post(() -> {
                    if (closed) return;
                    messageStore.add(message);
                    emitMessage(message);
                });
            } else if ("chunk".equals(type)) {
                IncomingTransfer transfer = incomingTransfers.get(id);
                if (transfer == null || transfer.stream == null) return;
                int index = packet.optInt("i", -1);
                if (index != transfer.nextChunk) throw new java.io.IOException("Invalid chunk order");
                byte[] bytes = Base64.decode(packet.optString("d", ""), Base64.NO_WRAP);
                if (transfer.received + bytes.length > transfer.expectedBytes ||
                        transfer.received + bytes.length > MAX_FILE_BYTES) {
                    throw new java.io.IOException("Incoming file exceeded its declared size");
                }
                transfer.stream.write(bytes);
                transfer.received += bytes.length;
                transfer.nextChunk++;
            } else if ("done".equals(type)) {
                IncomingTransfer transfer = incomingTransfers.remove(id);
                if (transfer == null) return;
                transfer.stream.close();
                if (transfer.received != transfer.expectedBytes) {
                    transfer.file.delete();
                    actor.post(() -> emitError("Передача файла прервалась: размер не совпал."));
                    return;
                }
                transfer.message.attachmentUri = transfer.file.getAbsolutePath();
                transfer.message.status = ChatMessage.READY;
                actor.post(() -> {
                    if (closed) return;
                    messageStore.update(transfer.message);
                    emitMessage(transfer.message);
                    sendAck(id);
                });
            }
        } catch (Exception ex) {
            IncomingTransfer transfer = incomingTransfers.remove(id);
            if (transfer != null) {
                try { if (transfer.stream != null) transfer.stream.close(); } catch (Exception ignored) { }
                transfer.file.delete();
                transfer.message.status = ChatMessage.FAILED;
                actor.post(() -> {
                    if (!closed) {
                        messageStore.update(transfer.message);
                        emitMessage(transfer.message);
                    }
                });
            }
        }
    }

    private void prepareAndSendFile(Uri source, String forcedKind, DataChannel channel) {
        String name = queryName(source);
        String mime;
        try { mime = context.getContentResolver().getType(source); }
        catch (Exception ignored) { mime = null; }
        if (mime == null || mime.isEmpty()) mime = guessMime(name);
        String kind = chooseKind(forcedKind, mime);
        File copy = null;
        ChatMessage message = null;
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
            String id = UUID.randomUUID().toString();
            message = new ChatMessage(id, "", kind, safeFileName(name), mime,
                    copy.getAbsolutePath(), true, System.currentTimeMillis(), total, ChatMessage.SENDING);
            ChatMessage outgoing = message;
            actor.post(() -> {
                if (closed) return;
                messageStore.add(outgoing);
                emitMessage(outgoing);
            });

            JSONObject start = new JSONObject();
            start.put("t", "file");
            start.put("id", id);
            start.put("name", outgoing.fileName);
            start.put("mime", mime);
            start.put("kind", kind);
            start.put("size", total);
            start.put("time", outgoing.timeMs);
            if (!sendPacket(channel, start)) throw new java.io.IOException("P2P data channel is closed");

            try (InputStream input = new BufferedInputStream(new FileInputStream(copy))) {
                byte[] buffer = new byte[CHUNK_BYTES];
                int read;
                int index = 0;
                while ((read = input.read(buffer)) != -1) {
                    if (closed || channel.state() != DataChannel.State.OPEN) throw new java.io.IOException("P2P-соединение потеряно");
                    waitForCapacity(channel);
                    byte[] chunk = new byte[read];
                    System.arraycopy(buffer, 0, chunk, 0, read);
                    JSONObject packet = new JSONObject();
                    packet.put("t", "chunk");
                    packet.put("id", id);
                    packet.put("i", index++);
                    packet.put("d", Base64.encodeToString(chunk, Base64.NO_WRAP));
                    if (!sendPacket(channel, packet)) throw new java.io.IOException("Не удалось передать часть файла");
                }
            }
            JSONObject end = new JSONObject();
            end.put("t", "done");
            end.put("id", id);
            if (!sendPacket(channel, end)) throw new java.io.IOException("Не удалось завершить передачу файла");
            // Keep the local bubble in "sending" state until the receiver confirms the file.
        } catch (Exception ex) {
            if (message != null) {
                message.status = ChatMessage.FAILED;
                ChatMessage failed = message;
                actor.post(() -> {
                    if (!closed) {
                        messageStore.update(failed);
                        emitMessage(failed);
                    }
                });
            }
            if (copy != null && (message == null || message.status == ChatMessage.FAILED)) copy.delete();
            actor.post(() -> {
                if (!closed) emitError("Файл не отправлен: " + friendly(ex));
            });
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
            if (message.id.equals(id) && message.outgoing && message.status == ChatMessage.SENDING) {
                message.status = ChatMessage.READY;
                messageStore.update(message);
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
            transfer.file.delete();
            transfer.message.status = ChatMessage.FAILED;
            messageStore.update(transfer.message);
        }
        incomingTransfers.clear();
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
                        notifyState("connected", "Зашифрованный P2P-канал активен");
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
        Member(String name, long lastSeen) { this.name = name; this.lastSeen = lastSeen; }
    }

    private static final class IncomingTransfer {
        final File file;
        final BufferedOutputStream stream;
        final long expectedBytes;
        final ChatMessage message;
        long received;
        int nextChunk;
        IncomingTransfer(File file, BufferedOutputStream stream, long expectedBytes, ChatMessage message) {
            this.file = file;
            this.stream = stream;
            this.expectedBytes = expectedBytes;
            this.message = message;
        }
    }
}
