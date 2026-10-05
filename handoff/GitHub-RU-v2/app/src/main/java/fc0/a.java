package fc0;

import hc0.bb;
import hc0.bc;
import hc0.fb;
import hc0.wg;
import hc0.xb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("IssueComment");
        List list = z50.a.a;
        aa.s c = no.a.c(list, "selections", "IssueComment", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        xb.Companion.getClass();
        aa.q0 q0Var = xb.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("node", q0Var, (String) null, rVar, rVar, r));
        bc.Companion.getClass();
        aa.q0 q0Var2 = bc.a;
        k71.k.g(q0Var2, "type");
        List n3 = sy.d0.n(new aa.m("commentEdge", q0Var2, (String) null, rVar, rVar, n2));
        hc0.n.Companion.getClass();
        aa.q0 q0Var3 = hc0.n.a;
        k71.k.g(q0Var3, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("addComment", q0Var3, (String) null, rVar, no.a.s(wg.a, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("subjectId", new aa.t("subject_id"))))), n3));
    }
}
