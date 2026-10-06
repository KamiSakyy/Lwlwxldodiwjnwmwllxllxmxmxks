package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 implements Runnable {
    public w0 r;
    public u0 s;

    public d0(w0 w0Var, u0 u0Var) {
        this.r = w0Var;
        this.s = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.r.r != this) {
            return;
        }
        u0 u0Var = this.s;
        if (m0.x.i0(this.r, this, w0.h(u0Var))) {
            w0.j(this.r);
        }
    }
}
