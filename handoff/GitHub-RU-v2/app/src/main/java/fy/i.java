package fy;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0.o("node", "id", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ey.n nVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                nVar = (ey.n) aa.c.b(aa.c.c(k.a, true)).a(eVar, wVar);
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
            return new ey.l(nVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ey.l lVar = (ey.l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(k.a, true)).b(fVar, wVar, lVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, lVar.c);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
