package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w1 extends androidx.compose.foundation.lazy.layout.s0 {
    public boolean t;

    public w1(o1 o1Var) {
        super(o1Var);
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).R++;
    }

    public abstract boolean A();

    public final void B() {
        if (!this.t) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void C() {
        if (this.t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (A()) {
            return;
        }
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).T.incrementAndGet();
        this.t = true;
    }
}
