package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x9 implements aa.a {
    public static final x9 a = new x9();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "dashboard"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jn0.le leVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                leVar = (jn0.le) aa.c.b(aa.c.c(q9.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.se(str, str2, leVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.se seVar = (jn0.se) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(seVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, seVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, seVar.b);
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(q9.a, false)).b(fVar, wVar, seVar.c);
    }
}
