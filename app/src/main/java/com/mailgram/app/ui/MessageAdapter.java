package com.mailgram.app.ui;

import android.graphics.Bitmap;
import android.util.Base64;
import android.util.LruCache;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mailgram.app.R;
import com.mailgram.app.store.Msg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** Лента сообщений: пузыри с датами, фото и статусами отправки. */
public class MessageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public interface Actions {
        void onMessageLongPress(Msg msg, View anchor);

        void onMessageClick(Msg msg);
    }

    private static final int TYPE_DAY = 0;
    private static final int TYPE_MSG = 1;

    private static final ExecutorService IMAGE_POOL = Executors.newFixedThreadPool(2);
    private static final LruCache<String, Bitmap> IMAGE_CACHE = new LruCache<>(12 * 1024 * 1024) {
        @Override
        protected int sizeOf(String key, Bitmap value) {
            return value.getByteCount();
        }
    };

    private final List<Row> rows = new ArrayList<>();
    private final Actions actions;

    public MessageAdapter(Actions actions) {
        this.actions = actions;
    }

    private static final class Row {
        boolean header;
        String label;
        Msg msg;
    }

    public void submit(List<Msg> messages) {
        rows.clear();
        String lastDay = null;
        for (Msg m : messages) {
            String day = Ui.dayLabel(m.ts);
            if (!day.equals(lastDay)) {
                Row header = new Row();
                header.header = true;
                header.label = day;
                rows.add(header);
                lastDay = day;
            }
            Row row = new Row();
            row.msg = m;
            rows.add(row);
        }
        notifyDataSetChanged();
    }

    public int messageCount() {
        int n = 0;
        for (Row r : rows) if (!r.header) n++;
        return n;
    }

    @Override
    public int getItemViewType(int position) {
        return rows.get(position).header ? TYPE_DAY : TYPE_MSG;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == TYPE_DAY) {
            return new DayHolder(inflater.inflate(R.layout.item_day, parent, false));
        }
        return new MessageHolder(inflater.inflate(R.layout.item_message, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Row row = rows.get(position);
        if (row.header) {
            ((DayHolder) holder).label.setText(row.label);
        } else {
            bindMessage((MessageHolder) holder, row.msg);
        }
    }

    @Override
    public int getItemCount() {
        return rows.size();
    }

    private void bindMessage(MessageHolder h, Msg m) {
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) h.container.getLayoutParams();
        lp.gravity = m.outgoing ? Gravity.END : Gravity.START;
        h.container.setLayoutParams(lp);
        h.container.setBackgroundResource(m.outgoing ? R.drawable.bg_bubble_out : R.drawable.bg_bubble_in);

        if (m.isImage()) {
            h.image.setVisibility(View.VISIBLE);
            bindImage(h.image, m.imageB64);
        } else {
            h.image.setVisibility(View.GONE);
            h.image.setImageDrawable(null);
        }

        String text = m.text == null ? "" : m.text;
        if (m.type != null && m.type.equals("invite")) {
            h.text.setVisibility(View.VISIBLE);
            h.text.setText(text);
        } else if (text.isEmpty() && !m.isImage()) {
            h.text.setVisibility(View.VISIBLE);
            h.text.setText(R.string.undecryptable);
        } else {
            h.text.setVisibility(text.isEmpty() ? View.GONE : View.VISIBLE);
            h.text.setText(text);
        }

        h.time.setText(Ui.timeShort(m.ts));

        if (m.outgoing) {
            h.state.setVisibility(View.VISIBLE);
            if (m.state == Msg.STATE_FAILED) {
                h.state.setImageResource(R.drawable.ic_error);
                h.state.setImageTintList(android.content.res.ColorStateList.valueOf(0xFFE53935));
                h.state.setContentDescription(h.itemView.getContext().getString(R.string.state_failed));
            } else if (m.state == Msg.STATE_SENDING) {
                h.state.setImageResource(R.drawable.ic_sync);
                h.state.setImageTintList(android.content.res.ColorStateList.valueOf(0xFF9AA6B2));
                h.state.setContentDescription(h.itemView.getContext().getString(R.string.state_sending));
            } else {
                h.state.setImageResource(R.drawable.ic_check);
                h.state.setImageTintList(android.content.res.ColorStateList.valueOf(0xFF31C48D));
                h.state.setContentDescription(h.itemView.getContext().getString(R.string.done));
            }
        } else {
            h.state.setVisibility(View.GONE);
        }

        h.itemView.setOnLongClickListener(v -> {
            actions.onMessageLongPress(m, h.container);
            return true;
        });
        h.container.setOnClickListener(v -> actions.onMessageClick(m));
    }

    private void bindImage(final ImageView view, final String b64) {
        view.setTag(b64);
        Bitmap cached = IMAGE_CACHE.get(b64);
        if (cached != null) {
            view.setImageBitmap(cached);
            return;
        }
        view.setImageBitmap(null);
        IMAGE_POOL.execute(() -> {
            Bitmap bitmap = null;
            try {
                byte[] raw = Base64.decode(b64, Base64.DEFAULT);
                bitmap = PhotoUtil.decodeScaled(raw, PhotoUtil.MAX_DIMENSION);
            } catch (Exception ignored) {
            }
            final Bitmap result = bitmap;
            if (result != null) {
                IMAGE_CACHE.put(b64, result);
            }
            view.post(() -> {
                if (result != null && b64.equals(view.getTag())) {
                    view.setImageBitmap(result);
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
        final TextView text;
        final TextView time;
        final ImageView image;
        final ImageView state;

        MessageHolder(View itemView) {
            super(itemView);
            container = itemView.findViewById(R.id.msg_container);
            text = itemView.findViewById(R.id.msg_text);
            time = itemView.findViewById(R.id.msg_time);
            image = itemView.findViewById(R.id.msg_image);
            state = itemView.findViewById(R.id.msg_state);
        }
    }
}
