package com.kamisakyy.noxchat;

import android.Manifest;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.IBinder;
import android.provider.MediaStore;
import android.text.InputType;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/** Black-theme Android chat UI and media capture/picker. */
public final class MainActivity extends ComponentActivity {
    private static final int BG = Color.rgb(8, 9, 11);
    private static final int SURFACE = Color.rgb(17, 19, 24);
    private static final int RAISED = Color.rgb(25, 28, 34);
    private static final int BORDER = Color.rgb(39, 43, 51);
    private static final int TEXT = Color.rgb(245, 246, 248);
    private static final int MUTED = Color.rgb(146, 152, 165);
    private static final int ACCENT = Color.rgb(183, 243, 107);
    private static final int ACCENT_DARK = Color.rgb(36, 52, 20);
    private static final int ERROR = Color.rgb(255, 116, 116);

    private FrameLayout root;
    private LinearLayout page;
    private LinearLayout messagesColumn;
    private ScrollView messagesScroll;
    private EditText roomEdit;
    private EditText nameEdit;
    private EditText composer;
    private TextView stateView;
    private TextView participantView;
    private TextView recordButton;
    private TextView recordHint;
    private TextView emptyChatView;
    private final Map<String, View> messageViews = new HashMap<>();

    private ActivityResultLauncher<Intent> documentPicker;
    private ActivityResultLauncher<Intent> videoCapture;
    private ActivityResultLauncher<String> audioPermission;
    private ActivityResultLauncher<String> notificationPermission;

    private ChatConnectionService service;
    private ChatSession session;
    private final Handler uiHandler = new Handler(Looper.getMainLooper());
    private boolean bound;
    private String roomCode = "";
    private String peerName = "";
    private String pendingMediaKind;
    private MediaRecorder mediaRecorder;
    private File voiceFile;
    private long voiceStartedAt;
    private boolean recording;

    private final ChatSession.Listener chatListener = new ChatSession.Listener() {
        @Override public void onState(String state, String detail) {
            runOnUiThread(() -> updateConnectionState(state, detail));
        }

        @Override public void onParticipants(int activeCount, String name) {
            runOnUiThread(() -> {
                peerName = name == null ? "" : name;
                if (participantView != null) {
                    if (activeCount <= 1) participantView.setText("СОБЕСЕДНИК НЕ В СЕТИ");
                    else participantView.setText("P2P · " + (peerName.isEmpty() ? "СОБЕСЕДНИК" : peerName.toUpperCase(Locale.ROOT)));
                }
            });
        }

        @Override public void onHistory(List<ChatMessage> history) {
            runOnUiThread(() -> renderHistory(history));
        }

        @Override public void onMessage(ChatMessage message) {
            runOnUiThread(() -> renderMessage(message));
        }

        @Override public void onError(String message) {
            runOnUiThread(() -> toast(message));
        }
    };

    private final ServiceConnection serviceConnection = new ServiceConnection() {
        @Override public void onServiceConnected(ComponentName name, IBinder binder) {
            ChatConnectionService.LocalBinder local = (ChatConnectionService.LocalBinder) binder;
            service = local.getService();
            service.setUiVisible(true);
            attachSessionWhenReady(0);
        }

        @Override public void onServiceDisconnected(ComponentName name) {
            if (session != null) session.removeListener(chatListener);
            session = null;
            service = null;
            bound = false;
            updateConnectionState("reconnecting", "Переподключаем службу чата…");
        }
    };

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().setNavigationBarColor(Color.TRANSPARENT);
        getWindow().setSoftInputMode(android.view.WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);

        root = new FrameLayout(this);
        root.setBackgroundColor(BG);
        ViewCompat.setOnApplyWindowInsetsListener(root, (view, windowInsets) -> {
            Insets bars = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
            Insets ime = windowInsets.getInsets(WindowInsetsCompat.Type.ime());
            view.setPadding(0, bars.top, 0, Math.max(bars.bottom, ime.bottom));
            return windowInsets;
        });
        setContentView(root);

        documentPicker = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                Uri uri = result.getData().getData();
                if (uri != null) {
                    try { getContentResolver().takePersistableUriPermission(uri, Intent.FLAG_GRANT_READ_URI_PERMISSION); }
                    catch (Exception ignored) { }
                    sendMedia(uri, pendingMediaKind);
                }
            }
            pendingMediaKind = null;
        });
        videoCapture = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK && result.getData() != null && result.getData().getData() != null) {
                sendMedia(result.getData().getData(), ChatMessage.CIRCLE);
            } else if (result.getResultCode() == RESULT_OK) {
                toast("Камера не вернула видео. Попробуйте выбрать ролик из галереи.");
            }
        });
        audioPermission = registerForActivityResult(new ActivityResultContracts.RequestPermission(), granted -> {
            if (granted) startVoiceRecording();
            else toast("Разрешите микрофон, чтобы записать голосовое сообщение.");
        });
        notificationPermission = registerForActivityResult(new ActivityResultContracts.RequestPermission(), granted -> { });

        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override public void handleOnBackPressed() {
                hideKeyboard();
                finish();
            }
        });

        String intentRoom = getIntent() == null ? null : getIntent().getStringExtra(ChatConnectionService.EXTRA_ROOM);
        String storedRoom = ChatConnectionService.storedRoom(this);
        if (Build.VERSION.SDK_INT >= 33 && ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) {
            notificationPermission.launch(Manifest.permission.POST_NOTIFICATIONS);
        }
        if (!RoomCode.normalize(intentRoom).isEmpty()) {
            enterRoom(RoomCode.normalize(intentRoom), ChatConnectionService.storedName(this));
        } else if (!RoomCode.normalize(storedRoom).isEmpty()) {
            enterRoom(RoomCode.normalize(storedRoom), ChatConnectionService.storedName(this));
        } else {
            showHome();
        }
    }

    @Override protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        String requested = intent == null ? null : intent.getStringExtra(ChatConnectionService.EXTRA_ROOM);
        String normalized = RoomCode.normalize(requested);
        if (!normalized.isEmpty() && !normalized.equals(roomCode)) enterRoom(normalized, ChatConnectionService.storedName(this));
    }

    @Override protected void onResume() {
        super.onResume();
        if (service != null) service.setUiVisible(true);
    }

    @Override protected void onPause() {
        if (service != null) service.setUiVisible(false);
        super.onPause();
    }

    @Override protected void onDestroy() {
        stopVoiceRecording(false);
        uiHandler.removeCallbacksAndMessages(null);
        if (session != null) session.removeListener(chatListener);
        if (bound) {
            try { unbindService(serviceConnection); } catch (Exception ignored) { }
            bound = false;
        }
        super.onDestroy();
    }

    private void showHome() {
        roomCode = "";
        root.removeAllViews();
        page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(dp(22), dp(16), dp(22), dp(22));
        root.addView(page, new FrameLayout.LayoutParams(-1, -1));

        LinearLayout brand = new LinearLayout(this);
        brand.setGravity(Gravity.CENTER_VERTICAL);
        TextView logo = text("N", 17, BG, true);
        logo.setGravity(Gravity.CENTER);
        logo.setBackground(rounded(ACCENT, dp(12)));
        brand.addView(logo, new LinearLayout.LayoutParams(dp(40), dp(40)));
        TextView brandName = text("NOX", 15, TEXT, true);
        brandName.setLetterSpacing(0.16f);
        LinearLayout.LayoutParams brandTextParams = new LinearLayout.LayoutParams(-2, -2);
        brandTextParams.leftMargin = dp(12);
        brand.addView(brandName, brandTextParams);
        TextView privacy = text("P2P · БЕЗ ОБЛАКА ДЛЯ СООБЩЕНИЙ", 9, MUTED, true);
        privacy.setLetterSpacing(0.08f);
        privacy.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        brand.addView(privacy, new LinearLayout.LayoutParams(0, -2, 1));
        page.addView(brand);

        addSpace(page, 52);
        TextView eyebrow = text("ЛИЧНЫЕ КОМНАТЫ · ПРЯМОЕ СОЕДИНЕНИЕ", 10, ACCENT, true);
        eyebrow.setLetterSpacing(0.09f);
        page.addView(eyebrow);
        addSpace(page, 14);
        TextView headline = text("Общайтесь\nнапрямую.", 38, TEXT, true);
        headline.setLineSpacing(dp(1), 1f);
        page.addView(headline);
        addSpace(page, 12);
        TextView intro = text("Сообщения и медиа идут между устройствами через зашифрованный P2P-канал. Создайте комнату и передайте код собеседнику.", 15, MUTED, false);
        intro.setLineSpacing(dp(5), 1.08f);
        page.addView(intro);
        addSpace(page, 28);

        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(dp(18), dp(18), dp(18), dp(18));
        card.setBackground(rounded(SURFACE, dp(20), BORDER, dp(1)));
        page.addView(card, new LinearLayout.LayoutParams(-1, -2));

        TextView nameLabel = text("ВАШЕ ИМЯ", 10, MUTED, true);
        nameLabel.setLetterSpacing(0.08f);
        card.addView(nameLabel);
        addSpace(card, 8);
        nameEdit = editField("Например, Лена", false);
        nameEdit.setText(ChatConnectionService.storedName(this));
        card.addView(nameEdit, new LinearLayout.LayoutParams(-1, dp(52)));
        addSpace(card, 18);
        TextView codeLabel = text("КОД КОМНАТЫ", 10, MUTED, true);
        codeLabel.setLetterSpacing(0.08f);
        card.addView(codeLabel);
        addSpace(card, 8);
        roomEdit = editField("Вставьте 16-символьный код", true);
        roomEdit.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        roomEdit.setLetterSpacing(0.12f);
        card.addView(roomEdit, new LinearLayout.LayoutParams(-1, dp(54)));
        addSpace(card, 14);

        TextView createButton = button("Создать новую комнату", ACCENT, BG, true);
        card.addView(createButton, new LinearLayout.LayoutParams(-1, dp(54)));
        createButton.setOnClickListener(v -> {
            String name = getDisplayName();
            enterRoom(RoomCode.create(), name);
        });
        addSpace(card, 10);
        TextView joinButton = button("Подключиться по коду", RAISED, TEXT, false);
        card.addView(joinButton, new LinearLayout.LayoutParams(-1, dp(52)));
        joinButton.setOnClickListener(v -> {
            String code = RoomCode.normalize(roomEdit.getText().toString());
            if (code.isEmpty()) {
                roomEdit.setError("Введите корректный 16-символьный код");
                return;
            }
            enterRoom(code, getDisplayName());
        });

        View spacer = new View(this);
        page.addView(spacer, new LinearLayout.LayoutParams(1, 0, 1));
        LinearLayout note = new LinearLayout(this);
        note.setGravity(Gravity.CENTER_VERTICAL);
        TextView dot = text("●", 10, ACCENT, true);
        note.addView(dot);
        TextView noteText = text("Код комнаты — ключ приглашения. Передавайте его только нужному человеку.", 11, MUTED, false);
        LinearLayout.LayoutParams noteParams = new LinearLayout.LayoutParams(0, -2, 1);
        noteParams.leftMargin = dp(8);
        note.addView(noteText, noteParams);
        page.addView(note);
    }

    private void showChat() {
        root.removeAllViews();
        messageViews.clear();
        page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setPadding(dp(14), dp(8), dp(14), dp(10));
        root.addView(page, new FrameLayout.LayoutParams(-1, -1));

        LinearLayout toolbar = new LinearLayout(this);
        toolbar.setGravity(Gravity.CENTER_VERTICAL);
        toolbar.setPadding(0, 0, 0, dp(10));
        page.addView(toolbar, new LinearLayout.LayoutParams(-1, dp(58)));
        TextView leaveButton = roundAction("×", "Отключиться от комнаты");
        toolbar.addView(leaveButton, new LinearLayout.LayoutParams(dp(42), dp(42)));
        leaveButton.setOnClickListener(v -> confirmLeaveRoom());

        LinearLayout titleColumn = new LinearLayout(this);
        titleColumn.setOrientation(LinearLayout.VERTICAL);
        titleColumn.setPadding(dp(10), 0, 0, 0);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(0, -2, 1);
        toolbar.addView(titleColumn, titleParams);
        TextView title = text("КОМНАТА", 10, MUTED, true);
        title.setLetterSpacing(0.12f);
        titleColumn.addView(title);
        TextView code = text(roomCode, 16, TEXT, true);
        code.setLetterSpacing(0.08f);
        titleColumn.addView(code);

        TextView shareButton = roundAction("↗", "Скопировать или отправить код комнаты");
        toolbar.addView(shareButton, new LinearLayout.LayoutParams(dp(42), dp(42)));
        shareButton.setOnClickListener(v -> shareRoom());

        LinearLayout statusBar = new LinearLayout(this);
        statusBar.setGravity(Gravity.CENTER_VERTICAL);
        statusBar.setPadding(dp(13), dp(10), dp(13), dp(10));
        statusBar.setBackground(rounded(SURFACE, dp(14), BORDER, dp(1)));
        page.addView(statusBar, new LinearLayout.LayoutParams(-1, -2));
        TextView statusDot = text("●", 10, ACCENT, true);
        statusBar.addView(statusDot);
        stateView = text("Синхронизируем комнату…", 12, TEXT, true);
        LinearLayout.LayoutParams stateParams = new LinearLayout.LayoutParams(0, -2, 1);
        stateParams.leftMargin = dp(8);
        statusBar.addView(stateView, stateParams);
        participantView = text("СОБЕСЕДНИК НЕ В СЕТИ", 9, MUTED, true);
        participantView.setLetterSpacing(0.04f);
        participantView.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
        statusBar.addView(participantView);

        messagesScroll = new ScrollView(this);
        messagesScroll.setFillViewport(true);
        messagesScroll.setClipToPadding(false);
        messagesScroll.setPadding(0, dp(15), 0, dp(12));
        LinearLayout.LayoutParams scrollParams = new LinearLayout.LayoutParams(-1, 0, 1);
        scrollParams.topMargin = dp(4);
        page.addView(messagesScroll, scrollParams);
        messagesColumn = new LinearLayout(this);
        messagesColumn.setOrientation(LinearLayout.VERTICAL);
        messagesColumn.setPadding(0, dp(4), 0, dp(10));
        messagesScroll.addView(messagesColumn, new ScrollView.LayoutParams(-1, -2));
        emptyChatView = text("Здесь пока тихо.\nОтправьте код комнаты собеседнику, чтобы начать чат.", 14, MUTED, false);
        emptyChatView.setGravity(Gravity.CENTER);
        emptyChatView.setLineSpacing(dp(5), 1f);
        emptyChatView.setPadding(dp(24), dp(40), dp(24), dp(40));
        messagesColumn.addView(emptyChatView, new LinearLayout.LayoutParams(-1, -2));

        View divider = new View(this);
        divider.setBackgroundColor(BORDER);
        page.addView(divider, new LinearLayout.LayoutParams(-1, dp(1)));

        recordHint = text("", 11, ACCENT, true);
        recordHint.setVisibility(View.GONE);
        LinearLayout.LayoutParams hintParams = new LinearLayout.LayoutParams(-1, -2);
        hintParams.topMargin = dp(7);
        page.addView(recordHint, hintParams);

        LinearLayout composerRow = new LinearLayout(this);
        composerRow.setGravity(Gravity.BOTTOM | Gravity.CENTER_VERTICAL);
        composerRow.setPadding(0, dp(10), 0, 0);
        page.addView(composerRow, new LinearLayout.LayoutParams(-1, -2));

        TextView attachmentButton = roundAction("＋", "Фото, видео, аудио или видеокружок");
        composerRow.addView(attachmentButton, new LinearLayout.LayoutParams(dp(44), dp(44)));
        attachmentButton.setOnClickListener(this::showAttachmentMenu);

        LinearLayout inputContainer = new LinearLayout(this);
        inputContainer.setGravity(Gravity.CENTER_VERTICAL);
        inputContainer.setPadding(dp(13), dp(2), dp(8), dp(2));
        inputContainer.setBackground(rounded(SURFACE, dp(22), BORDER, dp(1)));
        LinearLayout.LayoutParams inputParams = new LinearLayout.LayoutParams(0, -2, 1);
        inputParams.leftMargin = dp(8);
        composerRow.addView(inputContainer, inputParams);
        composer = new EditText(this);
        composer.setTextColor(TEXT);
        composer.setHintTextColor(MUTED);
        composer.setHint("Сообщение…");
        composer.setTextSize(15);
        composer.setSingleLine(false);
        composer.setMaxLines(4);
        composer.setPadding(0, dp(9), 0, dp(9));
        composer.setBackgroundColor(Color.TRANSPARENT);
        composer.setImeOptions(EditorInfo.IME_ACTION_SEND);
        composer.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_CAP_SENTENCES | InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        inputContainer.addView(composer, new LinearLayout.LayoutParams(0, -2, 1));
        TextView sendButton = text("↑", 22, BG, true);
        sendButton.setGravity(Gravity.CENTER);
        sendButton.setBackground(rounded(ACCENT, dp(20)));
        LinearLayout.LayoutParams sendParams = new LinearLayout.LayoutParams(dp(36), dp(36));
        sendParams.leftMargin = dp(6);
        inputContainer.addView(sendButton, sendParams);
        sendButton.setOnClickListener(v -> sendCurrentText());
        composer.setOnEditorActionListener((view, actionId, event) -> {
            boolean enter = event != null && event.getKeyCode() == KeyEvent.KEYCODE_ENTER && event.getAction() == KeyEvent.ACTION_DOWN;
            if (actionId == EditorInfo.IME_ACTION_SEND || enter) {
                sendCurrentText();
                return true;
            }
            return false;
        });

        recordButton = roundAction("◉", "Записать голосовое сообщение");
        LinearLayout.LayoutParams recordParams = new LinearLayout.LayoutParams(dp(44), dp(44));
        recordParams.leftMargin = dp(8);
        composerRow.addView(recordButton, recordParams);
        recordButton.setOnClickListener(v -> toggleVoiceRecording());
    }

    private void confirmLeaveRoom() {
        new AlertDialog.Builder(this)
                .setTitle("Отключиться от комнаты?")
                .setMessage("P2P-соединение и уведомления этой комнаты будут остановлены.")
                .setNegativeButton("Остаться", null)
                .setPositiveButton("Отключиться", (dialog, which) -> leaveRoom())
                .show();
    }

    private void leaveRoom() {
        if (session != null) session.removeListener(chatListener);
        if (service != null) service.leaveRoom();
        else {
            Intent stop = new Intent(this, ChatConnectionService.class).setAction(ChatConnectionService.ACTION_LEAVE);
            try { startService(stop); } catch (Exception ignored) { }
        }
        if (bound) {
            try { unbindService(serviceConnection); } catch (Exception ignored) { }
            bound = false;
        }
        session = null;
        service = null;
        roomCode = "";
        showHome();
    }

    private void attachSessionWhenReady(int attempt) {
        if (service == null || isFinishing()) return;
        ChatSession current = service.getSession();
        if (current != null) {
            if (session != current) {
                if (session != null) session.removeListener(chatListener);
                session = current;
                session.addListener(chatListener);
            }
            return;
        }
        if (attempt < 20) uiHandler.postDelayed(() -> attachSessionWhenReady(attempt + 1), 150L);
    }

    private void enterRoom(String code, String displayName) {
        String normalized = RoomCode.normalize(code);
        if (normalized.isEmpty()) {
            toast("Некорректный код комнаты.");
            return;
        }
        if (bound && !normalized.equals(roomCode)) {
            if (session != null) session.removeListener(chatListener);
            try { unbindService(serviceConnection); } catch (Exception ignored) { }
            bound = false;
            session = null;
            service = null;
        }
        roomCode = normalized;
        String name = displayName == null || displayName.trim().isEmpty() ? "Гость" : displayName.trim();
        if (name.length() > 32) name = name.substring(0, 32);
        Intent serviceIntent = new Intent(this, ChatConnectionService.class)
                .setAction(ChatConnectionService.ACTION_CONNECT)
                .putExtra(ChatConnectionService.EXTRA_ROOM, roomCode)
                .putExtra(ChatConnectionService.EXTRA_NAME, name);
        try {
            ContextCompat.startForegroundService(this, serviceIntent);
            if (!bound) {
                bound = bindService(new Intent(this, ChatConnectionService.class), serviceConnection, Context.BIND_AUTO_CREATE);
            }
        } catch (Exception ex) {
            toast("Не удалось запустить службу чата: " + ex.getMessage());
        }
        showChat();
    }

    private void sendCurrentText() {
        if (composer == null) return;
        String value = composer.getText().toString();
        if (value.trim().isEmpty()) return;
        if (session == null) {
            toast("Подключаем комнату, подождите секунду.");
            return;
        }
        session.sendText(value);
        composer.setText("");
        hideKeyboard();
    }

    private void showAttachmentMenu(View anchor) {
        PopupMenu menu = new PopupMenu(this, anchor);
        menu.getMenu().add(0, 1, 0, "Фото");
        menu.getMenu().add(0, 2, 1, "Видео из галереи");
        menu.getMenu().add(0, 3, 2, "Музыка / аудио");
        menu.getMenu().add(0, 4, 3, "Видеокружок · записать");
        menu.getMenu().add(0, 5, 4, "Другой файл");
        menu.setOnMenuItemClickListener(item -> {
            if (item.getItemId() == 1) openPicker("image/*", null);
            else if (item.getItemId() == 2) openPicker("video/*", null);
            else if (item.getItemId() == 3) openPicker("audio/*", null);
            else if (item.getItemId() == 4) launchVideoCircle();
            else openPicker("*/*", ChatMessage.FILE);
            return true;
        });
        menu.show();
    }

    private void openPicker(String mimeType, String kind) {
        pendingMediaKind = kind;
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.setType(mimeType);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
        documentPicker.launch(intent);
    }

    private void launchVideoCircle() {
        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_DURATION_LIMIT, 60);
        intent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY, 1);
        try {
            videoCapture.launch(intent);
        } catch (Exception ex) {
            toast("На устройстве нет доступной камеры для записи видео.");
        }
    }

    private void sendMedia(Uri uri, String kind) {
        if (session == null) {
            toast("Сначала подключитесь к комнате.");
            return;
        }
        session.sendAttachment(uri, kind);
    }

    private void toggleVoiceRecording() {
        if (recording) {
            stopVoiceRecording(true);
            return;
        }
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            audioPermission.launch(Manifest.permission.RECORD_AUDIO);
            return;
        }
        startVoiceRecording();
    }

    private void startVoiceRecording() {
        if (session == null) {
            toast("Сначала подключитесь к комнате.");
            return;
        }
        try {
            File directory = new File(getFilesDir(), "media/voice");
            if (!directory.exists() && !directory.mkdirs()) throw new IllegalStateException("Не удалось создать папку записи");
            voiceFile = new File(directory, "voice-" + System.currentTimeMillis() + ".m4a");
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) mediaRecorder = new MediaRecorder(this);
            else mediaRecorder = new MediaRecorder();
            mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
            mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
            mediaRecorder.setAudioSamplingRate(44_100);
            mediaRecorder.setAudioEncodingBitRate(96_000);
            mediaRecorder.setMaxDuration(120_000);
            mediaRecorder.setOutputFile(voiceFile.getAbsolutePath());
            mediaRecorder.prepare();
            mediaRecorder.start();
            recording = true;
            voiceStartedAt = System.currentTimeMillis();
            if (recordButton != null) {
                recordButton.setText("■");
                recordButton.setTextColor(ERROR);
                recordButton.setContentDescription("Остановить запись голосового сообщения");
            }
            if (recordHint != null) {
                recordHint.setText("● ИДЁТ ЗАПИСЬ · НАЖМИТЕ ■, ЧТОБЫ ОТПРАВИТЬ");
                recordHint.setVisibility(View.VISIBLE);
            }
        } catch (Exception ex) {
            stopVoiceRecording(false);
            toast("Не удалось начать запись: " + ex.getMessage());
        }
    }

    private void stopVoiceRecording(boolean send) {
        boolean wasRecording = recording;
        recording = false;
        if (mediaRecorder != null) {
            try { if (wasRecording) mediaRecorder.stop(); } catch (Exception ignored) { }
            try { mediaRecorder.reset(); mediaRecorder.release(); } catch (Exception ignored) { }
            mediaRecorder = null;
        }
        if (recordButton != null) {
            recordButton.setText("◉");
            recordButton.setTextColor(TEXT);
            recordButton.setContentDescription("Записать голосовое сообщение");
        }
        if (recordHint != null) recordHint.setVisibility(View.GONE);
        File finished = voiceFile;
        voiceFile = null;
        if (send && wasRecording && finished != null && finished.exists()) {
            if (System.currentTimeMillis() - voiceStartedAt < 700L || finished.length() < 256L) {
                finished.delete();
                toast("Запись слишком короткая.");
            } else {
                sendMedia(Uri.fromFile(finished), ChatMessage.VOICE);
            }
        } else if (finished != null && (!send || !wasRecording)) {
            finished.delete();
        }
    }

    private String getDisplayName() {
        String value = nameEdit == null ? ChatConnectionService.storedName(this) : nameEdit.getText().toString().trim();
        return value.isEmpty() ? "Гость" : value;
    }

    private void shareRoom() {
        if (roomCode.isEmpty()) return;
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        if (clipboard != null) clipboard.setPrimaryClip(ClipData.newPlainText("Nox room", roomCode));
        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text/plain");
        share.putExtra(Intent.EXTRA_TEXT, "Подключись ко мне в Nox P2P. Код комнаты: " + roomCode);
        try {
            startActivity(Intent.createChooser(share, "Пригласить в Nox"));
        } catch (Exception ex) {
            toast("Код скопирован: " + roomCode);
        }
    }

    private void renderHistory(List<ChatMessage> history) {
        if (messagesColumn == null) return;
        messagesColumn.removeAllViews();
        messageViews.clear();
        if (history == null || history.isEmpty()) {
            if (emptyChatView != null) messagesColumn.addView(emptyChatView);
            return;
        }
        for (ChatMessage message : history) renderMessage(message, false);
        scrollToBottom();
    }

    private void renderMessage(ChatMessage message) {
        renderMessage(message, true);
    }

    private void renderMessage(ChatMessage message, boolean scroll) {
        if (messagesColumn == null || message == null) return;
        if (emptyChatView != null && emptyChatView.getParent() == messagesColumn) messagesColumn.removeView(emptyChatView);
        View old = messageViews.remove(message.id);
        if (old != null && old.getParent() == messagesColumn) messagesColumn.removeView(old);

        LinearLayout row = new LinearLayout(this);
        row.setGravity(message.outgoing ? Gravity.RIGHT : Gravity.LEFT);
        row.setPadding(0, dp(4), 0, dp(4));
        messagesColumn.addView(row, new LinearLayout.LayoutParams(-1, -2));

        LinearLayout bubble = new LinearLayout(this);
        bubble.setOrientation(LinearLayout.VERTICAL);
        bubble.setPadding(dp(13), dp(10), dp(13), dp(8));
        bubble.setBackground(rounded(message.outgoing ? ACCENT_DARK : SURFACE, dp(17),
                message.outgoing ? ACCENT_DARK : BORDER, dp(1)));
        LinearLayout.LayoutParams bubbleParams = new LinearLayout.LayoutParams(0, -2, 0);
        bubbleParams.width = Math.min(dp(300), getResources().getDisplayMetrics().widthPixels - dp(82));
        row.addView(bubble, bubbleParams);

        if (ChatMessage.TEXT.equals(message.kind)) {
            TextView content = text(message.text, 15, TEXT, false);
            content.setLineSpacing(dp(3), 1.02f);
            bubble.addView(content);
        } else {
            addAttachmentContent(bubble, message);
        }
        LinearLayout footer = new LinearLayout(this);
        footer.setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
        LinearLayout.LayoutParams footerParams = new LinearLayout.LayoutParams(-1, -2);
        footerParams.topMargin = dp(5);
        bubble.addView(footer, footerParams);
        TextView status = text(statusFor(message), 9, MUTED, false);
        footer.addView(status);
        TextView time = text("  " + formatTime(message.timeMs), 9, MUTED, false);
        footer.addView(time);
        messageViews.put(message.id, row);
        if (scroll) scrollToBottom();
    }

    private void addAttachmentContent(LinearLayout bubble, ChatMessage message) {
        LinearLayout fileRow = new LinearLayout(this);
        fileRow.setGravity(Gravity.CENTER_VERTICAL);
        bubble.addView(fileRow, new LinearLayout.LayoutParams(-1, -2));
        TextView icon = text(iconFor(message.kind), 18, ACCENT, true);
        icon.setGravity(Gravity.CENTER);
        icon.setBackground(rounded(RAISED, dp(12)));
        fileRow.addView(icon, new LinearLayout.LayoutParams(dp(42), dp(42)));
        LinearLayout details = new LinearLayout(this);
        details.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams detailsParams = new LinearLayout.LayoutParams(0, -2, 1);
        detailsParams.leftMargin = dp(10);
        fileRow.addView(details, detailsParams);
        TextView title = text(labelFor(message.kind), 13, TEXT, true);
        details.addView(title);
        TextView fileName = text(message.fileName.isEmpty() ? "Вложение" : message.fileName, 11, MUTED, false);
        fileName.setMaxLines(1);
        fileName.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        details.addView(fileName);
        String sub = message.status == ChatMessage.RECEIVING ? "Получение…" :
                message.status == ChatMessage.SENDING ? "Отправка…" :
                        message.status == ChatMessage.FAILED ? "Передача не завершена" : sizeLabel(message.sizeBytes) + " · нажмите, чтобы открыть";
        TextView state = text(sub, 10, message.status == ChatMessage.FAILED ? ERROR : MUTED, false);
        LinearLayout.LayoutParams stateParams = new LinearLayout.LayoutParams(-1, -2);
        stateParams.topMargin = dp(3);
        details.addView(state, stateParams);
        if (message.status == ChatMessage.READY && !message.attachmentUri.isEmpty()) {
            bubble.setOnClickListener(v -> openAttachment(message));
            bubble.setContentDescription(labelFor(message.kind) + ", " + message.fileName + ". Открыть");
        }
    }

    private void openAttachment(ChatMessage message) {
        try {
            Uri uri;
            if (message.attachmentUri.startsWith("/")) {
                uri = androidx.core.content.FileProvider.getUriForFile(this,
                        getPackageName() + ".files", new File(message.attachmentUri));
            } else {
                uri = Uri.parse(message.attachmentUri);
            }
            Intent open = new Intent(Intent.ACTION_VIEW);
            open.setDataAndType(uri, message.mimeType == null ? "*/*" : message.mimeType);
            open.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(open);
        } catch (Exception ex) {
            toast("Не найдено приложение для открытия этого вложения.");
        }
    }

    private String statusFor(ChatMessage message) {
        if (message.status == ChatMessage.SENDING) return "Отправка";
        if (message.status == ChatMessage.RECEIVING) return "Получение";
        if (message.status == ChatMessage.FAILED) return "Ошибка";
        return message.outgoing ? "Отправлено P2P" : "Получено";
    }

    private String iconFor(String kind) {
        if (ChatMessage.PHOTO.equals(kind)) return "▧";
        if (ChatMessage.VIDEO.equals(kind)) return "▶";
        if (ChatMessage.CIRCLE.equals(kind)) return "◉";
        if (ChatMessage.VOICE.equals(kind)) return "♫";
        if (ChatMessage.AUDIO.equals(kind)) return "♪";
        return "⇩";
    }

    private String labelFor(String kind) {
        if (ChatMessage.PHOTO.equals(kind)) return "Фото";
        if (ChatMessage.VIDEO.equals(kind)) return "Видео";
        if (ChatMessage.CIRCLE.equals(kind)) return "Видеокружок";
        if (ChatMessage.VOICE.equals(kind)) return "Голосовое";
        if (ChatMessage.AUDIO.equals(kind)) return "Музыка / аудио";
        return "Файл";
    }

    private String sizeLabel(long bytes) {
        if (bytes < 1024) return bytes + " Б";
        if (bytes < 1024 * 1024) return String.format(Locale.getDefault(), "%.0f КБ", bytes / 1024.0);
        return String.format(Locale.getDefault(), "%.1f МБ", bytes / (1024.0 * 1024.0));
    }

    private String formatTime(long timeMs) {
        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(timeMs));
    }

    private void updateConnectionState(String state, String detail) {
        if (stateView == null) return;
        stateView.setText(detail == null ? "" : detail);
        if ("connected".equals(state)) stateView.setTextColor(ACCENT);
        else if ("error".equals(state)) stateView.setTextColor(ERROR);
        else stateView.setTextColor(TEXT);
    }

    private void hideKeyboard() {
        View view = getCurrentFocus();
        if (view != null) {
            InputMethodManager manager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            if (manager != null) manager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private void scrollToBottom() {
        if (messagesScroll == null) return;
        messagesScroll.post(() -> messagesScroll.fullScroll(View.FOCUS_DOWN));
    }

    private void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    private EditText editField(String hint, boolean monospace) {
        EditText edit = new EditText(this);
        edit.setTextColor(TEXT);
        edit.setHintTextColor(MUTED);
        edit.setHint(hint);
        edit.setTextSize(15);
        edit.setSingleLine(true);
        edit.setPadding(dp(14), 0, dp(14), 0);
        edit.setBackground(rounded(RAISED, dp(14), BORDER, dp(1)));
        if (monospace) edit.setTypeface(Typeface.MONOSPACE, Typeface.NORMAL);
        return edit;
    }

    private TextView button(String label, int backgroundColor, int textColor, boolean bold) {
        TextView button = text(label, 14, textColor, bold);
        button.setGravity(Gravity.CENTER);
        button.setBackground(rounded(backgroundColor, dp(15), backgroundColor, dp(1)));
        button.setClickable(true);
        button.setFocusable(true);
        button.setLetterSpacing(0.01f);
        return button;
    }

    private TextView roundAction(String label, String description) {
        TextView button = text(label, 19, TEXT, true);
        button.setGravity(Gravity.CENTER);
        button.setBackground(rounded(RAISED, dp(22), BORDER, dp(1)));
        button.setContentDescription(description);
        button.setClickable(true);
        button.setFocusable(true);
        return button;
    }

    private TextView text(String value, int sizeSp, int color, boolean bold) {
        TextView text = new TextView(this);
        text.setText(value);
        text.setTextSize(sizeSp);
        text.setTextColor(color);
        if (bold) text.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        text.setIncludeFontPadding(true);
        return text;
    }

    private GradientDrawable rounded(int color, int radiusDp) {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setColor(color);
        drawable.setCornerRadius(dp(radiusDp));
        return drawable;
    }

    private GradientDrawable rounded(int color, int radiusDp, int strokeColor, int strokeWidthDp) {
        GradientDrawable drawable = rounded(color, radiusDp);
        drawable.setStroke(dp(strokeWidthDp), strokeColor);
        return drawable;
    }

    private void addSpace(LinearLayout parent, int heightDp) {
        parent.addView(new View(this), new LinearLayout.LayoutParams(1, dp(heightDp)));
    }

    private int dp(int value) {
        return Math.round(value * getResources().getDisplayMetrics().density);
    }
}
