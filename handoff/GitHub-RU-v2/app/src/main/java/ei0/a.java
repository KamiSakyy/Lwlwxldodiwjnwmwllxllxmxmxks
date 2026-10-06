package ei0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import gn0.dj;
import gn0.pa;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        r b = l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Organization");
        List list = di0.a.a;
        s c = no.a.c(list, "selections", "Organization", n, list);
        pb.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        dj.Companion.getClass();
        q0 q0Var = dj.m;
        k.g(q0Var, "type");
        List n2 = d0Shadow.n(new m("organization", q0Var, (String) null, rVar, rVar, r));
        pa.Companion.getClass();
        q0 q0Var2 = pa.a;
        k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = d0Shadow.n(new m("followOrganization", q0Var2, (String) null, rVar, no.a.s(wh.T, new u0(s0.p("organizationId", new t("organizationId")))), n2));
    }
}
