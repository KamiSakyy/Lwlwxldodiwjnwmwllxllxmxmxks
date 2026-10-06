package w20;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v20.f;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0Shadow.n("repository");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        f fVar = null;
        while (eVar.r0(b) == 0) {
            fVar = (f) aa.c.b(aa.c.c(e.a, false)).a(eVar, wVar);
        }
        return new v20.c(fVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        v20.c cVar = (v20.c) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(e.a, false)).b(fVar, wVar, cVar.a);
    }
}
