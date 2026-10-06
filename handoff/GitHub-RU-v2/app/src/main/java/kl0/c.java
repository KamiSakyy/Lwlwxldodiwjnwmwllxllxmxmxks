package kl0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import gn0.g10;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        List r = l.r(new m[]{mVar, new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("description", xVar, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        g10.Companion.getClass();
        q0 q0Var = g10.c;
        k.g(q0Var, "type");
        rn.Companion.getClass();
        a = d0Shadow.n(new m("list", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(rn.g, new u0(new t("login"))), new aa.k(rn.h, new u0(new t("slug")))}), r));
    }
}
