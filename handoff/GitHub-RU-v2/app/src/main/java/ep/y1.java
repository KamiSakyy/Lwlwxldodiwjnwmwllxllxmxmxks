package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class y1 implements aaShadow.a {
    public static final List a = sy.d0.n("repository");

    public static jo.h3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.j3 j3Var = null;
        while (eVar.r0(a) == 0) {
            j3Var = (jo.j3) aa.c.c(a2.a, false).a(eVar, wVar);
        }
        if (j3Var != null) {
            return new jo.h3(j3Var);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.h3 h3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h3Var, "value");
        fVar.z0("repository");
        aa.c.c(a2.a, false).b(fVar, wVar, h3Var.a);
    }
}
