package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.md0;
import m10.tz;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v5 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PullRequestReviewThread");
        List list = rw.a.a;
        aa.s c = no.a.c(list, "selections", "PullRequestReviewThread", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        tz.Companion.getClass();
        aa.q0 q0Var = tz.e;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("thread", q0Var, (String) null, rVar, rVar, r));
        md0.Companion.getClass();
        aa.q0 q0Var2 = md0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("unresolveReviewThread", q0Var2, (String) null, rVar, no.a.s(vp.c1, new aa.u0(a0.s0.p("threadId", new aa.t("nodeId")))), n2));
    }
}
