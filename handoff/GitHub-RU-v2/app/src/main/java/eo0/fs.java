package eo0;

import java.util.List;
import jn0.o40;
import jn0.s40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fs implements aa.a {
    public static final fs a = new fs();
    public static final List b = sy.d0.o(new String[]{"shortcuts", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s40 s40Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                s40Var = (s40) aa.c.c(js.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (s40Var == null) {
            k41.b.B(eVar, "shortcuts");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new o40(s40Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o40 o40Var = (o40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o40Var, "value");
        fVar.z0("shortcuts");
        aa.c.c(js.a, false).b(fVar, wVar, o40Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o40Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, o40Var.c);
    }
}
