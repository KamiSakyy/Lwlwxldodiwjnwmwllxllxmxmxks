package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hq implements aaShadow.a {
    public static final hq a = new hq();
    public static final List b = sy.d0.o("id", "ref", "comparison", "pullRequestTemplates", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.m10Shadow m10Var = null;
        jo.g10 g10Var = null;
        List list = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                m10Var = (jo.m10) aa.c.b(aa.c.c(gqShadow.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                g10Var = (jo.g10) aa.c.b(aa.c.c(aq.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                list = (List) aa.c.b(aa.c.a(aa.c.c(fq.a, false))).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.n10(str, m10Var, g10Var, list, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.n10Shadow n10Var = (jo.n10) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n10Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n10Var.a);
        fVar.z0("ref");
        aa.c.b(aa.c.c(gqShadow.a, false)).b(fVar, wVar, n10Var.b);
        fVar.z0("comparison");
        aa.c.b(aa.c.c(aq.a, false)).b(fVar, wVar, n10Var.c);
        fVar.z0("pullRequestTemplates");
        aa.c.b(aa.c.a(aa.c.c(fq.a, false))).b(fVar, wVar, n10Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n10Var.e);
    }
}
