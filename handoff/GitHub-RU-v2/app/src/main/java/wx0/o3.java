package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o3 implements aa.a {
    public static final List a = x61.l.r(new String[]{"milestone", "field"});

    public static g1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        d0 d0Var = null;
        w wVar2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                d0Var = (d0) aa.c.b(aa.c.c(l2.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                wVar2 = (w) aa.c.c(e2.a, true).a(eVar, wVar);
            }
        }
        if (wVar2 != null) {
            return new g1(d0Var, wVar2);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g1 g1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g1Var, "value");
        fVar.z0("milestone");
        aa.c.b(aa.c.c(l2.a, true)).b(fVar, wVar, g1Var.a);
        fVar.z0("field");
        aa.c.c(e2.a, true).b(fVar, wVar, g1Var.b);
    }
}
