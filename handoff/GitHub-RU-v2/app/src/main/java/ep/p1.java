package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p1 implements aaShadow.a {
    public static final p1 a = new p1();
    public static final List b = sy.d0Shadow.n("approveDeployments");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.u2 u2Var = null;
        while (eVar.r0(b) == 0) {
            u2Var = (jo.u2) aa.c.b(aa.c.c(o1.a, false)).a(eVar, wVar);
        }
        return new jo.w2(u2Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.w2 w2Var = (jo.w2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w2Var, "value");
        fVar.z0("approveDeployments");
        aa.c.b(aa.c.c(o1.a, false)).b(fVar, wVar, w2Var.a);
    }
}
