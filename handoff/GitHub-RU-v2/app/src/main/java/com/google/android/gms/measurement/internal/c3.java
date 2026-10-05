package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c3 implements Runnable {
    public final /* synthetic */ b3 r;
    public final /* synthetic */ b3 s;
    public final /* synthetic */ long t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ f3 v;

    public c3(f3 f3Var, b3 b3Var, b3 b3Var2, long j, boolean z) {
        this.r = b3Var;
        this.s = b3Var2;
        this.t = j;
        this.u = z;
        this.v = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.v.J(this.r, this.s, this.t, this.u, null);
    }
}
