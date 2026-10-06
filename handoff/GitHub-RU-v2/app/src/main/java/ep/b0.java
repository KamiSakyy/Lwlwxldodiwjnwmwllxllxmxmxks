package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aaShadow.a {
    public static final b0 a = new b0();
    public static final List b = sy.d0Shadow.n("addDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.n0 n0Var = null;
        while (eVar.r0(b) == 0) {
            n0Var = (jo.n0) aa.c.b(aa.c.c(z.a, false)).a(eVar, wVar);
        }
        return new jo.q0(n0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.q0 q0Var = (jo.q0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("addDiscussionComment");
        aa.c.b(aa.c.c(z.a, false)).b(fVar, wVar, q0Var.a);
    }
}
