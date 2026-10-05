package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p9 implements aa.a {
    public static final p9 a = new p9();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "dashboard"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jn0.ee eeVar = null;
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
                eeVar = (jn0.ee) aa.c.b(aa.c.c(l9.a, false)).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jn0.ie(str, str2, eeVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ie ieVar = (jn0.ie) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ieVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ieVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ieVar.b);
        fVar.z0("dashboard");
        aa.c.b(aa.c.c(l9.a, false)).b(fVar, wVar, ieVar.c);
    }
}
