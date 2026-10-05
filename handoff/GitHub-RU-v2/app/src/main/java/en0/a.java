package en0;

import gn0.lc;
import gn0.pb;
import gn0.pc;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("IssueComment");
        List list = pg0.a.a;
        aa.s c = no.a.c(list, "selections", "IssueComment", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        lc.Companion.getClass();
        aa.q0 q0Var = lc.a;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("node", q0Var, (String) null, rVar, rVar, r));
        pc.Companion.getClass();
        aa.q0 q0Var2 = pc.a;
        k71.k.g(q0Var2, "type");
        List n3 = sy.d0.n(new aa.m("commentEdge", q0Var2, (String) null, rVar, rVar, n2));
        gn0.n.Companion.getClass();
        aa.q0 q0Var3 = gn0.n.a;
        k71.k.g(q0Var3, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("addComment", q0Var3, (String) null, rVar, no.a.s(wh.a, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("subjectId", new aa.t("subject_id"))))), n3));
    }
}
