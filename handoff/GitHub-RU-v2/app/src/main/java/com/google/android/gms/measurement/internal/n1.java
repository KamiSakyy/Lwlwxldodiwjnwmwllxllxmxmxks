package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n1 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ com.google.android.gms.internal.measurement.n0 s;
    public final /* synthetic */ AppMeasurementDynamiteService t;

    public /* synthetic */ n1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.n0 n0Var, int i) {
        this.r = i;
        this.s = n0Var;
        this.t = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                p3 p = this.t.f.p();
                com.google.android.gms.internal.measurement.n0 n0Var = this.s;
                p.z();
                p.A();
                p.N(new c51.c(p, p.P(false), n0Var, 7));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.t;
                t4 t4Var = appMeasurementDynamiteService.f.z;
                o1.k(t4Var);
                o1 o1Var = appMeasurementDynamiteService.f;
                t4Var.m0(this.s, o1Var.P != null && o1Var.P.booleanValue());
                break;
        }
    }
}
