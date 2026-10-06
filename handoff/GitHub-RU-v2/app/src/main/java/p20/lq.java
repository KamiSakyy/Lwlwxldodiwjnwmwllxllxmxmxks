package p20;

import java.util.List;
import u10.o20;
import u10.r20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lq implements aaShadow.a {
    public static final lq a = new lq();
    public static final List b = sy.d0.n("unmarkDiscussionCommentAsAnswer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        r20 r20Var = null;
        while (eVar.r0(b) == 0) {
            r20Var = (r20) aa.c.b(aa.c.c(oq.a, false)).a(eVar, wVar);
        }
        return new o20(r20Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        o20 o20Var = (o20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o20Var, "value");
        fVar.z0("unmarkDiscussionCommentAsAnswer");
        aa.c.b(aa.c.c(oq.a, false)).b(fVar, wVar, o20Var.a);
    }
}
