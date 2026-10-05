package t20;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0.n("closeDiscussion");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        s20.a aVar = null;
        while (eVar.r0(b) == 0) {
            aVar = (s20.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new s20.c(aVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        s20.c cVar = (s20.c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("closeDiscussion");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.a);
    }
}
