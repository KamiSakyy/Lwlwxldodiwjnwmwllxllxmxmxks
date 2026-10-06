package kz0;

import java.util.List;
import pz0.sk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        pz0.o2.Companion.getClass();
        aa.q0 q0Var = pz0.o2.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("blockUserFromOrganization", q0Var, (String) null, rVar, no.a.s(sk.s, new aa.u0(x61.x.u(new w61.k("blockedUserId", new aa.t("userId")), new w61.k("contentId", new aa.t("contentId")), new w61.k("duration", new aa.t("duration")), new w61.k("hiddenReason", new aa.t("hiddenReason")), new w61.k("notifyBlockedUser", new aa.t("notifyUser")), new w61.k("organizationId", new aa.t("organizationId"))))), n));
    }
}
