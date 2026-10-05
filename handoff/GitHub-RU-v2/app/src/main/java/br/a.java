package br;

import a81.t;
import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.gh;
import m10.n5;
import m10.p5;
import m10.sa;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        s mVar3 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        s mVar4 = new m("author", j0Var, (String) null, rVar, rVar, r2);
        s mVar5 = new m("editor", j0Var, (String) null, rVar, rVar, r3);
        sa.Companion.getClass();
        x xVar2 = sa.a;
        k.g(xVar2, "type");
        s mVar6 = new m("lastEditedAt", xVar2, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        s mVar7 = new m("includesCreatedEdit", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        r b2 = l0.b(gh.a);
        n5.Companion.getClass();
        t tVar = n5.a;
        Boolean bool = Boolean.TRUE;
        aa.k kVar = new aa.k(tVar, new u0(bool));
        aa.k kVar2 = new aa.k(n5.b, new u0(bool));
        t tVar2 = n5.c;
        Boolean bool2 = Boolean.FALSE;
        s mVar8 = new m("bodyHTML", b2, (String) null, rVar, l.r(new aa.k[]{kVar, kVar2, new aa.k(tVar2, new u0(bool2)), new aa.k(n5.d, new u0(bool2)), new aa.k(n5.e, new u0(bool))}), rVar);
        s mVar9 = new m("body", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar10 = new m("createdAt", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar11 = new m("viewerDidAuthor", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        p5.Companion.getClass();
        s mVar12 = new m("authorAssociation", l0.b(p5.s), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "Project", "ProjectV2", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment"});
        List list2 = nx.a.a;
        a = l.r(new s[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, no.a.c(list2, "selections", "Updatable", r4, list2)});
    }
}
