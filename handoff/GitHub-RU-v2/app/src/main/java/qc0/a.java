package qc0;

import aa.m;
import aa.n;
import aa.q0;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import gn0.b;
import gn0.d;
import gn0.f;
import gn0.hy;
import gn0.j;
import gn0.jj;
import gn0.lb;
import gn0.mx;
import gn0.pb;
import gn0.r6;
import gn0.rb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        m mVar = new m("endCursor", xVar, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar2 = lb.a;
        List r = l.r(new m[]{mVar, new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        pb.Companion.getClass();
        x xVar3 = pb.a;
        m mVar2 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        x xVar4 = mx.a;
        List r3 = l.r(new m[]{mVar2, new m("highResolutionBadgeImageUrl", l0.b(xVar4), (String) null, rVar, rVar, rVar), new m("backgroundColor", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"AchievementRepositoryList", "CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = oc0.a.a;
        List r5 = l.r(new s[]{mVar3, no.a.c(list, "selections", "UnlockingModel", r4, list)});
        hy.Companion.getClass();
        x0 x0Var = hy.a;
        k.g(x0Var, "type");
        m mVar4 = new m("unlockingModel", x0Var, (String) null, rVar, rVar, r5);
        aa.rShadow b = l0.b(xVar);
        j.Companion.getClass();
        List r6 = l.r(new m[]{mVar4, new m("localizedUnlockingExplanation", b, (String) null, rVar, no.a.s(j.a, new u0("EN")), rVar), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.rShadow b2 = l0.b(xVar);
        d.Companion.getClass();
        m mVar6 = new m("localizedDescription", b2, (String) null, rVar, no.a.s(d.a, new u0("EN")), rVar);
        r6.Companion.getClass();
        m mVar7 = new m("unlockedAt", l0.b(r6.a), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("url", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        b.Companion.getClass();
        m mVar9 = new m("achievable", l0.b(b.a), (String) null, rVar, rVar, r2);
        q0 q0Var = j.b;
        k.g(q0Var, "type");
        List r7 = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, new m("tier", q0Var, (String) null, rVar, no.a.s(d.b, new u0(1)), r3), new m("tiers", no.a.d(q0Var), (String) null, rVar, rVar, r6), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        m mVar10 = new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        jj.Companion.getClass();
        List r8 = l.r(new m[]{mVar10, new m("pageInfo", l0.b(jj.a), (String) null, rVar, rVar, r), new m("nodes", l0.a(d.c), (String) null, rVar, rVar, r7)});
        f.Companion.getClass();
        aa.rShadow b3 = l0.b(f.a);
        s00.Companion.getClass();
        List r9 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("User", d0Shadow.n("User"), d0Shadow.n(new m("achievements", b3, (String) null, rVar, l.r(new aa.k[]{new aa.k(s00.a, new u0(new t("after"))), new aa.k(s00.b, new u0(new t("first")))}), r8))), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        q0 q0Var2 = s00.P;
        k.g(q0Var2, "type");
        rn.Companion.getClass();
        a = d0Shadow.n(new m("user", q0Var2, (String) null, rVar, no.a.s(rn.y, new u0(new t("login"))), r9));
    }
}
