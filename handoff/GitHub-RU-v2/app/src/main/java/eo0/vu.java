package eo0;

import java.util.List;
import jn0.j80;
import jn0.m80;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vu implements aa.a {
    public static final vu a = new vu();
    public static final List b = sy.d0.n("unmarkDiscussionCommentAsAnswer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m80 m80Var = null;
        while (eVar.r0(b) == 0) {
            m80Var = (m80) aa.c.b(aa.c.c(yu.a, false)).a(eVar, wVar);
        }
        return new j80(m80Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j80 j80Var = (j80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j80Var, "value");
        fVar.z0("unmarkDiscussionCommentAsAnswer");
        aa.c.b(aa.c.c(yu.a, false)).b(fVar, wVar, j80Var.a);
    }
}
