package xc0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.d4;
import gn0.jj;
import gn0.lb;
import gn0.mx;
import gn0.n0;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import gn0.u10;
import gn0.x2;
import gn0.y10;
import gn0.z2;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        lb.Companion.getClass();
        x xVar = lb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, mVar2, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        pb.Companion.getClass();
        x xVar3 = pb.a;
        List r2 = l.r(new m[]{new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        u10.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("workflow", l0.b(u10.c), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, mVar5, new m("logoUrl", l0.b(mx.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("CheckSuite");
        List list = b.a;
        s c = no.a.c(list, "selections", "CheckSuite", n, list);
        y10.Companion.getClass();
        q0 q0Var = y10.b;
        k.g(q0Var, "type");
        s mVar7 = new m("workflowRun", q0Var, (String) null, rVar, rVar, r3);
        n0.Companion.getClass();
        q0 q0Var2 = n0.a;
        k.g(q0Var2, "type");
        List r5 = l.r(new s[]{mVar6, c, mVar7, new m("app", q0Var2, (String) null, rVar, rVar, r4), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        m mVar8 = new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        jj.Companion.getClass();
        m mVar9 = new m("pageInfo", l0.b(jj.a), (String) null, rVar, rVar, r);
        x2.Companion.getClass();
        List r6 = l.r(new m[]{mVar8, mVar9, new m("nodes", l0.a(x2.f), (String) null, rVar, rVar, r5)});
        m mVar10 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        z2.Companion.getClass();
        q0 q0Var3 = z2.a;
        k.g(q0Var3, "type");
        d4.Companion.getClass();
        a = l.r(new m[]{mVar10, new m("checkSuites", q0Var3, (String) null, rVar, l.r(new aa.k[]{new aa.k(d4.c, new u0(new t("afterCheckSuites"))), new aa.k(d4.d, new u0(new t("first")))}), r6), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
