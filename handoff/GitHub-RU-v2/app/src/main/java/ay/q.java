package ay;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = sy.d0.n("linkedIssuesOrPullRequests");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.c(r.a, true))).a(eVar, wVar);
        }
        return new zx.b0(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx.b0 b0Var = (zx.b0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("linkedIssuesOrPullRequests");
        aa.c.b(aa.c.a(aa.c.c(r.a, true))).b(fVar, wVar, b0Var.a);
    }
}
