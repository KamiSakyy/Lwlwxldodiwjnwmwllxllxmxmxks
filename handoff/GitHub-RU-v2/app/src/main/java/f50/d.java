package f50;

import a81.t;
import aa.a0;
import aa.k;
import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.dq;
import hc0.ev;
import hc0.fb;
import hc0.hb;
import hc0.o8;
import hc0.xa;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
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
        bb.Companion.getClass();
        x xVar2 = bb.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        dq.Companion.getClass();
        List r3 = l.r(new m[]{mVar2, new m("owner", l0.b(dq.a), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ap.Companion.getClass();
        s mVar5 = new m("repository", l0.b(ap.k0), (String) null, rVar, rVar, r3);
        List n = d0Shadow.n("Discussion");
        List list2 = e.a;
        s c = no.a.c(list2, "selections", "Discussion", n, list2);
        hb.Companion.getClass();
        r b2 = l0.b(hb.a);
        o8.Companion.getClass();
        t tVar = o8.a;
        Boolean bool = Boolean.TRUE;
        k kVar = new k(tVar, new u0(bool));
        k kVar2 = new k(o8.b, new u0(bool));
        t tVar2 = o8.c;
        Boolean bool2 = Boolean.FALSE;
        s mVar6 = new m("bodyHTML", b2, (String) null, rVar, l.r(new k[]{kVar, kVar2, new k(tVar2, new u0(bool2)), new k(o8.d, new u0(bool2)), new k(o8.e, new u0(bool))}), rVar);
        s mVar7 = new m("body", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list3 = j80.a.a;
        s c2 = no.a.c(list3, "selections", "Reactable", r4, list3);
        List r5 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment"});
        List list4 = h70.a.a;
        s c3 = no.a.c(list4, "selections", "OrgBlockable", r5, list4);
        ev.Companion.getClass();
        a0 a0Var = ev.s;
        k71.k.g(a0Var, "type");
        s mVar8 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar3 = xa.a;
        a = l.r(new s[]{mVar3, mVar4, mVar5, c, mVar6, mVar7, c2, c3, mVar8, new m("locked", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanDelete", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanUpdate", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanUpvote", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
