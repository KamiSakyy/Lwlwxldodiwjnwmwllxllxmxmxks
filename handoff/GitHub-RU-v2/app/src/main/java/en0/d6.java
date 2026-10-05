package en0;

import gn0.e00;
import gn0.ew;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d6 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"});
        List list = fk0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Subscribable", r, list)});
        ew.Companion.getClass();
        aa.j0 j0Var = ew.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0.n(new aa.m("subscribable", j0Var, (String) null, rVar, rVar, r2));
        e00.Companion.getClass();
        aa.q0 q0Var = e00.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("updateSubscription", q0Var, (String) null, rVar, no.a.s(wh.Y0, new aa.u0(x61.x.u(new w61.k("state", new aa.t("state")), new w61.k("subscribableId", new aa.t("id")), new w61.k("types", new aa.t("types"))))), n));
    }
}
