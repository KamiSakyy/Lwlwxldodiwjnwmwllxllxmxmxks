package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 implements aa.a {
    public static final a1 a = new a1();
    public static final List b = sy.d0.o(new String[]{"issue", "subIssue"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.z1 z1Var = null;
        jn0.a2 a2Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                z1Var = (jn0.z1) aa.c.b(aa.c.c(c1.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jn0.w1(z1Var, a2Var);
                }
                a2Var = (jn0.a2) aa.c.b(aa.c.c(d1.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.w1 w1Var = (jn0.w1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w1Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(c1.a, true)).b(fVar, wVar, w1Var.a);
        fVar.z0("subIssue");
        aa.c.b(aa.c.c(d1.a, true)).b(fVar, wVar, w1Var.b);
    }
}
