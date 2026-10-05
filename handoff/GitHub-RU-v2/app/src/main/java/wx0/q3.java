package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"pullRequests", "field"});

    public static i1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t1 t1Var = null;
        z zVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                t1Var = (t1) aa.c.b(aa.c.c(c4.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                zVar = (z) aa.c.c(h2.a, true).a(eVar, wVar);
            }
        }
        if (zVar != null) {
            return new i1(t1Var, zVar);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, i1 i1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("pullRequests");
        aa.c.b(aa.c.c(c4.a, false)).b(fVar, wVar, i1Var.a);
        fVar.z0("field");
        aa.c.c(h2.a, true).b(fVar, wVar, i1Var.b);
    }
}
