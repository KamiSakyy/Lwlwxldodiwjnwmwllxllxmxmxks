package bi0;

import aa.w;
import ai0.g;
import ai0.i;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.n("unfollowOrganization");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        i iVar = null;
        while (eVar.r0(b) == 0) {
            iVar = (i) aa.c.b(aa.c.c(f.a, false)).a(eVar, wVar);
        }
        return new g(iVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        g gVar = (g) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(gVar, "value");
        fVar.z0("unfollowOrganization");
        aa.c.b(aa.c.c(f.a, false)).b(fVar, wVar, gVar.a);
    }

}
