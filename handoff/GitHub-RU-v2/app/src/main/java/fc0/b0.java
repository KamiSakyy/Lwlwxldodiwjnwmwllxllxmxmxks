package fc0;

import hc0.bb;
import hc0.fb;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Commit");
        List list = h40.b.a;
        aa.s c = no.a.c(list, "selections", "Commit", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        hc0.t3.Companion.getClass();
        aa.q0 q0Var = hc0.t3.j;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("commit", q0Var, (String) null, rVar, rVar, r));
        hc0.a5.Companion.getClass();
        aa.q0 q0Var2 = hc0.a5.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createCommitOnBranch", q0Var2, (String) null, rVar, no.a.s(wg.v, new aa.u0(new aa.t("input"))), n2));
    }
}
