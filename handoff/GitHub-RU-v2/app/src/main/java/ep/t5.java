package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t5 implements aa.a {
    public static final t5 a = new t5();
    public static final List b = sy.d0.n("createRef");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.q8 q8Var = null;
        while (eVar.r0(b) == 0) {
            q8Var = (jo.q8) aa.c.b(aa.c.c(s5.a, false)).a(eVar, wVar);
        }
        return new jo.r8(q8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.r8 r8Var = (jo.r8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r8Var, "value");
        fVar.z0("createRef");
        aa.c.b(aa.c.c(s5.a, false)).b(fVar, wVar, r8Var.a);
    }
}
