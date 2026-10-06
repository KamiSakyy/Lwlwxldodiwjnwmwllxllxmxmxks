package p60;

import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import aa.x0;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.fc;
import hc0.fm;
import hc0.h6;
import hc0.jc;
import hc0.lc;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        x xVar3 = db.a;
        m mVar4 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        jc.Companion.getClass();
        m mVar6 = new m("state", l0.b(jc.s), "issueState", rVar, rVar, rVar);
        lc.Companion.getClass();
        a0 a0Var = lc.s;
        k.g(a0Var, "type");
        List r3 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar)});
        m mVar7 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar9 = new m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fm.Companion.getClass();
        m mVar11 = new m("state", l0.b(fm.s), "pullRequestState", rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar4 = xa.a;
        List r4 = l.r(new m[]{mVar7, mVar8, mVar9, mVar10, mVar11, new m("isDraft", l0.b(xVar4), (String) null, rVar, rVar, rVar)});
        s mVar12 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r5 = l.r(new String[]{"CommitComment", "CommitCommentThread", "DependabotUpdate", "Discussion", "DiscussionCategory", "Issue", "IssueComment", "PinnedDiscussion", "PullRequest", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryVulnerabilityAlert"});
        List list2 = z80.a.a;
        List r6 = l.r(new s[]{mVar12, no.a.c(list2, "selections", "RepositoryNode", r5, list2), new n("Issue", d0Shadow.n("Issue"), r3), new n("PullRequest", d0Shadow.n("PullRequest"), r4)});
        m mVar13 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar14 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        j0 j0Var = hc0.l.a;
        k.g(j0Var, "type");
        m mVar15 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        h6.Companion.getClass();
        m mVar16 = new m("createdAt", l0.b(h6.a), (String) null, rVar, rVar, rVar);
        m mVar17 = new m("isCrossRepository", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        fc.Companion.getClass();
        x0 x0Var = fc.a;
        k.g(x0Var, "type");
        a = l.r(new m[]{mVar13, mVar14, mVar15, mVar16, mVar17, new m("canonical", x0Var, (String) null, rVar, rVar, r6)});
    }
}
