package ep;

import java.util.List;
import jo.ab0;
import jo.xa0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qwShadow implements aaShadow.a {
    public static final qwShadow a = new qwShadow();
    public static final List b = sy.d0Shadow.n("unmarkDiscussionCommentAsAnswer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ab0 ab0Var = null;
        while (eVar.r0(b) == 0) {
            ab0Var = (ab0) aa.c.b(aa.c.c(tw.a, false)).a(eVar, wVar);
        }
        return new xa0(ab0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xa0 xa0Var = (xa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xa0Var, "value");
        fVar.z0("unmarkDiscussionCommentAsAnswer");
        aa.c.b(aa.c.c(tw.a, false)).b(fVar, wVar, xa0Var.a);
    }
}
