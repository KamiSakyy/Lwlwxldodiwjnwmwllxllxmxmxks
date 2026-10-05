package ww0;

import aa.k;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import gw0.g;
import java.util.List;
import pz0.k90;
import pz0.m90;
import pz0.o90;
import pz0.s80;
import pz0.sk;
import pz0.td;
import pz0.w80;
import pz0.xd;
import sy.d0;
import v8.l0;
import vu0.u;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list = u.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "Repository", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("UserList");
        List list2 = g.a;
        s c = no.a.c(list2, "selections", "UserList", n2, list2);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        k90.Companion.getClass();
        List n3 = d0.n(new m("nodes", l0.a(k90.c), (String) null, rVar, rVar, r2));
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m90.Companion.getClass();
        r b2 = l0.b(m90.a);
        w80.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("lists", b2, (String) null, rVar, l.r(new k[]{new k(w80.m, new u0((Object) null)), new k(w80.n, new u0(100))}), n3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        o90.Companion.getClass();
        x0 x0Var = o90.a;
        k71.k.g(x0Var, "type");
        m mVar4 = new m("item", x0Var, (String) null, rVar, rVar, r);
        q0 q0Var = w80.W;
        k71.k.g(q0Var, "type");
        List r4 = l.r(new m[]{mVar4, new m("user", q0Var, (String) null, rVar, rVar, r3)});
        s80.Companion.getClass();
        q0 q0Var2 = s80.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = d0.n(new m("updateUserListsForItem", q0Var2, (String) null, rVar, no.a.s(sk.t1, new u0(new t("input"))), r4));
    }
}
