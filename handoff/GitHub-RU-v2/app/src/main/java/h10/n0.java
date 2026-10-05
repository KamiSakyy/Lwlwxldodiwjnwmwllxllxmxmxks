package h10;

import java.util.List;
import m10.eh;
import m10.vp;
import m10.x9;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        x9.Companion.getClass();
        aa.q0 q0Var = x9.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("createUserDisinterest", q0Var, (String) null, rVar, no.a.s(vp.M, new aa.u0(x61.x.u(new w61.k[]{new w61.k("identifier", new aa.t("identifier")), new w61.k("reasons", new aa.t("reasons"))}))), n));
    }
}
