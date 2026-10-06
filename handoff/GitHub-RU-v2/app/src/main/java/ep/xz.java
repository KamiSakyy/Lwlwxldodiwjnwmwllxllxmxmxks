package ep;

import java.util.List;
import jo.of0;
import jo.pf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xz implements aaShadow.a {
    public static final xz a = new xz();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        of0 of0Var = null;
        while (eVar.r0(b) == 0) {
            of0Var = (of0) aa.c.b(aa.c.c(wz.a, false)).a(eVar, wVar);
        }
        return new pf0(of0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        pf0 pf0Var = (pf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pf0Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(wz.a, false)).b(fVar, wVar, pf0Var.a);
    }
}
