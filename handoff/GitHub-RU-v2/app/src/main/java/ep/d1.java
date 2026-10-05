package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 implements aa.a {
    public static final d1 a = new d1();
    public static final List b = sy.d0.o("issue", "subIssue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.e2 e2Var = null;
        jo.f2 f2Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                e2Var = (jo.e2) aa.c.b(aa.c.c(f1.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.b2(e2Var, f2Var);
                }
                f2Var = (jo.f2) aa.c.b(aa.c.c(g1.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.b2 b2Var = (jo.b2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b2Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(f1.a, true)).b(fVar, wVar, b2Var.a);
        fVar.z0("subIssue");
        aa.c.b(aa.c.c(g1.a, true)).b(fVar, wVar, b2Var.b);
    }
}
