package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i4 extends e4 {
    public boolean u;

    public i4(o4 o4Var) {
        super(o4Var);
        this.t.I++;
    }

    public final void A() {
        if (!this.u) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void B() {
        if (this.u) {
            throw new IllegalStateException("Can't initialize twice");
        }
        C();
        this.t.J++;
        this.u = true;
    }

    public abstract void C();

    public i4(Object... a) {
    }
}
