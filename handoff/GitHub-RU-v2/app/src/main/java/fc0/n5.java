package fc0;

import hc0.bb;
import hc0.fb;
import hc0.lk;
import hc0.oy;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n5 {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = v8.l0.b(bb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        oy.Companion.getClass();
        aa.q0 q0Var2 = oy.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("updatePullRequest", q0Var2, (String) null, rVar, no.a.s(wg.R0, new aa.u0(x61.x.u(new w61.k("baseRefName", new aa.t("baseRefName")), new w61.k("pullRequestId", new aa.t("id"))))), n));
    }
}
