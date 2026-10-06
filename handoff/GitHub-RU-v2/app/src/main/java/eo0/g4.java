package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g4 implements aaShadow.a {
    public static final g4 a = new g4();
    public static final List b = sy.d0.o(new String[]{"id", "diff", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.q6 q6Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                q6Var = (jn0.q6) aa.c.b(aa.c.c(j4.a, false)).a(eVar, wVar);
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
        if (str2 != null) {
            return new jn0.n6(str, q6Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.n6 n6Var = (jn0.n6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n6Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n6Var.a);
        fVar.z0("diff");
        aa.c.b(aa.c.c(j4.a, false)).b(fVar, wVar, n6Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, n6Var.c);
    }
}
