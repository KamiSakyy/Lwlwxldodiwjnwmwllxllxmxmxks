package dd0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.eq;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.w10;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowConnection");
        List list = xc0.g.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "WorkflowConnection", n, list)});
        pb.Companion.getClass();
        m mVar2 = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        w10.Companion.getClass();
        r b2 = l0.b(w10.a);
        eq.Companion.getClass();
        List r2 = x61.l.r(new m[]{mVar2, new m("workflows", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(eq.j0, new u0(new t("after"))), new aa.k(eq.k0, new u0(new t("first"))), new aa.k(eq.l0, new u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "NAME"))))}), r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = eq.m0;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = d0Shadow.n(new m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.l, new u0(new t("repositoryName"))), new aa.k(rn.m, new u0(new t("repositoryOwner")))}), r2));
    }
}
