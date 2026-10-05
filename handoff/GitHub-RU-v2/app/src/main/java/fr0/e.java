package fr0;

import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.hm;
import pz0.ja;
import pz0.la;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        pd.Companion.getClass();
        x xVar = pd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, mVar2, new m("startCursor", xVar2, (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("DiscussionComment");
        List list = d.a;
        s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        td.Companion.getClass();
        x xVar3 = td.a;
        List r2 = l.r(new s[]{mVar3, c, new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        m mVar4 = new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r);
        vd.Companion.getClass();
        m mVar5 = new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        ja.Companion.getClass();
        List r3 = l.r(new m[]{mVar4, mVar5, new m("nodes", l0.a(ja.c), (String) null, rVar, rVar, r2)});
        s mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar7 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("DiscussionComment");
        List list2 = b.a;
        s c2 = no.a.c(list2, "selections", "DiscussionComment", n2, list2);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list3 = hu0.a.a;
        s c3 = no.a.c(list3, "selections", "Reactable", r4, list3);
        la.Companion.getClass();
        a = l.r(new s[]{mVar6, mVar7, c2, c3, new m("replies", l0.b(la.a), (String) null, rVar, l.r(new aa.k[]{new aa.k(ja.a, new u0(new t("before"))), new aa.k(ja.b, new u0(new t("numberOfReplies")))}), r3)});
    }
}
