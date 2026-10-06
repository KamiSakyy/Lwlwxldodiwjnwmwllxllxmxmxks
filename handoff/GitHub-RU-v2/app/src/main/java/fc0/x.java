package fc0;

import hc0.bb;
import hc0.fb;
import hc0.fm;
import hc0.lk;
import hc0.wg;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = v8.l0.b(bb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        fm.Companion.getClass();
        aa.m mVar2 = new aa.m("state", v8.l0.b(fm.s), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        aa.x xVar = xa.a;
        aa.m mVar3 = new aa.m("viewerCanReopen", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("viewerCanDeleteHeadRef", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        lk.Companion.getClass();
        aa.q0 q0Var = lk.J;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        hc0.h3.Companion.getClass();
        aa.q0 q0Var2 = hc0.h3.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("closePullRequest", q0Var2, (String) null, rVar, no.a.s(wg.u, new aa.u0(a0.s0.p("pullRequestId", new aa.t("id")))), n));
    }
}
