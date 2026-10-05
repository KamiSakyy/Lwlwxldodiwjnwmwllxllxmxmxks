package oa0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0.o("workflow", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        na0.g0 g0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                g0Var = (na0.g0) aa.c.c(z.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (g0Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new na0.h0(g0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.h0 h0Var = (na0.h0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h0Var, "value");
        fVar.z0("workflow");
        aa.c.c(z.a, false).b(fVar, wVar, h0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h0Var.c);
    }
}
