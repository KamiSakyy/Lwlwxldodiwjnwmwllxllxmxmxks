package fd0;

import java.util.List;
import kc0.c80;
import kc0.g80;
import kc0.h80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mu implements aa.a {
    public static final mu a = new mu();
    public static final List b = sy.d0.o(new String[]{"column", "project", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c80 c80Var = null;
        h80 h80Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                c80Var = (c80) aa.c.b(aa.c.c(ju.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                h80Var = (h80) aa.c.c(nu.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (h80Var == null) {
            k41.b.B(eVar, "project");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new g80(c80Var, h80Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g80 g80Var = (g80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g80Var, "value");
        fVar.z0("column");
        aa.c.b(aa.c.c(ju.a, false)).b(fVar, wVar, g80Var.a);
        fVar.z0("project");
        aa.c.c(nu.a, false).b(fVar, wVar, g80Var.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g80Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, g80Var.d);
    }
}
