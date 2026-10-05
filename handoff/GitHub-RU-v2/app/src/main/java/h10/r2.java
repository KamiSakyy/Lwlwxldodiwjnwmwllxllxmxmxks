package h10;

import java.util.List;
import m10.ah;
import m10.b00;
import m10.eh;
import m10.ol;
import m10.ux;
import m10.vp;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r2 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = v8.l0.b(ah.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        b00.Companion.getClass();
        aa.m mVar2 = new aa.m("state", v8.l0.b(b00.s), "pullRequestState", rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar3 = new aa.m("isDraft", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar)});
        ux.Companion.getClass();
        aa.q0 q0Var = ux.T;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        ol.Companion.getClass();
        aa.q0 q0Var2 = ol.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("markPullRequestReadyForReview", q0Var2, (String) null, rVar, no.a.s(vp.u0, new aa.u0(a0.s0.p("pullRequestId", new aa.t("pullRequestId")))), n));
    }
}
