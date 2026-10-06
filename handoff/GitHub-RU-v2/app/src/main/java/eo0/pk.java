package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pk implements aaShadow.a {
    public static final pk a = new pk();
    public static final List b = sy.d0.n("removeDashboardSearchShortcut");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.vt vtVar = null;
        while (eVar.r0(b) == 0) {
            vtVar = (jn0.vt) aa.c.b(aa.c.c(qk.a, false)).a(eVar, wVar);
        }
        return new jn0.ut(vtVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ut utVar = (jn0.ut) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(utVar, "value");
        fVar.z0("removeDashboardSearchShortcut");
        aa.c.b(aa.c.c(qk.a, false)).b(fVar, wVar, utVar.a);
    }
}
