package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements aaShadow.a {
    public static final u a = new u();
    public static final List b = sy.d0.o("subject", "reaction");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.l0 l0Var = null;
        jo.k0 k0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                l0Var = (jo.l0) aa.c.b(aa.c.c(y.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.g0(l0Var, k0Var);
                }
                k0Var = (jo.k0) aa.c.b(aa.c.c(x.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.g0 g0Var = (jo.g0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(y.a, true)).b(fVar, wVar, g0Var.a);
        fVar.z0("reaction");
        aa.c.b(aa.c.c(x.a, false)).b(fVar, wVar, g0Var.b);
    }
}
