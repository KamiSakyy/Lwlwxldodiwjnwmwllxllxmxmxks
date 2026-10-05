package da0;

import aa.w;
import ea.f;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.n("viewer");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        ca0.c cVar = null;
        while (eVar.r0(b) == 0) {
            cVar = (ca0.c) aa.c.c(b.a, false).a(eVar, wVar);
        }
        if (cVar != null) {
            return new ca0.b(cVar);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        ca0.b bVar = (ca0.b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("viewer");
        aa.c.c(b.a, false).b(fVar, wVar, bVar.a);
    }

}
