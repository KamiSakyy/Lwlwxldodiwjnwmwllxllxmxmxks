package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k4 implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("gitObject");

    public static jo.s6 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.l6 l6Var = null;
        while (eVar.r0(a) == 0) {
            l6Var = (jo.l6) aa.c.b(aa.c.c(d4.a, true)).a(eVar, wVar);
        }
        return new jo.s6(l6Var);
    }

    public static void d(ea.f fVar, aa.w wVar, jo.s6 s6Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s6Var, "value");
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(d4.a, true)).b(fVar, wVar, s6Var.a);
    }
}
