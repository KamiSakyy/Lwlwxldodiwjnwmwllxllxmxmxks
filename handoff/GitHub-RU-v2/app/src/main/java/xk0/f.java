package xk0;

import a81.t;
import aa.k;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.eq;
import gn0.lb;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("User");
        List list = h.a;
        s c = no.a.c(list, "selections", "User", n, list);
        lb.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("viewerCanUnblock", l0.b(lb.a), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("User", d0.n("User"), r);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r2 = l.r(new s[]{mVar2, nVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        r d = no.a.d(s00.P);
        eq.Companion.getClass();
        k kVar = new k(eq.e0, new u0(5));
        t tVar = eq.f0;
        Boolean bool = Boolean.TRUE;
        a = l.r(new m[]{new m("topContributors", d, (String) null, rVar, l.r(new k[]{kVar, new k(tVar, new u0(bool)), new k(eq.g0, new u0(bool))}), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
