package rn0;

import java.util.List;
import qn0.d3;
import qn0.e3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a2 implements aa.a {
    public static final a2 a = new a2();
    public static final List b = sy.d0.o(new String[]{"id", "workflows", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        e3 e3Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                e3Var = (e3) aa.c.c(b2.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (e3Var == null) {
            k41.b.B(eVar, "workflows");
            throw null;
        }
        if (str2 != null) {
            return new d3(str, e3Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d3 d3Var = (d3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d3Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d3Var.a);
        fVar.z0("workflows");
        aa.c.c(b2.a, true).b(fVar, wVar, d3Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d3Var.c);
    }
}
