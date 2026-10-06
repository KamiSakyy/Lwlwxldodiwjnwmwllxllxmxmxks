package eo0;

import java.util.List;
import jn0.p50;
import jn0.q50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ys implements aaShadow.a {
    public static final ys a = new ys();
    public static final List b = sy.d0Shadow.o(new String[]{"node", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        q50 q50Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                q50Var = (q50) aa.c.b(aa.c.c(zs.a, true)).a(eVar, wVar);
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
            return new p50(q50Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p50 p50Var = (p50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p50Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(zs.a, true)).b(fVar, wVar, p50Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p50Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p50Var.c);
    }
}
