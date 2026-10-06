package kl0;

import aa.k;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import gn0.g10;
import gn0.i10;
import gn0.k10;
import gn0.o00;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import gn0.wh;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import xk0.g;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Repository");
        List list = pj0.m.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "Repository", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("UserList");
        List list2 = g.a;
        s c = no.a.c(list2, "selections", "UserList", n2, list2);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        g10.Companion.getClass();
        List n3 = d0Shadow.n(new m("nodes", l0.a(g10.c), (String) null, rVar, rVar, r2));
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        i10.Companion.getClass();
        r b2 = l0.b(i10.a);
        s00.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("lists", b2, (String) null, rVar, l.r(new k[]{new k(s00.h, new u0((Object) null)), new k(s00.i, new u0(100))}), n3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        k10.Companion.getClass();
        x0 x0Var = k10.a;
        k71.k.g(x0Var, "type");
        m mVar4 = new m("item", x0Var, (String) null, rVar, rVar, r);
        q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        List r4 = l.r(new m[]{mVar4, new m("user", q0Var, (String) null, rVar, rVar, r3)});
        o00.Companion.getClass();
        q0 q0Var2 = o00.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = d0Shadow.n(new m("updateUserListsForItem", q0Var2, (String) null, rVar, no.a.s(wh.c1, new u0(new t("input"))), r4));
    }
}
