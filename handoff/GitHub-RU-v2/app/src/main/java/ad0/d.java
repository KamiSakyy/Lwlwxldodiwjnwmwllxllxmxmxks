package ad0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = d0.n("createCompletedWorkflowLogsAccess");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        zc0.f fVar = null;
        while (eVar.r0(b) == 0) {
            fVar = (zc0.f) aa.c.b(aa.c.c(c.a, false)).a(eVar, wVar);
        }
        return new zc0.g(fVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        zc0.g gVar = (zc0.g) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(gVar, "value");
        fVar.z0("createCompletedWorkflowLogsAccess");
        aa.c.b(aa.c.c(c.a, false)).b(fVar, wVar, gVar.a);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
