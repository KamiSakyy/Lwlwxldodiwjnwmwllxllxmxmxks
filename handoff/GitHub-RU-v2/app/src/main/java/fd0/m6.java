package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m6 implements aa.a {
    public static final m6 a = new m6();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.x9 x9Var = null;
        while (eVar.r0(b) == 0) {
            x9Var = (kc0.x9) aa.c.b(aa.c.c(q6.a, false)).a(eVar, wVar);
        }
        return new kc0.t9(x9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.t9 t9Var = (kc0.t9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t9Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(q6.a, false)).b(fVar, wVar, t9Var.a);
    }
}
