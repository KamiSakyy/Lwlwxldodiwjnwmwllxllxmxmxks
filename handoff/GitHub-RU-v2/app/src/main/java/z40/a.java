package z40;

import aa.k;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.n7;
import hc0.q9;
import hc0.r7;
import hc0.t7;
import hc0.xa;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("User", d0.n("User"), l.r(new m[]{new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new n("Team", d0.n("Team"), l.r(new m[]{new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        r7.Companion.getClass();
        List n = d0.n(new m("nodes", l0.a(r7.a), (String) null, rVar, rVar, r2));
        xa.Companion.getClass();
        m mVar2 = new m("currentUserCanApprove", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        q9.Companion.getClass();
        m mVar3 = new m("environment", l0.b(q9.a), (String) null, rVar, rVar, r);
        t7.Companion.getClass();
        r b2 = l0.b(t7.a);
        n7.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, new m("reviewers", b2, (String) null, rVar, l.r(new k[]{new k(n7.a, new u0((Object) null)), new k(n7.b, new u0(30))}), n)});
    }
}
