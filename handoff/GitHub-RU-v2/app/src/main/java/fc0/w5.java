package fc0;

import hc0.av;
import hc0.fb;
import hc0.wg;
import hc0.wy;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class w5 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"});
        List list = n90.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Subscribable", r, list)});
        av.Companion.getClass();
        aa.j0 j0Var = av.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("subscribable", j0Var, (String) null, rVar, rVar, r2));
        wy.Companion.getClass();
        aa.q0 q0Var = wy.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateSubscription", q0Var, (String) null, rVar, no.a.s(wg.W0, new aa.u0(x61.x.u(new w61.k("state", new aa.t("state")), new w61.k("subscribableId", new aa.t("id")), new w61.k("types", new aa.t("types"))))), n));
    }
}
