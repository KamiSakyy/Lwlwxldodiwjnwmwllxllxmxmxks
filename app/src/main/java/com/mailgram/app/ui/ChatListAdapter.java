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

        void onSwipePin(Chat chat);

        void onSwipeMute(Chat chat);
    }

    private final List<Chat> items = new ArrayList<>();
    private final List<Chat> all = new ArrayList<>();
    public static final String FILTER_ALL = "all";
    public static final String FILTER_UNREAD = "unread";
    public static final String FILTER_PINNED = "pinned";

    private final Actions actions;
    private String filter = "";
    private String quickFilter = FILTER_ALL;
    private final java.util.Set<String> animated = new java.util.HashSet<>();

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

    /** Свайп по строке: вправо — закрепить, влево — выключить или включить звук. */
    private void attachSwipe(final View row, final Chat chat, final Actions actions) {
        final android.graphics.drawable.Drawable original = row.getBackground();
        row.setOnTouchListener(Ui.touch(new View.OnTouchListener() {
            private float downX;
            private float downY;
            private boolean swiping;
            private boolean armed;

            @Override
            public boolean onTouch(View v, android.view.MotionEvent event) {
                switch (event.getActionMasked()) {
                    case android.view.MotionEvent.ACTION_DOWN:
                        downX = event.getRawX();
                        downY = event.getRawY();
                        swiping = false;
                        armed = false;
                        return false;
                    case android.view.MotionEvent.ACTION_MOVE: {
                        float dx = event.getRawX() - downX;
                        float dy = event.getRawY() - downY;
                        if (!swiping && Math.abs(dx) > Ui.dp(v.getContext(), 18)
                                && Math.abs(dx) > Math.abs(dy) * 1.5f) {
                            swiping = true;
                            if (v.getParent() != null) {
                                v.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (!swiping) return false;
                        float limit = Ui.dp(v.getContext(), 96);
                        float eased = Math.abs(dx) <= limit ? dx
                                : (float) (Math.signum(dx) * (limit + (Math.abs(dx) - limit) * 0.25f));
                        v.setTranslationX(eased);
                        // подсветка намерения: закрепить (акцент) или выключить звук (серый)
                        if (Math.abs(eased) > Ui.dp(v.getContext(), 8)) {
                            v.setBackgroundResource(dx > 0
                                    ? R.drawable.bg_swipe_pin : R.drawable.bg_swipe_mute);
                        }
                        boolean nowArmed = Math.abs(eased) > Ui.dp(v.getContext(), 64);
                        if (nowArmed && !armed) {
                            Anim.haptic(v, false);
                        }
                        armed = nowArmed;
                        return true;
                    }
                    case android.view.MotionEvent.ACTION_UP:
                    case android.view.MotionEvent.ACTION_CANCEL: {
                        if (!swiping) return false;
                        float dx = v.getTranslationX();
                        v.animate().translationX(0f).setDuration(190L)
                                .setInterpolator(Anim.EMPHASIZED).start();
                        if (original != null) {
                            v.setBackground(original);
                        } else {
                            v.setBackgroundResource(0);
                        }
                        if (Math.abs(dx) > Ui.dp(v.getContext(), 64)) {
                            if (dx > 0) {
                                actions.onSwipePin(chat);
                            } else {
                                actions.onSwipeMute(chat);
                            }
                        }
                        swiping = false;
                        return true;
                    }
                    default:
                        return false;
                }
            }
        }));
    }

    /** Нижние стеклянные фильтры: все / непрочитанные / закреплённые. */
    public void setQuickFilter(String value) {
        quickFilter = value == null ? FILTER_ALL : value;
        applyFilter();
    }

    private void applyFilter() {
        items.clear();
        for (Chat c : all) {
            if (FILTER_UNREAD.equals(quickFilter) && c.unread <= 0) continue;
            if (FILTER_PINNED.equals(quickFilter) && !c.pinned) continue;
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
        final Chat chat = items.get(position);
        if (h.avatar != null) {
            h.avatar.setTag("avatar_" + chat.uid);
            h.avatar.setTransitionName("avatar_" + chat.uid);
        }
        String name = chat.name != null && !chat.name.isEmpty()
                ? chat.name
                : Store.displayName(h.itemView.getContext(), chat.peer);
        if (h.name != null) h.name.setText(name);
        if (h.avatar != null) h.avatar.setName(name);
        h.time.setText(Ui.chatTime(chat.lastTs));
        h.preview.setText(chat.preview == null || chat.preview.isEmpty()
                ? h.itemView.getContext().getString(R.string.no_chats_title) : chat.preview);

        boolean hasKey = chat.peerPublic != null && !chat.peerPublic.isEmpty();
        h.state.setVisibility(!chat.lastOutgoing && hasKey ? View.VISIBLE : View.GONE);
        h.state.setImageResource(hasKey ? R.drawable.ic_lock : R.drawable.ic_lock_open);
        h.state.setImageTintList(android.content.res.ColorStateList.valueOf(
                hasKey ? h.itemView.getContext().getResources().getColor(R.color.lock_green)
                        : h.itemView.getContext().getResources().getColor(R.color.text_tertiary)));
        h.state.setContentDescription(h.itemView.getContext().getString(
                hasKey ? R.string.encryption_on : R.string.encryption_waiting));

        if (chat.unread > 0) {
            h.badge.setVisibility(View.VISIBLE);
            h.badge.setText(chat.unread > 99 ? "99+" : String.valueOf(chat.unread));
        } else {
            h.badge.setVisibility(View.GONE);
        }

        h.pin.setVisibility(chat.pinned ? View.VISIBLE : View.GONE);
        h.mute.setVisibility(chat.muted ? View.VISIBLE : View.GONE);
        h.name.setTextColor(chat.muted
                ? h.itemView.getContext().getResources().getColor(R.color.text_muted)
                : resolveOnSurface(h.itemView.getContext()));
        h.time.setTextColor(chat.unread > 0
                ? h.itemView.getContext().getResources().getColor(R.color.accent)
                : h.itemView.getContext().getResources().getColor(R.color.text_muted));

        if (!animated.contains(chat.uid)) {
            animated.add(chat.uid);
            Anim.staggeredIn(h.itemView, position);
        } else {
            h.itemView.setAlpha(1f);
            h.itemView.setTranslationY(0f);
        }
        if (chat.unread > 0) {
            Anim.pop(h.badge);
        }

        h.itemView.setOnClickListener(Ui.tap(v -> actions.onOpen(chat)));
        attachSwipe(h.itemView, chat, actions);
        h.itemView.setOnLongClickListener(Ui.hold(v -> {
            actions.onLongPress(chat);
            return true;
        }));
    }

    private static int resolveOnSurface(android.content.Context ctx) {
        android.util.TypedValue value = new android.util.TypedValue();
        if (!ctx.getTheme().resolveAttribute(com.google.android.material.R.attr.colorOnSurface,
                value, true)) {
            return ctx.getResources().getColor(R.color.text_primary);
        }
        return value.data;
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
        final ImageView pin;
        final ImageView mute;

        Holder(View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.chat_avatar);
            name = itemView.findViewById(R.id.chat_name);
            preview = itemView.findViewById(R.id.chat_preview);
            time = itemView.findViewById(R.id.chat_time);
            badge = itemView.findViewById(R.id.chat_badge);
            state = itemView.findViewById(R.id.chat_state_icon);
            pin = itemView.findViewById(R.id.chat_pin_icon);
            mute = itemView.findViewById(R.id.chat_mute_icon);
        }
    }
}
