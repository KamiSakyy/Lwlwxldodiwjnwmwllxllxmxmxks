package kz0;

import java.util.List;
import pz0.h50;
import pz0.le;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.x xVar3 = h50.a;
        aa.s mVar3 = new aa.m("url", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Issue");
        List list = vu0.r.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        List n2 = sy.d0Shadow.n("Issue");
        List list2 = vu0.s.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, no.a.c(list2, "selections", "Issue", n2, list2)});
        aa.s mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar6 = new aa.m("url", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0Shadow.n("Issue");
        List list3 = vu0.e.a;
        List r2 = x61.l.r(new aa.s[]{mVar4, mVar5, mVar6, no.a.c(list3, "selections", "Issue", n3, list3)});
        le.Companion.getClass();
        aa.q0 q0Var = le.A;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{new aa.m("issue", q0Var, (String) null, rVar, rVar, r), new aa.m("subIssue", q0Var, (String) null, rVar, rVar, r2)});
        pz0.k0.Companion.getClass();
        aa.q0 q0Var2 = pz0.k0.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addSubIssue", q0Var2, (String) null, rVar, no.a.s(sk.l, new aa.u0(new aa.t("addSubIssueInput"))), r3));
    }
}
