package my;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0.n("createUserList");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ly.b bVar = null;
        while (eVar.r0(b) == 0) {
            bVar = (ly.b) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new ly.c(bVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        ly.c cVar = (ly.c) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cVar, "value");
        fVar.z0("createUserList");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.a);
    }
}
