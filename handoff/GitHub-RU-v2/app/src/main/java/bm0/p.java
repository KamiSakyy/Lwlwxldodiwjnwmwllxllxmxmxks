package bm0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "owner", "name"});

    public static am0.q c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        am0.g0 g0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                g0Var = (am0.g0) aa.c.c(f0.a, false).a(eVar, wVar);
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
        if (g0Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str2 != null) {
            return new am0.q(str, g0Var, str2);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, am0.q qVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qVar.a);
        fVar.z0("owner");
        aa.c.c(f0.a, false).b(fVar, wVar, qVar.b);
        fVar.z0("name");
        bVar.b(fVar, wVar, qVar.c);
    }
}
