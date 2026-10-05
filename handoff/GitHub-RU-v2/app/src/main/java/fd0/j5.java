package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j5 implements aa.a {
    public static final j5 a = new j5();
    public static final List b = sy.d0.n("deleteIssueComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.f8 f8Var = null;
        while (eVar.r0(b) == 0) {
            f8Var = (kc0.f8) aa.c.b(aa.c.c(k5.a, false)).a(eVar, wVar);
        }
        return new kc0.e8(f8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.e8 e8Var = (kc0.e8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e8Var, "value");
        fVar.z0("deleteIssueComment");
        aa.c.b(aa.c.c(k5.a, false)).b(fVar, wVar, e8Var.a);
    }
}
