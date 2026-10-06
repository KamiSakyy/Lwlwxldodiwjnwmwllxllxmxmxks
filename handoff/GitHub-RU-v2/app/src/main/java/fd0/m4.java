package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m4 implements aaShadow.a {
    public static final m4 a = new m4();
    public static final List b = sy.d0Shadow.n("createPullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.w6 w6Var = null;
        while (eVar.r0(b) == 0) {
            w6Var = (kc0.w6) aa.c.b(aa.c.c(l4.a, false)).a(eVar, wVar);
        }
        return new kc0.x6(w6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.x6 x6Var = (kc0.x6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x6Var, "value");
        fVar.z0("createPullRequest");
        aa.c.b(aa.c.c(l4.a, false)).b(fVar, wVar, x6Var.a);
    }
}
