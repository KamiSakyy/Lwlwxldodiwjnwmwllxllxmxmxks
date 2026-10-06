package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y3 implements aaShadow.a {
    public static final y3 a = new y3();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "commit", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.x5 x5Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                x5Var = (jn0.x5) aa.c.c(t3.a, true).a(eVar, wVar);
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
        if (x5Var == null) {
            k41.b.B(eVar, "commit");
            throw null;
        }
        if (str2 != null) {
            return new jn0.d6(str, x5Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.d6 d6Var = (jn0.d6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d6Var.a);
        fVar.z0("commit");
        aa.c.c(t3.a, true).b(fVar, wVar, d6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, d6Var.c);
    }
}
