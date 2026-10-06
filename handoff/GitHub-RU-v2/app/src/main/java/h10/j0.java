package h10;

import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.n9;
import m10.vp;
import m10.wh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Issue");
        List list = ew.t.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.s mVar4 = new aa.m("url", v8.l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.s mVar5 = new aa.m("number", v8.l0.b(ch.a), (String) null, rVar, rVar, rVar);
        wh.Companion.getClass();
        aa.q0 q0Var = wh.B;
        k71.k.g(q0Var, "type");
        aa.s mVar6 = new aa.m("parent", q0Var, (String) null, rVar, rVar, r);
        List n2 = sy.d0Shadow.n("Issue");
        List list2 = ew.r.a;
        List n3 = sy.d0Shadow.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar2, mVar3, mVar4, mVar5, mVar6, no.a.c(list2, "selections", "Issue", n2, list2)})));
        n9.Companion.getClass();
        aa.q0 q0Var2 = n9.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createIssue", q0Var2, (String) null, rVar, no.a.s(vp.H, new aa.u0(new aa.t("createIssueInput"))), n3));
    }
}
