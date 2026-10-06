package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ik implements aaShadow.a {
    public static final ik a = new ik();
    public static final List b = sy.d0Shadow.n("deleteUserDashboardPin");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.kt ktVar = null;
        while (eVar.r0(b) == 0) {
            ktVar = (jn0.kt) aa.c.b(aa.c.c(jk.a, false)).a(eVar, wVar);
        }
        return new jn0.jt(ktVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.jt jtVar = (jn0.jt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jtVar, "value");
        fVar.z0("deleteUserDashboardPin");
        aa.c.b(aa.c.c(jk.a, false)).b(fVar, wVar, jtVar.a);
    }
}
