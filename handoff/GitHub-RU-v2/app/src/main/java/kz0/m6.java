package kz0;

import java.util.List;
import pz0.a80;
import pz0.hs;
import pz0.sk;
import pz0.td;
import pz0.xd;
import pz0.zd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m6 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.r b = v8.l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.m mVar2 = new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("titleHTML", v8.l0.b(zd.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        hs.Companion.getClass();
        aa.q0 q0Var = hs.N;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        a80.Companion.getClass();
        aa.q0 q0Var2 = a80.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updatePullRequest", q0Var2, (String) null, rVar, no.a.s(sk.k1, new aa.u0(x61.x.u(new w61.k("pullRequestId", new aa.t("id")), new w61.k("title", new aa.t("title"))))), n));
    }
}
