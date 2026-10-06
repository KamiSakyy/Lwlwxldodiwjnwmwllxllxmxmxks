package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cd implements aaShadow.a {
    public static final cd a = new cd();
    public static final List b = sy.d0.n("markFileAsViewed");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.hj hjVar = null;
        while (eVar.r0(b) == 0) {
            hjVar = (jn0.hj) aa.c.b(aa.c.c(dd.a, false)).a(eVar, wVar);
        }
        return new jn0.gj(hjVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.gj gjVar = (jn0.gj) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gjVar, "value");
        fVar.z0("markFileAsViewed");
        aa.c.b(aa.c.c(dd.a, false)).b(fVar, wVar, gjVar.a);
    }
}
