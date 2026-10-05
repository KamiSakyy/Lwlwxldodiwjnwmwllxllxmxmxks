package tb0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.hb;
import hc0.uy;
import hc0.wg;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        k.g(xVar, "type");
        m mVar2 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        x xVar2 = hb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("descriptionHTML", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("shortDescriptionHTML", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ap.Companion.getClass();
        q0 q0Var = ap.k0;
        k.g(q0Var, "type");
        List n = d0.n(new m("repository", q0Var, (String) null, rVar, rVar, r));
        uy.Companion.getClass();
        q0 q0Var2 = uy.a;
        k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = d0.n(new m("updateRepository", q0Var2, (String) null, rVar, no.a.s(wg.V0, new u0(x61.x.u(new w61.k[]{new w61.k("description", new t("description")), new w61.k("repositoryId", new t("repositoryId"))}))), n));
    }
}
