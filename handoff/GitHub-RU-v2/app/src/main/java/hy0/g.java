package hy0;

import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0Shadow.o(new String[]{"__typename", "id", "fields", "defaultView", "views"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        gy0.d dVar = null;
        gy0.c cVar = null;
        gy0.j jVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                dVar = (gy0.d) aa.c.c(c.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                cVar = (gy0.c) aa.c.b(aa.c.c(b.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                jVar = (gy0.j) aa.c.c(i.a, false).a(eVar, wVar);
            }
        }
        eVar.s0();
        wx0.l c = wx0.n.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (dVar == null) {
            k41.b.B(eVar, "fields");
            throw null;
        }
        if (jVar != null) {
            return new gy0.h(str, str2, dVar, cVar, jVar, c);
        }
        k41.b.B(eVar, "views");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        gy0.h hVar = (gy0.h) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, hVar.b);
        fVar.z0("fields");
        aa.c.c(c.a, false).b(fVar, wVar, hVar.c);
        fVar.z0("defaultView");
        aa.c.b(aa.c.c(b.a, true)).b(fVar, wVar, hVar.d);
        fVar.z0("views");
        aa.c.c(i.a, false).b(fVar, wVar, hVar.e);
        List list = wx0.n.a;
        wx0.n.d(fVar, wVar, hVar.f);
    }
}
