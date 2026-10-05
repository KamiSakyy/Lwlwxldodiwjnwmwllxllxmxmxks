package zp0;

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
import pz0.m4;
import pz0.o4;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.xd;
import pz0.zd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
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
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Actor", l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"}), list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        s mVar3 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        pz0.l.Companion.getClass();
        j0 j0Var = pz0.l.a;
        k.g(j0Var, "type");
        s mVar4 = new m("author", j0Var, (String) null, rVar, rVar, r2);
        s mVar5 = new m("editor", j0Var, (String) null, rVar, rVar, r3);
        o7.Companion.getClass();
        x xVar2 = o7.a;
        k.g(xVar2, "type");
        s mVar6 = new m("lastEditedAt", xVar2, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        s mVar7 = new m("includesCreatedEdit", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        r b2 = l0.b(zd.a);
        m4.Companion.getClass();
        t tVar = m4.a;
        Boolean bool = Boolean.TRUE;
        aa.k kVar = new aa.k(tVar, new u0(bool));
        aa.k kVar2 = new aa.k(m4.b, new u0(bool));
        t tVar2 = m4.c;
        Boolean bool2 = Boolean.FALSE;
        s mVar8 = new m("bodyHTML", b2, (String) null, rVar, l.r(new aa.k[]{kVar, kVar2, new aa.k(tVar2, new u0(bool2)), new aa.k(m4.d, new u0(bool2)), new aa.k(m4.e, new u0(bool))}), rVar);
        s mVar9 = new m("body", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar10 = new m("createdAt", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar11 = new m("viewerDidAuthor", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        o4.Companion.getClass();
        s mVar12 = new m("authorAssociation", l0.b(o4.s), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "Project", "ProjectNext", "ProjectV2", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = cw0.a.a;
        a = l.r(new s[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, no.a.c(list2, "selections", "Updatable", r4, list2)});
    }
}
