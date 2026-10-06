package gw0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import pz0.bm;
import pz0.o7;
import pz0.pd;
import pz0.td;
import pz0.xd;
import pz0.zd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Organization");
        List list = bp0.r.a;
        s c = no.a.c(list, "selections", "Organization", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        zd.Companion.getClass();
        x xVar3 = zd.a;
        k.g(xVar3, "type");
        m mVar3 = new m("emojiHTML", xVar3, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        m mVar4 = new m("indicatesLimitedAvailability", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("message", xVar, (String) null, rVar, rVar, rVar);
        m mVar6 = new m("emoji", xVar, (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        x xVar4 = o7.a;
        k.g(xVar4, "type");
        m mVar7 = new m("expiresAt", xVar4, (String) null, rVar, rVar, rVar);
        bm.Companion.getClass();
        q0 q0Var = bm.o;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, new m("organization", q0Var, (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
