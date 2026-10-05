package m70;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import hc0.bb;
import hc0.di;
import hc0.fb;
import hc0.mw;
import hc0.wg;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        fb.Companion.getClass();
        r b = l0.b(fb.a);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Organization");
        List list = l70.a.a;
        s c = no.a.c(list, "selections", "Organization", n, list);
        bb.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        di.Companion.getClass();
        q0 q0Var = di.m;
        k.g(q0Var, "type");
        List n2 = d0.n(new m("organization", q0Var, (String) null, rVar, rVar, r));
        mw.Companion.getClass();
        q0 q0Var2 = mw.a;
        k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = d0.n(new m("unfollowOrganization", q0Var2, (String) null, rVar, no.a.s(wg.B0, new u0(s0.p("organizationId", new t("organizationId")))), n2));
    }
}
