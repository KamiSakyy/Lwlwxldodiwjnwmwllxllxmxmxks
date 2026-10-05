package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ig implements aa.a {
    public static final ig a = new ig();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ao aoVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                aoVar = (u10.ao) aa.c.c(hg.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(eg.a, false)))).a(eVar, wVar);
            }
        }
        if (aoVar != null) {
            return new u10.bo(aoVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.bo boVar = (u10.bo) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(boVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(hg.a, false).b(fVar, wVar, boVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(eg.a, false)))).b(fVar, wVar, boVar.b);
    }
}
