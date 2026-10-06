package ep;

import java.util.List;
import jo.nf0;
import jo.pf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vz implements aaShadow.a {
    public static final vz a = new vz();
    public static final List b = sy.d0.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        pf0 pf0Var = null;
        while (eVar.r0(b) == 0) {
            pf0Var = (pf0) aa.c.b(aa.c.c(xz.a, false)).a(eVar, wVar);
        }
        return new nf0(pf0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        nf0 nf0Var = (nf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nf0Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(xz.a, false)).b(fVar, wVar, nf0Var.a);
    }
}
