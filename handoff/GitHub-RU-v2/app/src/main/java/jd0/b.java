package jd0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0Shadow.n("closeDiscussion");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        id0.a aVar = null;
        while (eVar.r0(b) == 0) {
            aVar = (id0.a) aa.c.b(aa.c.c(a.a, false)).a(eVar, wVar);
        }
        return new id0.c(aVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        id0.c cVar = (id0.c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("closeDiscussion");
        aa.c.b(aa.c.c(a.a, false)).b(fVar, wVar, cVar.a);
    }
}
