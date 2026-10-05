package zc;

import com.github.rudroid.feed.ui.g0;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class p implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f34671r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f34672s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t10.k f34673t;

    public /* synthetic */ p(g0 g0Var, t10.k kVar, int i) {
        this.f34671r = i;
        this.f34672s = g0Var;
        this.f34673t = kVar;
    }

    public final Object a() {
        switch (this.f34671r) {
            case k5.f.J /* 0 */:
                t10.l lVar = this.f34673t.i;
                this.f34672s.N2(lVar.b, lVar.d);
                break;
            case 1:
                t10.l lVar2 = this.f34673t.i;
                this.f34672s.U2(lVar2.a, lVar2.b);
                break;
            case 2:
                t10.l lVar3 = this.f34673t.i;
                this.f34672s.Q1(lVar3.a, lVar3.b);
                break;
            default:
                t10.k kVar = this.f34673t;
                String str = kVar.a;
                t10.l lVar4 = kVar.i;
                this.f34672s.u0(str, lVar4.b, lVar4.d);
                break;
        }
        return a0.a;
    }
}
