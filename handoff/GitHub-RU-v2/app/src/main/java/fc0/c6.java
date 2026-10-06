package fc0;

import hc0.a00;
import hc0.bb;
import hc0.fb;
import hc0.g00;
import hc0.kz;
import hc0.pm;
import hc0.xa;
import hc0.yz;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c6 {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.x xVar = bb.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", xVar, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar2 = fb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("name", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("UserList");
        List list = fa0.g.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "UserList", n, list), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        yz.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(yz.c), (String) null, rVar, rVar, r2));
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        aa.m mVar4 = new aa.m("hasCreatedLists", v8.l0.b(xa.a), (String) null, rVar, rVar, rVar);
        g00.Companion.getClass();
        aa.m mVar5 = new aa.m("suggestedListNames", no.a.d(g00.a), (String) null, rVar, rVar, r);
        a00.Companion.getClass();
        aa.r b = v8.l0.b(a00.a);
        kz.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, new aa.m("lists", b, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(kz.h, new aa.u0(new aa.t("after"))), new aa.k(kz.i, new aa.u0(new aa.t("first")))}), n2), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("user", q0Var, (String) null, rVar, no.a.s(pm.q, new aa.u0(new aa.t("login"))), r3));
    }
}
