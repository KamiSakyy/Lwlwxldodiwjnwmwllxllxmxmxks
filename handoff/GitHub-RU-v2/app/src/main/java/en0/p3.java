package en0;

import gn0.cg;
import gn0.eg;
import gn0.eq;
import gn0.jj;
import gn0.lb;
import gn0.ll;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.tb;
import gn0.yf;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p3 {
    public static final List a;

    static {
        rb.Companion.getClass();
        aa.x xVar = rb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        lb.Companion.getClass();
        aa.m mVar = new aa.m("hasNextPage", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("PullRequest");
        List list = si0.h.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n2, list);
        pb.Companion.getClass();
        aa.x xVar3 = pb.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("position", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        aa.q0 q0Var = ll.K;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("totalCount", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        jj.Companion.getClass();
        aa.m mVar6 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        cg.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, mVar6, new aa.m("nodes", v8.l0.a(cg.a), (String) null, rVar, rVar, r3)});
        aa.m mVar7 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        eg.Companion.getClass();
        aa.q0 q0Var2 = eg.a;
        k71.k.g(q0Var2, "type");
        aa.m mVar8 = new aa.m("entries", q0Var2, "entriesCount", rVar, rVar, n);
        yf.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar7, mVar8, new aa.m("entries", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(yf.a, new aa.u0(new aa.t("after"))), new aa.k(yf.b, new aa.u0(new aa.t("first")))}), r4), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar9 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var3 = yf.c;
        k71.k.g(q0Var3, "type");
        eq.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar9, new aa.m("mergeQueue", q0Var3, (String) null, rVar, no.a.s(eq.A, new aa.u0(new aa.t("branch"))), r5), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var4 = eq.m0;
        k71.k.g(q0Var4, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var4, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(rn.m, new aa.u0(new aa.t("repositoryOwner")))}), r6));
    }
}
