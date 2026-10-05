package sc0;

import gn0.jr;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = sy.d0.o(new String[]{"id", "name", "owner", "viewerPermission", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        rc0.j jVar = null;
        jr jrVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                jVar = (rc0.j) aa.c.c(i.a, true).a(eVar, wVar);
            } else if (r0 == 3) {
                jrVar = (jr) aa.c.b(hn0.b.h).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
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
        if (jVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new rc0.l(str, str2, jVar, jrVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rc0.l lVar = (rc0.l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, lVar.b);
        fVar.z0("owner");
        aa.c.c(i.a, true).b(fVar, wVar, lVar.c);
        fVar.z0("viewerPermission");
        aa.c.b(hn0.b.h).b(fVar, wVar, lVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, lVar.e);
    }
}
