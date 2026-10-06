package fc0;

import hc0.bb;
import hc0.fb;
import hc0.tb;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Issue");
        List list = x50.e.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        tb.Companion.getClass();
        aa.q0 q0Var = tb.x;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, r));
        hc0.f3.Companion.getClass();
        aa.q0 q0Var2 = hc0.f3.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("closeIssue", q0Var2, (String) null, rVar, no.a.s(wg.t, new aa.u0(x61.x.u(new w61.k("issueId", new aa.t("id")), new w61.k("stateReason", new aa.t("stateReason"))))), n2));
    }
}
