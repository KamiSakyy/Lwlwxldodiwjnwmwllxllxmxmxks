package ww0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import gw0.g;
import java.util.List;
import k71.k;
import pz0.k90;
import pz0.sk;
import pz0.td;
import pz0.w6;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        r b = l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("UserList");
        List list = g.a;
        s c = no.a.c(list, "selections", "UserList", n, list);
        td.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar)});
        k90.Companion.getClass();
        q0 q0Var = k90.c;
        k.g(q0Var, "type");
        List n2 = d0Shadow.n(new m("list", q0Var, (String) null, rVar, rVar, r));
        w6.Companion.getClass();
        q0 q0Var2 = w6.a;
        k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0Shadow.n(new m("createUserList", q0Var2, (String) null, rVar, no.a.s(sk.K, new u0(new t("input"))), n2));
    }
}
