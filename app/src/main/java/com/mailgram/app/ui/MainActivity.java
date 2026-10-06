package com.mailgram.app.ui;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.mailgram.app.R;
import com.mailgram.app.crypto.NativeCrypto;
import com.mailgram.app.net.Auth;
import com.mailgram.app.store.Chat;
import com.mailgram.app.store.Prefs;
import com.mailgram.app.store.Store;
import com.mailgram.app.sync.SyncEngine;
import com.mailgram.app.sync.SyncService;

/** Главный экран: список чатов. */
public class MainActivity extends AppCompatActivity implements SyncEngine.Listener {

    private static final int REQ_NOTIFICATIONS = 41;

    private MaterialToolbar toolbar;
    private RecyclerView list;
    private View emptyView;
    private LinearProgressIndicator syncBar;
    private View searchBar;
    private EditText searchInput;
    private ChatListAdapter adapter;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Runnable poller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!Auth.isSignedIn(this)) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }
        setContentView(R.layout.activity_main);
        Ui.applySystemBars(this, findViewById(R.id.main_toolbar), null);

        toolbar = findViewById(R.id.main_toolbar);
        list = findViewById(R.id.recycler_chats);
        emptyView = findViewById(R.id.empty_view);
        syncBar = findViewById(R.id.sync_bar);
        searchBar = findViewById(R.id.search_bar);
        searchInput = findViewById(R.id.search_input);

        toolbar.setSubtitle(Auth.account(this));
        toolbar.setOnMenuItemClickListener(this::onMenu);

        adapter = new ChatListAdapter(new ChatListAdapter.Actions() {
            @Override
            public void onOpen(Chat chat) {
                openChat(chat);
            }

            @Override
            public void onLongPress(Chat chat) {
                showChatMenu(chat);
            }
        });
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);
        list.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        Ui.liftAboveBars(findViewById(R.id.fab_new_chat));
        findViewById(R.id.fab_new_chat).setOnClickListener(v -> newChatDialog());
        findViewById(R.id.empty_action).setOnClickListener(v -> newChatDialog());

        searchInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.setFilter(s.toString());
                updateEmpty();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        SyncEngine.get(this).addListener(this);
        askNotificationPermission();
        if (Prefs.backgroundSync(this)) {
            SyncService.start(this);
        }
        refresh();
    }

    private boolean onMenu(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }
        if (id == R.id.action_sync) {
            syncBar.setVisibility(View.VISIBLE);
            SyncEngine.get(this).syncNow();
            return true;
        }
        if (id == R.id.action_search) {
            boolean visible = searchBar.getVisibility() == View.VISIBLE;
            searchBar.setVisibility(visible ? View.GONE : View.VISIBLE);
            if (visible) {
                searchInput.setText("");
                adapter.setFilter("");
                updateEmpty();
            } else {
                searchInput.requestFocus();
            }
            return true;
        }
        return false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        refresh();
        SyncEngine.get(this).syncNow();
        startPolling();
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

    private void startPolling() {
        if (poller != null) handler.removeCallbacks(poller);
        poller = new Runnable() {
            @Override
            public void run() {
                SyncEngine.get(MainActivity.this).syncNow();
                handler.postDelayed(this, 10000);
            }
        };
        handler.postDelayed(poller, 10000);
    }

    private void refresh() {
        adapter.submit(Store.get(this).chats());
        updateEmpty();
        int unread = Store.get(this).totalUnread();
        toolbar.setSubtitle(unread > 0
                ? Auth.account(this) + " · " + getString(R.string.unread, unread)
                : Auth.account(this));
    }

    private void updateEmpty() {
        boolean empty = adapter.isEmpty();
        emptyView.setVisibility(empty ? View.VISIBLE : View.GONE);
        list.setVisibility(empty ? View.GONE : View.VISIBLE);
    }

    private void openChat(Chat chat) {
        startActivity(new Intent(this, ChatActivity.class)
                .putExtra(ChatActivity.EXTRA_CHAT_UID, chat.uid));
    }

    private void showChatMenu(final Chat chat) {
        PopupMenu popup = new PopupMenu(this, list);
        popup.getMenu().add(0, 1, 0, R.string.chat_menu_rename);
        popup.getMenu().add(0, 2, 1, R.string.chat_menu_clear);
        popup.getMenu().add(0, 3, 2, R.string.chat_menu_delete);
        popup.setOnMenuItemClickListener(item -> {
            switch (item.getItemId()) {
                case 1:
                    renameChat(chat);
                    return true;
                case 2:
                    confirmClear(chat);
                    return true;
                case 3:
                    confirmDelete(chat);
                    return true;
                default:
                    return false;
            }
        });
        popup.show();
    }

    private void renameChat(final Chat chat) {
        final EditText input = new EditText(this);
        input.setText(chat.name == null ? "" : chat.name);
        input.setHint(Store.displayName(this, chat.peer));
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.rename_chat)
                .setView(input)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.save, (d, w) -> {
                    String name = input.getText().toString().trim();
                    Store.get(this).renameChat(chat.uid, name);
                    Prefs.setContactName(this, chat.peer, name);
                    refresh();
                })
                .show();
    }

    private void confirmClear(final Chat chat) {
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.clear_history_title)
                .setMessage(R.string.clear_history_text)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.clear, (d, w) -> {
                    Store.get(this).clearHistory(chat.uid);
                    refresh();
                })
                .show();
    }

    private void confirmDelete(final Chat chat) {
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.delete_chat_title)
                .setMessage(R.string.delete_chat_text)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.delete, (d, w) -> {
                    Store.get(this).removeChat(chat.uid);
                    refresh();
                })
                .show();
    }

    private void newChatDialog() {
        View view = LayoutInflater.from(this).inflate(R.layout.dialog_new_chat, null);
        final EditText email = view.findViewById(R.id.new_chat_email);
        new MaterialAlertDialogBuilder(this)
                .setTitle(R.string.new_chat)
                .setView(view)
                .setNegativeButton(R.string.cancel, null)
                .setPositiveButton(R.string.continue_label, (d, w) -> {
                    String peer = Store.normalizeEmail(email.getText().toString());
                    if (peer.isEmpty() || !peer.contains("@")) {
                        Ui.toast(this, getString(R.string.error_generic, "нужен корректный адрес Gmail"));
                        return;
                    }
                    String me = Auth.account(this);
                    String uid = NativeCrypto.chatUid(me, peer);
                    Store.get(this).ensureChat(uid, peer, null);
                    refresh();
                    startActivity(new Intent(this, ChatActivity.class)
                            .putExtra(ChatActivity.EXTRA_CHAT_UID, uid));
                })
                .show();
    }

    /** Последняя показанная ошибка Google — чтобы не открывать один и тот же диалог по кругу. */
    private String lastErrorShown = "";

    @Override
    public void onSyncDone(final SyncEngine.Result result) {
        handler.post(() -> {
            syncBar.setVisibility(View.GONE);
            refresh();
            if (result.ok) return;
            final com.mailgram.app.net.ApiError.Info info =
                    com.mailgram.app.net.ApiError.parse(result.cause != null
                            ? result.cause : new java.io.IOException(String.valueOf(result.error)));
            if (!info.title.equals(lastErrorShown)) {
                lastErrorShown = info.title;
                showGoogleError(info);
            }
        });
    }

    /** Показывает, что именно ответил Google, и даёт кнопку для решения. */
    private void showGoogleError(final com.mailgram.app.net.ApiError.Info info) {
        androidx.appcompat.app.AlertDialog.Builder builder =
                new androidx.appcompat.app.AlertDialog.Builder(this)
                        .setTitle(info.title)
                        .setMessage(info.text)
                        .setNeutralButton(R.string.error_copy, (d, w) ->
                                Ui.copy(this, "MailGram Google API error",
                                        info.title + "\n\n" + info.text + "\n\n" + info.raw));
        switch (info.action) {
            case com.mailgram.app.net.ApiError.ACTION_ENABLE_GMAIL_API:
                builder.setPositiveButton(R.string.error_open_console, (d, w) -> openUrl(info.url));
                break;
            case com.mailgram.app.net.ApiError.ACTION_REAUTH:
                builder.setPositiveButton(R.string.error_reauth, (d, w) -> {
                    Auth.signOut(this, false);
                    startActivity(new Intent(this, LoginActivity.class)
                            .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK));
                    finish();
                });
                break;
            default:
                builder.setPositiveButton(R.string.done, null);
                break;
        }
        builder.show();
    }

    private void openUrl(String url) {
        if (url == null || url.isEmpty()) return;
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, android.net.Uri.parse(url)));
        } catch (Exception e) {
            Ui.copy(this, "MailGram link", url);
        }
    }

    private void askNotificationPermission() {
        if (Build.VERSION.SDK_INT < 33) return;
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS)
                == PackageManager.PERMISSION_GRANTED) {
            return;
        }
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.POST_NOTIFICATIONS}, REQ_NOTIFICATIONS);
    }
}
