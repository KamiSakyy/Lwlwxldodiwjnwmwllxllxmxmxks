package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kb implements aaShadow.a {
    public static final kb a = new kb();
    public static final List b = sy.d0.n("followUser");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.xg xgVar = null;
        while (eVar.r0(b) == 0) {
            xgVar = (jn0.xg) aa.c.b(aa.c.c(lb.a, false)).a(eVar, wVar);
        }
        return new jn0.wg(xgVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.wg wgVar = (jn0.wg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wgVar, "value");
        fVar.z0("followUser");
        aa.c.b(aa.c.c(lb.a, false)).b(fVar, wVar, wgVar.a);
    }
}
