package eo0;

import java.util.List;
import jn0.g60;
import jn0.p60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kt implements aa.a {
    public static final kt a = new kt();
    public static final List b = sy.d0.o(new String[]{"repository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p60 p60Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                p60Var = (p60) aa.c.b(aa.c.c(tt.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new g60(p60Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g60 g60Var = (g60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g60Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(tt.a, false)).b(fVar, wVar, g60Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g60Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, g60Var.c);
    }
}
