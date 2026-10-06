package h10;

import java.util.List;
import m10.ah;
import m10.ai;
import m10.eh;
import m10.ei;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("IssueComment");
        List list = ft.a.a;
        aa.s c = no.a.c(list, "selections", "IssueComment", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        ai.Companion.getClass();
        aa.q0 q0Var = ai.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("node", q0Var, (String) null, rVar, rVar, r));
        ei.Companion.getClass();
        aa.q0 q0Var2 = ei.a;
        k71.k.g(q0Var2, "type");
        List n3 = sy.d0Shadow.n(new aa.m("commentEdge", q0Var2, (String) null, rVar, rVar, n2));
        m10.r.Companion.getClass();
        aa.q0 q0Var3 = m10.r.a;
        k71.k.g(q0Var3, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("addComment", q0Var3, (String) null, rVar, no.a.s(vp.b, new aa.u0(x61.x.u(new w61.k[]{new w61.k("body", new aa.t("body")), new w61.k("subjectId", new aa.t("subject_id"))}))), n3));
    }
}
