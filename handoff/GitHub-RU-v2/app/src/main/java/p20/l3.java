package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l3 implements aa.a {
    public static final l3 a = new l3();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.r5 r5Var = null;
        while (eVar.r0(b) == 0) {
            r5Var = (u10.r5) aa.c.b(aa.c.c(q3.a, true)).a(eVar, wVar);
        }
        return new u10.m5(r5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.m5 m5Var = (u10.m5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m5Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(q3.a, true)).b(fVar, wVar, m5Var.a);
    }
}
