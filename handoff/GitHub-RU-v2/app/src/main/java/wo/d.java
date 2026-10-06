package wo;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.ch0;
import m10.eh;
import m10.h1;
import m10.h4;
import m10.j4;
import m10.mr;
import m10.tg0;
import m10.wg;
import m10.y5;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        k71.k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, mVar2, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        x xVar3 = ah.a;
        List r2 = l.r(new m[]{new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        tg0.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("workflow", l0.b(tg0.e), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, mVar5, new m("logoUrl", l0.b(cc0.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("CheckSuite");
        List list = b.a;
        s c = no.a.c(list, "selections", "CheckSuite", n, list);
        ch0.Companion.getClass();
        q0 q0Var = ch0.b;
        k71.k.g(q0Var, "type");
        s mVar7 = new m("workflowRun", q0Var, (String) null, rVar, rVar, r3);
        h1.Companion.getClass();
        q0 q0Var2 = h1.a;
        k71.k.g(q0Var2, "type");
        List r5 = l.r(new s[]{mVar6, c, mVar7, new m("app", q0Var2, (String) null, rVar, rVar, r4), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        m mVar8 = new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        mr.Companion.getClass();
        m mVar9 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        h4.Companion.getClass();
        List r6 = l.r(new m[]{mVar8, mVar9, new m("nodes", l0.a(h4.f), (String) null, rVar, rVar, r5)});
        m mVar10 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        j4.Companion.getClass();
        q0 q0Var3 = j4.a;
        k71.k.g(q0Var3, "type");
        y5.Companion.getClass();
        a = l.r(new m[]{mVar10, new m("checkSuites", q0Var3, (String) null, rVar, l.r(new aa.k[]{new aa.k(y5.c, new u0(new t("afterCheckSuites"))), new aa.k(y5.d, new u0(new t("first")))}), r6), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
