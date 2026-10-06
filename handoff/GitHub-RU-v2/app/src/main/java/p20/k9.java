package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k9 implements aaShadow.a {
    public static final k9 a = new k9();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.he heVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                heVar = (u10.he) aa.c.c(q9.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(n9.a, true)))).a(eVar, wVar);
            }
        }
        if (heVar != null) {
            return new u10.be(heVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.be beVar = (u10.be) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(beVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(q9.a, false).b(fVar, wVar, beVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(n9.a, true)))).b(fVar, wVar, beVar.b);
    }
}
