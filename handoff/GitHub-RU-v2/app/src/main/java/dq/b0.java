package dq;

import java.util.List;
import m10.ah;
import m10.b00;
import m10.ch;
import m10.eh;
import m10.gh;
import m10.i30;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Repository");
        List list = h0.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        aa.s mVar5 = new aa.m("bodyHTML", v8.l0.b(gh.a), (String) null, rVar, rVar, rVar);
        aa.s mVar6 = new aa.m("bodyText", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r2 = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list2 = qv.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Reactable", r2, list2);
        aa.s mVar7 = new aa.m("baseRefName", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("headRefName", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        b00.Companion.getClass();
        aa.s mVar9 = new aa.m("state", v8.l0.b(b00.s), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.s mVar10 = new aa.m("isDraft", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.s mVar11 = new aa.m("number", v8.l0.b(ch.a), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar2, mVar3, mVar4, mVar5, mVar6, c2, mVar7, mVar8, mVar9, mVar10, mVar11, new aa.m("repository", v8.l0.b(i30.w0), (String) null, rVar, rVar, r)});
    }
}
