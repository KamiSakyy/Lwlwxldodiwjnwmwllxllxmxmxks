package n20;

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
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.h6;
import hc0.j2;
import hc0.l2;
import hc0.n2;
import hc0.p2;
import hc0.pm;
import hc0.v2;
import hc0.yg;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        h6.Companion.getClass();
        x xVar2 = h6.a;
        k71.k.g(xVar2, "type");
        m mVar2 = new m("startedAt", xVar2, (String) null, rVar, rVar, rVar);
        p2.Companion.getClass();
        m mVar3 = new m("status", l0.b(p2.s), (String) null, rVar, rVar, rVar);
        j2.Companion.getClass();
        a0 a0Var = j2.s;
        k71.k.g(a0Var, "type");
        m mVar4 = new m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar3 = fb.a;
        List r = x61.l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        db.Companion.getClass();
        m mVar5 = new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar);
        l2.Companion.getClass();
        List r2 = x61.l.r(new m[]{mVar5, new m("nodes", l0.a(l2.f), (String) null, rVar, rVar, r)});
        m mVar6 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        n2.Companion.getClass();
        q0 q0Var = n2.a;
        k71.k.g(q0Var, "type");
        v2.Companion.getClass();
        List r3 = x61.l.r(new s[]{new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("CheckSuite", d0Shadow.n("CheckSuite"), x61.l.r(new m[]{mVar6, new m("checkRuns", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(v2.a, new u0((Object) null)), new aa.k(v2.b, new u0(s0.p("checkName", new t("checkRunName")))), new aa.k(v2.c, new u0(new t("first")))}), r2)}))});
        yg.Companion.getClass();
        j0 j0Var = yg.a;
        k71.k.g(j0Var, "type");
        pm.Companion.getClass();
        a = d0Shadow.n(new m("node", j0Var, (String) null, rVar, no.a.s(pm.f, new u0(new t("checkSuiteId"))), r3));
    }
}
