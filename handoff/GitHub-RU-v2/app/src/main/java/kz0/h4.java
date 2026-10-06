package kz0;

import java.util.List;
import pz0.hs;
import pz0.iu;
import pz0.jx;
import pz0.mv;
import pz0.o7;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.xs;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h4 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequest");
        List list = yt0.h.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hs.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(hs.N), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xs.Companion.getClass();
        aa.r b2 = v8.l0.b(xs.a);
        mv.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("associatedPullRequests", b2, "activePullRequests", rVar, x61.l.r(new aa.k[]{new aa.k(mv.a, new aa.u0(new aa.t("baseRefName"))), new aa.k(mv.b, new aa.u0(new aa.t("last"))), new aa.k(mv.c, new aa.u0(sy.d0Shadow.n("OPEN")))}), n2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("message", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("committedDate", v8.l0.b(o7.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        aa.x xVar3 = vd.a;
        aa.m mVar5 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        pz0.s4.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("nodes", v8.l0.a(pz0.s4.j), (String) null, rVar, rVar, r3)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("additions", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("deletions", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar9 = new aa.m("changedFiles", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        pz0.e5.Companion.getClass();
        aa.r b3 = v8.l0.b(pz0.e5.a);
        pz0.c5.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, mVar9, new aa.m("commits", b3, "latestCommit", rVar, x61.l.r(new aa.k[]{new aa.k(pz0.c5.a, new aa.u0((Object) null)), new aa.k(pz0.c5.c, new aa.u0(1))}), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar10 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = pz0.c5.d;
        k71.k.g(q0Var, "type");
        List r6 = x61.l.r(new aa.m[]{mVar10, new aa.m("compare", q0Var, (String) null, rVar, no.a.s(mv.d, new aa.u0(new aa.t("headRefName"))), r5), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r7 = x61.l.r(new aa.m[]{new aa.m("filename", xVar, (String) null, rVar, rVar, rVar), new aa.m("body", xVar, (String) null, rVar, rVar, rVar)});
        aa.m mVar11 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = mv.e;
        k71.k.g(q0Var2, "type");
        jx.Companion.getClass();
        a81.t tVar = jx.W;
        aa.m mVar12 = new aa.m("ref", q0Var2, (String) null, rVar, no.a.s(tVar, new aa.u0(new aa.t("headRefName"))), r2);
        aa.m mVar13 = new aa.m("ref", q0Var2, "comparison", rVar, no.a.s(tVar, new aa.u0(new aa.t("baseRefName"))), r6);
        iu.Companion.getClass();
        List r8 = x61.l.r(new aa.m[]{mVar11, mVar12, mVar13, new aa.m("pullRequestTemplates", v8.l0.a(v8.l0.b(iu.a)), "pullRequestTemplates", rVar, rVar, r7), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = jx.t0;
        k71.k.g(q0Var3, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repoName"))), new aa.k(su.m, new aa.u0(new aa.t("ownerName")))}), r8), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
