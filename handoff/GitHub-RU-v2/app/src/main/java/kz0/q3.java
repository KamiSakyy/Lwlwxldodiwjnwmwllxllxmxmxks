package kz0;

import java.util.List;
import pz0.h50;
import pz0.le;
import pz0.pw;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q3 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Issue");
        List list = vu0.s.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.s mVar4 = new aa.m("url", v8.l0.b(h50.a), (String) null, rVar, rVar, rVar);
        le.Companion.getClass();
        aa.q0 q0Var = le.A;
        k71.k.g(q0Var, "type");
        aa.s mVar5 = new aa.m("parent", q0Var, (String) null, rVar, rVar, r);
        List n2 = sy.d0Shadow.n("Issue");
        List list2 = vu0.q.a;
        List r2 = x61.l.r(new aa.m[]{new aa.m("issue", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar2, mVar3, mVar4, mVar5, no.a.c(list2, "selections", "Issue", n2, list2)})), new aa.m("subIssue", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("parent", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)}))});
        pw.Companion.getClass();
        aa.q0 q0Var2 = pw.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("removeSubIssue", q0Var2, (String) null, rVar, no.a.s(sk.A0, new aa.u0(new aa.t("removeSubIssueInput"))), r2));
    }
}
