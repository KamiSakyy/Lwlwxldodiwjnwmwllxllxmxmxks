package h20;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.ew;
import hc0.fb;
import hc0.ji;
import hc0.m00;
import hc0.q00;
import hc0.t3;
import hc0.v2;
import hc0.x2;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        xa.Companion.getClass();
        x xVar = xa.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, mVar2, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        bb.Companion.getClass();
        x xVar3 = bb.a;
        List r2 = l.r(new m[]{new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m00.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("workflow", l0.b(m00.c), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, mVar5, new m("logoUrl", l0.b(ew.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0.n("CheckSuite");
        List list = b.a;
        s c = no.a.c(list, "selections", "CheckSuite", n, list);
        q00.Companion.getClass();
        q0 q0Var = q00.b;
        k.g(q0Var, "type");
        s mVar7 = new m("workflowRun", q0Var, (String) null, rVar, rVar, r3);
        hc0.l0.Companion.getClass();
        q0 q0Var2 = hc0.l0.a;
        k.g(q0Var2, "type");
        List r5 = l.r(new s[]{mVar6, c, mVar7, new m("app", q0Var2, (String) null, rVar, rVar, r4), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        db.Companion.getClass();
        m mVar8 = new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar);
        ji.Companion.getClass();
        m mVar9 = new m("pageInfo", l0.b(ji.a), (String) null, rVar, rVar, r);
        v2.Companion.getClass();
        List r6 = l.r(new m[]{mVar8, mVar9, new m("nodes", l0.a(v2.f), (String) null, rVar, rVar, r5)});
        m mVar10 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        x2.Companion.getClass();
        q0 q0Var3 = x2.a;
        k.g(q0Var3, "type");
        t3.Companion.getClass();
        a = l.r(new m[]{mVar10, new m("checkSuites", q0Var3, (String) null, rVar, l.r(new aa.k[]{new aa.k(t3.c, new u0(new t("afterCheckSuites"))), new aa.k(t3.d, new u0(new t("first")))}), r6), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
