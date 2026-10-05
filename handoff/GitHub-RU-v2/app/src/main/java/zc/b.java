package zc;

import com.github.rudroid.feed.ui.g0;
import com.github.rudroid.feed.v1;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f34653r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f34654s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f34655t;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.f34653r = i;
        this.f34654s = obj;
        this.f34655t = obj2;
    }

    public final Object a() {
        switch (this.f34653r) {
            case k5.f.J:
                g0 g0Var = (g0) this.f34654s;
                t10.e eVar = (t10.e) this.f34655t;
                t10.l lVar = eVar.i;
                g0Var.k2(lVar.b, eVar.f, lVar.d);
                break;
            case 1:
                g0 g0Var2 = (g0) this.f34654s;
                t10.l lVar2 = (t10.l) this.f34655t;
                g0Var2.N2(lVar2.b, lVar2.d);
                break;
            case 2:
                g0 g0Var3 = (g0) this.f34654s;
                t10.j jVar = ((t10.q) this.f34655t).e;
                t10.l lVar3 = jVar.m;
                g0Var3.v0(lVar3.b, lVar3.d, jVar.f);
                break;
            case 3:
                g0 g0Var4 = (g0) this.f34654s;
                t10.j jVar2 = (t10.j) this.f34655t;
                t10.l lVar4 = jVar2.m;
                g0Var4.v0(lVar4.b, lVar4.d, jVar2.f);
                break;
            default:
                ((v1) this.f34654s).Q(((t10.k) this.f34655t).a);
                break;
        }
        return a0.a;
    }
}
