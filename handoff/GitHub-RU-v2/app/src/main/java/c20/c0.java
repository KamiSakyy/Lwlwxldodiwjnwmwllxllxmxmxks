package c20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements aa.a {
    public static final c0 a = new c0();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        b20.k0 k0Var = null;
        while (eVar.r0(b) == 0) {
            k0Var = (b20.k0) aa.c.b(aa.c.c(d0.a, true)).a(eVar, wVar);
        }
        return new b20.j0(k0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        b20.j0 j0Var = (b20.j0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j0Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(d0.a, true)).b(fVar, wVar, j0Var.a);
    }
}
