package fc0;

import hc0.bb;
import hc0.ey;
import hc0.fb;
import hc0.tb;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k5 {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = v8.l0.b(bb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("titleHTML", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        tb.Companion.getClass();
        aa.q0 q0Var = tb.x;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, r));
        ey.Companion.getClass();
        aa.q0 q0Var2 = ey.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("updateIssue", q0Var2, (String) null, rVar, no.a.s(wg.M0, new aa.u0(x61.x.u(new w61.k("id", new aa.t("id")), new w61.k("title", new aa.t("title"))))), n));
    }
}
