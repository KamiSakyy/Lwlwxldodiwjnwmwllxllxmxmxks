package en0;

import gn0.dj;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k6 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = xk0.i.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("Organization");
        List list2 = di0.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list2, "selections", "Organization", n2, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        aa.q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        aa.m mVar3 = new aa.m("user", q0Var, (String) null, rVar, no.a.s(rn.y, new aa.u0(new aa.t("login"))), r);
        dj.Companion.getClass();
        aa.q0 q0Var2 = dj.m;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.m[]{mVar3, new aa.m("organization", q0Var2, (String) null, rVar, no.a.s(rn.j, new aa.u0(new aa.t("login"))), r2)});
    }
}
