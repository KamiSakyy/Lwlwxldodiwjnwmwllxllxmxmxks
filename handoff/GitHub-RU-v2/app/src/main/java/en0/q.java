package en0;

import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        gn0.b2.Companion.getClass();
        aa.q0 q0Var = gn0.b2.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("blockUserFromOrganization", q0Var, (String) null, rVar, no.a.s(wh.o, new aa.u0(x61.x.u(new w61.k("blockedUserId", new aa.t("userId")), new w61.k("contentId", new aa.t("contentId")), new w61.k("duration", new aa.t("duration")), new w61.k("hiddenReason", new aa.t("hiddenReason")), new w61.k("notifyBlockedUser", new aa.t("notifyUser")), new w61.k("organizationId", new aa.t("organizationId"))))), n));
    }
}
