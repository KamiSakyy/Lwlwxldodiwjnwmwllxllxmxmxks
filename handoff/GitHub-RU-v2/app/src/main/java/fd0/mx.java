package fd0;

import java.util.List;
import kc0.wc0;
import kc0.xc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mx implements aa.a {
    public static final mx a = new mx();
    public static final List b = sy.d0.o(new String[]{"repositories", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        wc0 wc0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wc0Var = (wc0) aa.c.c(lx.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (wc0Var == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new xc0(wc0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xc0 xc0Var = (xc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xc0Var, "value");
        fVar.z0("repositories");
        aa.c.c(lx.a, false).b(fVar, wVar, xc0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xc0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xc0Var.c);
    }
}
