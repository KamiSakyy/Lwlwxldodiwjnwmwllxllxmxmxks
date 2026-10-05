package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lb implements aa.a {
    public static final lb a = new lb();
    public static final List b = sy.d0.n("user");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.yg ygVar = null;
        while (eVar.r0(b) == 0) {
            ygVar = (jn0.yg) aa.c.b(aa.c.c(mb.a, true)).a(eVar, wVar);
        }
        return new jn0.xg(ygVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.xg xgVar = (jn0.xg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xgVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(mb.a, true)).b(fVar, wVar, xgVar.a);
    }
}
