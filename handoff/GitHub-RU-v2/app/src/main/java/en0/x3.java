package en0;

import gn0.eq;
import gn0.mo;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x3 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Ref");
        List list = nj0.a.a;
        aa.s c = no.a.c(list, "selections", "Ref", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mo.Companion.getClass();
        aa.q0 q0Var = mo.b;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{new aa.m("defaultBranchRef", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        eq.Companion.getClass();
        aa.q0 q0Var2 = eq.m0;
        k71.k.g(q0Var2, "type");
        rn.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("repo"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r2));
    }
}
