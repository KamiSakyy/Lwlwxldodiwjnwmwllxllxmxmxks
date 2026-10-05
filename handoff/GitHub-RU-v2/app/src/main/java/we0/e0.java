package we0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 implements aa.a {
    public static final e0 a = new e0();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(p0.a, false)))).a(eVar, wVar);
        }
        return new c(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c cVar = (c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(p0.a, false)))).b(fVar, wVar, cVar.a);
    }
}
