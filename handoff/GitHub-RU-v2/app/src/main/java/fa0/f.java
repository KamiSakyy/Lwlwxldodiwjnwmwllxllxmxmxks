package fa0;

import a81.t;
import aa.k;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.kz;
import hc0.xa;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("User");
        List list = h.a;
        s c = no.a.c(list, "selections", "User", n, list);
        xa.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("viewerCanUnblock", l0.b(xa.a), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("User", d0Shadow.n("User"), r);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r2 = l.r(new s[]{mVar2, nVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        r d = no.a.d(kz.O);
        ap.Companion.getClass();
        k kVar = new k(ap.c0, new u0(5));
        t tVar = ap.d0;
        Boolean bool = Boolean.TRUE;
        a = l.r(new m[]{new m("topContributors", d, (String) null, rVar, l.r(new k[]{kVar, new k(tVar, new u0(bool)), new k(ap.e0, new u0(bool))}), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
