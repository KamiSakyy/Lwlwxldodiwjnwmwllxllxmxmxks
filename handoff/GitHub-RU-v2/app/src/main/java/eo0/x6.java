package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x6 implements aaShadow.a {
    public static final x6 a = new x6();
    public static final List b = sy.d0.n("disablePullRequestAutoMerge");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ja jaVar = null;
        while (eVar.r0(b) == 0) {
            jaVar = (jn0.ja) aa.c.b(aa.c.c(y6.a, false)).a(eVar, wVar);
        }
        return new jn0.ia(jaVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ia iaVar = (jn0.ia) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iaVar, "value");
        fVar.z0("disablePullRequestAutoMerge");
        aa.c.b(aa.c.c(y6.a, false)).b(fVar, wVar, iaVar.a);
    }
}
