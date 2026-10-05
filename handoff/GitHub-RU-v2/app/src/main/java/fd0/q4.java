package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q4 implements aa.a {
    public static final q4 a = new q4();
    public static final List b = sy.d0.n("ref");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.f7 f7Var = null;
        while (eVar.r0(b) == 0) {
            f7Var = (kc0.f7) aa.c.b(aa.c.c(s4.a, true)).a(eVar, wVar);
        }
        return new kc0.d7(f7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.d7 d7Var = (kc0.d7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d7Var, "value");
        fVar.z0("ref");
        aa.c.b(aa.c.c(s4.a, true)).b(fVar, wVar, d7Var.a);
    }
}
