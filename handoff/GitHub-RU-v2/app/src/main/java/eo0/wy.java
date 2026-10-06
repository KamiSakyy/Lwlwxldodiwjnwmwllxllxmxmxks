package eo0;

import java.util.List;
import jn0.je0;
import jn0.le0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wy implements aaShadow.a {
    public static final wy a = new wy();
    public static final List b = sy.d0Shadow.n("updateUserDashboardNavLinks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        le0 le0Var = null;
        while (eVar.r0(b) == 0) {
            le0Var = (le0) aa.c.b(aa.c.c(yy.a, false)).a(eVar, wVar);
        }
        return new je0(le0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        je0 je0Var = (je0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(je0Var, "value");
        fVar.z0("updateUserDashboardNavLinks");
        aa.c.b(aa.c.c(yy.a, false)).b(fVar, wVar, je0Var.a);
    }
}
