package xk0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import gn0.dj;
import gn0.lb;
import gn0.pb;
import gn0.r6;
import gn0.tb;
import gn0.vb;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Organization");
        List list = td0.d.a;
        s c = no.a.c(list, "selections", "Organization", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        vb.Companion.getClass();
        x xVar3 = vb.a;
        k.g(xVar3, "type");
        m mVar3 = new m("emojiHTML", xVar3, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        m mVar4 = new m("indicatesLimitedAvailability", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("message", xVar, (String) null, rVar, rVar, rVar);
        m mVar6 = new m("emoji", xVar, (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        x xVar4 = r6.a;
        k.g(xVar4, "type");
        m mVar7 = new m("expiresAt", xVar4, (String) null, rVar, rVar, rVar);
        dj.Companion.getClass();
        q0 q0Var = dj.m;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new m("organization", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
