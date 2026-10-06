package n00;

import aa.w;
import java.util.List;
import m00.t;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t tVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                tVar = (t) aa.c.c(k.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(j.a, true)))).a(eVar, wVar);
            }
        }
        if (tVar != null) {
            return new m00.r(tVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        m00.r rVar = (m00.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(k.a, false).b(fVar, wVar, rVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(j.a, true)))).b(fVar, wVar, rVar.b);
    }
}
