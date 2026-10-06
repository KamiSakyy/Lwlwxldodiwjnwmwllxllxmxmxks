package com.mailgram.app.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/** Круглый аватар с инициалами и стабильным цветом (как в мессенджерах). */
public class AvatarView extends View {

    private final Paint circle = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint ring = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final Paint text = new Paint(Paint.ANTI_ALIAS_FLAG);
    private final RectF bounds = new RectF();
    private String initials = "?";
    private int color = 0xFF65AADD;

    public AvatarView(Context context) {
        this(context, null);
    }

    public AvatarView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AvatarView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        circle.setStyle(Paint.Style.FILL);
        ring.setStyle(Paint.Style.STROKE);
        ring.setStrokeWidth(Ui.dp(context, 1f));
        ring.setColor(0x22FFFFFF);
        text.setColor(0xFFFFFFFF);
        text.setTextAlign(Paint.Align.CENTER);
        text.setFakeBoldText(true);
    }

    /** Задаёт имя: цвет и инициалы считаются от него, поэтому они постоянны. */
    public void setName(String name) {
        this.initials = Ui.initials(name);
        this.color = Ui.avatarColor(name == null ? "" : name.toLowerCase(java.util.Locale.US));
        invalidate();
    }

    public void setColor(int color) {
        this.color = color;
        invalidate();
    }

    private static int lighten(int color, float amount) {
        return blend(color, 0xFFFFFFFF, amount);
    }

    private static int darken(int color, float amount) {
        return blend(color, 0xFF000000, amount);
    }

    private static int blend(int color, int target, float amount) {
        int r = (int) (android.graphics.Color.red(color)
                + (android.graphics.Color.red(target) - android.graphics.Color.red(color)) * amount);
        int g = (int) (android.graphics.Color.green(color)
                + (android.graphics.Color.green(target) - android.graphics.Color.green(color)) * amount);
        int b = (int) (android.graphics.Color.blue(color)
                + (android.graphics.Color.blue(target) - android.graphics.Color.blue(color)) * amount);
        return android.graphics.Color.argb(255, r, g, b);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int w = getWidth();
        int h = getHeight();
        float cx = w / 2f;
        float cy = h / 2f;
        float r = Math.min(w, h) / 2f;
        // мягкий градиент: верх светлее, низ глубже — «объёмный» аватар
        if (w > 0 && h > 0) {
            circle.setShader(new android.graphics.LinearGradient(0f, 0f, 0f, h,
                    lighten(color, 0.18f), darken(color, 0.14f), android.graphics.Shader.TileMode.CLAMP));
        } else {
            circle.setColor(color);
        }
        canvas.drawCircle(cx, cy, r, circle);
        canvas.drawCircle(cx, cy, r - ring.getStrokeWidth() / 2f, ring);

        text.setTextSize(r * (initials.length() > 1 ? 0.78f : 0.9f));
        float baseline = cy - (text.descent() + text.ascent()) / 2f;
        canvas.drawText(initials, cx, baseline, text);

        bounds.set(0, 0, w, h);
    }
}
