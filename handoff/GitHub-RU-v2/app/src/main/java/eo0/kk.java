package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kk implements aaShadow.a {
    public static final kk a = new kk();
    public static final List b = sy.d0.n("removeReaction");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.qt qtVar = null;
        while (eVar.r0(b) == 0) {
            qtVar = (jn0.qt) aa.c.b(aa.c.c(nk.a, false)).a(eVar, wVar);
        }
        return new jn0.nt(qtVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.nt ntVar = (jn0.nt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ntVar, "value");
        fVar.z0("removeReaction");
        aa.c.b(aa.c.c(nk.a, false)).b(fVar, wVar, ntVar.a);
    }
}
