package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 implements aa.a {
    public static final a1 a = new a1();
    public static final List b = sy.d0.n("starrable");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.z1 z1Var = null;
        while (eVar.r0(b) == 0) {
            z1Var = (jo.z1) aa.c.b(aa.c.c(c1.a, true)).a(eVar, wVar);
        }
        return new jo.w1(z1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.w1 w1Var = (jo.w1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w1Var, "value");
        fVar.z0("starrable");
        aa.c.b(aa.c.c(c1.a, true)).b(fVar, wVar, w1Var.a);
    }
}
