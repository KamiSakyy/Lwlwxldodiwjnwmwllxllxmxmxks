package kz0;

import java.util.List;
import pz0.fx;
import pz0.sk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a5 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Issue", "PullRequest"});
        List list = fp0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Assignable", r, list)});
        pz0.i1.Companion.getClass();
        aa.j0 j0Var = pz0.i1.e;
        k71.k.g(j0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("assignable", j0Var, (String) null, rVar, rVar, r2));
        fx.Companion.getClass();
        aa.q0 q0Var = fx.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("replaceAssigneesForAssignable", q0Var, (String) null, rVar, no.a.s(sk.E0, new aa.u0(x61.x.u(new w61.k("assignableId", new aa.t("assignableId")), new w61.k("assigneeIds", new aa.t("assigneeIds"))))), n));
    }
}
