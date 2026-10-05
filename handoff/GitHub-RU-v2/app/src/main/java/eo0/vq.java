package eo0;

import java.util.List;
import jn0.l20;
import jn0.o20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vq implements aa.a {
    public static final vq a = new vq();
    public static final List b = sy.d0.o(new String[]{"issue", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l20 l20Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l20Var = (l20) aa.c.c(sq.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (l20Var == null) {
            k41.b.B(eVar, "issue");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new o20(l20Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o20 o20Var = (o20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o20Var, "value");
        fVar.z0("issue");
        aa.c.c(sq.a, true).b(fVar, wVar, o20Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, o20Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, o20Var.c);
    }
}
