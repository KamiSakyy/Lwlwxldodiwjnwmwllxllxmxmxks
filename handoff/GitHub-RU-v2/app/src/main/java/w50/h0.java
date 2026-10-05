package w50;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements aa.a {
    public static final h0 a = new h0();
    public static final List b = sy.d0.o("id", "name", "owner", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        c0 c0Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                c0Var = (c0) aa.c.c(g0.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (c0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new d0(str, str2, c0Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d0 d0Var = (d0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d0Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, d0Var.b);
        fVar.z0("owner");
        aa.c.c(g0.a, false).b(fVar, wVar, d0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d0Var.d);
    }
}
