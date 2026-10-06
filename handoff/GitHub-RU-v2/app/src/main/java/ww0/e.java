package ww0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.k90;
import pz0.p80;
import pz0.sk;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        List r = l.r(new m[]{mVar, new m("slug", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("description", xVar, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        k90.Companion.getClass();
        q0 q0Var = k90.c;
        k.g(q0Var, "type");
        List n = d0Shadow.n(new m("list", q0Var, (String) null, rVar, rVar, r));
        p80.Companion.getClass();
        q0 q0Var2 = p80.a;
        k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0Shadow.n(new m("updateUserList", q0Var2, (String) null, rVar, no.a.s(sk.s1, new u0(new t("input"))), n));
    }
}
