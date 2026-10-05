package y70;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.n("repository");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        x70.e eVar2 = null;
        while (eVar.r0(b) == 0) {
            eVar2 = (x70.e) aa.c.b(aa.c.c(d.a, false)).a(eVar, wVar);
        }
        return new x70.b(eVar2);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        x70.b bVar = (x70.b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(d.a, false)).b(fVar, wVar, bVar.a);
    }
}
