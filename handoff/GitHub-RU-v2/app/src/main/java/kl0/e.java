package kl0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import gn0.g10;
import gn0.l00;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        List r = l.r(new m[]{mVar, new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("description", xVar, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        g10.Companion.getClass();
        q0 q0Var = g10.c;
        k.g(q0Var, "type");
        List n = d0.n(new m("list", q0Var, (String) null, rVar, rVar, r));
        l00.Companion.getClass();
        q0 q0Var2 = l00.a;
        k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = d0.n(new m("updateUserList", q0Var2, (String) null, rVar, no.a.s(wh.b1, new u0(new t("input"))), n));
    }
}
