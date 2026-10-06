package com.github.rudroid.utilities;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ImageSpan;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m extends ImageSpan {
    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        k71.k.g(canvas, "canvas");
        k71.k.g(paint, "paint");
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.ascent + i4;
        float max = (Integer.max(((i4 + fontMetricsInt.descent) - i6) - getDrawable().getBounds().height(), 0) / 2) + i6;
        int save = canvas.save();
        canvas.translate(f, max);
        try {
            getDrawable().draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
    public Object e() { return null; }
}
