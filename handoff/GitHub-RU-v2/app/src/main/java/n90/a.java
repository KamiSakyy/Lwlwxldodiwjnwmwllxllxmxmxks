package n90;

import aa.a0;
import aa.m;
import aa.n;
import aa.p;
import aa.s;
import hc0.bb;
import hc0.ev;
import hc0.fb;
import hc0.xa;
import hc0.z5;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        z5.Companion.getClass();
        p a2 = l0.a(l0.b(z5.s));
        r rVar = r.r;
        List n = d0.n(new m("viewerSubscriptionTypes", a2, (String) null, rVar, rVar, rVar));
        fb.Companion.getClass();
        s mVar = new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        s mVar2 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        ev.Companion.getClass();
        a0 a0Var = ev.s;
        k.g(a0Var, "type");
        s mVar3 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        a = l.r(new s[]{mVar, mVar2, mVar3, new m("viewerCanSubscribe", l0.b(xa.a), (String) null, rVar, rVar, rVar), new n("Repository", d0.n("Repository"), n)});
    }
}
