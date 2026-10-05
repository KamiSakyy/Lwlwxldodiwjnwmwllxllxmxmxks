package fc0;

import hc0.bb;
import hc0.fb;
import hc0.fm;
import hc0.lk;
import hc0.ne;
import hc0.wg;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d2 {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = v8.l0.b(bb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        fm.Companion.getClass();
        aa.m mVar2 = new aa.m("state", v8.l0.b(fm.s), "pullRequestState", rVar, rVar, rVar);
        xa.Companion.getClass();
        aa.m mVar3 = new aa.m("isDraft", v8.l0.b(xa.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        ne.Companion.getClass();
        aa.q0 q0Var2 = ne.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("markPullRequestReadyForReview", q0Var2, (String) null, rVar, no.a.s(wg.g0, new aa.u0(a0.s0.p("pullRequestId", new aa.t("pullRequestId")))), n));
    }
}
