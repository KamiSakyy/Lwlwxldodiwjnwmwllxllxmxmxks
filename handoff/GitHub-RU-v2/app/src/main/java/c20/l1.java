package c20;

import b20.e2;
import b20.f2;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "runs"});

    public static e2 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        f2 f2Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                f2Var = (f2) aa.c.c(m1.a, true).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (f2Var != null) {
            return new e2(str, f2Var);
        }
        k41.b.B(eVar, "runs");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e2 e2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e2Var, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, e2Var.a);
        fVar.z0("runs");
        aa.c.c(m1.a, true).b(fVar, wVar, e2Var.b);
    }
}
