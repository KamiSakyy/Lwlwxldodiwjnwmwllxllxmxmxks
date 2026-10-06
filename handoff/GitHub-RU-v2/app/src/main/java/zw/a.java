package zw;

import aa.a0;
import aa.m;
import aa.n;
import aa.p;
import aa.s;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.ia;
import m10.wg;
import m10.ya0;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ia.Companion.getClass();
        p a2 = l0.a(l0.b(ia.s));
        rShadow rVar = rShadow.r;
        List n = d0Shadow.n(new m("viewerSubscriptionTypes", a2, (String) null, rVar, rVar, rVar));
        eh.Companion.getClass();
        s mVar = new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        s mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        ya0.Companion.getClass();
        a0 a0Var = ya0.s;
        k.g(a0Var, "type");
        s mVar3 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        a = l.r(new s[]{mVar, mVar2, mVar3, new m("viewerCanSubscribe", l0.b(wg.a), (String) null, rVar, rVar, rVar), new n("Repository", d0Shadow.n("Repository"), n)});
    }
}
