package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ki implements aa.a {
    public static final ki a = new ki();
    public static final List b = sy.d0.n("removeUpvote");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.xq xqVar = null;
        while (eVar.r0(b) == 0) {
            xqVar = (u10.xq) aa.c.b(aa.c.c(li.a, false)).a(eVar, wVar);
        }
        return new u10.wq(xqVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.wq wqVar = (u10.wq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wqVar, "value");
        fVar.z0("removeUpvote");
        aa.c.b(aa.c.c(li.a, false)).b(fVar, wVar, wqVar.a);
    }
}
