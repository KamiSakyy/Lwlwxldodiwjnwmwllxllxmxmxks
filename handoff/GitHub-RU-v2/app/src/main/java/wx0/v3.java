package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"users", "field"});

    public static n1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        w1 w1Var = null;
        x xVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                w1Var = (w1) aa.c.b(aa.c.c(f4.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                xVar = (x) aa.c.c(f2.a, true).a(eVar, wVar);
            }
        }
        if (xVar != null) {
            return new n1(w1Var, xVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, n1 n1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n1Var, "value");
        fVar.z0("users");
        aa.c.b(aa.c.c(f4.a, false)).b(fVar, wVar, n1Var.a);
        fVar.z0("field");
        aa.c.c(f2.a, true).b(fVar, wVar, n1Var.b);
    }
}
