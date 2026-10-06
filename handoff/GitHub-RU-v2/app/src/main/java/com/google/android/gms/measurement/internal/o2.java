package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o2 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ b2 s;
    public final /* synthetic */ long t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ t2 v;

    public /* synthetic */ o2(t2 t2Var, b2 b2Var, long j, boolean z, int i) {
        this.r = i;
        this.s = b2Var;
        this.t = j;
        this.u = z;
        this.v = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                t2 t2Var = this.v;
                b2 b2Var = this.s;
                t2Var.D(b2Var);
                t2Var.P(b2Var, this.t, this.u);
                break;
            default:
                t2 t2Var2 = this.v;
                b2 b2Var2 = this.s;
                t2Var2.D(b2Var2);
                t2Var2.P(b2Var2, this.t, this.u);
                break;
        }
    }

    public o2(Object... a) {
    }
    public Object a = null;
    public Object b = null;
    public Object c = null;
    public Object d = null;
}
