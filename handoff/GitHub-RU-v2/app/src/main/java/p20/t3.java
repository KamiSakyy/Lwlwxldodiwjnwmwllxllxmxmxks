package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t3 implements aaShadow.a {
    public static final List a = sy.d0.n("gitObject");

    public static u10.u5 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.n5 n5Var = null;
        while (eVar.r0(a) == 0) {
            n5Var = (u10.n5) aa.c.b(aa.c.c(m3.a, true)).a(eVar, wVar);
        }
        return new u10.u5(n5Var);
    }

    public static void d(ea.f fVar, aa.w wVar, u10.u5 u5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u5Var, "value");
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(m3.a, true)).b(fVar, wVar, u5Var.a);
    }
}
