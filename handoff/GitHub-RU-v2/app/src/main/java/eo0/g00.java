package eo0;

import java.util.List;
import jn0.og0;
import jn0.qg0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g00 implements aaShadow.a {
    public static final g00 a = new g00();
    public static final List b = sy.d0.o(new String[]{"organizations", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        og0 og0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                og0Var = (og0) aa.c.c(e00.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (og0Var == null) {
            k41.b.B(eVar, "organizations");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new qg0(og0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qg0 qg0Var = (qg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qg0Var, "value");
        fVar.z0("organizations");
        aa.c.c(e00.a, false).b(fVar, wVar, qg0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qg0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qg0Var.c);
    }
}
