package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z8 implements aaShadow.a {
    public static final z8 a = new z8();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.pd pdVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                pdVar = (u10.pd) aa.c.c(c9.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(a9.a, true)))).a(eVar, wVar);
            }
        }
        if (pdVar != null) {
            return new u10.md(pdVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.md mdVar = (u10.md) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mdVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(c9.a, false).b(fVar, wVar, mdVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(a9.a, true)))).b(fVar, wVar, mdVar.b);
    }
}
