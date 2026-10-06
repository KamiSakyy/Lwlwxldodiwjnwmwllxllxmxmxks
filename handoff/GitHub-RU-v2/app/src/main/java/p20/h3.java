package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h3 implements aaShadow.a {
    public static final h3 a = new h3();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.h5 h5Var = null;
        while (eVar.r0(b) == 0) {
            h5Var = (u10.h5) aa.c.b(aa.c.c(i3.a, true)).a(eVar, wVar);
        }
        return new u10.g5(h5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.g5 g5Var = (u10.g5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g5Var, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(i3.a, true)).b(fVar, wVar, g5Var.a);
    }
}
