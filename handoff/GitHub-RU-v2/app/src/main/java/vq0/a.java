package vq0;

import aa.k;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.c9;
import pz0.e9;
import pz0.mb;
import pz0.pd;
import pz0.td;
import pz0.xd;
import pz0.y8;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("User", d0Shadow.n("User"), l.r(new m[]{new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new n("Team", d0Shadow.n("Team"), l.r(new m[]{new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        c9.Companion.getClass();
        List n = d0Shadow.n(new m("nodes", l0.a(c9.a), (String) null, rVar, rVar, r2));
        pd.Companion.getClass();
        m mVar2 = new m("currentUserCanApprove", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        mb.Companion.getClass();
        m mVar3 = new m("environment", l0.b(mb.a), (String) null, rVar, rVar, r);
        e9.Companion.getClass();
        r b2 = l0.b(e9.a);
        y8.Companion.getClass();
        a = l.r(new m[]{mVar2, mVar3, new m("reviewers", b2, (String) null, rVar, l.r(new k[]{new k(y8.a, new u0((Object) null)), new k(y8.b, new u0(30))}), n)});
    }
}
