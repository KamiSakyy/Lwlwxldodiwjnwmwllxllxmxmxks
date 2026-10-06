package pf0;

import aa.k;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.b8;
import gn0.d8;
import gn0.ea;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import gn0.x7;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("User", d0Shadow.n("User"), l.r(new m[]{new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new n("Team", d0Shadow.n("Team"), l.r(new m[]{new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        b8.Companion.getClass();
        List n = d0Shadow.n(new m("nodes", l0.a(b8.a), (String) null, rVar, rVar, r2));
        lb.Companion.getClass();
        m mVar2 = new m("currentUserCanApprove", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        ea.Companion.getClass();
        m mVar3 = new m("environment", l0.b(ea.a), (String) null, rVar, rVar, r);
        d8.Companion.getClass();
        r b2 = l0.b(d8.a);
        x7.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, new m("reviewers", b2, (String) null, rVar, l.r(new k[]{new k(x7.a, new u0((Object) null)), new k(x7.b, new u0(30))}), n)});
    }
}
