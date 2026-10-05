package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements aa.a {
    public static final y a = new y();
    public static final List b = sy.d0.n("addDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.i0 i0Var = null;
        while (eVar.r0(b) == 0) {
            i0Var = (jn0.i0) aa.c.b(aa.c.c(w.a, false)).a(eVar, wVar);
        }
        return new jn0.l0(i0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.l0 l0Var = (jn0.l0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("addDiscussionComment");
        aa.c.b(aa.c.c(w.a, false)).b(fVar, wVar, l0Var.a);
    }
}
