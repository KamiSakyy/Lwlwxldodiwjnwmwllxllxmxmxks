package en0;

import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c0 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Commit");
        List list = xe0.b.a;
        aa.s c = no.a.c(list, "selections", "Commit", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        gn0.d4.Companion.getClass();
        aa.q0 q0Var = gn0.d4.j;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0Shadow.n(new aa.m("commit", q0Var, (String) null, rVar, rVar, r));
        gn0.k5.Companion.getClass();
        aa.q0 q0Var2 = gn0.k5.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("createCommitOnBranch", q0Var2, (String) null, rVar, no.a.s(wh.v, new aa.u0(new aa.t("input"))), n2));
    }
}
