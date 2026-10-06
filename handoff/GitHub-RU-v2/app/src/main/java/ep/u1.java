package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u1 implements aaShadow.a {
    public static final List a = sy.d0.n("suggestedActors");

    public static jo.d3 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.k3 k3Var = null;
        while (eVar.r0(a) == 0) {
            k3Var = (jo.k3) aa.c.c(b2.a, false).a(eVar, wVar);
        }
        if (k3Var != null) {
            return new jo.d3(k3Var);
        }
        k41.b.B(eVar, "suggestedActors");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.d3 d3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d3Var, "value");
        fVar.z0("suggestedActors");
        aa.c.c(b2.a, false).b(fVar, wVar, d3Var.a);
    }
}
