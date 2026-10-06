package ep;

import java.util.List;
import jo.vc0;
import jo.xc0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wx implements aaShadow.a {
    public static final wx a = new wx();
    public static final List b = sy.d0Shadow.n("updateIssueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xc0 xc0Var = null;
        while (eVar.r0(b) == 0) {
            xc0Var = (xc0) aa.c.b(aa.c.c(yx.a, false)).a(eVar, wVar);
        }
        return new vc0(xc0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        vc0 vc0Var = (vc0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vc0Var, "value");
        fVar.z0("updateIssueComment");
        aa.c.b(aa.c.c(yx.a, false)).b(fVar, wVar, vc0Var.a);
    }
}
