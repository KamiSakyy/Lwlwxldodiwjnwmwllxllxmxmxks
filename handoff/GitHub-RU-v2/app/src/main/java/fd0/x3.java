package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"history", "id"});

    public static kc0.a6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.w5 w5Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                w5Var = (kc0.w5) aa.c.c(t3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (w5Var == null) {
            k41.b.B(eVar, "history");
            throw null;
        }
        if (str != null) {
            return new kc0.a6(w5Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.a6 a6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a6Var, "value");
        fVar.z0("history");
        aa.c.c(t3.a, false).b(fVar, wVar, a6Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, a6Var.b);
    }
}
