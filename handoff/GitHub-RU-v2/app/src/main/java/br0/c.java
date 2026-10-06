package br0;

import aa.k;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.ba;
import pz0.hm;
import pz0.ja;
import pz0.la;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PageInfo");
        List list = ot0.a.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "PageInfo", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("DiscussionComment");
        List list2 = fr0.b.a;
        s c = no.a.c(list2, "selections", "DiscussionComment", n2, list2);
        List r2 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list3 = hu0.a.a;
        s c2 = no.a.c(list3, "selections", "Reactable", r2, list3);
        List n3 = d0Shadow.n("DiscussionComment");
        List list4 = fr0.c.a;
        s c3 = no.a.c(list4, "selections", "DiscussionComment", n3, list4);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r3 = l.r(new s[]{mVar2, c, c2, c3, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r);
        ja.Companion.getClass();
        List r4 = l.r(new m[]{mVar3, new m("nodes", l0.a(ja.c), (String) null, rVar, rVar, r3)});
        s mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        la.Companion.getClass();
        r b2 = l0.b(la.a);
        ba.Companion.getClass();
        a = l.r(new s[]{mVar4, mVar5, new m("comments", b2, (String) null, rVar, l.r(new k[]{new k(ba.g, new u0(new t("before"))), new k(ba.h, new u0(new t("number")))}), r4), new n("Reactable", l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"}), list3)});
    }
}
