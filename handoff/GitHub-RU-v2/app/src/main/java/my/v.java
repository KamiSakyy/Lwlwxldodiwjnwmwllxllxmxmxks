package my;

import aa.w;
import java.util.List;
import ly.g0;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements aa.a {
    public static final v a = new v();
    public static final List b = d0Shadow.o("id", "lists", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ly.d0 d0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                d0Var = (ly.d0) aa.c.c(s.a, false).a(eVar, wVar);
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
        if (d0Var == null) {
            k41.b.B(eVar, "lists");
            throw null;
        }
        if (str2 != null) {
            return new g0(str, d0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        g0 g0Var = (g0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g0Var.a);
        fVar.z0("lists");
        aa.c.c(s.a, false).b(fVar, wVar, g0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, g0Var.c);
    }
}
