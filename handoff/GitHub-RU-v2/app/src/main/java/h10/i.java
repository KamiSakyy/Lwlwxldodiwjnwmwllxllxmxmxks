package h10;

import java.util.List;
import m10.ah;
import m10.bz;
import m10.dz;
import m10.eh;
import m10.sg;
import m10.tz;
import m10.ux;
import m10.vp;
import m10.xz;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        sg.Companion.getClass();
        aa.s mVar3 = new aa.m("headRefOid", v8.l0.b(sg.a), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequest");
        List list = hv.s.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = sy.d0Shadow.n("PullRequest");
        List list2 = hv.e.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, no.a.c(list2, "selections", "PullRequest", n2, list2)});
        aa.s mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0Shadow.n("PullRequestReviewComment");
        List list3 = hv.q.a;
        List r2 = x61.l.r(new aa.s[]{mVar4, no.a.c(list3, "selections", "PullRequestReviewComment", n3, list3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        bz.Companion.getClass();
        List n4 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(bz.a), (String) null, rVar, rVar, r2));
        xz.Companion.getClass();
        aa.m mVar5 = new aa.m("subjectType", v8.l0.b(xz.s), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        aa.m mVar6 = new aa.m("pullRequest", v8.l0.b(ux.T), (String) null, rVar, rVar, r);
        dz.Companion.getClass();
        aa.r b2 = v8.l0.b(dz.a);
        tz.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar5, mVar6, new aa.m("comments", b2, (String) null, rVar, no.a.s(tz.b, new aa.u0(1)), n4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = tz.e;
        k71.k.g(q0Var, "type");
        List n5 = sy.d0Shadow.n(new aa.m("thread", q0Var, (String) null, rVar, rVar, r3));
        m10.f0.Companion.getClass();
        aa.q0 q0Var2 = m10.f0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addPullRequestReviewThread", q0Var2, (String) null, rVar, no.a.s(vp.i, new aa.u0(x61.x.u(new w61.k[]{new w61.k("body", new aa.t("body")), new w61.k("filePositioning", new aa.t("filePositioning")), new w61.k("line", new aa.t("endLine")), new w61.k("linePositioning", new aa.t("linePositioning")), new w61.k("multilinePositioning", new aa.t("multilinePositioning")), new w61.k("path", new aa.t("path")), new w61.k("pullRequestId", new aa.t("pullId")), new w61.k("side", new aa.t("endSide")), new w61.k("startLine", new aa.t("startLine")), new w61.k("startSide", new aa.t("startSide")), new w61.k("subjectType", new aa.t("subjectType"))}))), n5));
    }
}
