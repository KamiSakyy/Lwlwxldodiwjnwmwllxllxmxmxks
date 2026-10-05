package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j4 implements aa.a {
    public static final List a = sy.d0.n("commits");

    public static jo.r6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.i6 i6Var = null;
        while (eVar.r0(a) == 0) {
            i6Var = (jo.i6) aa.c.c(b4.a, false).a(eVar, wVar);
        }
        if (i6Var != null) {
            return new jo.r6(i6Var);
        }
        k41.b.B(eVar, "commits");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.r6 r6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r6Var, "value");
        fVar.z0("commits");
        aa.c.c(b4.a, false).b(fVar, wVar, r6Var.a);
    }
}
