package bp0;

import aa.u0;
import java.util.List;
import pz0.ba;
import pz0.h50;
import pz0.jx;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.zd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = a0.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.s mVar4 = new aa.m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        aa.r b2 = l0.b(zd.a);
        ba.Companion.getClass();
        a81.t tVar = ba.a;
        Boolean bool = Boolean.TRUE;
        aa.k kVar = new aa.k(tVar, new u0(bool));
        aa.k kVar2 = new aa.k(ba.b, new u0(bool));
        a81.t tVar2 = ba.c;
        Boolean bool2 = Boolean.FALSE;
        aa.s mVar6 = new aa.m("bodyHTML", b2, (String) null, rVar, x61.l.r(new aa.k[]{kVar, kVar2, new aa.k(tVar2, new u0(bool2)), new aa.k(ba.d, new u0(bool2)), new aa.k(ba.e, new u0(bool))}), rVar);
        aa.s mVar7 = new aa.m("bodyText", l0.b(xVar), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.s mVar8 = new aa.m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        List r2 = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = hu0.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Reactable", r2, list2);
        jx.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, c2, new aa.m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r)});
    }
}
