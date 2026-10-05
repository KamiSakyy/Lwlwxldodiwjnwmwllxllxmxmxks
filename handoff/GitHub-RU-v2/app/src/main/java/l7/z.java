package l7;

import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public h0 f28373a;

    /* renamed from: b, reason: collision with root package name */
    public int f28374b;

    /* renamed from: c, reason: collision with root package name */
    public int f28375c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28376d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28377e;

    public z() {
        d();
    }

    public final void a() {
        this.f28375c = this.f28376d ? this.f28373a.i() : this.f28373a.m();
    }

    public final void b(View view, int i) {
        if (this.f28376d) {
            int d10 = this.f28373a.d(view);
            h0 h0Var = this.f28373a;
            this.f28375c = (Integer.MIN_VALUE == h0Var.f28139a ? 0 : h0Var.n() - h0Var.f28139a) + d10;
        } else {
            this.f28375c = this.f28373a.g(view);
        }
        this.f28374b = i;
    }

    public final void c(View view, int i) {
        h0 h0Var = this.f28373a;
        int n10 = Integer.MIN_VALUE == h0Var.f28139a ? 0 : h0Var.n() - h0Var.f28139a;
        if (n10 >= 0) {
            b(view, i);
            return;
        }
        this.f28374b = i;
        if (!this.f28376d) {
            int g7 = this.f28373a.g(view);
            int m = g7 - this.f28373a.m();
            this.f28375c = g7;
            if (m > 0) {
                int i10 = (this.f28373a.i() - Math.min(0, (this.f28373a.i() - n10) - this.f28373a.d(view))) - (this.f28373a.e(view) + g7);
                if (i10 < 0) {
                    this.f28375c -= Math.min(m, -i10);
                    return;
                }
                return;
            }
            return;
        }
        int i11 = (this.f28373a.i() - n10) - this.f28373a.d(view);
        this.f28375c = this.f28373a.i() - i11;
        if (i11 > 0) {
            int e5 = this.f28375c - this.f28373a.e(view);
            int m10 = this.f28373a.m();
            int min = e5 - (Math.min(this.f28373a.g(view) - m10, 0) + m10);
            if (min < 0) {
                this.f28375c = Math.min(i11, -min) + this.f28375c;
            }
        }
    }

    public final void d() {
        this.f28374b = -1;
        this.f28375c = Integer.MIN_VALUE;
        this.f28376d = false;
        this.f28377e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f28374b + ", mCoordinate=" + this.f28375c + ", mLayoutFromEnd=" + this.f28376d + ", mValid=" + this.f28377e + '}';
    }
}
