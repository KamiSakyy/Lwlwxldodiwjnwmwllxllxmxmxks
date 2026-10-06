package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v3 implements Runnable {
    public long r;
    public long s;
    public final /* synthetic */ b1.m t;

    public v3(b1.m mVar, long j, long j2) {
        Objects.requireNonNull(mVar);
        this.t = mVar;
        this.r = j;
        this.s = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m1 m1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((y3) this.t.t)).s).x;
        o1.m(m1Var);
        m1Var.I(new androidx.fragment.app.o(10, this));
    }
}
