package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"oid", "statusCheckRollup"});

    public static g1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        h1 h1Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                h1Var = (h1) aa.c.b(aa.c.c(m1.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new g1(str, h1Var);
        }
        k41.b.B(eVar, "oid");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g1 g1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g1Var, "value");
        fVar.z0("oid");
        aa.c.a.b(fVar, wVar, g1Var.a);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(m1.a, false)).b(fVar, wVar, g1Var.b);
    }
}
