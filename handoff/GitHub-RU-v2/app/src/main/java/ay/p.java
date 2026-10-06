package ay;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = sy.d0Shadow.n("linkIssueOrPullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zx.b0 b0Var = null;
        while (eVar.r0(b) == 0) {
            b0Var = (zx.b0) aa.c.b(aa.c.c(q.a, false)).a(eVar, wVar);
        }
        return new zx.a0Shadow(b0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx.a0Shadow a0Var = (zx.a0Shadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("linkIssueOrPullRequest");
        aa.c.b(aa.c.c(q.a, false)).b(fVar, wVar, a0Var.a);
    }
}
