package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.f00;
import m10.i30;
import m10.j10;
import m10.ly;
import m10.p00;
import m10.sa;
import m10.ux;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o4 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequest");
        List list = hv.i.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ux.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(ux.T), (String) null, rVar, rVar, r));
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ly.Companion.getClass();
        aa.r b2 = v8.l0.b(ly.a);
        j10.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("associatedPullRequests", b2, "activePullRequests", rVar, x61.l.r(new aa.k[]{new aa.k(j10.a, new aa.u0(new aa.t("baseRefName"))), new aa.k(j10.b, new aa.u0(new aa.t("last"))), new aa.k(j10.c, new aa.u0(sy.d0Shadow.n("OPEN")))}), n2), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("message", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("committedDate", v8.l0.b(sa.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        aa.x xVar3 = ch.a;
        aa.m mVar5 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m10.y5.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("nodes", v8.l0.a(m10.y5.j), (String) null, rVar, rVar, r3)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("additions", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("deletions", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar9 = new aa.m("changedFiles", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m10.k6.Companion.getClass();
        aa.r b3 = v8.l0.b(m10.k6.a);
        m10.i6.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, mVar9, new aa.m("commits", b3, "latestCommit", rVar, x61.l.r(new aa.k[]{new aa.k(m10.i6.a, new aa.u0((Object) null)), new aa.k(m10.i6.c, new aa.u0(1))}), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar10 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = m10.i6.d;
        k71.k.g(q0Var, "type");
        List r6 = x61.l.r(new aa.m[]{mVar10, new aa.m("compare", q0Var, (String) null, rVar, no.a.s(j10.d, new aa.u0(new aa.t("headRefName"))), r5), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r7 = x61.l.r(new aa.m[]{new aa.m("filename", xVar, (String) null, rVar, rVar, rVar), new aa.m("body", xVar, (String) null, rVar, rVar, rVar)});
        aa.m mVar11 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = j10.e;
        k71.k.g(q0Var2, "type");
        i30.Companion.getClass();
        a81.t tVar = i30.T;
        aa.m mVar12 = new aa.m("ref", q0Var2, (String) null, rVar, no.a.s(tVar, new aa.u0(new aa.t("headRefName"))), r2);
        aa.m mVar13 = new aa.m("ref", q0Var2, "comparison", rVar, no.a.s(tVar, new aa.u0(new aa.t("baseRefName"))), r6);
        f00.Companion.getClass();
        List r8 = x61.l.r(new aa.m[]{mVar11, mVar12, mVar13, new aa.m("pullRequestTemplates", v8.l0.a(v8.l0.b(f00.a)), "pullRequestTemplates", rVar, rVar, r7), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = i30.w0;
        k71.k.g(q0Var3, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repoName"))), new aa.k(p00.m, new aa.u0(new aa.t("ownerName")))}), r8), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
