package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 implements aa.a {
    public static final x0 a = new x0();
    public static final List b = sy.d0.o("id", "name", "owner", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        p0 p0Var = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                p0Var = (p0) aa.c.c(u0.a, false).a(eVar, wVar);
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
        if (p0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new r0(str, str2, p0Var, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r0 r0Var = (r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r0Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, r0Var.b);
        fVar.z0("owner");
        aa.c.c(u0.a, false).b(fVar, wVar, r0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, r0Var.d);
    }
}
