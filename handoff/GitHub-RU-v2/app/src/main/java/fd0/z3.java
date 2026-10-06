package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z3 implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("gitObject");

    public static kc0.c6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.v5 v5Var = null;
        while (eVar.r0(a) == 0) {
            v5Var = (kc0.v5) aa.c.b(aa.c.c(s3.a, true)).a(eVar, wVar);
        }
        return new kc0.c6(v5Var);
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.c6 c6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c6Var, "value");
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(s3.a, true)).b(fVar, wVar, c6Var.a);
    }
}
