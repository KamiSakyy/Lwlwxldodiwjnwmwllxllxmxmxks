package h10;

import java.util.List;
import m10.ah;
import m10.cc0;
import m10.eh;
import m10.vp;
import m10.wh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.s mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.x xVar3 = cc0.a;
        aa.s mVar3 = new aa.m("url", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Issue");
        List list = ew.s.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        List n2 = sy.d0.n("Issue");
        List list2 = ew.t.a;
        List r = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, c, no.a.c(list2, "selections", "Issue", n2, list2)});
        aa.s mVar4 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar6 = new aa.m("url", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n3 = sy.d0.n("Issue");
        List list3 = ew.e.a;
        List r2 = x61.l.r(new aa.s[]{mVar4, mVar5, mVar6, no.a.c(list3, "selections", "Issue", n3, list3)});
        wh.Companion.getClass();
        aa.q0 q0Var = wh.B;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{new aa.m("issue", q0Var, (String) null, rVar, rVar, r), new aa.m("subIssue", q0Var, (String) null, rVar, rVar, r2)});
        m10.o0.Companion.getClass();
        aa.q0 q0Var2 = m10.o0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("addSubIssue", q0Var2, (String) null, rVar, no.a.s(vp.m, new aa.u0(new aa.t("addSubIssueInput"))), r3));
    }
}
