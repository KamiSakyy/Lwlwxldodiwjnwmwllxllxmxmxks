package en0;

import gn0.hc;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Issue");
        List list = ng0.e.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        hc.Companion.getClass();
        aa.q0 q0Var = hc.x;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, r));
        gn0.h3.Companion.getClass();
        aa.q0 q0Var2 = gn0.h3.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("closeIssue", q0Var2, (String) null, rVar, no.a.s(wh.t, new aa.u0(x61.x.u(new w61.k("issueId", new aa.t("id")), new w61.k("stateReason", new aa.t("stateReason"))))), n2));
    }
}
