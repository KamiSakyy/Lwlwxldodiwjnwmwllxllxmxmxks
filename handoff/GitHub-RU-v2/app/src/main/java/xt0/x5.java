package xt0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x5 implements aa.a {
    public static final x5 a = new x5();
    public static final List b = sy.d0Shadow.o(new String[]{"refUpdateRule", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        l5 l5Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l5Var = (l5) aa.c.b(aa.c.c(w6.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
            return new m4(l5Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m4 m4Var = (m4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m4Var, "value");
        fVar.z0("refUpdateRule");
        aa.c.b(aa.c.c(w6.a, false)).b(fVar, wVar, m4Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m4Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, m4Var.c);
    }
}
