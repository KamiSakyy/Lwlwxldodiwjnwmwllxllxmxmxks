package dq;

import aa.u0;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.fd;
import m10.gh;
import m10.i30;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
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
        cc0.Companion.getClass();
        aa.s mVar4 = new aa.m("url", v8.l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        aa.r b2 = v8.l0.b(gh.a);
        fd.Companion.getClass();
        a81.t tVar = fd.a;
        Boolean bool = Boolean.TRUE;
        aa.k kVar = new aa.k(tVar, new u0(bool));
        aa.k kVar2 = new aa.k(fd.b, new u0(bool));
        a81.t tVar2 = fd.c;
        Boolean bool2 = Boolean.FALSE;
        aa.s mVar6 = new aa.m("bodyHTML", b2, (String) null, rVar, x61.l.r(new aa.k[]{kVar, kVar2, new aa.k(tVar2, new u0(bool2)), new aa.k(fd.d, new u0(bool2)), new aa.k(fd.e, new u0(bool))}), rVar);
        aa.s mVar7 = new aa.m("bodyText", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.s mVar8 = new aa.m("number", v8.l0.b(ch.a), (String) null, rVar, rVar, rVar);
        List r2 = x61.l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list2 = qv.a.a;
        aa.s c2 = no.a.c(list2, "selections", "Reactable", r2, list2);
        i30.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, c2, new aa.m("repository", v8.l0.b(i30.w0), (String) null, rVar, rVar, r)});
    }
}
