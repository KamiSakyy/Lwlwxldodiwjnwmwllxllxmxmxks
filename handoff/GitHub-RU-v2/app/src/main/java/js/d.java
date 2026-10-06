package js;

import a81.t;
import aa.a0;
import aa.k;
import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.gh;
import m10.i30;
import m10.l40;
import m10.wg;
import m10.ya0;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        ah.Companion.getClass();
        x xVar2 = ah.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r3 = l.r(new m[]{mVar2, new m("owner", l0.b(l40.e), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar4 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        s mVar5 = new m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r3);
        List n = d0Shadow.n("Discussion");
        List list2 = e.a;
        s c = no.a.c(list2, "selections", "Discussion", n, list2);
        gh.Companion.getClass();
        r b2 = l0.b(gh.a);
        fd.Companion.getClass();
        t tVar = fd.a;
        Boolean bool = Boolean.TRUE;
        k kVar = new k(tVar, new u0(bool));
        k kVar2 = new k(fd.b, new u0(bool));
        t tVar2 = fd.c;
        Boolean bool2 = Boolean.FALSE;
        s mVar6 = new m("bodyHTML", b2, (String) null, rVar, l.r(new k[]{kVar, kVar2, new k(tVar2, new u0(bool2)), new k(fd.d, new u0(bool2)), new k(fd.e, new u0(bool))}), rVar);
        s mVar7 = new m("body", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list3 = qv.a.a;
        s c2 = no.a.c(list3, "selections", "Reactable", r4, list3);
        List r5 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment"});
        List list4 = qu.a.a;
        s c3 = no.a.c(list4, "selections", "OrgBlockable", r5, list4);
        ya0.Companion.getClass();
        a0 a0Var = ya0.s;
        k71.k.g(a0Var, "type");
        s mVar8 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        a = l.r(new s[]{mVar3, mVar4, mVar5, c, mVar6, mVar7, c2, c3, mVar8, new m("locked", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanDelete", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanUpdate", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerCanUpvote", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
