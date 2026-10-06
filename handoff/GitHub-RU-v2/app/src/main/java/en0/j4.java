package en0;

import gn0.eq;
import gn0.lr;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.vb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j4 {
    public static final List a;

    static {
        vb.Companion.getClass();
        aa.x xVar = vb.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("contentHTML", xVar, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar2 = tb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("path", xVar2, (String) null, rVar, rVar, rVar)});
        lr.Companion.getClass();
        aa.q0 q0Var = lr.a;
        k71.k.g(q0Var, "type");
        eq.Companion.getClass();
        aa.m mVar2 = new aa.m("readme", q0Var, (String) null, rVar, no.a.s(eq.O, new aa.u0(new aa.t("branchName"))), r);
        pb.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = eq.m0;
        k71.k.g(q0Var2, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("name"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r2));
    }
}
