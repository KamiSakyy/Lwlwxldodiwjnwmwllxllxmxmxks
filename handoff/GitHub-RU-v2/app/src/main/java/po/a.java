package po;

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
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.d;
import m10.eh;
import m10.f;
import m10.j;
import m10.mr;
import m10.p00;
import m10.rf0;
import m10.sa;
import m10.wg;
import m10.yc0;
import no.b;
import sy.d0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("endCursor", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar2 = wg.a;
        List r = l.r(new m[]{mVar, new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        x xVar3 = ah.a;
        m mVar2 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        x xVar4 = cc0.a;
        List r3 = l.r(new m[]{mVar2, new m("highResolutionBadgeImageUrl", l0.b(xVar4), (String) null, rVar, rVar, rVar), new m("backgroundColor", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r4 = l.r(new String[]{"AchievementRepositoryList", "CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "Repository", "RepositoryAdvisory", "RepositoryAdvisoryComment", "Sponsorship", "TeamDiscussion", "TeamDiscussionComment"});
        List list = b.a;
        List r5 = l.r(new s[]{mVar3, no.a.c(list, "selections", "UnlockingModel", r4, list)});
        yc0.Companion.getClass();
        x0 x0Var = yc0.a;
        k.g(x0Var, "type");
        m mVar4 = new m("unlockingModel", x0Var, (String) null, rVar, rVar, r5);
        aa.r b = l0.b(xVar);
        j.Companion.getClass();
        List r6 = l.r(new m[]{mVar4, new m("localizedUnlockingExplanation", b, (String) null, rVar, no.a.s(j.a, new u0("EN")), rVar), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.r b2 = l0.b(xVar);
        d.Companion.getClass();
        m mVar6 = new m("localizedDescription", b2, (String) null, rVar, no.a.s(d.a, new u0("EN")), rVar);
        sa.Companion.getClass();
        m mVar7 = new m("unlockedAt", l0.b(sa.a), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("url", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m10.b.Companion.getClass();
        m mVar9 = new m("achievable", l0.b(m10.b.a), (String) null, rVar, rVar, r2);
        q0 q0Var = j.b;
        k.g(q0Var, "type");
        List r7 = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, mVar9, new m("tier", q0Var, (String) null, rVar, no.a.s(d.b, new u0(1)), r3), new m("tiers", no.a.d(q0Var), (String) null, rVar, rVar, r6), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        m mVar10 = new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        mr.Companion.getClass();
        List r8 = l.r(new m[]{mVar10, new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r), new m("nodes", l0.a(d.c), (String) null, rVar, rVar, r7)});
        f.Companion.getClass();
        aa.r b3 = l0.b(f.a);
        rf0.Companion.getClass();
        List r9 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("User", d0.n("User"), d0.n(new m("achievements", b3, (String) null, rVar, l.r(new aa.k[]{new aa.k(rf0.a, new u0(new t("after"))), new aa.k(rf0.b, new u0(new t("first")))}), r8))), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        q0 q0Var2 = rf0.g0;
        k.g(q0Var2, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("user", q0Var2, (String) null, rVar, no.a.s(p00.E, new u0(new t("login"))), r9), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
