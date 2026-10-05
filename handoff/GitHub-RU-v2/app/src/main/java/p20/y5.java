package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y5 implements aa.a {
    public static final y5 a = new y5();
    public static final List b = sy.d0.o("owner", "name", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.x8 x8Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                x8Var = (u10.x8) aa.c.c(w5.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (x8Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new u10.z8(x8Var, str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.z8 z8Var = (u10.z8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z8Var, "value");
        fVar.z0("owner");
        aa.c.c(w5.a, true).b(fVar, wVar, z8Var.a);
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z8Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, z8Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z8Var.d);
    }
}
