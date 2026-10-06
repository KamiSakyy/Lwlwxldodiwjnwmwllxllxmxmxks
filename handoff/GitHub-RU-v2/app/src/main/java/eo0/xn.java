package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xn implements aaShadow.a {
    public static final xn a = new xn();
    public static final List b = sy.d0Shadow.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.qy qyVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                qyVar = (jn0.qy) aa.c.c(co.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(bo.a, true)))).a(eVar, wVar);
            }
        }
        if (qyVar != null) {
            return new jn0.ky(qyVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ky kyVar = (jn0.ky) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kyVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(co.a, false).b(fVar, wVar, kyVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(bo.a, true)))).b(fVar, wVar, kyVar.b);
    }
}
