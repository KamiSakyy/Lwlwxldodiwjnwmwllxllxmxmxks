package h10;

import java.util.List;
import m10.ah;
import m10.bz;
import m10.eh;
import m10.sg;
import m10.ux;
import m10.vp;
import m10.xe0;
import m10.xz;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x6 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        sg.Companion.getClass();
        aa.m mVar2 = new aa.m("headRefOid", v8.l0.b(sg.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xz.Companion.getClass();
        aa.s mVar4 = new aa.m("subjectType", v8.l0.b(xz.s), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        aa.s mVar5 = new aa.m("pullRequest", v8.l0.b(ux.T), (String) null, rVar, rVar, r);
        List n = sy.d0Shadow.n("PullRequestReviewComment");
        List list = hv.q.a;
        List r2 = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, no.a.c(list, "selections", "PullRequestReviewComment", n, list), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        bz.Companion.getClass();
        aa.q0 q0Var = bz.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("pullRequestReviewComment", q0Var, (String) null, rVar, rVar, r2));
        xe0.Companion.getClass();
        aa.q0 q0Var2 = xe0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updatePullRequestReviewComment", q0Var2, (String) null, rVar, no.a.s(vp.s1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("body", new aa.t("body")), new w61.k("pullRequestReviewCommentId", new aa.t("commentId"))}))), n2));
    }
}
