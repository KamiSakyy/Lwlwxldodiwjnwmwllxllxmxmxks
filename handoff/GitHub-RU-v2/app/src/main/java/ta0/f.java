package ta0;

import aa.k;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import aa.x0;
import fa0.g;
import hc0.a00;
import hc0.bb;
import hc0.c00;
import hc0.fb;
import hc0.gz;
import hc0.kz;
import hc0.wg;
import hc0.yz;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list = x80.m.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "Repository", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("UserList");
        List list2 = g.a;
        s c = no.a.c(list2, "selections", "UserList", n2, list2);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        yz.Companion.getClass();
        List n3 = d0.n(new m("nodes", l0.a(yz.c), (String) null, rVar, rVar, r2));
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        a00.Companion.getClass();
        r b2 = l0.b(a00.a);
        kz.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("lists", b2, (String) null, rVar, l.r(new k[]{new k(kz.h, new u0((Object) null)), new k(kz.i, new u0(100))}), n3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        c00.Companion.getClass();
        x0 x0Var = c00.a;
        k71.k.g(x0Var, "type");
        m mVar4 = new m("item", x0Var, (String) null, rVar, rVar, r);
        q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        List r4 = l.r(new m[]{mVar4, new m("user", q0Var, (String) null, rVar, rVar, r3)});
        gz.Companion.getClass();
        q0 q0Var2 = gz.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = d0.n(new m("updateUserListsForItem", q0Var2, (String) null, rVar, no.a.s(wg.a1, new u0(new t("input"))), r4));
    }
}
