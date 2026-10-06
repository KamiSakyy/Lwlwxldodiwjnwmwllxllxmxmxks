package com.github.rudroid.utilities;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 extends ReplacementSpan {
    public int r;

    public l2(int i) {
        this.r = i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        k71.k.g(canvas, "canvas");
        k71.k.g(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        k71.k.g(paint, "paint");
        return this.r;
    }
}
