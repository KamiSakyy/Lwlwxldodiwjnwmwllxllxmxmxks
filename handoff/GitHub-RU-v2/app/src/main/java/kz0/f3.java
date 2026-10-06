package kz0;

import java.util.List;
import pz0.l00;
import pz0.n00;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f3 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequest");
        List list = bp0.i0.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "PullRequest", n, list)});
        vd.Companion.getClass();
        aa.x xVar2 = vd.a;
        aa.m mVar2 = new aa.m("issueCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l00.Companion.getClass();
        aa.x0 x0Var = l00.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, r)});
        List r3 = x61.l.r(new aa.m[]{new aa.m("issueCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("PullRequest", sy.d0Shadow.n("PullRequest"), list)}))});
        List r4 = x61.l.r(new aa.m[]{new aa.m("issueCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("PullRequest", sy.d0Shadow.n("PullRequest"), list)}))});
        List r5 = x61.l.r(new aa.m[]{new aa.m("issueCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("nodes", v8.l0.a(x0Var), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("PullRequest", sy.d0Shadow.n("PullRequest"), list)}))});
        n00.Companion.getClass();
        aa.q0 q0Var = n00.a;
        aa.r b2 = v8.l0.b(q0Var);
        List t = no.a.t("includeCreated", false);
        su.Companion.getClass();
        a81.t tVar = su.q;
        aa.k kVar = new aa.k(tVar, new aa.u0(new aa.t("first")));
        a81.t tVar2 = su.r;
        aa.k kVar2 = new aa.k(tVar2, new aa.u0("is:open archived:false is:pr author:@me sort:created-desc"));
        a81.t tVar3 = su.s;
        aa.m mVar3 = new aa.m("search", b2, "created", t, x61.l.r(new aa.k[]{kVar, kVar2, new aa.k(tVar3, new aa.u0("ISSUE"))}), r2);
        aa.m mVar4 = new aa.m("search", v8.l0.b(q0Var), "assigned", no.a.t("includeAssigned", false), x61.l.r(new aa.k[]{new aa.k(tVar, new aa.u0(new aa.t("first"))), new aa.k(tVar2, new aa.u0("is:open archived:false is:pr assignee:@me sort:created-desc")), new aa.k(tVar3, new aa.u0("ISSUE"))}), r3);
        aa.m mVar5 = new aa.m("search", v8.l0.b(q0Var), "mentioned", no.a.t("includeMentioned", false), x61.l.r(new aa.k[]{new aa.k(tVar, new aa.u0(new aa.t("first"))), new aa.k(tVar2, new aa.u0("is:open is:pr archived:false mentions:@me sort:created-desc")), new aa.k(tVar3, new aa.u0("ISSUE"))}), r4);
        aa.m mVar6 = new aa.m("search", v8.l0.b(q0Var), "requested", no.a.t("includeRequested", false), x61.l.r(new aa.k[]{new aa.k(tVar, new aa.u0(new aa.t("first"))), new aa.k(tVar2, new aa.u0("is:open is:pr archived:false review-requested:@me sort:created-desc")), new aa.k(tVar3, new aa.u0("ISSUE"))}), r5);
        td.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, mVar6, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
