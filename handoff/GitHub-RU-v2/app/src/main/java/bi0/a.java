package bi0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0Shadow.n("followOrganization");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        ai0.c cVar = null;
        while (eVar.r0(b) == 0) {
            cVar = (ai0.c) aa.c.b(aa.c.c(b.a, false)).a(eVar, wVar);
        }
        return new ai0.b(cVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ai0.b bVar = (ai0.b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("followOrganization");
        aa.c.b(aa.c.c(b.a, false)).b(fVar, wVar, bVar.a);
    }

}
