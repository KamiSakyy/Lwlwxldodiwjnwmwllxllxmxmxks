package fd0;

import java.util.List;
import kc0.m40;
import kc0.p40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vr implements aa.a {
    public static final vr a = new vr();
    public static final List b = sy.d0.n("unmarkDiscussionCommentAsAnswer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        p40 p40Var = null;
        while (eVar.r0(b) == 0) {
            p40Var = (p40) aa.c.b(aa.c.c(yr.a, false)).a(eVar, wVar);
        }
        return new m40(p40Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m40 m40Var = (m40) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m40Var, "value");
        fVar.z0("unmarkDiscussionCommentAsAnswer");
        aa.c.b(aa.c.c(yr.a, false)).b(fVar, wVar, m40Var.a);
    }
}
