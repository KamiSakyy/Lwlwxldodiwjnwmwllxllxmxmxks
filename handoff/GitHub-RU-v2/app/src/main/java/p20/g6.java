package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g6 implements aa.a {
    public static final g6 a = new g6();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.p9 p9Var = null;
        while (eVar.r0(b) == 0) {
            p9Var = (u10.p9) aa.c.b(aa.c.c(k6.a, false)).a(eVar, wVar);
        }
        return new u10.l9(p9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.l9 l9Var = (u10.l9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l9Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(k6.a, false)).b(fVar, wVar, l9Var.a);
    }
}
