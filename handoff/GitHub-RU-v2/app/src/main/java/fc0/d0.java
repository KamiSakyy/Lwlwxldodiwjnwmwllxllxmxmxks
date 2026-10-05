package fc0;

import hc0.bb;
import hc0.db;
import hc0.ew;
import hc0.fb;
import hc0.tb;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d0 {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = v8.l0.b(bb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        aa.m mVar2 = new aa.m("url", v8.l0.b(ew.a), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        aa.m mVar3 = new aa.m("number", v8.l0.b(db.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        tb.Companion.getClass();
        aa.q0 q0Var = tb.x;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("issue", q0Var, (String) null, rVar, rVar, r));
        hc0.k5.Companion.getClass();
        aa.q0 q0Var2 = hc0.k5.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("createIssue", q0Var2, (String) null, rVar, no.a.s(wg.z, new aa.u0(new aa.t("createIssueInput"))), n));
    }
}
