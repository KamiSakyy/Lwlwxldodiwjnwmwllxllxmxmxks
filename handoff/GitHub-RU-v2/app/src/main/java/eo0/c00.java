package eo0;

import java.util.List;
import jn0.mg0;
import jn0.qg0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c00 implements aa.a {
    public static final c00 a = new c00();
    public static final List b = sy.d0.o(new String[]{"viewer", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        qg0 qg0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                qg0Var = (qg0) aa.c.c(g00.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (qg0Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new mg0(qg0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mg0 mg0Var = (mg0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mg0Var, "value");
        fVar.z0("viewer");
        aa.c.c(g00.a, false).b(fVar, wVar, mg0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mg0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, mg0Var.c);
    }
}
