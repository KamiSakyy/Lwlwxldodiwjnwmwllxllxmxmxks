package eo0;

import java.util.List;
import jn0.a50;
import jn0.w40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ls implements aaShadow.a {
    public static final ls a = new ls();
    public static final List b = sy.d0Shadow.o(new String[]{"viewer", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        a50 a50Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                a50Var = (a50) aa.c.c(ps.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (a50Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new w40(a50Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w40 w40Var = (w40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w40Var, "value");
        fVar.z0("viewer");
        aa.c.c(ps.a, false).b(fVar, wVar, w40Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w40Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, w40Var.c);
    }
}
