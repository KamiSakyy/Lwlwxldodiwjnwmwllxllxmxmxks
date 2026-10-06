package pa0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import hc0.fb;
import hc0.fc;
import hc0.fd;
import hc0.wg;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        fb.Companion.getClass();
        r b = l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Issue");
        List list = x50.d.a;
        s c = no.a.c(list, "selections", "Issue", n, list);
        List n2 = d0Shadow.n("PullRequest");
        List list2 = a80.f.a;
        List r = l.r(new s[]{mVar, c, no.a.c(list2, "selections", "PullRequest", n2, list2)});
        fc.Companion.getClass();
        List n3 = d0Shadow.n(new m("linkedIssuesOrPullRequests", l0.a(l0.b(fc.a)), (String) null, rVar, rVar, r));
        fd.Companion.getClass();
        q0 q0Var = fd.a;
        k.g(q0Var, "type");
        wg.Companion.getClass();
        a = d0Shadow.n(new m("linkIssueOrPullRequest", q0Var, (String) null, rVar, no.a.s(wg.T, new u0(x.u(new w61.k[]{new w61.k("baseIssueOrPullRequestId", new t("baseIssueOrPullRequestId")), new w61.k("linkingIds", new t("linkedIssuesOrPRs"))}))), n3));
    }
}
