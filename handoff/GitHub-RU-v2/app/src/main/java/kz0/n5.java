package kz0;

import java.util.List;
import pz0.l50;
import pz0.sk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n5 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        l50.Companion.getClass();
        aa.q0 q0Var = l50.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("unblockUserFromOrganization", q0Var, (String) null, rVar, no.a.s(sk.O0, new aa.u0(x61.x.u(new w61.k("organizationId", new aa.t("organizationId")), new w61.k("unblockedUserId", new aa.t("userId"))))), n));
    }
}
