package dy;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import java.util.List;
import m10.eh;
import m10.gk;
import m10.si;
import m10.vp;
import sy.d0;
import v8.l0;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        eh.Companion.getClass();
        r b = l0.b(eh.a);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Issue");
        List list = dt.e.a;
        s c = no.a.c(list, "selections", "Issue", n, list);
        List n2 = d0.n("PullRequest");
        List list2 = hv.g.a;
        List r = x61.l.r(new s[]{mVar, c, no.a.c(list2, "selections", "PullRequest", n2, list2)});
        si.Companion.getClass();
        List n3 = d0.n(new m("linkedIssuesOrPullRequests", l0.a(l0.b(si.a)), (String) null, rVar, rVar, r));
        gk.Companion.getClass();
        q0 q0Var = gk.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = d0.n(new m("linkIssueOrPullRequest", q0Var, (String) null, rVar, no.a.s(vp.h0, new u0(x.u(new w61.k[]{new w61.k("baseIssueOrPullRequestId", new t("baseIssueOrPullRequestId")), new w61.k("linkingIds", new t("linkedIssuesOrPRs"))}))), n3));
    }
}
