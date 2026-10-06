package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jp implements aaShadow.a {
    public static final jp a = new jp();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.q00 q00Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                q00Var = (jo.q00) aa.c.c(op.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(np.a, true)))).a(eVar, wVar);
            }
        }
        if (q00Var != null) {
            return new jo.k00(q00Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.k00 k00Var = (jo.k00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k00Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(op.a, false).b(fVar, wVar, k00Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(np.a, true)))).b(fVar, wVar, k00Var.b);
    }
}
