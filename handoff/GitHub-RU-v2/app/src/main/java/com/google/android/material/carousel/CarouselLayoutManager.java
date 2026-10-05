package com.google.android.material.carousel;

import a0.g0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.datepicker.r;
import g31.b;
import g31.c;
import l7.e0;
import l7.e1;
import l7.i1;
import l7.j1;
import l7.w0;
import l7.x0;
import no.a;

/* loaded from: /home/user/work/p/classes4.dex */
public class CarouselLayoutManager extends w0 implements i1 {
    public final g0 p;
    public c q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager() {
        g0 g0Var = new g0(1);
        new b();
        this.r = new View.OnLayoutChangeListener() { // from class: g31.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                view.post(new s(16, CarouselLayoutManager.this));
            }
        };
        this.p = g0Var;
        t0();
        L0(0);
    }

    public final void F0(RecyclerView recyclerView, int i) {
        r rVar = new r(this, recyclerView.getContext());
        ((e0) rVar).a = i;
        G0(rVar);
    }

    public final float I0(float f, float f2) {
        return K0() ? f - f2 : f + f2;
    }

    public final boolean J0() {
        return this.q.a == 0;
    }

    public final boolean K0() {
        return J0() && ((w0) this).b.getLayoutDirection() == 1;
    }

    public final void L0(int i) {
        c cVar;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(a.k("invalid orientation:", i));
        }
        c((String) null);
        c cVar2 = this.q;
        if (cVar2 == null || i != cVar2.a) {
            if (i == 0) {
                cVar = new c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                cVar = new c(this, 0);
            }
            this.q = cVar;
            t0();
        }
    }

    public final boolean O() {
        return true;
    }

    public final void V(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        g0 g0Var = this.p;
        float f = g0Var.r;
        if (f <= 0.0f) {
            f = context.getResources().getDimension(2131165494);
        }
        g0Var.r = f;
        float f2 = g0Var.s;
        if (f2 <= 0.0f) {
            f2 = context.getResources().getDimension(2131165493);
        }
        g0Var.s = f2;
        t0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    public final void W(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0027, code lost:
    
        if (r6 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0031, code lost:
    
        if (K0() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0035, code lost:
    
        if (r6 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x003e, code lost:
    
        if (K0() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View X(View view, int i, e1 e1Var, j1 j1Var) {
        char c;
        if (v() == 0) {
            return null;
        }
        int i2 = this.q.a;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i == 130) {
                        }
                        c = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c = 0;
                    }
                }
                if (c == 0) {
                    return null;
                }
                if (c == 65535) {
                    if (w0.K(view) == 0) {
                        return null;
                    }
                    int K = w0.K(u(0)) - 1;
                    if (K < 0 || K >= F()) {
                        return u(K0() ? v() - 1 : 0);
                    }
                    this.q.a();
                    throw null;
                }
                if (w0.K(view) == F() - 1) {
                    return null;
                }
                int K2 = w0.K(u(v() - 1)) + 1;
                if (K2 < 0 || K2 >= F()) {
                    return u(K0() ? 0 : v() - 1);
                }
                this.q.a();
                throw null;
            }
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(w0.K(u(0)));
            accessibilityEvent.setToIndex(w0.K(u(v() - 1)));
        }
    }

    public final PointF a(int i) {
        return null;
    }

    public final void c0(int i, int i2) {
        F();
    }

    public final boolean d() {
        return J0();
    }

    public final void d0() {
        F();
    }

    public final boolean e() {
        return !J0();
    }

    public final void f0(int i, int i2) {
        F();
    }

    public final void h0(e1 e1Var, j1 j1Var) {
        if (j1Var.b() > 0) {
            if ((J0() ? ((w0) this).n : ((w0) this).o) > 0.0f) {
                K0();
                e1Var.d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        o0(e1Var);
    }

    public final void i0(j1 j1Var) {
        if (v() == 0) {
            return;
        }
        w0.K(u(0));
    }

    public final int j(j1 j1Var) {
        v();
        return 0;
    }

    public final int k(j1 j1Var) {
        return 0;
    }

    public final int l(j1 j1Var) {
        return 0;
    }

    public final int m(j1 j1Var) {
        v();
        return 0;
    }

    public final int n(j1 j1Var) {
        return 0;
    }

    public final int o(j1 j1Var) {
        return 0;
    }

    public final x0 r() {
        return new x0(-2, -2);
    }

    public final boolean s0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    public final int u0(int i, e1 e1Var, j1 j1Var) {
        if (!J0() || v() == 0 || i == 0) {
            return 0;
        }
        e1Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void v0(int i) {
    }

    public final int w0(int i, e1 e1Var, j1 j1Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        e1Var.d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final void z(Rect rect, View view) {
        RecyclerView.Q(rect, view);
        rect.centerY();
        if (J0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new b();
        this.r = new View.OnLayoutChangeListener() { // from class: g31.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                if (i32 - i3 == i7 - i5 && i4 - i22 == i8 - i6) {
                    return;
                }
                view.post(new s(16, CarouselLayoutManager.this));
            }
        };
        this.p = new g0(1);
        t0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.a.e);
            obtainStyledAttributes.getInt(0, 0);
            t0();
            L0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }






}
