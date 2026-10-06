package i11;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.l2;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.t;
import androidx.compose.ui.layout.o0;
import c2.e;
import d2.d;
import d2.l;
import d2.r;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import s3.m;
import sy.w;
import v2.i0;
import w61.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends i2.b implements l2 {
    public final Drawable w;
    public final p1 x;
    public final p1 y;
    public final p z;

    public a(Drawable drawable) {
        long j;
        k.g(drawable, "drawable");
        this.w = drawable;
        this.x = t.B(0);
        Object obj = c.a;
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            j = 9205357640488583168L;
        } else {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            j = (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L) | (Float.floatToRawIntBits(intrinsicWidth) << 32);
        }
        this.y = t.B(new e(j));
        this.z = w.t(new o0(4, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public final void a() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        Drawable drawable = this.w;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.z.getValue();
        Drawable drawable = this.w;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public final boolean d(float f) {
        this.w.setAlpha(aa1.b.v(m71.a.W(f * 255), 0, 255));
        return true;
    }

    public final boolean e(l lVar) {
        this.w.setColorFilter(lVar != null ? lVar.a : null);
        return true;
    }

    public final void f(m mVar) {
        int i;
        k.g(mVar, "layoutDirection");
        int ordinal = mVar.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 0;
        }
        this.w.setLayoutDirection(i);
    }

    public final long h() {
        return ((e) this.y.getValue()).a;
    }

    public final void i(i0 i0Var) {
        f2.b bVar = i0Var.r;
        r t = bVar.s.t();
        ((Number) this.x.getValue()).intValue();
        int W = m71.a.W(e.e(bVar.a()));
        int W2 = m71.a.W(e.c(bVar.a()));
        Drawable drawable = this.w;
        drawable.setBounds(0, 0, W, W2);
        try {
            t.f();
            drawable.draw(d.a(t));
        } finally {
            t.q();
        }
    }



}
