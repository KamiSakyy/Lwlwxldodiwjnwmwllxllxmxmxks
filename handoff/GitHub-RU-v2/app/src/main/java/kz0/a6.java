package kz0;

import java.util.List;
import pz0.ba;
import pz0.e70;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a6 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.r b = v8.l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ba.Companion.getClass();
        aa.q0 q0Var = ba.l;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("discussion", q0Var, (String) null, rVar, rVar, r));
        e70.Companion.getClass();
        aa.q0 q0Var2 = e70.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateDiscussion", q0Var2, (String) null, rVar, no.a.s(sk.Z0, new aa.u0(x61.x.u(new w61.k("discussionId", new aa.t("id")), new w61.k("title", new aa.t("title"))))), n));
    }
}
