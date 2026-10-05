package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q4 implements aa.a {
    public static final q4 a = new q4();
    public static final List b = sy.d0.n("patch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.c7 c7Var = null;
        while (eVar.r0(b) == 0) {
            c7Var = (jo.c7) aa.c.b(aa.c.c(s4.a, false)).a(eVar, wVar);
        }
        return new jo.a7(c7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.a7 a7Var = (jo.a7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a7Var, "value");
        fVar.z0("patch");
        aa.c.b(aa.c.c(s4.a, false)).b(fVar, wVar, a7Var.a);
    }
}
