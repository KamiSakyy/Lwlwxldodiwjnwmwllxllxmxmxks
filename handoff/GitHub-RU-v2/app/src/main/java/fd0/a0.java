package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.u0 u0Var = null;
        while (eVar.r0(b) == 0) {
            u0Var = (kc0.u0) aa.c.b(aa.c.c(f0.a, false)).a(eVar, wVar);
        }
        return new kc0.o0(u0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.o0 o0Var = (kc0.o0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o0Var, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(f0.a, false)).b(fVar, wVar, o0Var.a);
    }
}
