package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y2 implements aaShadow.a {
    public static final y2 a = new y2();
    public static final List b = sy.d0Shadow.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.t4 t4Var = null;
        while (eVar.r0(b) == 0) {
            t4Var = (u10.t4) aa.c.b(aa.c.c(a3.a, true)).a(eVar, wVar);
        }
        return new u10.q4(t4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.q4 q4Var = (u10.q4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q4Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(a3.a, true)).b(fVar, wVar, q4Var.a);
    }
}
