package h10;

import java.util.List;
import m10.e30;
import m10.eh;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h5 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Issue", "PullRequest"});
        List list = hq.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Assignable", r, list)});
        m10.t1.Companion.getClass();
        aa.j0 j0Var = m10.t1.e;
        k71.k.g(j0Var, "type");
        List n = sy.d0.n(new aa.m("assignable", j0Var, (String) null, rVar, rVar, r2));
        e30.Companion.getClass();
        aa.q0 q0Var = e30.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("replaceActorsForAssignable", q0Var, (String) null, rVar, no.a.s(vp.I0, new aa.u0(x61.x.u(new w61.k[]{new w61.k("actorIds", new aa.t("actorIds")), new w61.k("agentAssignment", new aa.t("agentAssignment")), new w61.k("assignableId", new aa.t("assignableId"))}))), n));
    }
}
