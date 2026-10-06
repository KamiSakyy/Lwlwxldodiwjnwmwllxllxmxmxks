package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mf implements aaShadow.a {
    public static final mf a = new mf();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.cn cnVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                cnVar = (kc0.cn) aa.c.c(nf.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(lf.a, true)))).a(eVar, wVar);
            }
        }
        if (cnVar != null) {
            return new kc0.bn(cnVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.bn bnVar = (kc0.bn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bnVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(nf.a, false).b(fVar, wVar, bnVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(lf.a, true)))).b(fVar, wVar, bnVar.b);
    }
}
