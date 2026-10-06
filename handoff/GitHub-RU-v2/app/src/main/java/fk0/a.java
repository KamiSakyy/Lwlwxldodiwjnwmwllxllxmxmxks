package fk0;

import aa.a0;
import aa.m;
import aa.n;
import aa.p;
import aa.s;
import gn0.j6;
import gn0.kw;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        j6.Companion.getClass();
        p a2 = l0.a(l0.b(j6.s));
        rShadow rVar = rShadow.r;
        List n = d0Shadow.n(new m("viewerSubscriptionTypes", a2, (String) null, rVar, rVar, rVar));
        tb.Companion.getClass();
        s mVar = new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        s mVar2 = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        kw.Companion.getClass();
        a0 a0Var = kw.s;
        k.g(a0Var, "type");
        s mVar3 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        a = l.r(new s[]{mVar, mVar2, mVar3, new m("viewerCanSubscribe", l0.b(lb.a), (String) null, rVar, rVar, rVar), new n("Repository", d0Shadow.n("Repository"), n)});
    }
}
