package eo0;

import java.util.List;
import jn0.eg0;
import jn0.fg0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yz implements aaShadow.a {
    public static final yz a = new yz();
    public static final List b = sy.d0.o(new String[]{"viewer", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fg0 fg0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fg0Var = (fg0) aa.c.c(zz.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (fg0Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new eg0(fg0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        eg0 eg0Var = (eg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eg0Var, "value");
        fVar.z0("viewer");
        aa.c.c(zz.a, false).b(fVar, wVar, eg0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eg0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, eg0Var.c);
    }
}
