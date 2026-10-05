package g20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"pageInfo", "nodes"});

    public static i2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h2 h2Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                h2Var = (h2) aa.c.c(k2.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(j2.a, true)))).a(eVar, wVar);
            }
        }
        if (h2Var != null) {
            return new i2(h2Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, i2 i2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i2Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(k2.a, false).b(fVar, wVar, i2Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(j2.a, true)))).b(fVar, wVar, i2Var.b);
    }
}
