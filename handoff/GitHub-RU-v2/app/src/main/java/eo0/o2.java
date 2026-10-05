package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o2 implements aa.a {
    public static final o2 a = new o2();
    public static final List b = sy.d0.o(new String[]{"commit", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.z3 z3Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                z3Var = (jn0.z3) aa.c.c(j2.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (z3Var == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.f4(z3Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.f4 f4Var = (jn0.f4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f4Var, "value");
        fVar.z0("commit");
        aa.c.c(j2.a, false).b(fVar, wVar, f4Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, f4Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, f4Var.c);
    }
}
