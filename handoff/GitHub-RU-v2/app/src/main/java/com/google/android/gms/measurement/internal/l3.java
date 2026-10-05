package com.google.android.gms.measurement.internal;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l3 extends p {
    public final /* synthetic */ int e;
    public final /* synthetic */ p3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(p3 p3Var, o1 o1Var, int i) {
        super(o1Var);
        this.e = i;
        this.f = p3Var;
    }

    @Override // com.google.android.gms.measurement.internal.p
    public final void a() {
        switch (this.e) {
            case 0:
                p3 p3Var = this.f;
                p3Var.z();
                if (p3Var.Q()) {
                    s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).w;
                    o1.m(s0Var);
                    s0Var.F.a("Inactivity, disconnecting from the service");
                    p3Var.H();
                    break;
                }
                break;
            default:
                s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this.f).s).w;
                o1.m(s0Var2);
                s0Var2.A.a("Tasks have been queued for a long time");
                break;
        }
    }


}
