package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"requiredStatusChecks", "commits"});

    public static u10.d4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.g4 g4Var = null;
        u10.u3 u3Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                g4Var = (u10.g4) aa.c.c(r2.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                u3Var = (u10.u3) aa.c.c(g2.a, false).a(eVar, wVar);
            }
        }
        if (g4Var == null) {
            k41.b.B(eVar, "requiredStatusChecks");
            throw null;
        }
        if (u3Var != null) {
            return new u10.d4(g4Var, u3Var);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.d4 d4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d4Var, "value");
        fVar.z0("requiredStatusChecks");
        aa.c.c(r2.a, false).b(fVar, wVar, d4Var.a);
        fVar.z0("commits");
        aa.c.c(g2.a, false).b(fVar, wVar, d4Var.b);
    }
}
