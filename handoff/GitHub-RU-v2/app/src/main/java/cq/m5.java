package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m5 implements aa.a {
    public static final m5 a = new m5();
    public static final List b = sy.d0.o("color", "name", "id", "__typename");

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
                str = (String) aa.c.i.a(eVar, wVar);
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
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str3 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str4 != null) {
            return new k5(str, str2, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k5 k5Var = (k5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k5Var, "value");
        fVar.z0("color");
        aa.c.i.b(fVar, wVar, k5Var.a);
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, k5Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, k5Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, k5Var.d);
    }
}
