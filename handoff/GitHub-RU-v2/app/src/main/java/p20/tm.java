package p20;

import java.util.List;
import u10.ex;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tm implements aa.a {
    public static final tm a = new tm();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(pm.a, false)))).a(eVar, wVar);
        }
        return new ex(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ex exVar = (ex) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(exVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(pm.a, false)))).b(fVar, wVar, exVar.a);
    }
}
