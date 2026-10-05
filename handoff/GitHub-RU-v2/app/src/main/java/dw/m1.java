package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"oid", "statusCheckRollup"});

    public static i1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        j1 j1Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                j1Var = (j1) aa.c.b(aa.c.c(o1.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new i1(str, j1Var);
        }
        k41.b.B(eVar, "oid");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, i1 i1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i1Var, "value");
        fVar.z0("oid");
        aa.c.a.b(fVar, wVar, i1Var.a);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(o1.a, false)).b(fVar, wVar, i1Var.b);
    }
}
