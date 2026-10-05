package vx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 implements aa.a {
    public static final b0 a = new b0();
    public static final List b = sy.d0.o(new String[]{"id", "owner", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ux0.n0 n0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                n0Var = (ux0.n0) aa.c.c(z.a, true).a(eVar, wVar);
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
        if (n0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new ux0.p0(str, n0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ux0.p0 p0Var = (ux0.p0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p0Var.a);
        fVar.z0("owner");
        aa.c.c(z.a, true).b(fVar, wVar, p0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, p0Var.c);
    }
}
