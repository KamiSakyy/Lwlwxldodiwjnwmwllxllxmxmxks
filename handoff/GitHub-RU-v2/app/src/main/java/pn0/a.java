package pn0;

import aa.m;
import aa.n;
import aa.q0;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import pz0.b;
import pz0.d;
import pz0.d60;
import pz0.f;
import pz0.h50;
import pz0.hm;
import pz0.j;
import pz0.o7;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("endCursor", xVar, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar2 = pd.a;
        List r = l.r(new m[]{mVar, new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        td.Companion.getClass();
        x xVar3 = td.a;
        m mVar2 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        x xVar4 = h50.a;
        List r3 = l.r(new m[]{mVar2, new m("highResolutionBadgeImageUrl", l0.b(xVar4), (String) null, rVar, rVar, rVar), new m("backgroundColor", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"AchievementRepositoryList", "CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = nn0.a.a;
        List r5 = l.r(new s[]{mVar3, no.a.c(list, "selections", "UnlockingModel", r4, list)});
        d60.Companion.getClass();
        x0 x0Var = d60.a;
        k.g(x0Var, "type");
        m mVar4 = new m("unlockingModel", x0Var, (String) null, rVar, rVar, r5);
        aa.r b = l0.b(xVar);
        j.Companion.getClass();
        List r6 = l.r(new m[]{mVar4, new m("localizedUnlockingExplanation", b, (String) null, rVar, no.a.s(j.a, new u0("EN")), rVar), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.r b2 = l0.b(xVar);
        d.Companion.getClass();
        m mVar6 = new m("localizedDescription", b2, (String) null, rVar, no.a.s(d.a, new u0("EN")), rVar);
        o7.Companion.getClass();
        m mVar7 = new m("unlockedAt", l0.b(o7.a), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("url", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        b.Companion.getClass();
        m mVar9 = new m("achievable", l0.b(b.a), (String) null, rVar, rVar, r2);
        q0 q0Var = j.b;
        k.g(q0Var, "type");
        List r7 = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, new m("tier", q0Var, (String) null, rVar, no.a.s(d.b, new u0(1)), r3), new m("tiers", no.a.d(q0Var), (String) null, rVar, rVar, r6), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        m mVar10 = new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        hm.Companion.getClass();
        List r8 = l.r(new m[]{mVar10, new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r), new m("nodes", l0.a(d.c), (String) null, rVar, rVar, r7)});
        f.Companion.getClass();
        aa.r b3 = l0.b(f.a);
        w80.Companion.getClass();
        List r9 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("User", d0.n("User"), d0.n(new m("achievements", b3, (String) null, rVar, l.r(new aa.k[]{new aa.k(w80.a, new u0(new t("after"))), new aa.k(w80.b, new u0(new t("first")))}), r8))), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        q0 q0Var2 = w80.W;
        k.g(q0Var2, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("user", q0Var2, (String) null, rVar, no.a.s(su.y, new u0(new t("login"))), r9), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
