package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"repository", "field"});

    public static j1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u1 u1Var = null;
        y yVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                u1Var = (u1) aa.c.b(aa.c.c(d4.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                yVar = (y) aa.c.c(g2.a, true).a(eVar, wVar);
            }
        }
        if (yVar != null) {
            return new j1(u1Var, yVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, j1 j1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j1Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(d4.a, false)).b(fVar, wVar, j1Var.a);
        fVar.z0("field");
        aa.c.c(g2.a, true).b(fVar, wVar, j1Var.b);
    }
}
