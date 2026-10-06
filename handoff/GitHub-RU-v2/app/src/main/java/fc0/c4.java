package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.hb;
import hc0.hq;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c4 {
    public static final List a;

    static {
        hb.Companion.getClass();
        aa.x xVar = hb.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("contentHTML", xVar, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar2 = fb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("path", xVar2, (String) null, rVar, rVar, rVar)});
        hq.Companion.getClass();
        aa.q0 q0Var = hq.a;
        k71.k.g(q0Var, "type");
        ap.Companion.getClass();
        aa.m mVar2 = new aa.m("readme", q0Var, (String) null, rVar, no.a.s(ap.N, new aa.u0(new aa.t("branchName"))), r);
        bb.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = ap.k0;
        k71.k.g(q0Var2, "type");
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("name"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r2));
    }
}
