package mt0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import java.util.List;
import k71.k;
import pz0.bm;
import pz0.r50;
import pz0.sk;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        xd.Companion.getClass();
        r b = l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Organization");
        List list = lt0.a.a;
        s c = no.a.c(list, "selections", "Organization", n, list);
        td.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar)});
        bm.Companion.getClass();
        q0 q0Var = bm.o;
        k.g(q0Var, "type");
        List n2 = d0Shadow.n(new m("organization", q0Var, (String) null, rVar, rVar, r));
        r50.Companion.getClass();
        q0 q0Var2 = r50.a;
        k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0Shadow.n(new m("unfollowOrganization", q0Var2, (String) null, rVar, no.a.s(sk.Q0, new u0(s0.p("organizationId", new t("organizationId")))), n2));
    }
}
