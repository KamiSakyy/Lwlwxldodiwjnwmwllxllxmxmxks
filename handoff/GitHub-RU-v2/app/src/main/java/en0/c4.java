package en0;

import gn0.eq;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c4 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("licenseContents", xVar, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        eq.Companion.getClass();
        aa.q0 q0Var = eq.m0;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new aa.u0(new aa.t("name"))), new aa.k(rn.m, new aa.u0(new aa.t("owner")))}), r));
    }
}
