package kz0;

import java.util.List;
import pz0.c90;
import pz0.hm;
import pz0.jx;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.wk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list = gw0.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.x xVar3 = vd.a;
        aa.r b2 = v8.l0.b(xVar3);
        jx.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("repository", v8.l0.b(jx.t0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar2, new aa.m("planLimit", b2, (String) null, rVar, no.a.s(jx.M, new aa.u0("ISSUE_PR_ASSIGNEES")), rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        pd.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        List r3 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0Shadow.n("User"), list), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r2);
        aa.m mVar4 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        aa.q0 q0Var = w80.W;
        List r4 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("nodes", v8.l0.a(q0Var), (String) null, rVar, rVar, r3)});
        c90.Companion.getClass();
        aa.r b3 = v8.l0.b(c90.a);
        pz0.i1.Companion.getClass();
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("RepositoryNode", x61.l.r(new String[]{"CommitComment", "CommitCommentThread", "DependabotUpdate", "Discussion", "DiscussionCategory", "Issue", "IssueComment", "PinnedDiscussion", "PullRequest", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryVulnerabilityAlert"}), n2), new aa.n("Assignable", x61.l.r(new String[]{"Issue", "PullRequest"}), sy.d0Shadow.n(new aa.m("suggestedAssignees", b3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pz0.i1.b, new aa.u0(new aa.t("after"))), new aa.k(pz0.i1.c, new aa.u0(50)), new aa.k(pz0.i1.d, new aa.u0(new aa.t("query")))}), r4)))});
        aa.m mVar5 = new aa.m("viewer", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        wk.Companion.getClass();
        aa.j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar5, new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new aa.u0(new aa.t("assignableId"))), r5), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
