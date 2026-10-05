package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 extends g1 {
    public final /* synthetic */ int v;
    public final /* synthetic */ i0 w;
    public final /* synthetic */ k1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(k1 k1Var, i0 i0Var, int i) {
        super(k1Var, true);
        this.v = i;
        this.w = i0Var;
        this.x = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.v) {
            case 0:
                l0 l0Var = this.x.f;
                c21.u.g(l0Var);
                l0Var.getGmpAppId(this.w);
                break;
            case 1:
                l0 l0Var2 = this.x.f;
                c21.u.g(l0Var2);
                l0Var2.getCachedAppInstanceId(this.w);
                break;
            case 2:
                l0 l0Var3 = this.x.f;
                c21.u.g(l0Var3);
                l0Var3.generateEventId(this.w);
                break;
            case 3:
                l0 l0Var4 = this.x.f;
                c21.u.g(l0Var4);
                l0Var4.getCurrentScreenName(this.w);
                break;
            default:
                l0 l0Var5 = this.x.f;
                c21.u.g(l0Var5);
                l0Var5.getCurrentScreenClass(this.w);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void b() {
        switch (this.v) {
            case 0:
                this.w.c(null);
                break;
            case 1:
                this.w.c(null);
                break;
            case 2:
                this.w.c(null);
                break;
            case 3:
                this.w.c(null);
                break;
            default:
                this.w.c(null);
                break;
        }
    }
}
