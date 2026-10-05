package en0;

import gn0.qx;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c5 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        qx.Companion.getClass();
        aa.q0 q0Var = qx.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("unblockUserFromOrganization", q0Var, (String) null, rVar, no.a.s(wh.C0, new aa.u0(x61.x.u(new w61.k("organizationId", new aa.t("organizationId")), new w61.k("unblockedUserId", new aa.t("userId"))))), n));
    }
}
