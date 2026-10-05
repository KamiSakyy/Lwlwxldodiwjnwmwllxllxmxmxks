package uc0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.n("node");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        tc0.c cVar = null;
        while (eVar.r0(b) == 0) {
            cVar = (tc0.c) aa.c.b(aa.c.c(b.a, true)).a(eVar, wVar);
        }
        return new tc0.b(cVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        tc0.b bVar = (tc0.b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(b.a, true)).b(fVar, wVar, bVar.a);
    }
}
