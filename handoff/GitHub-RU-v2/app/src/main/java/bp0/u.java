package bp0;

import java.util.List;
import pz0.gu;
import pz0.jx;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.zd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = a0.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        aa.s mVar5 = new aa.m("bodyHTML", l0.b(zd.a), (String) null, rVar, rVar, rVar);
        aa.s mVar6 = new aa.m("bodyText", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r2 = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = hu0.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Reactable", r2, list2);
        aa.s mVar7 = new aa.m("baseRefName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("headRefName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        gu.Companion.getClass();
        aa.s mVar9 = new aa.m("state", l0.b(gu.s), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.s mVar10 = new aa.m("isDraft", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.s mVar11 = new aa.m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar2, mVar3, mVar4, mVar5, mVar6, c2, mVar7, mVar8, mVar9, mVar10, mVar11, new aa.m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r)});
    }
}
