package cp;

import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.eh;
import m10.ge;
import m10.vp;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        k71.k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        ge.Companion.getClass();
        q0 q0Var = ge.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = d0.n(new aa.m("dispatchWorkflowRun", q0Var, (String) null, rVar, no.a.s(vp.c0, new u0(new t("input"))), n));
    }
}
