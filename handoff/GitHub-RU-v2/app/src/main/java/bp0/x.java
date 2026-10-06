package bp0;

import aa.q0;
import aa.u0;
import java.util.List;
import pz0.aw;
import pz0.ba;
import pz0.c90;
import pz0.h50;
import pz0.jx;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import pz0.zd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        aa.s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.x xVar3 = h50.a;
        aa.s mVar3 = new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        vd.Companion.getClass();
        aa.m mVar4 = new aa.m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("nodes", l0.a(w80.W), (String) null, rVar, rVar, r2)});
        aa.s mVar5 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list2 = a0.a;
        List r4 = x61.l.r(new aa.s[]{mVar5, no.a.c(list2, "selections", "Repository", n, list2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar6 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar9 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        aa.x xVar4 = zd.a;
        k71.k.g(xVar4, "type");
        aa.s mVar10 = new aa.m("shortDescriptionHTML", xVar4, (String) null, rVar, rVar, rVar);
        aa.s mVar11 = new aa.m("tagName", l0.b(xVar), (String) null, rVar, rVar, rVar);
        c90.Companion.getClass();
        q0 q0Var = c90.a;
        k71.k.g(q0Var, "type");
        aw.Companion.getClass();
        aa.s mVar12 = new aa.m("mentions", q0Var, (String) null, rVar, no.a.s(aw.b, new u0(10)), r3);
        List r6 = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list3 = hu0.a.a;
        aa.s c = no.a.c(list3, "selections", "Reactable", r6, list3);
        jx.Companion.getClass();
        aa.s mVar13 = new aa.m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r4);
        ba.Companion.getClass();
        q0 q0Var2 = ba.l;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.s[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, c, mVar13, new aa.m("discussion", q0Var2, (String) null, rVar, rVar, r5)});
    }
}
