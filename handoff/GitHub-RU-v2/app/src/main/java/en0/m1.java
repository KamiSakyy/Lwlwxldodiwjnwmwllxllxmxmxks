package en0;

import gn0.pb;
import gn0.ra;
import gn0.s00;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m1 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = td0.c.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        aa.q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("user", q0Var, (String) null, rVar, rVar, r));
        ra.Companion.getClass();
        aa.q0 q0Var2 = ra.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("followUser", q0Var2, (String) null, rVar, no.a.s(wh.U, new aa.u0(a0.s0.p("userId", new aa.t("userId")))), n2));
    }
}
