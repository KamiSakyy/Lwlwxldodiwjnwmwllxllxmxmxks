package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 implements aa.a {
    public static final g0 a = new g0();
    public static final List b = sy.d0.o("id", "workflow", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        b20.m0 m0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                m0Var = (b20.m0) aa.c.c(f0.a, false).a(eVar, wVar);
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
        if (m0Var == null) {
            k41.b.B(eVar, "workflow");
            throw null;
        }
        if (str2 != null) {
            return new b20.n0(str, m0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b20.n0 n0Var = (b20.n0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n0Var.a);
        fVar.z0("workflow");
        aa.c.c(f0.a, false).b(fVar, wVar, n0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n0Var.c);
    }
}
