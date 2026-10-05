package eo0;

import java.util.List;
import jn0.u50;
import jn0.v50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ct implements aa.a {
    public static final ct a = new ct();
    public static final List b = sy.d0.o(new String[]{"__typename", "pullRequest", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u50 u50Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                u50Var = (u50) aa.c.c(bt.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        cu0.c c = cu0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (u50Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new v50(str, u50Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v50 v50Var = (v50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v50Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v50Var.a);
        fVar.z0("pullRequest");
        aa.c.c(bt.a, true).b(fVar, wVar, v50Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, v50Var.c);
        List list = cu0.f.a;
        cu0.f.d(fVar, wVar, v50Var.d);
    }
}
