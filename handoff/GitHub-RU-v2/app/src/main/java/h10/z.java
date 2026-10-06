package h10;

import java.util.List;
import m10.ah;
import m10.b00;
import m10.eh;
import m10.ux;
import m10.vp;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = v8.l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        b00.Companion.getClass();
        aa.m mVar2 = new aa.m("state", v8.l0.b(b00.s), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.x xVar = wg.a;
        aa.m mVar3 = new aa.m("viewerCanReopen", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("viewerCanDeleteHeadRef", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar)});
        ux.Companion.getClass();
        aa.q0 q0Var = ux.T;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        m10.v4.Companion.getClass();
        aa.q0 q0Var2 = m10.v4.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("closePullRequest", q0Var2, (String) null, rVar, no.a.s(vp.A, new aa.u0(a0.s0.p("pullRequestId", new aa.t("id")))), n));
    }
}
