package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x9 implements aaShadow.a {
    public static final x9 a = new x9();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.af afVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                afVar = (kc0.af) aa.c.c(da.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(aa.a, true)))).a(eVar, wVar);
            }
        }
        if (afVar != null) {
            return new kc0.ue(afVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ue ueVar = (kc0.ue) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ueVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(da.a, false).b(fVar, wVar, ueVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(aa.a, true)))).b(fVar, wVar, ueVar.b);
    }
}
