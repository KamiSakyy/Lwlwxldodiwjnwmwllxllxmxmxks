package kz0;

import java.util.List;
import pz0.pe;
import pz0.sk;
import pz0.td;
import pz0.te;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("IssueComment");
        List list = xr0.a.a;
        aa.s c = no.a.c(list, "selections", "IssueComment", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        pe.Companion.getClass();
        aa.q0 q0Var = pe.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("node", q0Var, (String) null, rVar, rVar, r));
        te.Companion.getClass();
        aa.q0 q0Var2 = te.a;
        k71.k.g(q0Var2, "type");
        List n3 = sy.d0.n(new aa.m("commentEdge", q0Var2, (String) null, rVar, rVar, n2));
        pz0.n.Companion.getClass();
        aa.q0 q0Var3 = pz0.n.a;
        k71.k.g(q0Var3, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("addComment", q0Var3, (String) null, rVar, no.a.s(sk.a, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("subjectId", new aa.t("subject_id"))))), n3));
    }
}
