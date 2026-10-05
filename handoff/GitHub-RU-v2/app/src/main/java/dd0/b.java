package dd0;

import a0.s0;
import aa.a0;
import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.l2;
import gn0.n2;
import gn0.p2;
import gn0.pb;
import gn0.r2;
import gn0.r6;
import gn0.rb;
import gn0.rn;
import gn0.tb;
import gn0.x2;
import gn0.yh;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        x xVar2 = r6.a;
        k71.k.g(xVar2, "type");
        m mVar2 = new m("startedAt", xVar2, (String) null, rVar, rVar, rVar);
        r2.Companion.getClass();
        m mVar3 = new m("status", l0.b(r2.s), (String) null, rVar, rVar, rVar);
        l2.Companion.getClass();
        a0 a0Var = l2.s;
        k71.k.g(a0Var, "type");
        m mVar4 = new m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar3 = tb.a;
        List r = x61.l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        m mVar5 = new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        n2.Companion.getClass();
        List r2 = x61.l.r(new m[]{mVar5, new m("nodes", l0.a(n2.f), (String) null, rVar, rVar, r)});
        m mVar6 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        p2.Companion.getClass();
        q0 q0Var = p2.a;
        k71.k.g(q0Var, "type");
        x2.Companion.getClass();
        List r3 = x61.l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("CheckSuite", d0.n("CheckSuite"), x61.l.r(new m[]{mVar6, new m("checkRuns", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(x2.a, new u0((Object) null)), new aa.k(x2.b, new u0(s0.p("checkName", new t("checkRunName")))), new aa.k(x2.c, new u0(new t("first")))}), r2)}))});
        yh.Companion.getClass();
        j0 j0Var = yh.a;
        k71.k.g(j0Var, "type");
        rn.Companion.getClass();
        a = d0.n(new m("node", j0Var, (String) null, rVar, no.a.s(rn.i, new u0(new t("checkSuiteId"))), r3));
    }
}
