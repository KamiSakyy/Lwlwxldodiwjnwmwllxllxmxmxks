package ep;

import java.util.List;
import jo.l50;
import jo.p50;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xs implements aaShadow.a {
    public static final xs a = new xs();
    public static final List b = sy.d0.o("search", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p50 p50Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                p50Var = (p50) aa.c.c(bt.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (p50Var == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new l50(p50Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l50 l50Var = (l50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l50Var, "value");
        fVar.z0("search");
        aa.c.c(bt.a, false).b(fVar, wVar, l50Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l50Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l50Var.c);
    }
}
