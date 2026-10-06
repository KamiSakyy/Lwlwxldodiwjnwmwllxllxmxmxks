package ds;

import aa.k;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.cc;
import m10.eh;
import m10.gc;
import m10.ic;
import m10.qe;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("User", d0Shadow.n("User"), l.r(new m[]{new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new n("Team", d0Shadow.n("Team"), l.r(new m[]{new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        gc.Companion.getClass();
        List n = d0Shadow.n(new m("nodes", l0.a(gc.a), (String) null, rVar, rVar, r2));
        wg.Companion.getClass();
        m mVar2 = new m("currentUserCanApprove", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        qe.Companion.getClass();
        m mVar3 = new m("environment", l0.b(qe.a), (String) null, rVar, rVar, r);
        ic.Companion.getClass();
        r b2 = l0.b(ic.a);
        cc.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, new m("reviewers", b2, (String) null, rVar, l.r(new k[]{new k(cc.a, new u0((Object) null)), new k(cc.b, new u0(30))}), n)});
    }
}
