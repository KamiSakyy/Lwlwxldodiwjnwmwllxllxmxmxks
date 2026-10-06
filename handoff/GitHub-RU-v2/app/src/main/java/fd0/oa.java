package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oa implements aaShadow.a {
    public static final oa a = new oa();
    public static final List b = sy.d0.o(new String[]{"nodes", "pageInfo"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        kc0.jg jgVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(va.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                jgVar = (kc0.jg) aa.c.c(db.a, false).a(eVar, wVar);
            }
        }
        if (jgVar != null) {
            return new kc0.tf(list, jgVar);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.tf tfVar = (kc0.tf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tfVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(va.a, true)))).b(fVar, wVar, tfVar.a);
        fVar.z0("pageInfo");
        aa.c.c(db.a, false).b(fVar, wVar, tfVar.b);
    }
}
