package eo0;

import java.util.List;
import jn0.e30;
import jn0.i30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hr implements aaShadow.a {
    public static final hr a = new hr();
    public static final List b = sy.d0Shadow.o(new String[]{"search", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        i30 i30Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                i30Var = (i30) aa.c.c(lr.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (i30Var == null) {
            k41.b.B(eVar, "search");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new e30(i30Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e30 e30Var = (e30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e30Var, "value");
        fVar.z0("search");
        aa.c.c(lr.a, false).b(fVar, wVar, e30Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e30Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, e30Var.c);
    }
}
