package com.mailgram.app.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.mailgram.app.R;
import com.mailgram.app.crypto.B64;
import com.mailgram.app.crypto.Identity;
import com.mailgram.app.crypto.NativeCrypto;
import com.mailgram.app.net.Auth;
import com.mailgram.app.store.Chat;
import com.mailgram.app.store.Msg;
import com.mailgram.app.store.Store;
import com.mailgram.app.sync.SyncEngine;
import com.mailgram.app.sync.SyncService;

import java.util.ArrayList;
import java.util.List;

/** Экран диалога: пузыри, фото, эмодзи и понятное состояние шифрования. */
public class ChatActivity extends AppCompatActivity implements SyncEngine.Listener {

    public static final String EXTRA_CHAT_UID = "chat_uid";
    private static final int REQ_PICK_IMAGE = 3001;

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
    private MaterialToolbar toolbar;
    private RecyclerView list;
    private MessageAdapter adapter;
    private EditText input;
    private View banner;
    private TextView bannerText;
    private MaterialButton bannerAction;
    private GridLayout emojiPanel;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable poller;
    private int lastCount = -1;

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
        Ui.applySystemBars(this, findViewById(R.id.chat_toolbar), findViewById(R.id.input_bar));

        toolbar = findViewById(R.id.chat_toolbar);
        list = findViewById(R.id.recycler_messages);
        input = findViewById(R.id.input_edit);
        banner = findViewById(R.id.chat_banner);
        bannerText = findViewById(R.id.chat_banner_text);
        bannerAction = findViewById(R.id.chat_banner_action);
        emojiPanel = findViewById(R.id.emoji_panel);

        toolbar.setNavigationOnClickListener(v -> finish());
        toolbar.setOnMenuItemClickListener(this::onMenu);

        adapter = new MessageAdapter(new MessageAdapter.Actions() {
            @Override
            public void onMessageLongPress(Msg msg, View anchor) {
                messageMenu(msg);
            }

            @Override
            public void onMessageClick(Msg msg) {
                if (msg.state == Msg.STATE_FAILED) {
                    SyncEngine.get(ChatActivity.this).retry(chat, msg, null);
                    refresh();
                } else if (msg.isImage()) {
                    showImage(msg);
                }
            }
        });
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setStackFromEnd(true);
        list.setLayoutManager(manager);
        list.setAdapter(adapter);

        ImageButton send = findViewById(R.id.btn_send);
        send.setOnClickListener(v -> sendMessage());
        findViewById(R.id.btn_emoji).setOnClickListener(v -> toggleEmoji());
        findViewById(R.id.btn_attach).setOnClickListener(v -> pickImage());
        input.setOnEditorActionListener((v, actionId, event) -> {
            sendMessage();
            return true;
        });

        buildEmojiPanel();
        bannerAction.setOnClickListener(v -> inviteDialog());
        SyncEngine.get(this).addListener(this);
        refresh();
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

    private boolean onMenu(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_safety) {
            showSafety();
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
        if (com.mailgram.app.store.Prefs.backgroundSync(this)) SyncService.start(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (poller != null) handler.removeCallbacks(poller);
    }

    @Override
    protected void onDestroy() {
        SyncEngine.get(this).removeListener(this);
        super.onDestroy();
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

    private void refresh() {
        chat = Store.get(this).chat(uid);
        if (chat == null) {
            finish();
            return;
        }
        String title = chat.name != null && !chat.name.isEmpty()
                ? chat.name : Store.displayName(this, chat.peer);
        toolbar.setTitle(title);
        boolean hasKey = chat.peerPublic != null && !chat.peerPublic.isEmpty();
        toolbar.setSubtitle(hasKey ? chat.peer + " · 🔒" : chat.peer);

        banner.setVisibility(hasKey ? View.GONE : View.VISIBLE);
        bannerText.setText(R.string.peer_no_key);

        List<Msg> messages = Store.get(this).messages(uid);
        adapter.submit(messages);
        if (messages.size() != lastCount) {
            lastCount = messages.size();
            list.post(() -> {
                if (adapter.getItemCount() > 0) {
                    list.scrollToPosition(adapter.getItemCount() - 1);
                }
            });
        }
    }

    @Override
    public void onSyncDone(SyncEngine.Result result) {
        handler.post(this::refresh);
    }

    private void toggleEmoji() {
        boolean visible = emojiPanel.getVisibility() == View.VISIBLE;
        emojiPanel.setVisibility(visible ? View.GONE : View.VISIBLE);
    }

    private void sendMessage() {
        String text = input.getText().toString().trim();
        if (text.isEmpty()) return;
        chat = Store.get(this).chat(uid);
        if (chat == null) return;
        if (chat.peerPublic == null || chat.peerPublic.isEmpty()) {
            inviteDialog();
            return;
        }
        input.setText("");
        SyncEngine.get(this).sendText(chat, text, new SyncEngine.SendCallback() {
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

    private void pickImage() {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 33) {
            intent = new Intent(MediaStore.ACTION_PICK_IMAGES);
        } else {
            intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
        }
        intent.setType("image/*");
        try {
            startActivityForResult(Intent.createChooser(intent, getString(R.string.attach_photo)), REQ_PICK_IMAGE);
        } catch (Exception e) {
            Ui.toast(this, getString(R.string.error_generic, "нет приложения для выбора фото"));
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != REQ_PICK_IMAGE || resultCode != RESULT_OK || data == null) return;
        final Uri uri = data.getData();
        if (uri == null) return;
        chat = Store.get(this).chat(uid);
        if (chat == null) return;
        if (chat.peerPublic == null || chat.peerPublic.isEmpty()) {
            inviteDialog();
            return;
        }
        Ui.toast(this, getString(R.string.photo_preparing));
        new Thread(() -> {
            try {
                byte[] jpeg = PhotoUtil.compressForMail(getApplicationContext(), uri);
                final String caption = input.getText().toString().trim();
                input.setText("");
                handler.post(() -> {
                    SyncEngine.get(ChatActivity.this).sendImage(chat, jpeg, caption,
                            new SyncEngine.SendCallback() {
                                @Override
                                public void onSent(Msg message) {
                                    handler.post(ChatActivity.this::refresh);
                                }

                                @Override
                                public void onError(final String error) {
                                    handler.post(() -> Ui.toast(ChatActivity.this,
                                            getString(R.string.send_failed, error)));
                                }
                            });
                    refresh();
                });
            } catch (final Exception e) {
                handler.post(() -> Ui.toast(ChatActivity.this,
                        getString(R.string.error_generic, String.valueOf(e.getMessage()))));
            }
        }, "mailgram-photo").start();
    }

    private void messageMenu(final Msg msg) {
        final List<String> items = new ArrayList<>();
        final List<Integer> ids = new ArrayList<>();
        if (!msg.text.isEmpty()) {
            items.add(getString(R.string.copy));
            ids.add(1);
        }
        if (msg.state == Msg.STATE_FAILED) {
            items.add(getString(R.string.retry));
            ids.add(2);
        }
        if (msg.isImage()) {
            items.add(getString(R.string.image));
            ids.add(3);
        }
        items.add(getString(R.string.delete_message));
        ids.add(4);

        new MaterialAlertDialogBuilder(this)
                .setItems(items.toArray(new String[0]), (d, which) -> {
                    int id = ids.get(which);
                    if (id == 1) {
                        Ui.copy(this, "MailGram", msg.text);
                    } else if (id == 2) {
                        SyncEngine.get(this).retry(chat, msg, null);
                        refresh();
                    } else if (id == 3) {
                        showImage(msg);
                    } else {
                        Store.get(this).deleteMessage(uid, msg.mid);
                        refresh();
                    }
                })
                .show();
    }

    private void showImage(Msg msg) {
        try {
            byte[] raw = android.util.Base64.decode(msg.imageB64, android.util.Base64.DEFAULT);
            Bitmap bitmap = android.graphics.BitmapFactory.decodeByteArray(raw, 0, raw.length);
            if (bitmap == null) return;
            ImageView view = new ImageView(this);
            view.setImageBitmap(bitmap);
            view.setAdjustViewBounds(true);
            view.setScaleType(ImageView.ScaleType.FIT_CENTER);
            view.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            new MaterialAlertDialogBuilder(this)
                    .setView(view)
                    .setPositiveButton(R.string.done, null)
                    .show();
        } catch (Exception e) {
            Ui.toast(this, getString(R.string.error_generic, "не удалось открыть фото"));
        }
    }

    private void showSafety() {
        chat = Store.get(this).chat(uid);
        String safety = "—";
        String peerKey = "—";
        try {
            byte[] mine = Identity.publicKeyRaw(this);
            if (chat.peerPublic != null && !chat.peerPublic.isEmpty()) {
                byte[] peer = B64.bytes(chat.peerPublic);
                if (peer.length == 65) {
                    safety = NativeCrypto.safetyNumber(mine, peer);
                    peerKey = chat.peerPublic;
                }
            }
        } catch (Exception e) {
            safety = "ошибка: " + e.getMessage();
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
                .setPositiveButton(R.string.copy, (d, w) -> Ui.copy(this, "MailGram safety", safetyValue))
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
                    com.mailgram.app.store.Prefs.setContactName(this, chat.peer, name);
                    refresh();
                })
                .show();
    }
}
