package jd0;

import aa.w;
import id0.l;
import java.util.List;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = d0.n("discussion");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        id0.k kVar = null;
        while (eVar.r0(b) == 0) {
            kVar = (id0.k) aa.c.b(aa.c.c(e.a, true)).a(eVar, wVar);
        }
        return new l(kVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        l lVar = (l) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(lVar, "value");
        fVar.z0("discussion");
        aa.c.b(aa.c.c(e.a, true)).b(fVar, wVar, lVar.a);
    }
}
