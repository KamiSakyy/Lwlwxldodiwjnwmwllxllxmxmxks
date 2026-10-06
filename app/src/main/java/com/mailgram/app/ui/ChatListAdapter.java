package com.mailgram.app.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mailgram.app.R;
import com.mailgram.app.store.Chat;
import com.mailgram.app.store.Store;

import java.util.ArrayList;
import java.util.List;

/** Список диалогов. */
public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.Holder> {

    public interface Actions {
        void onOpen(Chat chat);

        void onLongPress(Chat chat);
    }

    private final List<Chat> items = new ArrayList<>();
    private final List<Chat> all = new ArrayList<>();
    private final Actions actions;
    private String filter = "";

    public ChatListAdapter(Actions actions) {
        this.actions = actions;
    }

    public void submit(List<Chat> chats) {
        all.clear();
        all.addAll(chats);
        applyFilter();
    }

    public void setFilter(String query) {
        filter = query == null ? "" : query.trim().toLowerCase(java.util.Locale.US);
        applyFilter();
    }

    private void applyFilter() {
        items.clear();
        for (Chat c : all) {
            if (filter.isEmpty()) {
                items.add(c);
                continue;
            }
            String name = (c.name == null ? "" : c.name) + " " + c.peer + " " + (c.preview == null ? "" : c.preview);
            if (name.toLowerCase(java.util.Locale.US).contains(filter)) items.add(c);
        }
        notifyDataSetChanged();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int totalUnread() {
        int n = 0;
        for (Chat c : all) n += c.unread;
        return n;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_chat, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder h, int position) {
        Chat chat = items.get(position);
        String name = chat.name != null && !chat.name.isEmpty()
                ? chat.name
                : Store.displayName(h.itemView.getContext(), chat.peer);
        h.name.setText(name);
        h.avatar.setName(name);
        h.time.setText(Ui.chatTime(chat.lastTs));
        h.preview.setText(chat.preview == null || chat.preview.isEmpty()
                ? h.itemView.getContext().getString(R.string.no_chats_title) : chat.preview);

        boolean hasKey = chat.peerPublic != null && !chat.peerPublic.isEmpty();
        h.state.setVisibility(!chat.lastOutgoing && hasKey ? View.VISIBLE : View.GONE);
        h.state.setImageResource(hasKey ? R.drawable.ic_lock : R.drawable.ic_lock_open);
        h.state.setImageTintList(android.content.res.ColorStateList.valueOf(
                hasKey ? 0xFF31C48D : 0xFF9AA6B2));
        h.state.setContentDescription(h.itemView.getContext().getString(
                hasKey ? R.string.encryption_on : R.string.encryption_waiting));

        if (chat.unread > 0) {
            h.badge.setVisibility(View.VISIBLE);
            h.badge.setText(chat.unread > 99 ? "99+" : String.valueOf(chat.unread));
        } else {
            h.badge.setVisibility(View.GONE);
        }

        h.itemView.setOnClickListener(v -> actions.onOpen(chat));
        h.itemView.setOnLongClickListener(v -> {
            actions.onLongPress(chat);
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class Holder extends RecyclerView.ViewHolder {
        final AvatarView avatar;
        final TextView name;
        final TextView preview;
        final TextView time;
        final TextView badge;
        final ImageView state;

        Holder(View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.chat_avatar);
            name = itemView.findViewById(R.id.chat_name);
            preview = itemView.findViewById(R.id.chat_preview);
            time = itemView.findViewById(R.id.chat_time);
            badge = itemView.findViewById(R.id.chat_badge);
            state = itemView.findViewById(R.id.chat_state_icon);
        }
    }
}
