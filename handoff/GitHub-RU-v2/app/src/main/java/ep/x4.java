package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x4 implements aa.a {
    public static final x4 a = new x4();
    public static final List b = sy.d0.n("task");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.n7 n7Var = null;
        while (eVar.r0(b) == 0) {
            n7Var = (jo.n7) aa.c.b(aa.c.c(z4.a, false)).a(eVar, wVar);
        }
        return new jo.l7(n7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.l7 l7Var = (jo.l7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l7Var, "value");
        fVar.z0("task");
        aa.c.b(aa.c.c(z4.a, false)).b(fVar, wVar, l7Var.a);
    }
}
