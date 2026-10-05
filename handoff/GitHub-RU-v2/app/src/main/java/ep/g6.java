package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g6 implements aa.a {
    public static final g6 a = new g6();
    public static final List b = sy.d0.n("deleteDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.l9 l9Var = null;
        while (eVar.r0(b) == 0) {
            l9Var = (jo.l9) aa.c.b(aa.c.c(h6.a, false)).a(eVar, wVar);
        }
        return new jo.k9(l9Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.k9 k9Var = (jo.k9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k9Var, "value");
        fVar.z0("deleteDiscussionComment");
        aa.c.b(aa.c.c(h6.a, false)).b(fVar, wVar, k9Var.a);
    }
}
