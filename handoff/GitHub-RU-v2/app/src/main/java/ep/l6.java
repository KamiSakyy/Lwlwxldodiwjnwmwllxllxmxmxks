package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l6 implements aa.a {
    public static final l6 a = new l6();
    public static final List b = sy.d0.n("deleteDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.s9 s9Var = null;
        while (eVar.r0(b) == 0) {
            s9Var = (jo.s9) aa.c.b(aa.c.c(m6.a, false)).a(eVar, wVar);
        }
        return new jo.r9(s9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.r9 r9Var = (jo.r9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r9Var, "value");
        fVar.z0("deleteDiscussion");
        aa.c.b(aa.c.c(m6.a, false)).b(fVar, wVar, r9Var.a);
    }
}
