package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class al implements aa.a {
    public static final al a = new al();
    public static final List b = sy.d0.n("removeUpvote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.mu muVar = null;
        while (eVar.r0(b) == 0) {
            muVar = (jn0.mu) aa.c.b(aa.c.c(bl.a, false)).a(eVar, wVar);
        }
        return new jn0.lu(muVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.lu luVar = (jn0.lu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(luVar, "value");
        fVar.z0("removeUpvote");
        aa.c.b(aa.c.c(bl.a, false)).b(fVar, wVar, luVar.a);
    }
}
