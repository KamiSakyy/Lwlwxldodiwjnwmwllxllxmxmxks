package fd0;

import java.util.List;
import kc0.r50;
import kc0.s50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qs implements aaShadow.a {
    public static final qs a = new qs();
    public static final List b = sy.d0.n("updateDiscussionComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        s50 s50Var = null;
        while (eVar.r0(b) == 0) {
            s50Var = (s50) aa.c.b(aa.c.c(rs.a, false)).a(eVar, wVar);
        }
        return new r50(s50Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r50 r50Var = (r50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r50Var, "value");
        fVar.z0("updateDiscussionComment");
        aa.c.b(aa.c.c(rs.a, false)).b(fVar, wVar, r50Var.a);
    }
}
