package com.mailgram.app.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Затемнение вокруг круглого окна записи + кольцо прогресса (как в кружках Telegram).
 * Рисуется поверх SurfaceView: снаружи круга — чёрная маска.
 */
public class CircleMaskView extends View {

    private final Paint maskPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint ringPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private float progress;

    public CircleMaskView(Context context) {
        super(context);
        init();
    }

    public CircleMaskView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        maskPaint.setColor(0xFF000000);
        maskPaint.setStyle(Paint.Style.FILL);
        maskPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        ringPaint.setStyle(Paint.Style.STROKE);
        ringPaint.setStrokeWidth(dp(3f));
        ringPaint.setColor(0xFFFFFFFF);
        setLayerType(LAYER_TYPE_HARDWARE, null);
    }

    public void setProgress(float value) {
        progress = Math.max(0f, Math.min(1f, value));
        invalidate();
    }

    public void setRingColor(int color) {
        ringPaint.setColor(color);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) return;
        float radius = Math.min(width, height) / 2f - dp(6f);
        float cx = width / 2f;
        float cy = height / 2f;

        canvas.drawRect(0, 0, width, height, maskPaint);

        RectF box = new RectF(cx - radius, cy - radius, cx + radius, cy + radius);
        ringPaint.setAlpha(70);
        canvas.drawOval(box, ringPaint);
        ringPaint.setAlpha(255);
        if (progress > 0f) {
            canvas.drawArc(box, -90f, 360f * progress, false, ringPaint);
        }
    }

    private float dp(float value) {
        return value * getResources().getDisplayMetrics().density;
    }
}
