package com.mailgram.app.ui;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.mailgram.app.R;
import com.mailgram.app.crypto.B64;
import com.mailgram.app.crypto.Identity;
import com.mailgram.app.crypto.NativeCrypto;
import com.mailgram.app.media.MediaUtil;
import com.mailgram.app.media.VoiceRecorder;
import com.mailgram.app.media.VoiceWaveView;
import com.mailgram.app.net.Auth;
import com.mailgram.app.store.Chat;
import com.mailgram.app.store.Msg;
import com.mailgram.app.store.Prefs;
import com.mailgram.app.store.Store;
import com.mailgram.app.sync.SyncEngine;
import com.mailgram.app.sync.SyncService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/** Экран диалога: пузыри, медиа всех типов, ответы смахиванием, реакции и голосовые. */
public class ChatActivity extends AppCompatActivity implements SyncEngine.Listener {

    public static final String EXTRA_CHAT_UID = "chat_uid";
    /** Имя общего элемента (аватар) для плавного перехода из списка чатов. */
    public static final String EXTRA_SHARED_AVATAR = "shared_avatar";
    /** Открыть чат сразу на нужном сообщении (переход из глобального поиска). */
    public static final String EXTRA_JUMP_MID = "jump_mid";

    private static final int REQ_PICK_PHOTO = 3001;
    private static final int REQ_PICK_VIDEO = 3002;
    private static final int REQ_PICK_FILE = 3003;
    private static final int REQ_CIRCLE = 3004;
    private static final int REQ_CAMERA = 3005;
    private static final int REQ_AUDIO_PERMISSION = 3010;
    private static final int REQ_CAMERA_PERMISSION = 3011;

    private static final String[] QUICK_REACTIONS = {"❤️", "👍", "😂", "🔥", "🙏", "😮", "😢", "💯"};

    private static final String[] EMOJI = {
            "😀", "😁", "😂", "🤣", "😊", "😍", "😘", "😎",
            "🤔", "😴", "😢", "😡", "👍", "👎", "🙏", "👏",
            "🔥", "💯", "🎉", "❤️", "💙", "😅", "🤝", "✌️",
            "🤗", "😇", "🥳", "😜", "🤯", "😱", "🥺", "😭",
            "🙈", "🤫", "💪", "✨", "⭐", "🌈", "☕", "🍕",
            "⚽", "🚀", "🌍", "📌", "✅", "❌", "⏰", "🎁",
            "📷", "🎵", "📞", "💬", "🔒", "🔑", "🖼", "😺"};

    private String uid;
    private Chat chat;
    private View header;
    private AvatarView avatar;
    private TextView titleView;
    private TextView subtitleView;
    private RecyclerView list;
    private MessageAdapter adapter;
    private EditText input;
    private EditText searchEdit;
    private View searchBar;
    private View banner;
    private TextView bannerText;
    private MaterialButton bannerAction;
    private GridLayout emojiPanel;
    private View replyBar;
    private TextView replyName;
    private TextView replyText;
    private View sendButton;
    private View micButton;
    private View voiceBar;
    private TextView voiceTimer;
    private TextView voiceHint;
    private VoiceWaveView liveWave;
    private View pinnedRow;
    private TextView pinnedText;
    private View scrollDown;
    private TextView scrollBadge;
    private View selectionBar;
    private TextView selectionTitle;
    private boolean selecting;
    private boolean sendShown;

    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable poller;
    private int lastCount = -1;
    private Msg replyTo;
    private boolean pendingAudioPermission;

    private File pendingCameraFile;
    private VoiceRecorder recorder;
    private Runnable recordTicker;
    private boolean recordCancelled;
    private float downRawX;

    private MediaPlayer player;
    private String playingMid = "";
    private float playbackSpeed = 1f;
    private Runnable playTicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        uid = getIntent().getStringExtra(EXTRA_CHAT_UID);
        chat = Store.get(this).chat(uid);
        if (chat == null || Auth.account(this).isEmpty()) {
            finish();
            return;
        }
        setContentView(R.layout.activity_chat);
        Ui.applyWallpaper(this, R.id.chat_root);
        Ui.applySystemBars(this, findViewById(R.id.chat_header), findViewById(R.id.input_bar));

        header = findViewById(R.id.chat_header);
        avatar = findViewById(R.id.chat_avatar);
        titleView = findViewById(R.id.chat_title);
        subtitleView = findViewById(R.id.chat_subtitle);
        list = findViewById(R.id.recycler_messages);
        input = findViewById(R.id.input_edit);
        searchEdit = findViewById(R.id.chat_search_edit);
        searchBar = findViewById(R.id.chat_search_bar);
        banner = findViewById(R.id.chat_banner);
        bannerText = findViewById(R.id.chat_banner_text);
        bannerAction = findViewById(R.id.chat_banner_action);
        emojiPanel = findViewById(R.id.emoji_panel);
        replyBar = findViewById(R.id.chat_reply_bar);
        replyName = findViewById(R.id.chat_reply_name);
        replyText = findViewById(R.id.chat_reply_text);
        sendButton = findViewById(R.id.btn_send);
        micButton = findViewById(R.id.btn_mic);
        voiceBar = findViewById(R.id.voice_record_bar);
        voiceTimer = findViewById(R.id.voice_timer);
        voiceHint = findViewById(R.id.voice_hint);
        liveWave = findViewById(R.id.voice_live_wave);
        pinnedRow = findViewById(R.id.chat_pinned);
        pinnedText = findViewById(R.id.chat_pinned_text);
        scrollDown = findViewById(R.id.btn_scroll_down);
        scrollBadge = findViewById(R.id.scroll_unread_badge);

        String sharedAvatar = getIntent().getStringExtra(EXTRA_SHARED_AVATAR);
        if (sharedAvatar != null && !sharedAvatar.isEmpty()) {
            avatar.setTransitionName(sharedAvatar);
            androidx.core.view.ViewCompat.setTransitionName(avatar, sharedAvatar);
        }
        findViewById(R.id.chat_back).setOnClickListener(v -> finishAfterTransition());
        findViewById(R.id.chat_menu_btn).setOnClickListener(v -> showSheet());
        findViewById(R.id.chat_search_btn).setOnClickListener(v -> toggleSearch());
        Anim.pressFeedback(avatar);

        adapter = new MessageAdapter(new MessageAdapter.Actions() {
            @Override
            public void onMessageLongPress(Msg msg, View anchor) {
                if (selecting) {
                    adapter.toggleSelection(msg);
                    return;
                }
                messageMenu(msg);
            }

            @Override
            public void onMessageClick(Msg msg) {
                if (msg.state == Msg.STATE_FAILED) {
                    SyncEngine.get(ChatActivity.this).retry(chat, msg, null);
                    refresh();
                } else if (msg.hasMedia() && !msg.isVoice()) {
                    openViewer(msg);
                }
            }

            @Override
            public void onReply(Msg msg) {
                setReplyTarget(msg);
            }

            @Override
            public void onVoiceTap(Msg msg, VoiceWaveView wave, ImageView play) {
                toggleVoice(msg);
            }

            @Override
            public void onReactionTap(Msg msg, String emoji) {
                SyncEngine.get(ChatActivity.this).sendReaction(chat, msg, emoji, null);
                Anim.haptic(sendButton, false);
                refresh();
            }

            @Override
            public void onVoiceSpeed(Msg msg) {
                cycleSpeed();
            }

            @Override
            public void onJumpToMessage(Msg msg) {
                jumpTo(msg.replyMid);
            }

            @Override
            public void onSelectionChanged(int count) {
                updateSelectionUi(count);
            }
        });
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setStackFromEnd(true);
        list.setLayoutManager(manager);
        list.setAdapter(adapter);
        list.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView view, int dx, int dy) {
                updateScrollButton();
                if (!Anim.enabled(ChatActivity.this)) return;
                if (dy > 6 && list.canScrollVertically(-1)) {
                    hideHeader(true);
                } else if (dy < -6) {
                    hideHeader(false);
                }
            }
        });

        sendButton.setOnClickListener(v -> {
            Anim.haptic(v, false);
            sendMessage();
        });
        final View emojiButton = findViewById(R.id.btn_emoji);
        emojiButton.setOnClickListener(v -> toggleEmoji());
        final View attachButton = findViewById(R.id.btn_attach);
        attachButton.setOnClickListener(v -> showAttachSheet());
        Anim.pressFeedback(attachButton);
        Anim.pressFeedback(emojiButton);
        Anim.pressFeedback(sendButton);
        Anim.pressFeedback(micButton);
        findViewById(R.id.chat_reply_close).setOnClickListener(v -> setReplyTarget(null));
        findViewById(R.id.chat_search_close).setOnClickListener(v -> closeSearch());
        scrollDown.setOnClickListener(v -> scrollToBottom());
        View.OnClickListener info = v -> showChatInfo();
        findViewById(R.id.chat_title).setOnClickListener(info);
        avatar.setOnClickListener(info);
        setUpVoiceButton();
        selectionBar = findViewById(R.id.selection_bar);
        selectionTitle = findViewById(R.id.selection_title);
        findViewById(R.id.sel_close).setOnClickListener(v -> exitSelection());
        findViewById(R.id.sel_copy).setOnClickListener(v -> copySelected());
        findViewById(R.id.sel_forward).setOnClickListener(v -> forwardSelected());
        findViewById(R.id.sel_pin).setOnClickListener(v -> pinSelected());
        findViewById(R.id.sel_delete).setOnClickListener(v -> deleteSelected());

        input.setOnEditorActionListener((v, actionId, event) -> {
            sendMessage();
            return true;
        });
        input.addTextChangedListener(new android.text.TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                boolean hasText = s.toString().trim().length() > 0;
                if (hasText != sendShown) {
                    sendShown = hasText;
                    if (hasText) {
                        sendButton.setVisibility(View.VISIBLE);
                        Anim.pop(sendButton);
                        micButton.setVisibility(View.GONE);
                    } else {
                        micButton.setVisibility(View.VISIBLE);
                        Anim.fadeIn(micButton, 180L);
                        sendButton.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void afterTextChanged(android.text.Editable s) {
            }
        });
        searchEdit.addTextChangedListener(new android.text.TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.setFilter(s.toString());
                List<Msg> messages = Store.get(ChatActivity.this).messages(uid);
                adapter.submit(messages, unreadAnchor(messages), ChatActivity.this);
            }

            @Override
            public void afterTextChanged(android.text.Editable s) {
            }
        });

        buildEmojiPanel();
        bannerAction.setOnClickListener(v -> inviteDialog());
        restoreDraft();
        SyncEngine.get(this).addListener(this);
        refresh();
    }

    // ---------------- меню ----------------

    private boolean onMenu(MenuItem item) {
        return handleMenuId(item.getItemId());
    }

    private boolean handleMenuId(int id) {
        if (id == R.id.action_search) {
            toggleSearch();
            return true;
        }
        if (id == R.id.action_pin) {
            chat = Store.get(this).chat(uid);
            Store.get(this).setPinned(uid, !chat.pinned);
            refresh();
            return true;
        }
        if (id == R.id.action_mute) {
            chat = Store.get(this).chat(uid);
            Store.get(this).setMuted(uid, !chat.muted);
            refresh();
            return true;
        }
        if (id == R.id.action_safety) {
            showSafety();
            return true;
        }
        if (id == R.id.action_export) {
            exportChat();
            return true;
        }
        if (id == R.id.action_rename) {
            renameDialog();
            return true;
        }
        if (id == R.id.action_clear) {
            new MaterialAlertDialogBuilder(this)
                    .setTitle(R.string.clear_history_title)
                    .setMessage(R.string.clear_history_text)
                    .setNegativeButton(R.string.cancel, null)
                    .setPositiveButton(R.string.clear, (d, w) -> {
                        Store.get(this).clearHistory(uid);
                        lastCount = -1;
                        refresh();
                    })
                    .show();
            return true;
        }
        if (id == R.id.action_delete) {
            new MaterialAlertDialogBuilder(this)
                    .setTitle(R.string.delete_chat_title)
                    .setMessage(R.string.delete_chat_text)
                    .setNegativeButton(R.string.cancel, null)
                    .setPositiveButton(R.string.delete, (d, w) -> {
                        Store.get(this).removeChat(uid);
                        finish();
                    })
                    .show();
            return true;
        }
        return false;
    }

    private void toggleSearch() {
        boolean visible = searchBar.getVisibility() == View.VISIBLE;
        searchBar.setVisibility(visible ? View.GONE : View.VISIBLE);
        if (!visible) {
            searchEdit.requestFocus();
            android.view.inputmethod.InputMethodManager imm =
                    (android.view.inputmethod.InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            if (imm != null) imm.showSoftInput(searchEdit, android.view.inputmethod.InputMethodManager.SHOW_IMPLICIT);
        } else {
            closeSearch();
        }
    }

    private void closeSearch() {
        searchBar.setVisibility(View.GONE);
        searchEdit.setText("");
        adapter.setFilter("");
        List<Msg> messages = Store.get(this).messages(uid);
        adapter.submit(messages, unreadAnchor(messages), this);
    }

    // ---------------- жизненный цикл ----------------

    @Override
    protected void onResume() {
        super.onResume();
        markRead();
        refresh();
        SyncEngine.get(this).syncNow();
        if (poller != null) handler.removeCallbacks(poller);
        poller = new Runnable() {
            @Override
            public void run() {
                SyncEngine.get(ChatActivity.this).syncNow();
                handler.postDelayed(this, 4000);
            }
        };
        handler.postDelayed(poller, 4000);
        if (Prefs.backgroundSync(this)) SyncService.start(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (poller != null) handler.removeCallbacks(poller);
        saveDraft();
        stopPlayback();
    }

    @Override
    public void onBackPressed() {
        if (selecting) {
            exitSelection();
            return;
        }
        if (replyBar != null && replyBar.getVisibility() == View.VISIBLE) {
            setReplyTarget(null);
            return;
        }
        if (emojiPanel != null && emojiPanel.getVisibility() == View.VISIBLE) {
            toggleEmoji();
            return;
        }
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        SyncEngine.get(this).removeListener(this);
        if (recorder != null) {
            recorder.cancel();
            recorder = null;
        }
        stopPlayback();
        super.onDestroy();
    }

    // ---------------- режим выбора нескольких сообщений ----------------

    private void enterSelection(Msg msg) {
        selecting = true;
        adapter.toggleSelection(msg);
        Anim.slidePanel(selectionBar, true);
        Anim.haptic(selectionBar, false);
        View inputBar = findViewById(R.id.input_bar);
        if (inputBar != null) inputBar.setVisibility(View.GONE);
        updateSelectionUi(adapter.selectedCount());
    }

    private void updateSelectionUi(int count) {
        if (!selecting) return;
        if (count <= 0) {
            exitSelection();
            return;
        }
        selectionTitle.setText(getString(R.string.selected_count, count));
    }

    private void exitSelection() {
        selecting = false;
        adapter.clearSelection();
        Anim.slidePanel(selectionBar, false);
        View inputBar = findViewById(R.id.input_bar);
        if (inputBar != null) inputBar.setVisibility(View.VISIBLE);
    }

    /** Собранные сообщения из списка выбранных, в порядке ленты. */
    private List<Msg> selectedMessages() {
        List<Msg> picked = new ArrayList<>();
        for (Msg m : Store.get(this).messages(uid)) {
            if (adapter.selectedMids().contains(m.mid)) picked.add(m);
        }
        return picked;
    }

    private void copySelected() {
        List<Msg> picked = selectedMessages();
        StringBuilder sb = new StringBuilder();
        for (Msg m : picked) {
            if (m.text != null && !m.text.isEmpty()) {
                if (sb.length() > 0) sb.append('\n');
                sb.append(m.text);
            }
        }
        if (sb.length() == 0) {
            Ui.toast(this, getString(R.string.nothing_here));
            return;
        }
        Ui.copy(this, getString(R.string.copy), sb.toString());
        exitSelection();
    }

    private void pinSelected() {
        List<Msg> picked = selectedMessages();
        boolean allPinned = true;
        for (Msg m : picked) {
            if (!m.pinned) {
                allPinned = false;
                break;
            }
        }
        final boolean pin = !allPinned;
        for (Msg m : picked) {
            SyncEngine.get(this).sendPin(chat, m, pin, null);
        }
        Ui.toast(this, getString(pin ? R.string.pinned_toast : R.string.unpinned_toast, picked.size()));
        exitSelection();
        refresh();
    }

    private void deleteSelected() {
        final List<Msg> picked = selectedMessages();
        if (picked.isEmpty()) {
            exitSelection();
            return;
        }
        new MaterialAlertDialogBuilder(this)
                .setTitle(getString(R.string.delete_for_all))
                .setMessage(getString(R.string.delete_many_confirm, picked.size()))
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.delete_for_all, (d, w) -> {
                    for (Msg m : picked) {
                        SyncEngine.get(this).sendDelete(chat, m, null);
                    }
                    exitSelection();
                    refresh();
                })
                .show();
    }

    private void forwardSelected() {
        final List<Msg> picked = selectedMessages();
        if (picked.isEmpty()) {
            exitSelection();
            return;
        }
        final List<Chat> chats = new ArrayList<>(Store.get(this).chats());
        if (chats.isEmpty()) {
            Ui.toast(this, getString(R.string.nothing_here));
            return;
        }
        String[] names = new String[chats.size()];
        for (int i = 0; i < chats.size(); i++) {
            Chat c = chats.get(i);
            names[i] = (c.name != null && !c.name.isEmpty() ? c.name : Store.displayName(this, c.peer));
        }
        new MaterialAlertDialogBuilder(this)
                .setTitle(getString(R.string.forward_to_chat))
                .setItems(names, (d, which) -> {
                    Chat target = chats.get(which);
                    int limit = Math.min(picked.size(), 20);
                    for (int i = 0; i < limit; i++) {
                        SyncEngine.get(this).sendForward(target, picked.get(i), null);
                    }
                    Ui.toast(this, getString(R.string.forwarded_count, limit));
                    exitSelection();
                })
                .show();
    }

    /** Профиль собеседника — как .profile-view-modal в старом мессенджере. */
    private void showChatInfo() {
        showProfile();
    }

    private void showProfile() {
        chat = Store.get(this).chat(uid);
        if (chat == null) return;
        final View view = findViewById(R.id.profile_view);
        if (view == null) return;
        String title = chat.name != null && !chat.name.isEmpty()
                ? chat.name : Store.displayName(this, chat.peer);
        String myKey = "";
        try {
            myKey = B64.str(Identity.publicKeyRaw(this));
        } catch (Exception ignored) {
        }
        final String number = Ui.safetyNumber(chat.peerPublic, myKey);
        ((AvatarView) findViewById(R.id.profile_avatar)).setName(title);
        ((TextView) findViewById(R.id.profile_name)).setText(title);
        ((TextView) findViewById(R.id.profile_status)).setText(chat.peer);
        int[] counts = Store.get(this).mediaCounts(uid);
        ((TextView) findViewById(R.id.profile_info_count))
                .setText(getString(R.string.media_count, counts[0], counts[1], counts[2]));
        final TextView verify = findViewById(R.id.profile_info_key);
        verify.setText(chat.verified ? R.string.verified_short : R.string.unverified_short);
        verify.setOnClickListener(v -> {
            Store.get(this).setVerified(uid, !chat.verified);
            chat = Store.get(this).chat(uid);
            verify.setText(chat != null && chat.verified
                    ? R.string.verified_short : R.string.unverified_short);
            Anim.haptic(verify, false);
        });
        TextView keyBox = findViewById(R.id.profile_key_box);
        keyBox.setText(number.isEmpty() ? chat.peer : number);
        keyBox.setOnClickListener(v -> Ui.copy(this, getString(R.string.safety_number),
                number.isEmpty() ? chat.peer : number));
        findViewById(R.id.profile_close).setOnClickListener(v -> hideProfile());
        view.setVisibility(View.VISIBLE);
        view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, R.anim.slide_up));
        Anim.haptic(view, false);
    }

    private void hideProfile() {
        final View view = findViewById(R.id.profile_view);
        if (view == null) return;
        view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, R.anim.slide_down));
        view.postDelayed(() -> view.setVisibility(View.GONE), 200L);
    }

    /** Шторка действий — .action-sheet: фон затемняется, панель выезжает снизу. */
    private void showSheet() {
        final View sheet = findViewById(R.id.chat_sheet);
        if (sheet == null) return;
        sheet.setVisibility(View.VISIBLE);
        sheet.setAlpha(0f);
        sheet.animate().alpha(1f).setDuration(150L).start();
        final View panel = ((ViewGroup) sheet).getChildAt(0);
        if (panel != null) {
            panel.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, R.anim.sheet_up));
            panel.setOnClickListener(v -> {
            });
        }
        sheet.setOnClickListener(v -> hideSheet());
        int[] ids = {R.id.action_pin, R.id.action_mute, R.id.action_search, R.id.action_export,
                R.id.action_safety, R.id.action_rename, R.id.action_clear, R.id.action_delete};
        for (int itemId : ids) {
            final int actionId = itemId;
            View item = findViewById(actionId);
            if (item == null) continue;
            item.setOnClickListener(v -> {
                hideSheet();
                handleMenuId(actionId);
            });
            Anim.pressFeedback(item);
        }
    }

    private void hideSheet() {
        final View sheet = findViewById(R.id.chat_sheet);
        if (sheet == null) return;
        sheet.animate().alpha(0f).setDuration(150L)
                .withEndAction(() -> sheet.setVisibility(View.GONE)).start();
    }

    /** Плавный переход к сообщению по его mid с короткой вспышкой подсветки. */
    private void jumpTo(final String mid) {
        if (mid == null || mid.isEmpty()) return;
        List<Msg> all = Store.get(this).messages(uid);
        for (int i = 0; i < all.size(); i++) {
            if (mid.equals(all.get(i).mid)) {
                final int position = i;
                final LinearLayoutManager manager = (LinearLayoutManager) list.getLayoutManager();
                if (manager != null) {
                    manager.scrollToPositionWithOffset(position, Ui.dp(this, 90));
                }
                list.postDelayed(() -> {
                    View row = manager == null ? null : manager.findViewByPosition(position);
                    if (row != null) {
                        Anim.pop(row);
                    }
                }, 280L);
                return;
            }
        }
        Ui.toast(this, getString(R.string.original_not_found));
    }

    private void markRead() {
        Store store = Store.get(this);
        List<Msg> unread = new ArrayList<>();
        for (Msg m : store.messages(uid)) {
            if (m.unread && !m.outgoing && m.gmailId != null && !m.gmailId.isEmpty()) {
                unread.add(m);
            }
        }
        store.markRead(uid);
        if (!unread.isEmpty()) SyncEngine.get(this).markReadOnServer(unread);
    }

    private String unreadAnchor(List<Msg> messages) {
        for (Msg m : messages) {
            if (m.unread && !m.outgoing) return m.mid;
        }
        return null;
    }

    private void refresh() {
        chat = Store.get(this).chat(uid);
        if (chat == null) {
            finish();
            return;
        }
        String title = chat.name != null && !chat.name.isEmpty()
                ? chat.name : Store.displayName(this, chat.peer);
        titleView.setText(title);
        avatar.setName(title);
        boolean hasKey = chat.peerPublic != null && !chat.peerPublic.isEmpty();
        boolean ratchet = com.mailgram.app.crypto.RatchetStore.hasSession(this, uid);
        subtitleView.setText(!hasKey
                ? getString(R.string.peer_no_key_short)
                : ratchet ? getString(R.string.ratchet_on) : "🔒 " + chat.peer);

        banner.setVisibility(hasKey ? View.GONE : View.VISIBLE);
        bannerText.setText(R.string.peer_no_key);

        List<Msg> messages = Store.get(this).messages(uid);
        Msg pinned = null;
        for (int i = messages.size() - 1; i >= 0; i--) {
            Msg m = messages.get(i);
            if (m.pinned) {
                pinned = m;
                break;
            }
        }
        if (pinned != null) {
            pinnedRow.setVisibility(View.VISIBLE);
            pinnedText.setText(pinned.previewText());
        } else {
            pinnedRow.setVisibility(View.GONE);
        }

        adapter.submit(messages, unreadAnchor(messages), this);
        String pending = getIntent().getStringExtra(EXTRA_JUMP_MID);
        if (pending != null && !pending.isEmpty()) {
            getIntent().removeExtra(EXTRA_JUMP_MID);
            final String mid = pending;
            handler.postDelayed(() -> jumpTo(mid), 420L);
        }
        if (messages.size() != lastCount) {
            lastCount = messages.size();
            list.post(() -> scrollToBottom());
        }
        updateScrollButton();
    }

    @Override
    public void onSyncDone(SyncEngine.Result result) {
        handler.post(this::refresh);
    }

    /** Шапка уезжает вверх при листании вниз и возвращается при листании вверх — как в Telegram. */
    private void hideHeader(boolean hide) {
        float target = hide ? -header.getHeight() : 0f;
        if (Math.abs(header.getTranslationY() - target) < 2f) return;
        header.animate().translationY(target)
                .setInterpolator(Anim.EMPHASIZED).setDuration(220L).start();
    }

    private void scrollToBottom() {
        if (adapter.getItemCount() == 0) return;
        list.scrollToPosition(adapter.getItemCount() - 1);
    }

    private void updateScrollButton() {
        LinearLayoutManager manager = (LinearLayoutManager) list.getLayoutManager();
        if (manager == null) return;
        boolean away = manager.findLastVisibleItemPosition() < adapter.getItemCount() - 3;
        View wrap = findViewById(R.id.scroll_down_wrap);
        wrap.setVisibility(away ? View.VISIBLE : View.GONE);
        if (away && scrollBadge != null) {
            int unread = 0;
            for (Msg m : Store.get(this).messages(uid)) {
                if (m.unread) unread++;
            }
            if (unread > 0) {
                scrollBadge.setText(unread > 99 ? "99+" : String.valueOf(unread));
                scrollBadge.setVisibility(View.VISIBLE);
                Anim.pop(scrollBadge);
            } else {
                scrollBadge.setVisibility(View.GONE);
            }
        }
    }

    // ---------------- отправка текста и вложений ----------------

    private void sendMessage() {
        String text = input.getText().toString().trim();
        if (text.isEmpty()) return;
        chat = Store.get(this).chat(uid);
        if (chat == null) return;
        if (chat.peerPublic == null || chat.peerPublic.isEmpty()) {
            inviteDialog();
            return;
        }
        Msg target = replyTo;
        input.setText("");
        Store.get(this).setDraft(uid, "");
        setReplyTarget(null);
        SyncEngine.get(this).sendText(chat, text, target, new SyncEngine.SendCallback() {
            @Override
            public void onSent(Msg message) {
                handler.post(ChatActivity.this::refresh);
            }

            @Override
            public void onError(final String error) {
                handler.post(() -> {
                    Ui.toast(ChatActivity.this, getString(R.string.send_failed, error));
                    refresh();
                });
            }
        });
        refresh();
    }

    private void setReplyTarget(Msg msg) {
        replyTo = msg;
        if (msg == null) {
            Anim.slidePanel(replyBar, false);
            return;
        }
        Anim.slidePanel(replyBar, true);
        replyName.setText(msg.outgoing ? getString(R.string.reply_short) : Store.displayName(this, msg.peer));
        replyText.setText(msg.previewText());
    }

    private void restoreDraft() {
        String draft = Store.get(this).draft(uid);
        if (draft != null && !draft.isEmpty()) {
            input.setText(draft);
            input.setSelection(draft.length());
        }
    }

    private void saveDraft() {
        Store.get(this).setDraft(uid, input.getText().toString().trim());
    }

    private void showAttachSheet() {
        View view = LayoutInflater.from(this).inflate(R.layout.dialog_attach, null);
        final androidx.appcompat.app.AlertDialog dialog =
                new MaterialAlertDialogBuilder(this).setView(view).create();
        attachAction(view, R.id.attach_photo, () -> pick(REQ_PICK_PHOTO, "image/*"), dialog);
        attachAction(view, R.id.attach_video, () -> pick(REQ_PICK_VIDEO, "video/*"), dialog);
        attachAction(view, R.id.attach_circle, this::openCircle, dialog);
        attachAction(view, R.id.attach_file, () -> pick(REQ_PICK_FILE, "*/*"), dialog);
        attachAction(view, R.id.attach_camera, this::openCamera, dialog);
        dialog.show();

        // Кружки появляются каскадом — как меню вложений в iOS
        int[] ids = {R.id.attach_photo, R.id.attach_video, R.id.attach_circle,
                R.id.attach_file, R.id.attach_camera};
        for (int i = 0; i < ids.length; i++) {
            Anim.staggeredIn(view.findViewById(ids[i]), i);
        }
    }

    /** Пункт меню вложений: пружинный отклик, хептика, закрытие меню и запуск действия. */
    private void attachAction(final View root, int id, final Runnable action,
                              final androidx.appcompat.app.AlertDialog dialog) {
        View item = root.findViewById(id);
        Anim.pressFeedback(item);
        item.setOnClickListener(v -> {
            Anim.haptic(v, false);
            dialog.dismiss();
            action.run();
        });
    }

    private void pick(int request, String mime) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 33 && !"*/*".equals(mime)) {
            intent = new Intent(MediaStore.ACTION_PICK_IMAGES);
            intent.setType(mime);
        } else {
            intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            intent.setType(mime);
        }
        try {
            startActivityForResult(Intent.createChooser(intent, getString(R.string.attach_title)), request);
        } catch (Exception e) {
            Ui.toast(this, getString(R.string.error_generic, "нет приложения для выбора"));
        }
    }

    private void openCircle() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CAMERA,
                    Manifest.permission.RECORD_AUDIO}, REQ_CAMERA_PERMISSION);
            return;
        }
        startActivityForResult(new Intent(this, CircleRecordActivity.class), REQ_CIRCLE);
    }

    private void openCamera() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (intent.resolveActivity(getPackageManager()) == null) {
            Ui.toast(this, getString(R.string.error_generic, "камера недоступна"));
            return;
        }
        try {
            File dir = new File(getCacheDir(), "photo");
            if (!dir.exists() && !dir.mkdirs()) dir = getCacheDir();
            File photo = new File(dir, "camera-" + System.nanoTime() + ".jpg");
            pendingCameraFile = photo;
            Uri uri = androidx.core.content.FileProvider.getUriForFile(this, getPackageName() + ".files", photo);
            intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
            intent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
            startActivityForResult(intent, REQ_CAMERA);
        } catch (Exception e) {
            Ui.toast(this, getString(R.string.error_generic, "камера недоступна"));
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQ_AUDIO_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Ui.toast(this, getString(R.string.voice_hold));
            } else {
                Ui.toast(this, getString(R.string.error_generic, "нужно разрешение на микрофон"));
            }
            return;
        }
        if (requestCode == REQ_CAMERA_PERMISSION) {
            boolean granted = grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED;
            if (granted) openCircle();
            else Ui.toast(this, getString(R.string.error_generic, "нужно разрешение на камеру"));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK) return;
        if (requestCode == REQ_CIRCLE && data != null) {
            String path = data.getStringExtra(CircleRecordActivity.EXTRA_PATH);
            long duration = data.getLongExtra(CircleRecordActivity.EXTRA_DURATION, 0L);
            if (path == null) return;
            File file = new File(path);
            byte[] bytes = readFile(file);
            file.delete();
            if (bytes == null || bytes.length == 0) return;
            if (bytes.length > MediaUtil.MAX_VIDEO_BYTES) {
                Ui.toast(this, getString(R.string.video_too_big));
                return;
            }
            sendMedia("video", bytes, "video/mp4", duration, "", true, "");
            return;
        }
        if (requestCode == REQ_CAMERA) {
            final File shot = pendingCameraFile;
            pendingCameraFile = null;
            if (shot == null || !shot.exists()) return;
            new Thread(() -> {
                try {
                    final byte[] jpeg = PhotoUtil.compressBytes(readFile(shot));
                    handler.post(() -> sendMedia("image", jpeg, "image/jpeg", 0L, "", false, caption()));
                } catch (final Exception e) {
                    handler.post(() -> Ui.toast(ChatActivity.this,
                            getString(R.string.error_generic, "снимок не удалось обработать")));
                } finally {
                    shot.delete();
                }
            }, "mailgram-camera").start();
            return;
        }
        if (data == null || data.getData() == null) return;
        final Uri uri = data.getData();
        if (requestCode == REQ_PICK_PHOTO) {
            new Thread(() -> {
                try {
                    final byte[] jpeg = PhotoUtil.compressForMail(getApplicationContext(), uri);
                    handler.post(() -> sendMedia("image", jpeg, "image/jpeg", 0L, "", false, caption()));
                } catch (final Exception e) {
                    handler.post(() -> Ui.toast(ChatActivity.this,
                            getString(R.string.error_generic, String.valueOf(e.getMessage()))));
                }
            }, "mailgram-photo").start();
            return;
        }
        if (requestCode == REQ_PICK_VIDEO) {
            new Thread(() -> prepareVideo(uri), "mailgram-video").start();
            return;
        }
        if (requestCode == REQ_PICK_FILE) {
            new Thread(() -> prepareFile(uri), "mailgram-file").start();
        }
    }

    private void prepareVideo(Uri uri) {
        File cached = null;
        try {
            long size = MediaUtil.sizeOf(this, uri);
            if (size > MediaUtil.MAX_VIDEO_BYTES + 512 * 1024L) {
                handler.post(() -> Ui.toast(this, getString(R.string.video_too_big)));
                return;
            }
            byte[] bytes = MediaUtil.readAll(this, uri, MediaUtil.MAX_VIDEO_BYTES);
            String name = MediaUtil.displayName(this, uri);
            String mime = MediaUtil.mimeOf(this, uri);
            cached = MediaUtil.cacheFile(this, name, bytes, ".mp4");
            long duration = MediaUtil.videoDurationMs(cached);
            final byte[] data = bytes;
            final String fileName = name;
            final String fileMime = mime == null || mime.isEmpty() ? "video/mp4" : mime;
            final long ms = duration;
            handler.post(() -> sendMedia("video", data, fileMime, ms, fileName, false, caption()));
        } catch (final Exception e) {
            handler.post(() -> Ui.toast(this, getString(R.string.error_generic, "видео не прочитано")));
        } finally {
            if (cached != null) cached.delete();
        }
    }

    private void prepareFile(Uri uri) {
        try {
            long size = MediaUtil.sizeOf(this, uri);
            if (size > MediaUtil.MAX_FILE_BYTES) {
                handler.post(() -> Ui.toast(this, getString(R.string.file_too_big)));
                return;
            }
            byte[] bytes = MediaUtil.readAll(this, uri, MediaUtil.MAX_FILE_BYTES);
            String name = MediaUtil.displayName(this, uri);
            String mime = MediaUtil.mimeOf(this, uri);
            final String fileMime = mime == null || mime.isEmpty() ? "application/octet-stream" : mime;
            handler.post(() -> sendMedia("file", bytes, fileMime, 0L, name, false, caption()));
        } catch (final Exception e) {
            handler.post(() -> Ui.toast(this, getString(R.string.error_generic, "файл не прочитан")));
        }
    }

    private String caption() {
        String caption = input.getText().toString().trim();
        input.setText("");
        return caption;
    }

    private void sendMedia(String type, byte[] data, String mime, long durationMs,
                           String fileName, boolean round, String caption) {
        chat = Store.get(this).chat(uid);
        if (chat == null) return;
        if (chat.peerPublic == null || chat.peerPublic.isEmpty()) {
            inviteDialog();
            return;
        }
        if (data == null || data.length == 0) {
            Ui.toast(this, getString(R.string.error_generic, "пустое вложение"));
            return;
        }
        long limit = MediaUtil.MAX_FILE_BYTES;
        if ("image".equals(type)) limit = MediaUtil.MAX_PHOTO_BYTES;
        else if ("video".equals(type)) limit = MediaUtil.MAX_VIDEO_BYTES;
        if (data.length > limit) {
            Ui.toast(this, "image".equals(type) ? getString(R.string.photo_too_big)
                    : "video".equals(type) ? getString(R.string.video_too_big) : getString(R.string.file_too_big));
            return;
        }
        Ui.toast(this, getString(R.string.sending_media));
        Msg target = replyTo;
        setReplyTarget(null);
        SyncEngine.SendCallback callback = new SyncEngine.SendCallback() {
            @Override
            public void onSent(Msg message) {
                handler.post(ChatActivity.this::refresh);
            }

            @Override
            public void onError(final String error) {
                handler.post(() -> {
                    Ui.toast(ChatActivity.this, getString(R.string.send_failed, error));
                    refresh();
                });
            }
        };
        SyncEngine engine = SyncEngine.get(this);
        engine.sendMedia(chat, type, data, mime, durationMs, fileName, caption, round,
                target == null ? null : target.mid, SyncEngine.replyQuote(target), callback);
        refresh();
    }

    private static byte[] readFile(File file) {
        try (java.io.FileInputStream in = new java.io.FileInputStream(file)) {
            byte[] out = new byte[(int) file.length()];
            int read = in.read(out);
            return read > 0 ? out : null;
        } catch (Exception e) {
            return null;
        }
    }

    private void openViewer(Msg msg) {
        Intent intent = new Intent(this, MediaViewerActivity.class);
        intent.putExtra(MediaViewerActivity.EXTRA_CHAT, uid);
        intent.putExtra(MediaViewerActivity.EXTRA_MID, msg.mid);
        startActivity(intent);
    }

    // ---------------- голосовые ----------------

    private void setUpVoiceButton() {
        micButton.setOnTouchListener((v, event) -> {
            switch (event.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    downRawX = event.getRawX();
                    recordCancelled = false;
                    if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)
                            != PackageManager.PERMISSION_GRANTED) {
                        pendingAudioPermission = true;
                        requestPermissions(new String[]{Manifest.permission.RECORD_AUDIO}, REQ_AUDIO_PERMISSION);
                        return true;
                    }
                    startRecordingTouch();
                    return true;
                case MotionEvent.ACTION_MOVE:
                    if (recorder != null) {
                        boolean cancel = event.getRawX() < downRawX - Ui.dp(this, 90);
                        if (cancel != recordCancelled) {
                            recordCancelled = cancel;
                            voiceHint.setText(cancel ? getString(R.string.voice_cancelled) : getString(R.string.voice_slide_cancel));
                        }
                    }
                    return true;
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL:
                    if (pendingAudioPermission) {
                        pendingAudioPermission = false;
                        return true;
                    }
                    finishRecordingTouch(recordCancelled);
                    return true;
                default:
                    return false;
            }
        });
    }

    private void startRecordingTouch() {
        if (recorder != null) return;
        recorder = new VoiceRecorder();
        try {
            recorder.start(this);
        } catch (Exception e) {
            recorder = null;
            Ui.toast(this, getString(R.string.error_generic, "микрофон занят"));
            return;
        }
        Anim.slidePanel(voiceBar, true);
        Anim.pulse(findViewById(R.id.voice_dot), 900L);
        Anim.haptic(micButton, true);
        voiceHint.setText(R.string.voice_slide_cancel);
        liveWave.setAmplitudes(new int[0]);
        recordTicker = new Runnable() {
            @Override
            public void run() {
                if (recorder == null) return;
                long elapsed = recorder.elapsedMs();
                voiceTimer.setText(MediaUtil.humanDuration(elapsed));
                recorder.sample();
                liveWave.setAmplitudes(recorder.liveWave());
                if (elapsed >= 60_000L) {
                    finishRecordingTouch(false);
                    return;
                }
                handler.postDelayed(this, 90L);
            }
        };
        handler.post(recordTicker);
    }

    private void finishRecordingTouch(boolean cancelled) {
        if (recordTicker != null) handler.removeCallbacks(recordTicker);
        Anim.slidePanel(voiceBar, false);
        VoiceRecorder current = recorder;
        recorder = null;
        if (current == null) return;
        VoiceRecorder.Result result = current.stop();
        if (cancelled || !result.ok() || result.file == null) {
            Ui.toast(this, getString(R.string.voice_too_short));
            return;
        }
        byte[] audio = readFile(result.file);
        result.file.delete();
        if (audio == null || audio.length == 0) {
            Ui.toast(this, getString(R.string.voice_too_short));
            return;
        }
        if (audio.length > MediaUtil.MAX_VOICE_BYTES) {
            Ui.toast(this, getString(R.string.file_too_big));
            return;
        }
        final byte[] data = audio;
        final long duration = result.durationMs;
        final int[] wave = result.amplitudes;
        chat = Store.get(this).chat(uid);
        if (chat == null || chat.peerPublic == null || chat.peerPublic.isEmpty()) {
            inviteDialog();
            return;
        }
        Msg target = replyTo;
        setReplyTarget(null);
        Ui.toast(this, getString(R.string.sending_media));
        SyncEngine.get(this).sendVoice(chat, data, duration, wave,
                target == null ? null : target.mid, SyncEngine.replyQuote(target),
                new SyncEngine.SendCallback() {
                    @Override
                    public void onSent(Msg message) {
                        handler.post(ChatActivity.this::refresh);
                    }

                    @Override
                    public void onError(final String error) {
                        handler.post(() -> {
                            Ui.toast(ChatActivity.this, getString(R.string.send_failed, error));
                            refresh();
                        });
                    }
                });
        refresh();
    }

    /** Скорость воспроизведения: 1x → 1.5x → 2x (как в Telegram). */
    private void cycleSpeed() {
        playbackSpeed = playbackSpeed >= 2f ? 1f : playbackSpeed >= 1.5f ? 2f : 1.5f;
        if (player != null) {
            try {
                player.setPlaybackParams(new android.media.PlaybackParams()
                        .setSpeed(playbackSpeed).setPitch(1f));
            } catch (Exception ignored) {
            }
        }
        Ui.toast(this, String.format(java.util.Locale.US, "%.1fx", playbackSpeed));
    }

    private void toggleVoice(Msg msg) {
        if (playingMid.equals(msg.mid)) {
            stopPlayback();
            return;
        }
        stopPlayback();
        try {
            byte[] data = MediaUtil.decode(msg.mediaB64);
            File file = MediaUtil.cacheFile(this, msg.mid, data, ".m4a");
            player = new MediaPlayer();
            player.setDataSource(file.getAbsolutePath());
            player.prepare();
            player.start();
            if (playbackSpeed != 1f) {
                try {
                    player.setPlaybackParams(new android.media.PlaybackParams()
                            .setSpeed(playbackSpeed).setPitch(1f));
                } catch (Exception ignored) {
                }
            }
            playingMid = msg.mid;
            adapter.setPlaying(msg.mid);
            final int duration = Math.max(1, player.getDuration());
            playTicker = new Runnable() {
                @Override
                public void run() {
                    if (player == null) return;
                    float progress = Math.min(1f, player.getCurrentPosition() / (float) duration);
                    adapter.setPlayProgress(playingMid, progress);
                    if (player.isPlaying()) {
                        handler.postDelayed(this, 100L);
                    }
                }
            };
            handler.post(playTicker);
            player.setOnCompletionListener(mp -> stopPlayback());
        } catch (Exception e) {
            stopPlayback();
            Ui.toast(this, getString(R.string.error_generic, "не удалось воспроизвести"));
        }
    }

    private void stopPlayback() {
        if (playTicker != null) handler.removeCallbacks(playTicker);
        playTicker = null;
        if (player != null) {
            try {
                player.stop();
            } catch (Exception ignored) {
            }
            try {
                player.release();
            } catch (Exception ignored) {
            }
            player = null;
        }
        if (!playingMid.isEmpty()) {
            String was = playingMid;
            playingMid = "";
            adapter.setPlaying("");
            adapter.refreshMessage(was);
        }
    }

    // ---------------- меню сообщения и реакции ----------------

    private void messageMenu(final Msg msg) {
        final List<String> items = new ArrayList<>();
        final List<Integer> ids = new ArrayList<>();
        items.add(getString(R.string.reply));
        ids.add(1);
        if (!msg.text.isEmpty()) {
            items.add(getString(R.string.copy));
            ids.add(2);
        }
        items.add(getString(R.string.select));
        ids.add(11);
        items.add(getString(R.string.forward));
        ids.add(9);
        if (msg.state == Msg.STATE_FAILED) {
            items.add(getString(R.string.retry));
            ids.add(3);
        }
        if (msg.outgoing && !msg.text.isEmpty()) {
            items.add(getString(R.string.edit));
            ids.add(4);
        }
        if (msg.hasMedia()) {
            items.add(getString(R.string.save));
            ids.add(5);
        }
        items.add(getString(R.string.pin_chat));
        ids.add(6);
        if (msg.outgoing) {
            items.add(getString(R.string.delete_for_all));
            ids.add(7);
        }
        items.add(getString(R.string.delete_message));
        ids.add(8);

        new MaterialAlertDialogBuilder(this)
                .setItems(items.toArray(new String[0]), (d, which) -> {
                    int id = ids.get(which);
                    if (id == 1) {
                        setReplyTarget(msg);
                    } else if (id == 2) {
                        Ui.copy(this, "MailGram", msg.text);
                    } else if (id == 3) {
                        SyncEngine.get(this).retry(chat, msg, null);
                        refresh();
                    } else if (id == 4) {
                        editMessage(msg);
                    } else if (id == 5) {
                        openViewer(msg);
                    } else if (id == 6) {
                        Store.get(this).setMsgPinned(uid, msg.mid, !msg.pinned);
                        refresh();
                    } else if (id == 11) {
                        adapter.clearSelection();
                        enterSelection(msg);
                    } else if (id == 9) {
                        forwardDialog(msg);
                    } else if (id == 7) {
                        SyncEngine.get(this).sendDelete(chat, msg, null);
                        refresh();
                    } else {
                        Store.get(this).deleteMessage(uid, msg.mid);
                        refresh();
                    }
                })
                .show();
    }

    /** Выгрузка переписки в HTML: читаемый файл, который можно открыть или отправить. */
    private void exportChat() {
        chat = Store.get(this).chat(uid);
        if (chat == null) return;
        final List<Msg> messages = Store.get(this).messages(uid);
        new Thread(() -> {
            try {
                StringBuilder html = new StringBuilder();
                html.append("<!doctype html><html lang=\"ru\"><head><meta charset=\"utf-8\">")
                        .append("<title>MailGram — переписка</title><style>")
                        .append("body{background:#0b0b0d;color:#eaeaea;font-family:-apple-system,Roboto,sans-serif;margin:0;padding:24px}")
                        .append("h1{font-size:20px}.m{max-width:640px;margin:10px 0;padding:10px 14px;border-radius:16px;white-space:pre-wrap}")
                        .append(".in{background:#1c1c1e}.out{background:#0a6bff;margin-left:auto}")
                        .append(".t{font-size:11px;opacity:.6;margin-top:6px}")
                        .append("</style></head><body>")
                        .append("<h1>").append(escape(chat.peer)).append("</h1>");
                for (Msg m : messages) {
                    if (m.isControl()) continue;
                    html.append("<div class=\"m ").append(m.outgoing ? "out" : "in").append("\">");
                    if (m.forwarded) html.append("<i>Переслано</i><br>");
                    if (m.replyPreview != null && !m.replyPreview.isEmpty()) {
                        html.append("<blockquote>").append(escape(m.replyPreview)).append("</blockquote>");
                    }
                    if (m.deleted) {
                        html.append("<i>Сообщение удалено</i>");
                    } else if (m.hasMedia()) {
                        html.append("<b>[").append(mediaLabel(m)).append("]</b>");
                        if (m.text != null && !m.text.isEmpty()) {
                            html.append("<br>").append(escape(m.text));
                        }
                    } else {
                        html.append(escape(m.text));
                    }
                    html.append("<div class=\"t\">").append(Ui.timeShort(m.ts))
                            .append(m.edited ? " · изменено" : "").append("</div></div>");
                }
                html.append("</body></html>");

                java.io.File dir = new File(getExternalFilesDir(null), "export");
                if (!dir.exists() && !dir.mkdirs()) dir = getCacheDir();
                final File out = new File(dir, "mailgram-" + uid + ".html");
                try (java.io.FileOutputStream fos = new java.io.FileOutputStream(out)) {
                    fos.write(html.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));
                }
                handler.post(() -> new MaterialAlertDialogBuilder(ChatActivity.this)
                        .setTitle(R.string.export_done)
                        .setMessage(out.getAbsolutePath())
                        .setNegativeButton(R.string.done, null)
                        .setPositiveButton(R.string.share, (d, w) -> {
                            try {
                                android.net.Uri uri = androidx.core.content.FileProvider.getUriForFile(
                                        ChatActivity.this, getPackageName() + ".files", out);
                                Intent send = new Intent(Intent.ACTION_SEND);
                                send.setType("text/html");
                                send.putExtra(Intent.EXTRA_STREAM, uri);
                                send.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                                startActivity(Intent.createChooser(send, getString(R.string.share)));
                            } catch (Exception e) {
                                Ui.toast(ChatActivity.this, getString(R.string.error_generic, "не удалось поделиться"));
                            }
                        })
                        .show());
            } catch (final Exception e) {
                handler.post(() -> Ui.toast(ChatActivity.this,
                        getString(R.string.error_generic, String.valueOf(e.getMessage()))));
            }
        }, "mailgram-export").start();
    }

    private static String mediaLabel(Msg m) {
        if (m.isImage()) return "фото";
        if (m.isVideo()) return m.round ? "видеокружок" : "видео";
        if (m.isVoice()) return "голосовое " + com.mailgram.app.media.MediaUtil.humanDuration(m.durationMs);
        if (m.isFile()) return "файл " + (m.fileName == null ? "" : m.fileName);
        return "вложение";
    }

    private static String escape(String text) {
        if (text == null) return "";
        return text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")
                .replace("\"", "&quot;");
    }

    /** Выбор чата для пересылки: список диалогов с аватарами. */
    private void forwardDialog(final Msg msg) {
        final List<Chat> chats = new ArrayList<>(Store.get(this).chats());
        if (chats.isEmpty()) {
            Ui.toast(this, getString(R.string.nothing_here));
            return;
        }
        final String[] names = new String[chats.size()];
        for (int i = 0; i < chats.size(); i++) {
            Chat c = chats.get(i);
            names[i] = (c.name != null && !c.name.isEmpty() ? c.name : Store.displayName(this, c.peer));
        }
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.forward_to_chat)
                .setItems(names, (d, which) -> {
                    final Chat target = chats.get(which);
                    chat = Store.get(this).chat(uid);
                    SyncEngine.get(this).sendForward(target, msg, new SyncEngine.SendCallback() {
                        @Override
                        public void onSent(Msg message) {
                            handler.post(() -> {
                                Ui.toast(ChatActivity.this, getString(R.string.forwarded));
                                refresh();
                            });
                        }

                        @Override
                        public void onError(final String error) {
                            handler.post(() -> Ui.toast(ChatActivity.this,
                                    getString(R.string.send_failed, error)));
                        }
                    });
                })
                .show();
    }

    private void editMessage(final Msg msg) {
        final EditText edit = new EditText(this);
        edit.setText(msg.text);
        edit.setSelection(msg.text.length());
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.edit_message)
                .setView(edit)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.save, (d, w) -> {
                    String text = edit.getText().toString().trim();
                    if (text.isEmpty() || text.equals(msg.text)) return;
                    SyncEngine.get(this).sendEdit(chat, msg, text, null);
                    refresh();
                })
                .show();
    }

    private void inviteDialog() {
        if (chat == null) return;
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.invite_title)
                .setMessage(R.string.invite_text)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.invite_send, (d, w) -> {
                    SyncEngine.get(this).sendInvite(chat.peer, null, new SyncEngine.SendCallback() {
                        @Override
                        public void onSent(Msg message) {
                            handler.post(() -> {
                                Ui.toast(ChatActivity.this, "Приглашение отправлено на " + chat.peer);
                                refresh();
                            });
                        }

                        @Override
                        public void onError(final String error) {
                            handler.post(() -> {
                                Ui.toast(ChatActivity.this, getString(R.string.send_failed, error));
                                refresh();
                            });
                        }
                    });
                    refresh();
                })
                .show();
    }

    private void buildEmojiPanel() {
        emojiPanel.removeAllViews();
        int size = Ui.dp(this, 42);
        for (String emoji : EMOJI) {
            TextView tv = new TextView(this);
            tv.setText(emoji);
            tv.setTextSize(22);
            tv.setGravity(android.view.Gravity.CENTER);
            GridLayout.LayoutParams lp = new GridLayout.LayoutParams();
            lp.width = size;
            lp.height = size;
            tv.setLayoutParams(lp);
            tv.setOnClickListener(v -> {
                input.append(emoji);
                input.setSelection(input.getText().length());
            });
            emojiPanel.addView(tv);
        }
    }

    private void toggleEmoji() {
        boolean visible = emojiPanel.getVisibility() == View.VISIBLE;
        Anim.slidePanel(emojiPanel, !visible);
        if (!visible) Anim.haptic(emojiPanel, false);
    }

    private void showSafety() {
        showSafetyModal();
    }

    /** Крипто-модалка дизайна: ключ в .key-box, отпечаток и адрес собеседника. */
    private void showSafetyModal() {
        chat = Store.get(this).chat(uid);
        if (chat == null) return;
        String myKey = "";
        try {
            myKey = B64.str(Identity.publicKeyRaw(this));
        } catch (Exception ignored) {
        }
        final String number = Ui.safetyNumber(chat.peerPublic, myKey);
        final String keyValue = myKey;
        final View modal = findViewById(R.id.encrypt_modal);
        if (modal == null) {
            showSafetyDialog();
            return;
        }
        ((TextView) findViewById(R.id.encrypt_key_box)).setText(keyValue);
        ((TextView) findViewById(R.id.encrypt_safety_box))
                .setText(number.isEmpty() ? getString(R.string.peer_no_key) : number);
        ((TextView) findViewById(R.id.encrypt_delfan_box)).setText(chat.peer);
        modal.setVisibility(View.VISIBLE);
        modal.setAlpha(0f);
        modal.animate().alpha(1f).setDuration(150L).start();
        modal.setOnClickListener(v -> modal.setVisibility(View.GONE));
        findViewById(R.id.encrypt_close).setOnClickListener(v -> modal.setVisibility(View.GONE));
        findViewById(R.id.encrypt_copy).setOnClickListener(v -> Ui.copy(this,
                getString(R.string.safety_number), number.isEmpty() ? keyValue : number));
    }

    /** Запасной вариант: тот же номер безопасности обычным диалогом. */
    private void showSafetyDialog() {
        String safety = "\u2014";
        String peerKey = "\u2014";
        try {
            byte[] mine = Identity.publicKeyRaw(this);
            if (chat != null && chat.peerPublic != null && !chat.peerPublic.isEmpty()) {
                byte[] peer = B64.bytes(chat.peerPublic);
                if (peer.length == 65) {
                    safety = NativeCrypto.safetyNumber(mine, peer);
                    peerKey = chat.peerPublic;
                }
            }
        } catch (Exception e) {
            safety = getString(R.string.error_generic, e.getMessage());
        }
        final String safetyValue = safety;
        View view = LayoutInflater.from(this).inflate(R.layout.dialog_text, null);
        TextView text = view.findViewById(R.id.dialog_text);
        String content = getString(R.string.safety_text) + "\n\n"
                + getString(R.string.safety_number) + ":\n" + safetyValue + "\n\n"
                + getString(R.string.my_key) + ":\n" + keyPreview(peerKey);
        text.setText(content);
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.chat_menu_safety)
                .setView(view)
                .setNegativeButton(R.string.done, null)
                .setPositiveButton(R.string.copy, (d, w) -> Ui.copy(this, getString(R.string.safety_number), safetyValue))
                .show();
    }

    private static String keyPreview(String key) {
        if (key == null || key.length() < 24) return key == null ? "—" : key;
        return key.substring(0, 12) + "…" + key.substring(key.length() - 12);
    }

    private void renameDialog() {
        final EditText edit = new EditText(this);
        edit.setText(chat.name == null ? "" : chat.name);
        edit.setHint(Store.displayName(this, chat.peer));
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.rename_chat)
                .setView(edit)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.save, (d, w) -> {
                    String name = edit.getText().toString().trim();
                    Store.get(this).renameChat(uid, name);
                    Prefs.setContactName(this, chat.peer, name);
                    refresh();
                })
                .show();
    }

    /** Быстрые реакции — доступны долгим нажатием на сообщение. */
    @SuppressWarnings("unused")
    private void quickReactions(final Msg msg) {
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        int pad = Ui.dp(this, 10);
        row.setPadding(pad, pad, pad, pad);
        final androidx.appcompat.app.AlertDialog dialog =
                new MaterialAlertDialogBuilder(this).setView(row).create();
        for (final String emoji : QUICK_REACTIONS) {
            TextView tv = new TextView(this);
            tv.setText(emoji);
            tv.setTextSize(24);
            tv.setGravity(android.view.Gravity.CENTER);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(Ui.dp(this, 44), Ui.dp(this, 44));
            tv.setLayoutParams(lp);
            tv.setOnClickListener(v -> {
                SyncEngine.get(this).sendReaction(chat, msg, emoji, null);
                dialog.dismiss();
                refresh();
            });
            row.addView(tv);
        }
        dialog.show();
    }
}
