package tz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class p3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"milestone", "field"});

    public static h1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        e0 e0Var = null;
        x xVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                e0Var = (e0) aa.c.b(aa.c.c(m2.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                xVar = (x) aa.c.c(f2.a, true).a(eVar, wVar);
            }
        }
        if (xVar != null) {
            return new h1(e0Var, xVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, h1 h1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("milestone");
        aa.c.b(aa.c.c(m2.a, true)).b(fVar, wVar, h1Var.a);
        fVar.z0("field");
        aa.c.c(f2.a, true).b(fVar, wVar, h1Var.b);
    }
}
