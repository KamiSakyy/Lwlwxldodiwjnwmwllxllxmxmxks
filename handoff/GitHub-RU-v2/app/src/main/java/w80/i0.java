package w80;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"oid", "statusCheckRollup"});

    public static e0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        f0 f0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                f0Var = (f0) aa.c.b(aa.c.c(k0.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new e0(str, f0Var);
        }
        k41.b.B(eVar, "oid");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e0 e0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("oid");
        aa.c.a.b(fVar, wVar, e0Var.a);
        fVar.z0("statusCheckRollup");
        aa.c.b(aa.c.c(k0.a, false)).b(fVar, wVar, e0Var.b);
    }
}
