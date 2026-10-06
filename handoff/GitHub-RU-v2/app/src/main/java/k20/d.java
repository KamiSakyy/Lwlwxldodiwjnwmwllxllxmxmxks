package k20;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0Shadow.n("createCompletedWorkflowLogsAccess");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        j20.f fVar = null;
        while (eVar.r0(b) == 0) {
            fVar = (j20.f) aa.c.b(aa.c.c(c.a, false)).a(eVar, wVar);
        }
        return new j20.g(fVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        j20.g gVar = (j20.g) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(gVar, "value");
        fVar.z0("createCompletedWorkflowLogsAccess");
        aa.c.b(aa.c.c(c.a, false)).b(fVar, wVar, gVar.a);
    }
}
