package h10;

import java.util.List;
import m10.eh;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        m10.b3.Companion.getClass();
        aa.q0 q0Var = m10.b3.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("blockUserFromOrganization", q0Var, (String) null, rVar, no.a.s(vp.t, new aa.u0(x61.x.u(new w61.k[]{new w61.k("blockedUserId", new aa.t("userId")), new w61.k("contentId", new aa.t("contentId")), new w61.k("duration", new aa.t("duration")), new w61.k("hiddenReason", new aa.t("hiddenReason")), new w61.k("notifyBlockedUser", new aa.t("notifyUser")), new w61.k("organizationId", new aa.t("organizationId"))}))), n));
    }
}
