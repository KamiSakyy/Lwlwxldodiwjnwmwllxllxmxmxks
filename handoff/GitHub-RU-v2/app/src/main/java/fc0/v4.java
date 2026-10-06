package fc0;

import hc0.fb;
import hc0.iw;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v4 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        iw.Companion.getClass();
        aa.q0 q0Var = iw.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("unblockUserFromOrganization", q0Var, (String) null, rVar, no.a.s(wg.A0, new aa.u0(x61.x.u(new w61.k("organizationId", new aa.t("organizationId")), new w61.k("unblockedUserId", new aa.t("userId"))))), n));
    }
}
