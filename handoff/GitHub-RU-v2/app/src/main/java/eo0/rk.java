package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rk implements aa.a {
    public static final rk a = new rk();
    public static final List b = sy.d0.n("removeStar");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.zt ztVar = null;
        while (eVar.r0(b) == 0) {
            ztVar = (jn0.zt) aa.c.b(aa.c.c(sk.a, false)).a(eVar, wVar);
        }
        return new jn0.yt(ztVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.yt ytVar = (jn0.yt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ytVar, "value");
        fVar.z0("removeStar");
        aa.c.b(aa.c.c(sk.a, false)).b(fVar, wVar, ytVar.a);
    }
}
