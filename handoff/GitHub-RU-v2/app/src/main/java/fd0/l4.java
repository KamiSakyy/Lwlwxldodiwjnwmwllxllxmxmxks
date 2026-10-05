package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l4 implements aa.a {
    public static final l4 a = new l4();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.z6 z6Var = null;
        while (eVar.r0(b) == 0) {
            z6Var = (kc0.z6) aa.c.b(aa.c.c(o4.a, false)).a(eVar, wVar);
        }
        return new kc0.w6(z6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.w6 w6Var = (kc0.w6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w6Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(o4.a, false)).b(fVar, wVar, w6Var.a);
    }
}
