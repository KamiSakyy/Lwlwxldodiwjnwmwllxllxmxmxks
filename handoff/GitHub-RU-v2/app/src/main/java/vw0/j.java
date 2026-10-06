package vw0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = d0Shadow.o(new String[]{"id", "name", "description", "user", "items", "__typename"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        uw0.t tVar = null;
        uw0.p pVar = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 3) {
                tVar = (uw0.t) aa.c.c(m.a, true).a(eVar, wVar);
            } else if (r0 == 4) {
                pVar = (uw0.p) aa.c.c(i.a, false).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (tVar == null) {
            k41.b.B(eVar, "user");
            throw null;
        }
        if (pVar == null) {
            k41.b.B(eVar, "items");
            throw null;
        }
        if (str4 != null) {
            return new uw0.q(str, str2, str3, tVar, pVar, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        uw0.q qVar = (uw0.q) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, qVar.b);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, qVar.c);
        fVar.z0("user");
        aa.c.c(m.a, true).b(fVar, wVar, qVar.d);
        fVar.z0("items");
        aa.c.c(i.a, false).b(fVar, wVar, qVar.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qVar.f);
    }
}
