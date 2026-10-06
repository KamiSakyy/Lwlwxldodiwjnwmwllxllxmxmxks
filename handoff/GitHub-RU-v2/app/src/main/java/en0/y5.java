package en0;

import gn0.ll;
import gn0.pb;
import gn0.tb;
import gn0.vb;
import gn0.wh;
import gn0.wz;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y5 {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.r b = v8.l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.m mVar2 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        vb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("titleHTML", v8.l0.b(vb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ll.Companion.getClass();
        aa.q0 q0Var = ll.K;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        wz.Companion.getClass();
        aa.q0 q0Var2 = wz.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updatePullRequest", q0Var2, (String) null, rVar, no.a.s(wh.T0, new aa.u0(x61.x.u(new w61.k("pullRequestId", new aa.t("id")), new w61.k("title", new aa.t("title"))))), n));
    }
}
