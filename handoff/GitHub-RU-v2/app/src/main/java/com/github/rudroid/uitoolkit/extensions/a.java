package com.github.rudroid.uitoolkit.extensions;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import d2.a0;
import d2.r;
import k71.k;
import s3.f;
import y11.l;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.c {
    public final /* synthetic */ float r;
    public final /* synthetic */ long s;
    public final /* synthetic */ float t;
    public final /* synthetic */ float u;

    public /* synthetic */ a(float f, float f2, float f3, long j) {
        this.r = f;
        this.s = j;
        this.t = f2;
        this.u = f3;
    }

    public final Object k(Object obj) {
        f2.d dVar = (f2.d) obj;
        k.g(dVar, "$this$drawBehind");
        r t = dVar.c0().t();
        l g = a0.g();
        Paint paint = (Paint) g.b;
        float f = this.r;
        if (!f.b(f, 0)) {
            paint.setMaskFilter(new BlurMaskFilter(dVar.W(f), BlurMaskFilter.Blur.NORMAL));
        }
        paint.setColor(a0.y(this.s));
        float W = dVar.W(this.t);
        float W2 = dVar.W(this.u);
        t.m(W, W2, Float.intBitsToFloat((int) (dVar.a() >> 32)) + W, Float.intBitsToFloat((int) (dVar.a() & 4294967295L)) + W2, g);
        return w61.a0.a;
    }
}
