package kz0;

import java.util.List;
import pz0.le;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Issue");
        List list = vr0.e.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        le.Companion.getClass();
        aa.q0 q0Var = le.A;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, r));
        pz0.w3.Companion.getClass();
        aa.q0 q0Var2 = pz0.w3.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("closeIssue", q0Var2, (String) null, rVar, no.a.s(sk.y, new aa.u0(x61.x.u(new w61.k("issueId", new aa.t("id")), new w61.k("stateReason", new aa.t("stateReason"))))), n2));
    }
}
