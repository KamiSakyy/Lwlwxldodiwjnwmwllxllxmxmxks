package ps0;

import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import pz0.bf;
import pz0.df;
import pz0.gu;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.xe;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar3 = vd.a;
        m mVar4 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bf.Companion.getClass();
        m mVar6 = new m("state", l0.b(bf.s), "issueState", rVar, rVar, rVar);
        df.Companion.getClass();
        a0 a0Var = df.s;
        k.g(a0Var, "type");
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar)});
        m mVar7 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        gu.Companion.getClass();
        m mVar11 = new m("state", l0.b(gu.s), "pullRequestState", rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar4 = pd.a;
        List r4 = l.r(new m[]{mVar7, mVar8, mVar9, mVar10, mVar11, new m("isInMergeQueue", l0.b(xVar4), (String) null, rVar, rVar, rVar), new m("isDraft", l0.b(xVar4), (String) null, rVar, rVar, rVar)});
        s mVar12 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r5 = l.r(new String[]{"CommitComment", "CommitCommentThread", "DependabotUpdate", "Discussion", "DiscussionCategory", "Issue", "IssueComment", "PinnedDiscussion", "PullRequest", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryVulnerabilityAlert"});
        List list2 = yu0.a.a;
        List r6 = l.r(new s[]{mVar12, no.a.c(list2, "selections", "RepositoryNode", r5, list2), new n("Issue", d0.n("Issue"), r3), new n("PullRequest", d0.n("PullRequest"), r4)});
        m mVar13 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar14 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        m mVar15 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        o7.Companion.getClass();
        m mVar16 = new m("createdAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        m mVar17 = new m("isCrossRepository", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        xe.Companion.getClass();
        x0 x0Var = xe.a;
        k.g(x0Var, "type");
        a = l.r(new m[]{mVar13, mVar14, mVar15, mVar16, mVar17, new m("canonical", x0Var, (String) null, rVar, rVar, r6)});
    }
}
