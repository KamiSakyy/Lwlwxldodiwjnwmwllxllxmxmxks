package androidx.compose.foundation.lazy.layout;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class k1 implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1428r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m1 f1429s;

    public /* synthetic */ k1(m1 m1Var, int i) {
        this.f1428r = i;
        this.f1429s = m1Var;
    }

    public final Object a() {
        switch (this.f1428r) {
            case k5.f.J /* 0 */:
                return Float.valueOf(this.f1429s.G.b());
            case 1:
                return Float.valueOf(this.f1429s.G.d());
            default:
                m1 m1Var = this.f1429s;
                return Float.valueOf(m1Var.G.a() - m1Var.G.c());
        }
    }



}
