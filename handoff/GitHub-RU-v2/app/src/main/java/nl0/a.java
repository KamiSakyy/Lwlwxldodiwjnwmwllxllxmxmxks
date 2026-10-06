package nl0;

import aa.w;
import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0Shadow.n("dequeuePullRequest");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ml0.c cVar = null;
        while (eVar.r0(b) == 0) {
            cVar = (ml0.c) aa.c.b(aa.c.c(b.a, false)).a(eVar, wVar);
        }
        return new ml0.b(cVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ml0.b bVar = (ml0.b) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("dequeuePullRequest");
        aa.c.b(aa.c.c(b.a, false)).b(fVar, wVar, bVar.a);
    }
}
