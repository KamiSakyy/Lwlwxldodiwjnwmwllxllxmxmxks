package qi0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.n("repository");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        pi0.e eVar2 = null;
        while (eVar.r0(b) == 0) {
            eVar2 = (pi0.e) aa.c.b(aa.c.c(d.a, false)).a(eVar, wVar);
        }
        return new pi0.b(eVar2);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        pi0.b bVar = (pi0.b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(d.a, false)).b(fVar, wVar, bVar.a);
    }
}
