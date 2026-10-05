package px0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aa.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0.o(new String[]{"name", "owner", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        ox0.g0 g0Var = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                g0Var = (ox0.g0) aa.c.c(f0.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (g0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new ox0.l0(str, g0Var, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ox0.l0 l0Var = (ox0.l0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l0Var.a);
        fVar.z0("owner");
        aa.c.c(f0.a, false).b(fVar, wVar, l0Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, l0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, l0Var.d);
    }
}
