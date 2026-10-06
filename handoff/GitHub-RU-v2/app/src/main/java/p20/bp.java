package p20;

import java.util.List;
import u10.n00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bp implements aaShadow.a {
    public static final bp a = new bp();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ep.a, false)))).a(eVar, wVar);
        }
        return new n00(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n00 n00Var = (n00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n00Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ep.a, false)))).b(fVar, wVar, n00Var.a);
    }
}
