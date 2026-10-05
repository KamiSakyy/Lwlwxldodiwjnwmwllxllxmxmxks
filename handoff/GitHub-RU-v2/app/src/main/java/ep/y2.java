package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class y2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"requiredStatusChecks", "commits"});

    public static jo.s4 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.v4 v4Var = null;
        jo.j4 j4Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                v4Var = (jo.v4) aa.c.c(b3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                j4Var = (jo.j4) aa.c.c(q2.a, false).a(eVar, wVar);
            }
        }
        if (v4Var == null) {
            k41.b.B(eVar, "requiredStatusChecks");
            throw null;
        }
        if (j4Var != null) {
            return new jo.s4(v4Var, j4Var);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.s4 s4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s4Var, "value");
        fVar.z0("requiredStatusChecks");
        aa.c.c(b3.a, false).b(fVar, wVar, s4Var.a);
        fVar.z0("commits");
        aa.c.c(q2.a, false).b(fVar, wVar, s4Var.b);
    }
}
