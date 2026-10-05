package ov0;

import aa.a0;
import aa.m;
import aa.n;
import aa.p;
import aa.s;
import java.util.List;
import k71.k;
import pz0.e7;
import pz0.f40;
import pz0.pd;
import pz0.td;
import pz0.xd;
import sy.d0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        e7.Companion.getClass();
        p a2 = l0.a(l0.b(e7.s));
        r rVar = r.r;
        List n = d0.n(new m("viewerSubscriptionTypes", a2, (String) null, rVar, rVar, rVar));
        xd.Companion.getClass();
        s mVar = new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        s mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        f40.Companion.getClass();
        a0 a0Var = f40.s;
        k.g(a0Var, "type");
        s mVar3 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        a = l.r(new s[]{mVar, mVar2, mVar3, new m("viewerCanSubscribe", l0.b(pd.a), (String) null, rVar, rVar, rVar), new n("Repository", d0.n("Repository"), n)});
    }
}
