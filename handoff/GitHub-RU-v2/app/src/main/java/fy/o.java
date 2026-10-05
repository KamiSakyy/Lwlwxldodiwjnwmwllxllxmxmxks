package fy;

import aa.w;
import ey.r;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements aa.a {
    public static final o a = new o();
    public static final List b = d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ey.p pVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                pVar = (ey.p) aa.c.c(m.a, true).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(j.a, true)))).a(eVar, wVar);
            }
        }
        if (pVar != null) {
            return new r(pVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        r rVar = (r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(m.a, true).b(fVar, wVar, rVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(j.a, true)))).b(fVar, wVar, rVar.b);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
