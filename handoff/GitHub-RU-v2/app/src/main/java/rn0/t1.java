package rn0;

import java.util.List;
import qn0.s2;
import qn0.t2;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "runs"});

    public static s2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        t2 t2Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                t2Var = (t2) aa.c.c(u1.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (t2Var != null) {
            return new s2(str, t2Var);
        }
        k41.b.B(eVar, "runs");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, s2 s2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s2Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, s2Var.a);
        fVar.z0("runs");
        aa.c.c(u1.a, true).b(fVar, wVar, s2Var.b);
    }
}
