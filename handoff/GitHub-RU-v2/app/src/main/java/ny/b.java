package ny;

import a0.s0;
import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.eh;
import m10.sb;
import m10.vp;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar));
        sb.Companion.getClass();
        q0 q0Var = sb.a;
        k.g(q0Var, "type");
        vp.Companion.getClass();
        a = d0.n(new m("deleteUserList", q0Var, (String) null, rVar, no.a.s(vp.Y, new u0(s0.p("listId", new t("id")))), n));
    }
}
