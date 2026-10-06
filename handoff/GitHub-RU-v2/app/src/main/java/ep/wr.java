package ep;

import java.util.List;
import jo.c40;
import jo.h40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wr implements aaShadow.a {
    public static final wr a = new wr();
    public static final List b = sy.d0.o("search", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        h40 h40Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                h40Var = (h40) aa.c.c(bs.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (h40Var == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new c40(h40Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c40 c40Var = (c40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c40Var, "value");
        fVar.z0("search");
        aa.c.c(bs.a, false).b(fVar, wVar, c40Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c40Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, c40Var.c);
    }
}
