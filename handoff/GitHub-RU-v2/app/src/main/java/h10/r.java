package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.mr;
import m10.p00;
import m10.rf0;
import m10.wg;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = rx.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.x xVar3 = ch.a;
        aa.r b2 = v8.l0.b(xVar3);
        i30.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("repository", v8.l0.b(i30.w0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar2, new aa.m("planLimit", b2, (String) null, rVar, no.a.s(i30.J, new aa.u0("ISSUE_PR_ASSIGNEES")), rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        wg.Companion.getClass();
        aa.x xVar4 = wg.a;
        List r2 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar4), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("displayName", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar6 = new aa.m("isCopilot", v8.l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("isAgent", v8.l0.b(xVar4), (String) null, rVar, rVar, rVar);
        List r3 = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list2 = fq.b.a;
        List r4 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0.n("User"), list), new aa.n("Bot", sy.d0.n("Bot"), x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, no.a.c(list2, "selections", "Actor", r3, list2)})), new aa.n("Mannequin", sy.d0.n("Mannequin"), sy.d0.n(new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar))), new aa.n("Organization", sy.d0.n("Organization"), sy.d0.n(new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)))});
        mr.Companion.getClass();
        aa.m mVar9 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r2);
        aa.m mVar10 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m10.x1.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar9, mVar10, new aa.m("nodes", v8.l0.a(m10.x1.a), (String) null, rVar, rVar, r4)});
        m10.z1.Companion.getClass();
        aa.r b3 = v8.l0.b(m10.z1.a);
        m10.t1.Companion.getClass();
        List r6 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("RepositoryNode", x61.l.r(new String[]{"CommitComment", "CommitCommentThread", "DependabotUpdate", "Discussion", "DiscussionCategory", "Issue", "IssueComment", "PinnedDiscussion", "PullRequest", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryVulnerabilityAlert"}), n2), new aa.n("Assignable", x61.l.r(new String[]{"Issue", "PullRequest"}), sy.d0.n(new aa.m("suggestedActors", b3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(m10.t1.b, new aa.u0(new aa.t("after"))), new aa.k(m10.t1.c, new aa.u0(50)), new aa.k(m10.t1.d, new aa.u0(new aa.t("query")))}), r5)))});
        rf0.Companion.getClass();
        aa.m mVar11 = new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r);
        zp.Companion.getClass();
        aa.j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar11, new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("assignableId"))), r6), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
