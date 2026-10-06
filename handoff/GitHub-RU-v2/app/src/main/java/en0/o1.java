package en0;

import gn0.jj;
import gn0.lb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o1 {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.r b = v8.l0.b(lb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("CodeSearchResult");
        List list = cn0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "CodeSearchResult", n, list)});
        jj.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        gn0.t3.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(gn0.t3.a), (String) null, rVar, rVar, r2)});
        gn0.p3.Companion.getClass();
        aa.r b2 = v8.l0.b(gn0.p3.a);
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("codeSearch", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.a, new aa.u0(new aa.t("after"))), new aa.k(rn.b, new aa.u0(new aa.t("first"))), new aa.k(rn.c, new aa.u0(new aa.t("query")))}), r3));
    }
}
