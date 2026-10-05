package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.kb;
import m10.ux;
import m10.vp;
import m10.zy;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequest");
        List list = hv.s.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        List n2 = sy.d0.n("PullRequest");
        List list2 = hv.e.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, c, no.a.c(list2, "selections", "PullRequest", n2, list2)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar3, new aa.m("pullRequest", v8.l0.b(ux.T), (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        zy.Companion.getClass();
        aa.q0 q0Var = zy.d;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r2)});
        kb.Companion.getClass();
        aa.q0 q0Var2 = kb.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("deletePullRequestReviewComment", q0Var2, (String) null, rVar, no.a.s(vp.U, new aa.u0(a0.s0.p("id", new aa.t("commentId")))), r3));
    }
}
