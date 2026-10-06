package fd0;

import java.util.List;
import kc0.p80;
import kc0.t80;
import kc0.u80;
import kc0.w80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xu implements aaShadow.a {
    public static final xu a = new xu();
    public static final List b = sy.d0.o(new String[]{"id", "repository", "reviewRequests", "latestReviews", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u80 u80Var = null;
        w80 w80Var = null;
        p80 p80Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                u80Var = (u80) aa.c.c(yu.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                w80Var = (w80) aa.c.b(aa.c.c(av.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                p80Var = (p80) aa.c.b(aa.c.c(tu.a, false)).a(eVar, wVar);
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
        if (u80Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str2 != null) {
            return new t80(str, u80Var, w80Var, p80Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t80 t80Var = (t80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t80Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t80Var.a);
        fVar.z0("repository");
        aa.c.c(yu.a, false).b(fVar, wVar, t80Var.b);
        fVar.z0("reviewRequests");
        aa.c.b(aa.c.c(av.a, false)).b(fVar, wVar, t80Var.c);
        fVar.z0("latestReviews");
        aa.c.b(aa.c.c(tu.a, false)).b(fVar, wVar, t80Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t80Var.e);
    }
}
