package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g5 implements aa.a {
    public static final g5 a = new g5();
    public static final List b = sy.d0.o(new String[]{"shortcuts", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.d8 d8Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                d8Var = (jn0.d8) aa.c.c(k5.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (d8Var == null) {
            k41.b.B(eVar, "shortcuts");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.z7(d8Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.z7 z7Var = (jn0.z7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z7Var, "value");
        fVar.z0("shortcuts");
        aa.c.c(k5.a, false).b(fVar, wVar, z7Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z7Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, z7Var.c);
    }
}
