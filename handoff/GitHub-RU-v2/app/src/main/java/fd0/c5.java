package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c5 implements aaShadow.a {
    public static final c5 a = new c5();
    public static final List b = sy.d0.n("deleteDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.u7 u7Var = null;
        while (eVar.r0(b) == 0) {
            u7Var = (kc0.u7) aa.c.b(aa.c.c(d5.a, false)).a(eVar, wVar);
        }
        return new kc0.t7(u7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.t7 t7Var = (kc0.t7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t7Var, "value");
        fVar.z0("deleteDiscussionComment");
        aa.c.b(aa.c.c(d5.a, false)).b(fVar, wVar, t7Var.a);
    }
}
