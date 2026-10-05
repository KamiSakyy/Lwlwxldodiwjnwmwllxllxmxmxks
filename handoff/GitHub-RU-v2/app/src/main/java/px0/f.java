package px0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ox0.i0 i0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i0Var = (ox0.i0) aa.c.c(h0.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(e.a, false)))).a(eVar, wVar);
            }
        }
        if (i0Var != null) {
            return new ox0.g(i0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ox0.g gVar = (ox0.g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(h0.a, false).b(fVar, wVar, gVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(e.a, false)))).b(fVar, wVar, gVar.b);
    }
}
