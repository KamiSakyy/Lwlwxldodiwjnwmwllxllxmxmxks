package en0;

import gn0.g10;
import gn0.i10;
import gn0.lb;
import gn0.o10;
import gn0.pb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j6 {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.x xVar = pb.a;
        k71.k.g(xVar, "type");
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", xVar, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("name", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("UserList");
        List list = xk0.g.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "UserList", n, list), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        g10.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("nodes", v8.l0.a(g10.c), (String) null, rVar, rVar, r2));
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        aa.m mVar4 = new aa.m("hasCreatedLists", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar);
        o10.Companion.getClass();
        aa.m mVar5 = new aa.m("suggestedListNames", no.a.d(o10.a), (String) null, rVar, rVar, r);
        i10.Companion.getClass();
        aa.r b = v8.l0.b(i10.a);
        s00.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, new aa.m("lists", b, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(s00.h, new aa.u0(new aa.t("after"))), new aa.k(s00.i, new aa.u0(new aa.t("first")))}), n2), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("user", q0Var, (String) null, rVar, no.a.s(rn.y, new aa.u0(new aa.t("login"))), r3));
    }
}
