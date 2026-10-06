package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r3 implements aaShadow.a {
    public static final r3 a = new r3();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.z5 z5Var = null;
        while (eVar.r0(b) == 0) {
            z5Var = (kc0.z5) aa.c.b(aa.c.c(w3.a, true)).a(eVar, wVar);
        }
        return new kc0.u5(z5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.u5 u5Var = (kc0.u5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u5Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(w3.a, true)).b(fVar, wVar, u5Var.a);
    }
}
