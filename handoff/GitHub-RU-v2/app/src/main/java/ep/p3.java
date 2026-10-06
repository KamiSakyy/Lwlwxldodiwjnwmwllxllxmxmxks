package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p3 implements aaShadow.a {
    public static final p3 a = new p3();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.v5 v5Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                v5Var = (jo.v5) aa.c.c(t3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s3.a, false)))).a(eVar, wVar);
            }
        }
        if (v5Var != null) {
            return new jo.q5(v5Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.q5 q5Var = (jo.q5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q5Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(t3.a, false).b(fVar, wVar, q5Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s3.a, false)))).b(fVar, wVar, q5Var.b);
    }
}
