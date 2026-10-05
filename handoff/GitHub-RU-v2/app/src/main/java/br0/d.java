package br0;

import a81.t;
import aa.a0;
import aa.k;
import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.ba;
import pz0.f40;
import pz0.jx;
import pz0.ny;
import pz0.pd;
import pz0.td;
import pz0.xd;
import pz0.zd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
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
        td.Companion.getClass();
        x xVar2 = td.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        List r3 = l.r(new m[]{mVar2, new m("owner", l0.b(ny.e), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        s mVar5 = new m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r3);
        List n = d0.n("Discussion");
        List list2 = e.a;
        s c = no.a.c(list2, "selections", "Discussion", n, list2);
        zd.Companion.getClass();
        r b2 = l0.b(zd.a);
        ba.Companion.getClass();
        t tVar = ba.a;
        Boolean bool = Boolean.TRUE;
        k kVar = new k(tVar, new u0(bool));
        k kVar2 = new k(ba.b, new u0(bool));
        t tVar2 = ba.c;
        Boolean bool2 = Boolean.FALSE;
        s mVar6 = new m("bodyHTML", b2, (String) null, rVar, l.r(new k[]{kVar, kVar2, new k(tVar2, new u0(bool2)), new k(ba.d, new u0(bool2)), new k(ba.e, new u0(bool))}), rVar);
        s mVar7 = new m("body", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list3 = hu0.a.a;
        s c2 = no.a.c(list3, "selections", "Reactable", r4, list3);
        List r5 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment"});
        List list4 = ht0.a.a;
        s c3 = no.a.c(list4, "selections", "OrgBlockable", r5, list4);
        f40.Companion.getClass();
        a0 a0Var = f40.s;
        k71.k.g(a0Var, "type");
        s mVar8 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        a = l.r(new s[]{mVar3, mVar4, mVar5, c, mVar6, mVar7, c2, c3, mVar8, new m("locked", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanDelete", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanUpdate", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanUpvote", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
