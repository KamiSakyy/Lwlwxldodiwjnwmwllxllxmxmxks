package eo0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oh implements aaShadow.a {
    public static final oh a = new oh();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.dq dqVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        jn0.cq cqVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequestReviewThread"}), set2, str, set)) {
            eVar.s0();
            dqVar = th.c(eVar, wVar);
        } else {
            dqVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequestReviewComment"}), set2, str, set)) {
            eVar.s0();
            cqVar = sh.c(eVar, wVar);
        }
        return new jn0.yp(str, dqVar, cqVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.yp ypVar = (jn0.yp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ypVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, ypVar.a);
        jn0.dq dqVar = ypVar.b;
        if (dqVar != null) {
            th.d(fVar, wVar, dqVar);
        }
        jn0.cq cqVar = ypVar.c;
        if (cqVar != null) {
            sh.d(fVar, wVar, cqVar);
        }
    }
}
