package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class af implements aaShadow.a {
    public static final af a = new af();
    public static final List b = sy.d0.n("mergePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.mm mmVar = null;
        while (eVar.r0(b) == 0) {
            mmVar = (jn0.mm) aa.c.b(aa.c.c(cf.a, false)).a(eVar, wVar);
        }
        return new jn0.km(mmVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.km kmVar = (jn0.km) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kmVar, "value");
        fVar.z0("mergePullRequest");
        aa.c.b(aa.c.c(cf.a, false)).b(fVar, wVar, kmVar.a);
    }
}
