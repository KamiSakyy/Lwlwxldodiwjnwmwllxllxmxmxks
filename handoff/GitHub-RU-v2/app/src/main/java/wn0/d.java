package wn0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.h50;
import pz0.ha0;
import pz0.hm;
import pz0.k3;
import pz0.m3;
import pz0.pd;
import pz0.s4;
import pz0.td;
import pz0.vd;
import pz0.w0;
import pz0.xd;
import pz0.y90;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        pd.Companion.getClass();
        x xVar = pd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        k71.k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, mVar2, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        td.Companion.getClass();
        x xVar3 = td.a;
        List r2 = l.r(new m[]{new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        y90.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("workflow", l0.b(y90.e), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, mVar5, new m("logoUrl", l0.b(h50.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("CheckSuite");
        List list = b.a;
        s c = no.a.c(list, "selections", "CheckSuite", n, list);
        ha0.Companion.getClass();
        q0 q0Var = ha0.b;
        k71.k.g(q0Var, "type");
        s mVar7 = new m("workflowRun", q0Var, (String) null, rVar, rVar, r3);
        w0.Companion.getClass();
        q0 q0Var2 = w0.a;
        k71.k.g(q0Var2, "type");
        List r5 = l.r(new s[]{mVar6, c, mVar7, new m("app", q0Var2, (String) null, rVar, rVar, r4), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        m mVar8 = new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        hm.Companion.getClass();
        m mVar9 = new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r);
        k3.Companion.getClass();
        List r6 = l.r(new m[]{mVar8, mVar9, new m("nodes", l0.a(k3.f), (String) null, rVar, rVar, r5)});
        m mVar10 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m3.Companion.getClass();
        q0 q0Var3 = m3.a;
        k71.k.g(q0Var3, "type");
        s4.Companion.getClass();
        a = l.r(new m[]{mVar10, new m("checkSuites", q0Var3, (String) null, rVar, l.r(new aa.k[]{new aa.k(s4.c, new u0(new t("afterCheckSuites"))), new aa.k(s4.d, new u0(new t("first")))}), r6), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
