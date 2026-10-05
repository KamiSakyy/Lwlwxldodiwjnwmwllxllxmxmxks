package uc0;

import aa.w;
import java.util.List;
import k71.k;
import sy.d0;
import tc0.o;
import tc0.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.n("node");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        p pVar = null;
        while (eVar.r0(b) == 0) {
            pVar = (p) aa.c.b(aa.c.c(i.a, true)).a(eVar, wVar);
        }
        return new o(pVar);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        o oVar = (o) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(oVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(i.a, true)).b(fVar, wVar, oVar.a);
    }
}
