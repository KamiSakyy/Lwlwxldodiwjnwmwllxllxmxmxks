package ta0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import hc0.d7;
import hc0.fb;
import hc0.wg;
import java.util.List;
import k71.k;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        d7.Companion.getClass();
        q0 q0Var = d7.a;
        k.g(q0Var, "type");
        wg.Companion.getClass();
        a = d0.n(new m("deleteUserList", q0Var, (String) null, rVar, no.a.s(wg.N, new u0(s0.p("listId", new t("id")))), n));
    }
}
