package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gi implements aa.a {
    public static final gi a = new gi();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ap0.p6 p6Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            p6Var = ap0.x6.c(eVar, wVar);
        }
        return new jn0.sq(str, p6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.sq sqVar = (jn0.sq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sqVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, sqVar.a);
        ap0.p6 p6Var = sqVar.b;
        if (p6Var != null) {
            ap0.x6.d(fVar, wVar, p6Var);
        }
    }
}
