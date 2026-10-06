package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d8 implements aaShadow.a {
    public static final d8 a = new d8();
    public static final List b = sy.d0.o(new String[]{"organizationDiscussionsRepository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.fc fcVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fcVar = (jn0.fc) aa.c.b(aa.c.c(e8.a, false)).a(eVar, wVar);
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
            return new jn0.ec(fcVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ec ecVar = (jn0.ec) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ecVar, "value");
        fVar.z0("organizationDiscussionsRepository");
        aa.c.b(aa.c.c(e8.a, false)).b(fVar, wVar, ecVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ecVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ecVar.c);
    }
}
