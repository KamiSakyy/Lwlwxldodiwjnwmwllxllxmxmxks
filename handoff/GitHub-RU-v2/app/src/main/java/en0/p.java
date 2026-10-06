package en0;

import gn0.eq;
import gn0.jj;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import gn0.y00;
import gn0.yh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list = xk0.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        aa.x xVar3 = rb.a;
        aa.r b2 = v8.l0.b(xVar3);
        eq.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("repository", v8.l0.b(eq.m0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar2, new aa.m("planLimit", b2, (String) null, rVar, no.a.s(eq.J, new aa.u0("ISSUE_PR_ASSIGNEES")), rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        lb.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0Shadow.n("User"), list), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r2);
        aa.m mVar4 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        aa.q0 q0Var = s00.P;
        List r4 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("nodes", v8.l0.a(q0Var), (String) null, rVar, rVar, r3)});
        y00.Companion.getClass();
        aa.r b3 = v8.l0.b(y00.a);
        gn0.x0.Companion.getClass();
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("RepositoryNode", x61.l.r(new String[]{"CommitComment", "CommitCommentThread", "DependabotUpdate", "Discussion", "DiscussionCategory", "Issue", "IssueComment", "PinnedDiscussion", "PullRequest", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryVulnerabilityAlert"}), n2), new aa.n("Assignable", x61.l.r(new String[]{"Issue", "PullRequest"}), sy.d0Shadow.n(new aa.m("suggestedAssignees", b3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(gn0.x0.b, new aa.u0(new aa.t("after"))), new aa.k(gn0.x0.c, new aa.u0(50)), new aa.k(gn0.x0.d, new aa.u0(new aa.t("query")))}), r4)))});
        aa.m mVar5 = new aa.m("viewer", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        yh.Companion.getClass();
        aa.j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar5, new aa.m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new aa.u0(new aa.t("assignableId"))), r5)});
    }
}
