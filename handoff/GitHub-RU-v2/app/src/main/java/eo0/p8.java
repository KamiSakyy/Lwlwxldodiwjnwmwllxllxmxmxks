package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p8 implements aa.a {
    public static final p8 a = new p8();
    public static final List b = sy.d0.n("enablePullRequestAutoMerge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.xc xcVar = null;
        while (eVar.r0(b) == 0) {
            xcVar = (jn0.xc) aa.c.b(aa.c.c(q8.a, false)).a(eVar, wVar);
        }
        return new jn0.wc(xcVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.wc wcVar = (jn0.wc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wcVar, "value");
        fVar.z0("enablePullRequestAutoMerge");
        aa.c.b(aa.c.c(q8.a, false)).b(fVar, wVar, wcVar.a);
    }
}
