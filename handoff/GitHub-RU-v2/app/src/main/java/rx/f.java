package rx;

import a81.t;
import aa.k;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.rf0;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("User");
        List list = h.a;
        s c = no.a.c(list, "selections", "User", n, list);
        wg.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("viewerCanUnblock", l0.b(wg.a), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s nVar = new n("User", d0.n("User"), r);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r2 = l.r(new s[]{mVar2, nVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        r d = no.a.d(rf0.g0);
        i30.Companion.getClass();
        k kVar = new k(i30.m0, new u0(5));
        t tVar = i30.n0;
        Boolean bool = Boolean.TRUE;
        a = l.r(new m[]{new m("topContributors", d, (String) null, rVar, l.r(new k[]{kVar, new k(tVar, new u0(bool)), new k(i30.o0, new u0(bool))}), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
