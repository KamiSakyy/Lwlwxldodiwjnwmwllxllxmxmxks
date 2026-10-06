package qb0;

import aa.w;
import java.util.List;
import k71.k;
import pb0.j;
import pb0.l;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0Shadow.n("updateRepository");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        l lVar = null;
        while (eVar.r0(b) == 0) {
            lVar = (l) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
        }
        return new j(lVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        j jVar = (j) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(jVar, "value");
        fVar.z0("updateRepository");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, jVar.a);
    }
}
