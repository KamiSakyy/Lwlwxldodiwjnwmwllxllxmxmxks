package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 implements aa.a {
    public static final y0 a = new y0();
    public static final List b = sy.d0Shadow.n("patches");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s0 s0Var = null;
        while (eVar.r0(b) == 0) {
            s0Var = (s0) aa.c.c(n1.a, false).a(eVar, wVar);
        }
        if (s0Var != null) {
            return new e0(s0Var);
        }
        k41.b.B(eVar, "patches");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e0 e0Var = (e0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e0Var, "value");
        fVar.z0("patches");
        aa.c.c(n1.a, false).b(fVar, wVar, e0Var.a);
    }
}
