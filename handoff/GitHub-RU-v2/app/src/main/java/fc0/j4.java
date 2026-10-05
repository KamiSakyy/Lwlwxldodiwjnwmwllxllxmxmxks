package fc0;

import hc0.fb;
import hc0.wg;
import hc0.wo;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j4 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Issue", "PullRequest"});
        List list = j30.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Assignable", r, list)});
        hc0.v0.Companion.getClass();
        aa.j0 j0Var = hc0.v0.e;
        k71.k.g(j0Var, "type");
        List n = sy.d0.n(new aa.m("assignable", j0Var, (String) null, rVar, rVar, r2));
        wo.Companion.getClass();
        aa.q0 q0Var = wo.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("replaceAssigneesForAssignable", q0Var, (String) null, rVar, no.a.s(wg.r0, new aa.u0(x61.x.u(new w61.k("assignableId", new aa.t("assignableId")), new w61.k("assigneeIds", new aa.t("assigneeIds"))))), n));
    }
}
