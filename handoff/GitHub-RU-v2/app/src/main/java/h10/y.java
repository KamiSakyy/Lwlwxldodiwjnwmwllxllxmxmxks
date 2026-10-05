package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.vp;
import m10.wh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class y {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Issue");
        List list = dt.a.a;
        aa.s c = no.a.c(list, "selections", "Issue", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("Issue");
        List list2 = dt.f.a;
        aa.s c2 = no.a.c(list2, "selections", "Issue", n2, list2);
        wh.Companion.getClass();
        aa.q0 q0Var = wh.B;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar2, c2, new aa.m("duplicateOf", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        m10.t4.Companion.getClass();
        aa.q0 q0Var2 = m10.t4.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("closeIssue", q0Var2, (String) null, rVar, no.a.s(vp.z, new aa.u0(x61.x.u(new w61.k[]{new w61.k("duplicateIssueId", new aa.t("duplicateIssueId")), new w61.k("issueId", new aa.t("id")), new w61.k("stateReason", new aa.t("stateReason"))}))), n3));
    }
}
