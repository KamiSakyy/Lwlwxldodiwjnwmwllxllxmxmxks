package kz0;

import java.util.List;
import pz0.k90;
import pz0.m90;
import pz0.pd;
import pz0.s90;
import pz0.su;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x6 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.x xVar = td.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", xVar, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("name", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("UserList");
        List list = gw0.g.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "UserList", n, list), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        k90.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(k90.c), (String) null, rVar, rVar, r2));
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar4 = new aa.m("hasCreatedLists", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar);
        s90.Companion.getClass();
        aa.m mVar5 = new aa.m("suggestedListNames", no.a.d(s90.a), (String) null, rVar, rVar, r);
        m90.Companion.getClass();
        aa.r b = v8.l0.b(m90.a);
        w80.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, mVar5, new aa.m("lists", b, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(w80.m, new aa.u0(new aa.t("after"))), new aa.k(w80.n, new aa.u0(new aa.t("first")))}), n2), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = w80.W;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("user", q0Var, (String) null, rVar, no.a.s(su.y, new aa.u0(new aa.t("login"))), r3), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
