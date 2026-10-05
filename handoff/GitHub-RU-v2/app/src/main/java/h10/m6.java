package h10;

import java.util.List;
import m10.ah;
import m10.de0;
import m10.eh;
import m10.gj;
import m10.vp;
import m10.wh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m6 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("IssueType");
        List list = ht.a.a;
        aa.s c = no.a.c(list, "selections", "IssueType", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gj.Companion.getClass();
        aa.q0 q0Var = gj.a;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("issueType", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        wh.Companion.getClass();
        aa.q0 q0Var2 = wh.B;
        k71.k.g(q0Var2, "type");
        List n2 = sy.d0.n(new aa.m("issue", q0Var2, (String) null, rVar, rVar, r2));
        de0.Companion.getClass();
        aa.q0 q0Var3 = de0.a;
        k71.k.g(q0Var3, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("updateIssueIssueType", q0Var3, (String) null, rVar, no.a.s(vp.i1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("issueId", new aa.t("issueId")), new w61.k("issueTypeId", new aa.t("issueTypeId"))}))), n2));
    }
}
