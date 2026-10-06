package mo0;

import aa.w;
import java.util.List;
import lo0.l;
import lo0.n;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements aa.a {
    public static final i a = new i();
    public static final List b = d0Shadow.n("updateProjectV2DraftIssue");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        n nVar = null;
        while (eVar.r0(b) == 0) {
            nVar = (n) aa.c.b(aa.c.c(k.a, false)).a(eVar, wVar);
        }
        return new l(nVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        l lVar = (l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("updateProjectV2DraftIssue");
        aa.c.b(aa.c.c(k.a, false)).b(fVar, wVar, lVar.a);
    }
}
