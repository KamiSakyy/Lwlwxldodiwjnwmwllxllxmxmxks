package kz0;

import java.util.List;
import pz0.h50;
import pz0.le;
import pz0.sk;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Issue");
        List list = vu0.s.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.s mVar4 = new aa.m("url", v8.l0.b(h50.a), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.s mVar5 = new aa.m("number", v8.l0.b(vd.a), (String) null, rVar, rVar, rVar);
        le.Companion.getClass();
        aa.q0 q0Var = le.A;
        k71.k.g(q0Var, "type");
        aa.s mVar6 = new aa.m("parent", q0Var, (String) null, rVar, rVar, r);
        List n2 = sy.d0.n("Issue");
        List list2 = vu0.q.a;
        List n3 = sy.d0.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar2, mVar3, mVar4, mVar5, mVar6, no.a.c(list2, "selections", "Issue", n2, list2)})));
        pz0.j6.Companion.getClass();
        aa.q0 q0Var2 = pz0.j6.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("createIssue", q0Var2, (String) null, rVar, no.a.s(sk.E, new aa.u0(new aa.t("createIssueInput"))), n3));
    }
}
