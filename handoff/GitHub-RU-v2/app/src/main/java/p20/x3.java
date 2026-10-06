package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x3 implements aaShadow.a {
    public static final x3 a = new x3();
    public static final List b = sy.d0Shadow.n("commit");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.y5 y5Var = null;
        while (eVar.r0(b) == 0) {
            y5Var = (u10.y5) aa.c.b(aa.c.c(w3.a, true)).a(eVar, wVar);
        }
        return new u10.a6(y5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.a6 a6Var = (u10.a6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a6Var, "value");
        fVar.z0("commit");
        aa.c.b(aa.c.c(w3.a, true)).b(fVar, wVar, a6Var.a);
    }
}
