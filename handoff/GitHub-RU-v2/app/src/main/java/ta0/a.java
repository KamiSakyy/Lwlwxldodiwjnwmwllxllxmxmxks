package ta0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import fa0.g;
import hc0.bb;
import hc0.fb;
import hc0.v5;
import hc0.wg;
import hc0.yz;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        r b = l0.b(fb.a);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("UserList");
        List list = g.a;
        s c = no.a.c(list, "selections", "UserList", n, list);
        bb.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        yz.Companion.getClass();
        q0 q0Var = yz.c;
        k.g(q0Var, "type");
        List n2 = d0.n(new m("list", q0Var, (String) null, rVar, rVar, r));
        v5.Companion.getClass();
        q0 q0Var2 = v5.a;
        k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = d0.n(new m("createUserList", q0Var2, (String) null, rVar, no.a.s(wg.E, new u0(new t("input"))), n2));
    }
}
