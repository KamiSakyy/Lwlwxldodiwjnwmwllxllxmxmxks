package h10;

import java.util.List;
import m10.eh;
import m10.gc0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w5 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        gc0.Companion.getClass();
        aa.q0 q0Var = gc0.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("unblockUserFromOrganization", q0Var, (String) null, rVar, no.a.s(vp.T0, new aa.u0(x61.x.u(new w61.k[]{new w61.k("organizationId", new aa.t("organizationId")), new w61.k("unblockedUserId", new aa.t("userId"))}))), n));
    }
}
