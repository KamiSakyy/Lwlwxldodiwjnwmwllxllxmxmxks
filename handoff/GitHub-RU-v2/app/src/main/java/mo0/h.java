package mo0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.n("nodes");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(c.a, true)))).a(eVar, wVar);
        }
        return new lo0.i(list);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        lo0.i iVar = (lo0.i) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(c.a, true)))).b(fVar, wVar, iVar.a);
    }
}
