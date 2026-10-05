package d10;

import aa.w;
import c10.m;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.o("repository", "resource", "id", "__typename");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        c10.l lVar = null;
        m mVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                lVar = (c10.l) aa.c.b(aa.c.c(k.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                mVar = (m) aa.c.b(aa.c.c(l.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new c10.e(lVar, mVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        c10.e eVar = (c10.e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(k.a, false)).b(fVar, wVar, eVar.a);
        fVar.z0("resource");
        aa.c.b(aa.c.c(l.a, true)).b(fVar, wVar, eVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, eVar.d);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
