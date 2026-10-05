package fd0;

import java.util.List;
import kc0.u10;
import kc0.x10;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class zp implements aa.a {
    public static final List a = x61.l.r(new String[]{"starredRepositories", "id"});

    public static u10 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        x10 x10Var = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                x10Var = (x10) aa.c.c(cq.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (x10Var == null) {
            k41.b.B(eVar, "starredRepositories");
            throw null;
        }
        if (str != null) {
            return new u10(x10Var, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10 u10Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u10Var, "value");
        fVar.z0("starredRepositories");
        aa.c.c(cq.a, false).b(fVar, wVar, u10Var.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, u10Var.b);
    }
}
