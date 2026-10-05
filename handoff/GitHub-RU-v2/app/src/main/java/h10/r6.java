package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.ux;
import m10.ve0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r6 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = v8.l0.b(ah.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar)});
        ux.Companion.getClass();
        aa.q0 q0Var = ux.T;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        ve0.Companion.getClass();
        aa.q0 q0Var2 = ve0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("updatePullRequest", q0Var2, (String) null, rVar, no.a.s(vp.p1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("baseRefName", new aa.t("baseRefName")), new w61.k("pullRequestId", new aa.t("id"))}))), n));
    }
}
