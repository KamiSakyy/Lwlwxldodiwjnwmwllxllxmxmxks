package p20;

import java.util.List;
import u10.p60;
import u10.t60;
import u10.u60;
import u10.w60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lt implements aaShadow.a {
    public static final lt a = new lt();
    public static final List b = sy.d0.o("id", "repository", "reviewRequests", "latestReviews", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u60 u60Var = null;
        w60 w60Var = null;
        p60 p60Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                u60Var = (u60) aa.c.c(mt.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                w60Var = (w60) aa.c.b(aa.c.c(ot.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                p60Var = (p60) aa.c.b(aa.c.c(gt.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (u60Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str2 != null) {
            return new t60(str, u60Var, w60Var, p60Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t60 t60Var = (t60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t60Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t60Var.a);
        fVar.z0("repository");
        aa.c.c(mt.a, false).b(fVar, wVar, t60Var.b);
        fVar.z0("reviewRequests");
        aa.c.b(aa.c.c(ot.a, false)).b(fVar, wVar, t60Var.c);
        fVar.z0("latestReviews");
        aa.c.b(aa.c.c(gt.a, false)).b(fVar, wVar, t60Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t60Var.e);
    }
}
