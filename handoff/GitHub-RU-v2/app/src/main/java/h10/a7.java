package h10;

import java.util.List;
import m10.df0;
import m10.eh;
import m10.pa0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a7 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team"});
        List list = zw.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Subscribable", r, list)});
        pa0.Companion.getClass();
        aa.j0 j0Var = pa0.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0.n(new aa.m("subscribable", j0Var, (String) null, rVar, rVar, r2));
        df0.Companion.getClass();
        aa.q0 q0Var = df0.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("updateSubscription", q0Var, (String) null, rVar, no.a.s(vp.u1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("state", new aa.t("state")), new w61.k("subscribableId", new aa.t("id")), new w61.k("types", new aa.t("types"))}))), n));
    }
}
