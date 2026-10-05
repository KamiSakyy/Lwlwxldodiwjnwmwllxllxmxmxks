package vo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 implements aa.a {
    public static final b1 a = new b1();
    public static final List b = sy.d0.o("id", "name", "logoUrl", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
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
        if (str3 == null) {
            k41.b.B(eVar, "logoUrl");
            throw null;
        }
        if (str4 != null) {
            return new u0(str, str2, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u0 u0Var = (u0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u0Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, u0Var.b);
        fVar.z0("logoUrl");
        bVar.b(fVar, wVar, u0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, u0Var.d);
    }
}
