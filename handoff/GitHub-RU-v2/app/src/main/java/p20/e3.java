package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e3 implements aaShadow.a {
    public static final e3 a = new e3();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.d5 d5Var = null;
        while (eVar.r0(b) == 0) {
            d5Var = (u10.d5) aa.c.b(aa.c.c(g3.a, false)).a(eVar, wVar);
        }
        return new u10.b5(d5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.b5 b5Var = (u10.b5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b5Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(g3.a, false)).b(fVar, wVar, b5Var.a);
    }
}
