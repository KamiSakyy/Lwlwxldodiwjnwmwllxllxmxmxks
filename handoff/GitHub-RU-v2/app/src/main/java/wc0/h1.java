package wc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 implements aa.a {
    public static final h1 a = new h1();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "workflow", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        y0 y0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                y0Var = (y0) aa.c.c(g1.a, false).a(eVar, wVar);
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
        if (y0Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (str2 != null) {
            return new z0(str, y0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        z0 z0Var = (z0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z0Var.a);
        fVar.z0("workflow");
        aa.c.c(g1.a, false).b(fVar, wVar, z0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z0Var.c);
    }
}
