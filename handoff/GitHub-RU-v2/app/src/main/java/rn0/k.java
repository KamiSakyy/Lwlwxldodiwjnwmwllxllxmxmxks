package rn0;

import java.util.List;
import pz0.py;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "name", "owner", "viewerPermission", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        qn0.j jVar = null;
        py pyVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                jVar = (qn0.j) aa.c.c(i.a, true).a(eVar, wVar);
            } else if (r0 == 3) {
                pyVar = (py) aa.c.b(qz0.b.o).a(eVar, wVar);
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
            return new qn0.l(str, str2, jVar, pyVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qn0.l lVar = (qn0.l) obj;
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
        aa.c.b(qz0.b.o).b(fVar, wVar, lVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, lVar.e);
    }
}
