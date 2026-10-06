package com.github.rudroid.discussions;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;

/* loaded from: /home/user/work/p/classes.dex */
public final class k5 extends GradientDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f11443a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f11444b;

    public k5(Bitmap bitmap, int i, int i10, float f6) {
        super(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, i10});
        this.f11443a = f6;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = new Paint();
        this.f11444b = paint;
        paint.setAlpha(30);
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        setCornerRadius(f6);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        k71.k.g(canvas, "canvas");
        super.draw(canvas);
        RectF rectF = new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height());
        float f6 = this.f11443a;
        canvas.drawRoundRect(rectF, f6, f6, this.f11444b);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f11444b.setAlpha(i);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11444b.setColorFilter(colorFilter);
    }
}
