package en0;

import gn0.aq;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q4 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Issue", "PullRequest"});
        List list = zd0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Assignable", r, list)});
        gn0.x0.Companion.getClass();
        aa.j0 j0Var = gn0.x0.e;
        k71.k.g(j0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("assignable", j0Var, (String) null, rVar, rVar, r2));
        aq.Companion.getClass();
        aa.q0 q0Var = aq.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("replaceAssigneesForAssignable", q0Var, (String) null, rVar, no.a.s(wh.t0, new aa.u0(x61.x.u(new w61.k("assignableId", new aa.t("assignableId")), new w61.k("assigneeIds", new aa.t("assigneeIds"))))), n));
    }
}
