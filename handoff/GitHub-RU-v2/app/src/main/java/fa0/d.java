package fa0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.di;
import hc0.fb;
import hc0.h6;
import hc0.hb;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Organization");
        List list = d30.c.a;
        s c = no.a.c(list, "selections", "Organization", n, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        x xVar3 = hb.a;
        k.g(xVar3, "type");
        m mVar3 = new m("emojiHTML", xVar3, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        m mVar4 = new m("indicatesLimitedAvailability", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("message", xVar, (String) null, rVar, rVar, rVar);
        m mVar6 = new m("emoji", xVar, (String) null, rVar, rVar, rVar);
        h6.Companion.getClass();
        x xVar4 = h6.a;
        k.g(xVar4, "type");
        m mVar7 = new m("expiresAt", xVar4, (String) null, rVar, rVar, rVar);
        di.Companion.getClass();
        q0 q0Var = di.m;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new m("organization", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
