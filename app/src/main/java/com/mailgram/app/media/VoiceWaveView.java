package com.mailgram.app.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Волновая дорожка голосового сообщения: столбики амплитуд и прогресс прослушивания.
 * Рисуется вручную — без картинок и сторонних библиотек.
 */
public class VoiceWaveView extends View {

    private int[] amplitudes = new int[0];
    private float progress;
    private int playedColor = 0xFF0A84FF;
    private int restColor = 0xFF8E8E93;
    private final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint cursor = new Paint(Paint.ANTI_ALIAS_FLAG);

    public VoiceWaveView(Context context) {
        super(context);
        init();
    }

    public VoiceWaveView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VoiceWaveView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        cursor.setStrokeWidth(dp(2f));
        cursor.setStrokeCap(Paint.Cap.ROUND);
        setWillNotDraw(false);
    }

    public void setColors(int played, int rest) {
        playedColor = played;
        restColor = rest;
        invalidate();
    }

    public void setAmplitudes(int[] values) {
        amplitudes = values == null ? new int[0] : values;
        invalidate();
    }

    public void setProgress(float value) {
        progress = Math.max(0f, Math.min(1f, value));
        invalidate();
    }

    public float getProgress() {
        return progress;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        if (height <= 0 || width <= 0) return;

        int bars = amplitudes.length > 1 ? amplitudes.length : Math.max(12, (int) (width / dp(4f)));
        float step = (float) width / (float) bars;
        float barWidth = Math.max(dp(1.6f), step * 0.55f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(barWidth);
        float center = height / 2f;
        float playedX = width * progress;

        for (int i = 0; i < bars; i++) {
            float value = 0.28f;
            if (amplitudes.length > 1) {
                value = Math.max(0.12f, Math.min(1f, amplitudes[i] / 100f));
            } else {
                value = 0.25f + 0.55f * Math.abs((float) Math.sin(i * 1.7f));
            }
            float half = (height / 2f - dp(1f)) * value;
            float x = step * i + step / 2f;
            paint.setColor(x <= playedX ? playedColor : restColor);
            canvas.drawLine(x, center - half, x, center + half, paint);
        }
    }

    private float dp(float value) {
        return value * getResources().getDisplayMetrics().density;
    }
}
