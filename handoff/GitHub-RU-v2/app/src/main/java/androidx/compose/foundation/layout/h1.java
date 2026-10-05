package androidx.compose.foundation.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class h1 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1160r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i1 f1161s;

    public /* synthetic */ h1(i1 i1Var, int i) {
        this.f1160r = i;
        this.f1161s = i1Var;
    }

    public final Object k(Object obj) {
        v2.z1 z1Var = (v2.z1) obj;
        switch (this.f1160r) {
            case k5.f.J:
                k71.k.e(z1Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                i1 i1Var = (i1) z1Var;
                b3 b3Var = this.f1161s.G;
                if (!k71.k.b(i1Var.F, b3Var)) {
                    i1Var.F = b3Var;
                    i1Var.P0();
                }
                return v2.y1.f32638s;
            default:
                k71.k.e(z1Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                this.f1161s.F = ((i1) z1Var).G;
                return Boolean.FALSE;
        }
    }



}
