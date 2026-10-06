package kz0;

import java.util.List;
import pz0.i80;
import pz0.sk;
import pz0.xd;
import pz0.z30;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r6 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"});
        List list = ov0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Subscribable", r, list)});
        z30.Companion.getClass();
        aa.j0 j0Var = z30.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("subscribable", j0Var, (String) null, rVar, rVar, r2));
        i80.Companion.getClass();
        aa.q0 q0Var = i80.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateSubscription", q0Var, (String) null, rVar, no.a.s(sk.p1, new aa.u0(x61.x.u(new w61.k("state", new aa.t("state")), new w61.k("subscribableId", new aa.t("id")), new w61.k("types", new aa.t("types"))))), n));
    }
}
