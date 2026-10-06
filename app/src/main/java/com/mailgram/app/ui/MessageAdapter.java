package com.mailgram.app.ui;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Base64;
import android.util.LruCache;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mailgram.app.R;
import com.mailgram.app.media.MediaUtil;
import com.mailgram.app.media.VoiceWaveView;
import com.mailgram.app.store.Msg;
import com.mailgram.app.store.Prefs;
import com.mailgram.app.store.Store;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Лента сообщений: пузыри в стиле iOS, медиа (фото, видео, кружки, голосовые, файлы),
 * ответы, реакции, выбор нескольких сообщений, ответ смахиванием и анимация появления.
 */
public class MessageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public interface Actions {
        void onMessageLongPress(Msg msg, View anchor);

        void onMessageClick(Msg msg);

        void onReply(Msg msg);

        void onVoiceTap(Msg msg, VoiceWaveView wave, ImageView play);

        void onReactionTap(Msg msg, String emoji);

        void onVoiceSpeed(Msg msg);

        void onJumpToMessage(Msg msg);

        /** Сколько сообщений выбрано (0 — режим выбора выключен). */
        void onSelectionChanged(int count);
    }

    private static final int TYPE_DAY = 0;
    private static final int TYPE_MSG = 1;
    private static final int TYPE_UNREAD = 2;
    private static final int SWIPE_TRIGGER_DP = 56;

    private static final ExecutorService MEDIA_POOL = Executors.newFixedThreadPool(3);
    private static final LruCache<String, Bitmap> MEDIA_CACHE = new LruCache<>(14 * 1024 * 1024) {
        @Override
        protected int sizeOf(String key, Bitmap value) {
            return value.getByteCount();
        }
    };

    private final List<Row> rows = new ArrayList<>();
    private final Actions actions;
    private final Set<String> animated = new HashSet<>();
    private final Set<String> selected = new HashSet<>();

    private String playingMid = "";
    private long lastTapAt;
    private String lastTapMid = "";
    private float playingProgress;
    private float textScale = 1f;
    private boolean animationsEnabled = true;
    private String filter = "";

    public MessageAdapter(Actions actions) {
        this.actions = actions;
    }

    private static final class Row {
        int kind;
        String label;
        Msg msg;
    }

    // ---------------- данные ----------------

    public void submit(List<Msg> messages, String unreadAfterMid, Context ctx) {
        textScale = Prefs.fontScaleFactor(ctx);
        animationsEnabled = Prefs.animations(ctx);
        rows.clear();
        String lastDay = null;
        boolean unreadPlaced = false;
        for (Msg m : messages) {
            if (m.isControl()) continue;
            if (!filter.isEmpty() && !matches(m, filter)) continue;
            String day = Ui.dayLabel(m.ts);
            if (!day.equals(lastDay)) {
                Row header = new Row();
                header.kind = TYPE_DAY;
                header.label = day;
                rows.add(header);
                lastDay = day;
            }
            if (!unreadPlaced && unreadAfterMid != null && unreadAfterMid.equals(m.mid)) {
                Row divider = new Row();
                divider.kind = TYPE_UNREAD;
                divider.label = "Непрочитанные сообщения";
                rows.add(divider);
                unreadPlaced = true;
            }
            Row row = new Row();
            row.kind = TYPE_MSG;
            row.msg = m;
            rows.add(row);
        }
        notifyDataSetChanged();
    }

    private boolean matches(Msg m, String query) {
        String haystack = (m.text == null ? "" : m.text) + " " + m.previewText() + " "
                + (m.fileName == null ? "" : m.fileName);
        return haystack.toLowerCase(java.util.Locale.US).contains(query.toLowerCase(java.util.Locale.US));
    }

    public void setFilter(String query) {
        filter = query == null ? "" : query.trim();
    }

    public String filter() {
        return filter;
    }

    public int messageCount() {
        int n = 0;
        for (Row r : rows) if (r.kind == TYPE_MSG) n++;
        return n;
    }

    public Msg messageAt(int position) {
        if (position < 0 || position >= rows.size()) return null;
        return rows.get(position).msg;
    }

    /** Позиция первого непрочитанного сообщения (для кнопки «вниз»). */
    public int firstUnreadPosition() {
        for (int i = 0; i < rows.size(); i++) {
            Row r = rows.get(i);
            if (r.kind == TYPE_UNREAD) return Math.min(i + 1, rows.size() - 1);
        }
        return -1;
    }

    public int positionOfMid(String mid) {
        for (int i = 0; i < rows.size(); i++) {
            Row r = rows.get(i);
            if (r.kind == TYPE_MSG && r.msg != null && r.msg.mid.equals(mid)) return i;
        }
        return -1;
    }

    public String lastMid() {
        for (int i = rows.size() - 1; i >= 0; i--) {
            Row r = rows.get(i);
            if (r.kind == TYPE_MSG && r.msg != null) return r.msg.mid;
        }
        return "";
    }

    // ---------------- выбор нескольких ----------------

    public boolean selectionMode() {
        return !selected.isEmpty();
    }

    public int selectedCount() {
        return selected.size();
    }

    public Set<String> selectedMids() {
        return selected;
    }

    public void toggleSelection(Msg msg) {
        if (selected.contains(msg.mid)) {
            selected.remove(msg.mid);
        } else {
            selected.add(msg.mid);
        }
        int position = positionOfMid(msg.mid);
        if (position >= 0) notifyItemChanged(position);
        actions.onSelectionChanged(selected.size());
    }

    public void clearSelection() {
        selected.clear();
        notifyDataSetChanged();
    }

    // ---------------- воспроизведение голосовых ----------------

    public void setPlaying(String mid) {
        String previous = playingMid;
        playingMid = mid == null ? "" : mid;
        playingProgress = 0f;
        int a = positionOfMid(previous);
        int b = positionOfMid(playingMid);
        if (a >= 0) notifyItemChanged(a);
        if (b >= 0) notifyItemChanged(b);
    }

    public void setPlayProgress(String mid, float progress) {
        if (!mid.equals(playingMid)) return;
        playingProgress = progress;
        int position = positionOfMid(mid);
        if (position >= 0) notifyItemChanged(position);
    }

    public String playingMid() {
        return playingMid;
    }

    /** Обновляет конкретное сообщение (реакция, правка, удаление, новое состояние). */
    public void refreshMessage(String mid) {
        int position = positionOfMid(mid);
        if (position >= 0) notifyItemChanged(position);
    }

    // ---------------- RecyclerView ----------------

    @Override
    public int getItemViewType(int position) {
        return rows.get(position).kind;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == TYPE_DAY || viewType == TYPE_UNREAD) {
            return new DayHolder(inflater.inflate(R.layout.item_day, parent, false));
        }
        return new MessageHolder(inflater.inflate(R.layout.item_message, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Row row = rows.get(position);
        if (row.kind == TYPE_DAY || row.kind == TYPE_UNREAD) {
            ((DayHolder) holder).label.setText(row.label);
            return;
        }
        bindMessage((MessageHolder) holder, row.msg);
    }

    @Override
    public int getItemCount() {
        return rows.size();
    }

    @SuppressLint("ClickableViewAccessibility")
    private void bindMessage(final MessageHolder h, final Msg m) {
        final Context ctx = h.itemView.getContext();

        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) h.container.getLayoutParams();
        lp.gravity = m.outgoing ? Gravity.END : Gravity.START;
        h.container.setLayoutParams(lp);
        h.container.setBackgroundResource(m.outgoing ? R.drawable.bg_bubble_out : R.drawable.bg_bubble_in);
        int onBubble = m.outgoing
                ? ctx.getResources().getColor(R.color.bubble_out_text_dark)
                : resolveOnSurface(ctx);

        // ---- отметка «Переслано» ----
        if (m.forwarded && !m.deleted) {
            h.forwarded.setVisibility(View.VISIBLE);
            h.forwarded.setTextColor(m.outgoing ? 0xCCFFFFFF : ctx.getResources().getColor(R.color.accent));
        } else {
            h.forwarded.setVisibility(View.GONE);
        }

        // ---- переход к исходному сообщению по тапу на цитате ----
        h.replyQuote.setOnClickListener(v -> {
            if (m.replyMid != null && !m.replyMid.isEmpty()) actions.onJumpToMessage(m);
        });

        // ---- цитата ответа ----
        if (m.replyMid != null && !m.replyMid.isEmpty()) {
            h.replyQuote.setVisibility(View.VISIBLE);
            String who = m.outgoing ? ctx.getString(R.string.reply_short) : Store.displayName(ctx, m.peer);
            h.replyName.setText(who);
            h.replyText.setText(m.replyPreview == null || m.replyPreview.isEmpty()
                    ? ctx.getString(R.string.attach_photo) : m.replyPreview);
            h.replyStrip.setBackgroundColor(m.outgoing ? 0xCCFFFFFF : ctx.getResources().getColor(R.color.accent));
        } else {
            h.replyQuote.setVisibility(View.GONE);
        }

        // ---- медиа ----
        h.image.setVisibility(View.GONE);
        h.videoBox.setVisibility(View.GONE);
        h.circleBox.setVisibility(View.GONE);
        h.voiceBox.setVisibility(View.GONE);
        h.fileBox.setVisibility(View.GONE);

        if (m.isImage()) {
            h.image.setVisibility(View.VISIBLE);
            h.image.getLayoutParams().width = Ui.dp(ctx, 240);
            bindBitmap(h.image, m.mediaB64, 0);
        } else if (m.isVideo() && m.round) {
            h.circleBox.setVisibility(View.VISIBLE);
            bindBitmap(h.circleThumb, m.mediaB64, 1);
        } else if (m.isVideo()) {
            h.videoBox.setVisibility(View.VISIBLE);
            bindBitmap(h.videoThumb, m.mediaB64, 1);
            h.videoDuration.setText(MediaUtil.humanDuration(m.durationMs));
        } else if (m.isVoice()) {
            h.voiceBox.setVisibility(View.VISIBLE);
            h.voiceWave.setAmplitudes(waveOf(m));
            boolean playing = m.mid.equals(playingMid);
            h.voiceWave.setProgress(playing ? playingProgress : 0f);
            h.voiceWave.setColors(m.outgoing ? 0xFFFFFFFF : ctx.getResources().getColor(R.color.accent),
                    m.outgoing ? 0x66FFFFFF : 0x558E8E93);
            h.voicePlay.setImageResource(playing ? R.drawable.ic_pause : R.drawable.ic_play);
            h.voicePlay.setImageTintList(android.content.res.ColorStateList.valueOf(
                    m.outgoing ? 0xFFFFFFFF : ctx.getResources().getColor(R.color.accent)));
            h.voiceTime.setText(MediaUtil.humanDuration(m.durationMs));
            final VoiceWaveView wave = h.voiceWave;
            final ImageView play = h.voicePlay;
            View.OnClickListener listener = v -> actions.onVoiceTap(m, wave, play);
            h.voicePlay.setOnClickListener(listener);
            h.voiceBox.setOnClickListener(listener);
            h.voiceTime.setOnClickListener(v -> actions.onVoiceSpeed(m));
        } else if (m.isFile()) {
            h.fileBox.setVisibility(View.VISIBLE);
            h.fileName.setText(m.fileName == null || m.fileName.isEmpty() ? "файл" : m.fileName);
            h.fileSize.setText(MediaUtil.humanSize(m.fileSize > 0 ? m.fileSize : MediaUtil.decode(m.mediaB64).length));
        }

        // ---- текст ----
        String text = m.text == null ? "" : m.text;
        if (m.deleted) {
            h.text.setVisibility(View.VISIBLE);
            h.text.setText(R.string.message_deleted);
            h.text.setTypeface(null, android.graphics.Typeface.ITALIC);
            h.text.setTextColor(0x99FFFFFF & (m.outgoing ? 0xFFFFFFFF : 0xFF8E8E93));
        } else if (text.isEmpty() && !m.hasMedia() && !"invite".equals(m.type)) {
            h.text.setVisibility(View.VISIBLE);
            h.text.setText(R.string.undecryptable);
            h.text.setTypeface(null, android.graphics.Typeface.NORMAL);
            h.text.setTextColor(onBubble);
        } else {
            h.text.setVisibility(text.isEmpty() ? View.GONE : View.VISIBLE);
            h.text.setText(text);
            // Ссылки в тексте открываются по нажатию и подсвечиваются акцентом
            if (android.text.util.Linkify.addLinks(h.text, android.text.util.Linkify.WEB_URLS)) {
                h.text.setLinkTextColor(ctx.getResources().getColor(R.color.accent));
            }
            h.text.setTypeface(null, android.graphics.Typeface.NORMAL);
            h.text.setTextColor(onBubble);
            h.text.setTextSize(16f * textScale);
            if (m.isFile() && m.text != null && !m.text.isEmpty()) {
                h.text.setVisibility(View.VISIBLE);
            }
        }

        // ---- реакции ----
        h.reactions.removeAllViews();
        if (m.reactions.isEmpty()) {
            h.reactions.setVisibility(View.GONE);
        } else {
            h.reactions.setVisibility(View.VISIBLE);
            for (Map.Entry<String, Integer> entry : m.reactions.entrySet()) {
                TextView chip = new TextView(ctx);
                chip.setText(entry.getKey() + (entry.getValue() > 1 ? " " + entry.getValue() : ""));
                chip.setTextSize(13f);
                chip.setPadding(Ui.dp(ctx, 7), Ui.dp(ctx, 2), Ui.dp(ctx, 7), Ui.dp(ctx, 2));
                chip.setBackgroundResource(R.drawable.bg_reaction_chip);
                LinearLayout.LayoutParams chipParams = new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                chipParams.setMarginEnd(Ui.dp(ctx, 4));
                chip.setLayoutParams(chipParams);
                final String emoji = entry.getKey();
                chip.setOnClickListener(v -> actions.onReactionTap(m, emoji));
                h.reactions.addView(chip);
                if (animationsEnabled) Anim.pop(chip);
            }
        }

        // ---- время, правка, статус ----
        h.time.setText(Ui.timeShort(m.ts));
        h.edited.setVisibility(m.edited ? View.VISIBLE : View.GONE);
        h.time.setTextColor(m.outgoing ? 0xB3FFFFFF : resolveSecondary(ctx));
        h.edited.setTextColor(m.outgoing ? 0x99FFFFFF : resolveSecondary(ctx));
        if (m.outgoing) {
            h.state.setVisibility(View.VISIBLE);
            if (m.state == Msg.STATE_FAILED) {
                h.state.setImageResource(R.drawable.ic_error);
                h.state.setImageTintList(android.content.res.ColorStateList.valueOf(0xFFFF453A));
            } else if (m.state == Msg.STATE_SENDING) {
                h.state.setImageResource(R.drawable.ic_sync);
                h.state.setImageTintList(android.content.res.ColorStateList.valueOf(0x99FFFFFF));
            } else {
                h.state.setImageResource(R.drawable.ic_check_double);
                h.state.setImageTintList(android.content.res.ColorStateList.valueOf(0xCCFFFFFF));
            }
        } else {
            h.state.setVisibility(View.GONE);
        }

        // ---- выбор нескольких ----
        boolean isSelected = selected.contains(m.mid);
        h.selectCheck.setVisibility(selectionMode() ? View.VISIBLE : View.GONE);
        h.selectCheck.setImageResource(isSelected ? R.drawable.ic_check_accent : R.drawable.ic_close);
        h.selectCheck.setAlpha(isSelected ? 1f : 0.35f);

        // ---- касания, смахивание для ответа ----
        h.container.setOnLongClickListener(v -> {
            Anim.haptic(h.container, true);
            actions.onMessageLongPress(m, h.container);
            return true;
        });
        h.container.setOnClickListener(v -> {
            long now = System.currentTimeMillis();
            if (now - lastTapAt < 280L && lastTapMid.equals(m.mid)) {
                lastTapMid = "";
                lastTapAt = 0L;
                Anim.haptic(h.container, false);
                Anim.pop(h.container);
                actions.onReactionTap(m, "\u2764\uFE0F");
                return;
            }
            lastTapAt = now;
            lastTapMid = m.mid;
            if (selectionMode()) {
                toggleSelection(m);
            } else {
                actions.onMessageClick(m);
            }
        });
        attachSwipe(h, m);

        // ---- анимация появления нового сообщения: пружина (spatial spring) ----
        if (animationsEnabled && !animated.contains(m.mid)) {
            animated.add(m.mid);
            Anim.springIn(h.container, 0.94f, 14f);
        } else {
            h.container.setAlpha(1f);
            h.container.setScaleX(1f);
            h.container.setScaleY(1f);
            h.container.setTranslationY(0f);
        }
    }

    private void attachSwipe(final MessageHolder h, final Msg m) {
        final Context ctx = h.itemView.getContext();
        final int trigger = Ui.dp(ctx, SWIPE_TRIGGER_DP);
        h.container.setOnTouchListener(new View.OnTouchListener() {
            float startX;
            float startY;
            boolean dragging;
            boolean armed;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        startX = event.getRawX();
                        startY = event.getRawY();
                        dragging = false;
                        armed = false;
                        return false;
                    case MotionEvent.ACTION_MOVE:
                        float dx = event.getRawX() - startX;
                        float dy = Math.abs(event.getRawY() - startY);
                        if (!dragging && dx > Ui.dp(ctx, 12) && dy < Ui.dp(ctx, 24)) {
                            dragging = true;
                            h.swipeIcon.setVisibility(View.VISIBLE);
                            if (v.getParent() != null) {
                                v.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                        }
                        if (dragging) {
                            // мягкое «сопротивление» за порогом — как эластичная лента
                            float shift = dx <= trigger ? dx : trigger + (dx - trigger) * 0.25f;
                            h.container.setTranslationX(shift);
                            float progress = Math.min(1f, shift / trigger);
                            h.swipeIcon.setAlpha(progress);
                            h.swipeIcon.setScaleX(0.7f + 0.5f * progress);
                            h.swipeIcon.setScaleY(0.7f + 0.5f * progress);
                            if (!armed && shift >= trigger * 0.8f) {
                                armed = true;
                                h.container.performHapticFeedback(
                                        android.view.HapticFeedbackConstants.LONG_PRESS);
                            } else if (armed && shift < trigger * 0.6f) {
                                armed = false;
                            }
                            return true;
                        }
                        return false;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        if (dragging) {
                            float shift = h.container.getTranslationX();
                            h.container.animate().translationX(0f).setDuration(150L).start();
                            h.swipeIcon.animate().alpha(0f).setDuration(150L).withEndAction(() -> {
                                h.swipeIcon.setVisibility(View.GONE);
                            }).start();
                            h.swipeIcon.setScaleX(1f);
                            h.swipeIcon.setScaleY(1f);
                            if (shift >= trigger * 0.8f) {
                                Anim.haptic(h.container, true);
                                actions.onReply(m);
                            }
                            dragging = false;
                            return true;
                        }
                        return false;
                    default:
                        return false;
                }
            }
        });
    }

    private int resolveOnSurface(Context ctx) {
        android.util.TypedValue value = new android.util.TypedValue();
        if (!ctx.getTheme().resolveAttribute(com.google.android.material.R.attr.colorOnSurface, value, true)) {
            return Color.WHITE;
        }
        return value.data;
    }

    private int resolveSecondary(Context ctx) {
        android.util.TypedValue value = new android.util.TypedValue();
        if (!ctx.getTheme().resolveAttribute(com.google.android.material.R.attr.colorOnSurfaceVariant, value, true)) {
            return 0xFF8E8E93;
        }
        return value.data;
    }

    // ---------------- миниатюры ----------------

    private static int[] waveOf(Msg m) {
        String source = m.wave != null && !m.wave.isEmpty()
                ? m.wave
                : (m.mediaMime != null && m.mediaMime.startsWith("wave:") ? m.mediaMime.substring(5) : "");
        if (!source.isEmpty()) {
            try {
                String[] parts = source.split(",");
                int[] out = new int[parts.length];
                for (int i = 0; i < parts.length; i++) out[i] = Integer.parseInt(parts[i].trim());
                return out;
            } catch (Exception ignored) {
            }
        }
        return new int[0];
    }

    private void bindBitmap(final ImageView view, final String base64, final int mode) {
        final String key = mode + ":" + (base64.length() > 64 ? base64.substring(0, 64) + base64.length() : base64);
        view.setTag(key);
        Bitmap cached = MEDIA_CACHE.get(key);
        if (cached != null) {
            view.setImageBitmap(cached);
            return;
        }
        view.setImageBitmap(null);
        MEDIA_POOL.execute(() -> {
            Bitmap result = null;
            try {
                byte[] raw = Base64.decode(base64, Base64.DEFAULT);
                if (mode == 0) {
                    result = PhotoUtil.decodeScaled(raw, 800);
                } else {
                    File file = File.createTempFile("thumb", ".mp4", view.getContext().getCacheDir());
                    try (java.io.FileOutputStream out = new java.io.FileOutputStream(file)) {
                        out.write(raw);
                    }
                    result = MediaUtil.videoFrame(file, 512);
                    // временный файл нужен только для кадра
                    file.delete();
                }
            } catch (Exception ignored) {
            }
            final Bitmap bitmap = result;
            if (bitmap != null) MEDIA_CACHE.put(key, bitmap);
            view.post(() -> {
                if (bitmap != null && key.equals(view.getTag())) {
                    view.setImageBitmap(bitmap);
                    if (animationsEnabled) {
                        view.setAlpha(0f);
                        ObjectAnimator.ofFloat(view, View.ALPHA, 0f, 1f).setDuration(160L).start();
                    }
                }
            });
        });
    }

    static class DayHolder extends RecyclerView.ViewHolder {
        final TextView label;

        DayHolder(View itemView) {
            super(itemView);
            label = itemView.findViewById(R.id.day_label);
        }
    }

    static class MessageHolder extends RecyclerView.ViewHolder {
        final LinearLayout container;
        final TextView forwarded;
        final LinearLayout replyQuote;
        final View replyStrip;
        final TextView replyName;
        final TextView replyText;
        final TextView text;
        final TextView time;
        final TextView edited;
        final ImageView image;
        final FrameLayout videoBox;
        final ImageView videoThumb;
        final TextView videoDuration;
        final FrameLayout circleBox;
        final ImageView circleThumb;
        final LinearLayout voiceBox;
        final ImageView voicePlay;
        final VoiceWaveView voiceWave;
        final TextView voiceTime;
        final LinearLayout fileBox;
        final TextView fileName;
        final TextView fileSize;
        final LinearLayout reactions;
        final ImageView state;
        final ImageView swipeIcon;
        final ImageView selectCheck;

        MessageHolder(View itemView) {
            super(itemView);
            container = itemView.findViewById(R.id.msg_container);
            forwarded = itemView.findViewById(R.id.msg_forwarded);
            replyQuote = itemView.findViewById(R.id.msg_reply_quote);
            replyStrip = itemView.findViewById(R.id.msg_reply_strip);
            replyName = itemView.findViewById(R.id.msg_reply_name);
            replyText = itemView.findViewById(R.id.msg_reply_text);
            text = itemView.findViewById(R.id.msg_text);
            time = itemView.findViewById(R.id.msg_time);
            edited = itemView.findViewById(R.id.msg_edited);
            image = itemView.findViewById(R.id.msg_image);
            videoBox = itemView.findViewById(R.id.msg_video_box);
            videoThumb = itemView.findViewById(R.id.msg_video_thumb);
            videoDuration = itemView.findViewById(R.id.msg_video_duration);
            circleBox = itemView.findViewById(R.id.msg_circle_box);
            circleThumb = itemView.findViewById(R.id.msg_circle_thumb);
            voiceBox = itemView.findViewById(R.id.msg_voice_box);
            voicePlay = itemView.findViewById(R.id.msg_voice_play);
            voiceWave = itemView.findViewById(R.id.msg_voice_wave);
            voiceTime = itemView.findViewById(R.id.msg_voice_time);
            fileBox = itemView.findViewById(R.id.msg_file_box);
            fileName = itemView.findViewById(R.id.msg_file_name);
            fileSize = itemView.findViewById(R.id.msg_file_size);
            reactions = itemView.findViewById(R.id.msg_reactions);
            state = itemView.findViewById(R.id.msg_state);
            swipeIcon = itemView.findViewById(R.id.msg_swipe_icon);
            selectCheck = itemView.findViewById(R.id.msg_select_check);
        }
    }
}
