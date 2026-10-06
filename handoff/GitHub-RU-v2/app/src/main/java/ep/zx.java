package ep;

import java.util.List;
import jo.ad0;
import jo.dd0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zx implements aaShadow.a {
    public static final zx a = new zx();
    public static final List b = sy.d0.n("updateIssueIssueType");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        dd0 dd0Var = null;
        while (eVar.r0(b) == 0) {
            dd0Var = (dd0) aa.c.b(aa.c.c(dy.a, false)).a(eVar, wVar);
        }
        return new ad0(dd0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ad0 ad0Var = (ad0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ad0Var, "value");
        fVar.z0("updateIssueIssueType");
        aa.c.b(aa.c.c(dy.a, false)).b(fVar, wVar, ad0Var.a);
    }
}
