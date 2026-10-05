package ns;

import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.mr;
import m10.nd;
import m10.pd;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, mVar2, new m("startCursor", xVar2, (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("DiscussionComment");
        List list = d.a;
        s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        ah.Companion.getClass();
        x xVar3 = ah.a;
        List r2 = l.r(new s[]{mVar3, c, new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        m mVar4 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        ch.Companion.getClass();
        m mVar5 = new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        nd.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, new m("nodes", l0.a(nd.c), (String) null, rVar, rVar, r2)});
        s mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar7 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("DiscussionComment");
        List list2 = b.a;
        s c2 = no.a.c(list2, "selections", "DiscussionComment", n2, list2);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list3 = qv.a.a;
        s c3 = no.a.c(list3, "selections", "Reactable", r4, list3);
        pd.Companion.getClass();
        a = l.r(new s[]{mVar6, mVar7, c2, c3, new m("replies", l0.b(pd.a), (String) null, rVar, l.r(new aa.k[]{new aa.k(nd.a, new u0(new t("before"))), new aa.k(nd.b, new u0(new t("numberOfReplies")))}), r3)});
    }
}
