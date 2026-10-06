package pm0;

import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import gn0.c00;
import gn0.eq;
import gn0.pb;
import gn0.tb;
import gn0.vb;
import gn0.wh;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        k.g(xVar, "type");
        m mVar2 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        vb.Companion.getClass();
        x xVar2 = vb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("descriptionHTML", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("shortDescriptionHTML", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        eq.Companion.getClass();
        q0 q0Var = eq.m0;
        k.g(q0Var, "type");
        List n = d0Shadow.n(new m("repository", q0Var, (String) null, rVar, rVar, r));
        c00.Companion.getClass();
        q0 q0Var2 = c00.a;
        k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = d0Shadow.n(new m("updateRepository", q0Var2, (String) null, rVar, no.a.s(wh.X0, new u0(x61.x.u(new w61.k("description", new t("description")), new w61.k("repositoryId", new t("repositoryId"))))), n));
    }
}
