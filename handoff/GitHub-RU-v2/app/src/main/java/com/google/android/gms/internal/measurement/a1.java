package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 extends g1 {
    public final /* synthetic */ int v;
    public final /* synthetic */ String w;
    public final /* synthetic */ k1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(k1 k1Var, String str, int i) {
        super(k1Var, true);
        this.v = i;
        this.w = str;
        this.x = k1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.v) {
            case 0:
                l0 l0Var = this.x.f;
                c21.u.g(l0Var);
                l0Var.beginAdUnitExposure(this.w, this.s);
                break;
            default:
                l0 l0Var2 = this.x.f;
                c21.u.g(l0Var2);
                l0Var2.endAdUnitExposure(this.w, this.s);
                break;
        }
    }
}
