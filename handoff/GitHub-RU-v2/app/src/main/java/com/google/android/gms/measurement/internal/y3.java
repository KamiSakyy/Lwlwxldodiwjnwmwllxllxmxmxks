package com.google.android.gms.measurement.internal;

import android.os.Looper;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y3 extends e0 {
    public com.google.android.gms.internal.measurement.h0 u;
    public boolean v;
    public x3 w;
    public a0.o2 x;
    public b1.m y;

    public y3(o1 o1Var) {
        super(o1Var);
        this.v = true;
        this.w = new x3(0, this);
        this.x = new a0.o2(this);
        this.y = new b1.m(this);
    }

    @Override // com.google.android.gms.measurement.internal.e0
    public final boolean C() {
        return false;
    }

    public final void D() {
        z();
        if (this.u == null) {
            this.u = new com.google.android.gms.internal.measurement.h0(Looper.getMainLooper(), 0);
        }
    }
}
