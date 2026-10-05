package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s5 implements aa.a {
    public static final s5 a = new s5();
    public static final List b = sy.d0.n("ref");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.s8 s8Var = null;
        while (eVar.r0(b) == 0) {
            s8Var = (jo.s8) aa.c.b(aa.c.c(u5.a, true)).a(eVar, wVar);
        }
        return new jo.q8(s8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.q8 q8Var = (jo.q8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q8Var, "value");
        fVar.z0("ref");
        aa.c.b(aa.c.c(u5.a, true)).b(fVar, wVar, q8Var.a);
    }
}
