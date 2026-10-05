package ep;

import java.util.List;
import jo.ve0;
import jo.ye0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hz implements aa.a {
    public static final hz a = new hz();
    public static final List b = sy.d0.n("updatePullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ye0 ye0Var = null;
        while (eVar.r0(b) == 0) {
            ye0Var = (ye0) aa.c.b(aa.c.c(kz.a, false)).a(eVar, wVar);
        }
        return new ve0(ye0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ve0 ve0Var = (ve0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ve0Var, "value");
        fVar.z0("updatePullRequest");
        aa.c.b(aa.c.c(kz.a, false)).b(fVar, wVar, ve0Var.a);
    }
}
