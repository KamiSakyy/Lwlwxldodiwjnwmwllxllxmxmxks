package op;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.n("discussion");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        np.d dVar = null;
        while (eVar.r0(b) == 0) {
            dVar = (np.d) aa.c.b(aa.c.c(c.a, true)).a(eVar, wVar);
        }
        return new np.a(dVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        np.a aVar = (np.a) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(c.a, true)).b(fVar, wVar, aVar.a);
    }
}
