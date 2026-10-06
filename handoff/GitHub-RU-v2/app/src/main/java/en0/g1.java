package en0;

import gn0.dj;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g1 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Organization");
        List list = td0.d.a;
        aa.s c = no.a.c(list, "selections", "Organization", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        dj.Companion.getClass();
        aa.q0 q0Var = dj.m;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("organization", q0Var, (String) null, rVar, no.a.s(rn.j, new aa.u0(new aa.t("login"))), r));
    }
}
