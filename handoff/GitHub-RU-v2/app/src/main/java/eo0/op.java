package eo0;

import java.util.List;
import jn0.p00;

/* loaded from: /home/user/work/p/classes4.dex */
public final class op implements aaShadow.a {
    public static final op a = new op();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(np.a, true)))).a(eVar, wVar);
        }
        return new p00(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p00 p00Var = (p00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p00Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(np.a, true)))).b(fVar, wVar, p00Var.a);
    }
}
