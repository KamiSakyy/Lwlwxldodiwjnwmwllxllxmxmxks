package fl0;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import gn0.eq;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.tc;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Issue");
        List list = ng0.c.a;
        s c = no.a.c(list, "selections", "Issue", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("PullRequest");
        List list2 = si0.m.a;
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0Shadow.n("Issue"), r), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new s[]{mVar2, no.a.c(list2, "selections", "PullRequest", n2, list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        tc.Companion.getClass();
        x0 x0Var = tc.a;
        k.g(x0Var, "type");
        eq.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("issueOrPullRequest", x0Var, (String) null, rVar, no.a.s(eq.p, new u0(new t("number"))), r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = eq.m0;
        k.g(q0Var, "type");
        rn.Companion.getClass();
        a = d0Shadow.n(new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(rn.l, new u0(new t("repositoryName"))), new aa.k(rn.m, new u0(new t("repositoryOwner")))}), r3));
    }
}
