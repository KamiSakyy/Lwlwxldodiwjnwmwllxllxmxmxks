package eo0;

import java.util.List;
import jn0.p40;
import jn0.t40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gs implements aaShadow.a {
    public static final gs a = new gs();
    public static final List b = sy.d0.o(new String[]{"viewer", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t40 t40Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                t40Var = (t40) aa.c.c(ks.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (t40Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new p40(t40Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p40 p40Var = (p40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p40Var, "value");
        fVar.z0("viewer");
        aa.c.c(ks.a, false).b(fVar, wVar, p40Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p40Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p40Var.c);
    }
}
