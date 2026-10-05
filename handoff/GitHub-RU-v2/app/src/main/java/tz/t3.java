package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"reviewers", "field"});

    public static l1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w1 w1Var = null;
        r rVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                w1Var = (w1) aa.c.b(aa.c.c(f4.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                rVar = (r) aa.c.c(z1.a, true).a(eVar, wVar);
            }
        }
        if (rVar != null) {
            return new l1(w1Var, rVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, l1 l1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l1Var, "value");
        fVar.z0("reviewers");
        aa.c.b(aa.c.c(f4.a, false)).b(fVar, wVar, l1Var.a);
        fVar.z0("field");
        aa.c.c(z1.a, true).b(fVar, wVar, l1Var.b);
    }
}
