package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d6 implements aaShadow.a {
    public static final d6 a = new d6();
    public static final List b = sy.d0Shadow.n("disablePullRequestAutoMerge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.h9 h9Var = null;
        while (eVar.r0(b) == 0) {
            h9Var = (u10.h9) aa.c.b(aa.c.c(e6.a, false)).a(eVar, wVar);
        }
        return new u10.g9(h9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.g9 g9Var = (u10.g9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g9Var, "value");
        fVar.z0("disablePullRequestAutoMerge");
        aa.c.b(aa.c.c(e6.a, false)).b(fVar, wVar, g9Var.a);
    }
}
