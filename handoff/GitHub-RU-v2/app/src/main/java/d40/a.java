package d40;

import a81.t;
import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.h6;
import hc0.hb;
import hc0.n3;
import hc0.p3;
import hc0.xa;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
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
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        s mVar3 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        hc0.l.Companion.getClass();
        j0 j0Var = hc0.l.a;
        k.g(j0Var, "type");
        s mVar4 = new m("author", j0Var, (String) null, rVar, rVar, r2);
        s mVar5 = new m("editor", j0Var, (String) null, rVar, rVar, r3);
        h6.Companion.getClass();
        x xVar2 = h6.a;
        k.g(xVar2, "type");
        s mVar6 = new m("lastEditedAt", xVar2, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar3 = xa.a;
        s mVar7 = new m("includesCreatedEdit", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        r b2 = l0.b(hb.a);
        n3.Companion.getClass();
        t tVar = n3.a;
        Boolean bool = Boolean.TRUE;
        aa.k kVar = new aa.k(tVar, new u0(bool));
        aa.k kVar2 = new aa.k(n3.b, new u0(bool));
        t tVar2 = n3.c;
        Boolean bool2 = Boolean.FALSE;
        s mVar8 = new m("bodyHTML", b2, (String) null, rVar, l.r(new aa.k[]{kVar, kVar2, new aa.k(tVar2, new u0(bool2)), new aa.k(n3.d, new u0(bool2)), new aa.k(n3.e, new u0(bool))}), rVar);
        s mVar9 = new m("body", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar10 = new m("createdAt", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar11 = new m("viewerDidAuthor", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        p3.Companion.getClass();
        s mVar12 = new m("authorAssociation", l0.b(p3.s), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "Project", "ProjectNext", "ProjectV2", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = ba0.a.a;
        a = l.r(new s[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, no.a.c(list2, "selections", "Updatable", r4, list2)});
    }
}
