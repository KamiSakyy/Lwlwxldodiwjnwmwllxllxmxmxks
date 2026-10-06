package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tc implements aaShadow.a {
    public static final tc a = new tc();
    public static final List b = sy.d0.n("lockLockable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ui uiVar = null;
        while (eVar.r0(b) == 0) {
            uiVar = (jn0.ui) aa.c.b(aa.c.c(uc.a, false)).a(eVar, wVar);
        }
        return new jn0.ti(uiVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ti tiVar = (jn0.ti) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tiVar, "value");
        fVar.z0("lockLockable");
        aa.c.b(aa.c.c(uc.a, false)).b(fVar, wVar, tiVar.a);
    }
}
