package h10;

import java.util.List;
import m10.a30;
import m10.ah;
import m10.eh;
import m10.vp;
import m10.wh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z3 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Issue");
        List list = dt.f.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        wh.Companion.getClass();
        aa.q0 q0Var = wh.B;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, r));
        a30.Companion.getClass();
        aa.q0 q0Var2 = a30.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("reopenIssue", q0Var2, (String) null, rVar, no.a.s(vp.H0, new aa.u0(a0.s0.p("issueId", new aa.t("id")))), n2));
    }
}
