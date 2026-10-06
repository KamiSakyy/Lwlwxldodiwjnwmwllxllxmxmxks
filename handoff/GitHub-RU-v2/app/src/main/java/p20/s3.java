package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s3 implements aaShadow.a {
    public static final List a = sy.d0.n("commits");

    public static u10.t5 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.k5 k5Var = null;
        while (eVar.r0(a) == 0) {
            k5Var = (u10.k5) aa.c.c(k3.a, false).a(eVar, wVar);
        }
        if (k5Var != null) {
            return new u10.t5(k5Var);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u10.t5 t5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t5Var, "value");
        fVar.z0("commits");
        aa.c.c(k3.a, false).b(fVar, wVar, t5Var.a);
    }
}
