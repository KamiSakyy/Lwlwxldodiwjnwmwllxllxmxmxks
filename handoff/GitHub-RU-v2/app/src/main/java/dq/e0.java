package dq;

import aa.q0;
import aa.u0;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.fd;
import m10.gh;
import m10.i30;
import m10.rf0;
import m10.x10;
import m10.xf0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.x xVar3 = cc0.a;
        aa.s mVar3 = new aa.m("url", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        ch.Companion.getClass();
        aa.m mVar4 = new aa.m("totalCount", v8.l0.b(ch.a), (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("nodes", v8.l0.a(rf0.g0), (String) null, rVar, rVar, r2)});
        aa.s mVar5 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list2 = h0.a;
        List r4 = x61.l.r(new aa.s[]{mVar5, no.a.c(list2, "selections", "Repository", n, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("url", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar6 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("url", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar9 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        aa.x xVar4 = gh.a;
        k71.k.g(xVar4, "type");
        aa.s mVar10 = new aa.m("shortDescriptionHTML", xVar4, (String) null, rVar, rVar, rVar);
        aa.s mVar11 = new aa.m("tagName", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        xf0.Companion.getClass();
        q0 q0Var = xf0.a;
        k71.k.g(q0Var, "type");
        x10.Companion.getClass();
        aa.s mVar12 = new aa.m("mentions", q0Var, (String) null, rVar, no.a.s(x10.b, new u0(10)), r3);
        List r6 = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list3 = qv.a.a;
        aa.s c = no.a.c(list3, "selections", "Reactable", r6, list3);
        i30.Companion.getClass();
        aa.s mVar13 = new aa.m("repository", v8.l0.b(i30.w0), (String) null, rVar, rVar, r4);
        fd.Companion.getClass();
        q0 q0Var2 = fd.l;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.s[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, c, mVar13, new aa.m("discussion", q0Var2, (String) null, rVar, rVar, r5)});
    }
}
