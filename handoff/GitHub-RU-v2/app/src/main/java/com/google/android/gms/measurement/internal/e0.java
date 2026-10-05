package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e0 extends a0 {
    public boolean t;

    public e0(o1 o1Var) {
        super(o1Var);
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).R++;
    }

    public final void A() {
        if (!this.t) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void B() {
        if (this.t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (C()) {
            return;
        }
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).T.incrementAndGet();
        this.t = true;
    }

    public abstract boolean C();

    public e0(Object... a) {
    }
}
