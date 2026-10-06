package dd0;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.mx;
import gn0.n0;
import gn0.pb;
import gn0.rn;
import gn0.tb;
import gn0.u10;
import gn0.y10;
import gn0.yh;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = x61.l.r(new m[]{mVar, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        u10.Companion.getClass();
        List r2 = x61.l.r(new m[]{mVar2, new m("workflow", l0.b(u10.c), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        List r3 = x61.l.r(new m[]{mVar3, mVar4, new m("logoUrl", l0.b(mx.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("CheckSuite");
        List list = xc0.b.a;
        s c = no.a.c(list, "selections", "CheckSuite", n, list);
        y10.Companion.getClass();
        q0 q0Var = y10.b;
        k71.k.g(q0Var, "type");
        s mVar6 = new m("workflowRun", q0Var, (String) null, rVar, rVar, r2);
        n0.Companion.getClass();
        q0 q0Var2 = n0.a;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("CheckSuite", d0Shadow.n("CheckSuite"), x61.l.r(new s[]{mVar5, c, mVar6, new m("app", q0Var2, (String) null, rVar, rVar, r3)}))});
        yh.Companion.getClass();
        j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = d0Shadow.n(new m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new u0(new t("id"))), r4));
    }
}
