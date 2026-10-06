package en0;

import gn0.eq;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.yf;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e4 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("MergeQueue");
        List list = jh0.c.a;
        aa.s c = no.a.c(list, "selections", "MergeQueue", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        yf.Companion.getClass();
        aa.q0 q0Var = yf.c;
        k71.k.g(q0Var, "type");
        eq.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("mergeQueue", q0Var, (String) null, rVar, no.a.s(eq.A, new aa.u0(new aa.t("branchName"))), r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = eq.m0;
        k71.k.g(q0Var2, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("name"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r2));
    }
}
