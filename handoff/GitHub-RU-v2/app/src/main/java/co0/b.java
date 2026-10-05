package co0;

import a0.s0;
import aa.a0;
import aa.j0;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.a3;
import pz0.c3;
import pz0.e3;
import pz0.k3;
import pz0.o7;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.wk;
import pz0.xd;
import pz0.y2;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        x xVar2 = o7.a;
        k71.k.g(xVar2, "type");
        aa.m mVar2 = new aa.m("startedAt", xVar2, (String) null, rVar, rVar, rVar);
        e3.Companion.getClass();
        aa.m mVar3 = new aa.m("status", l0.b(e3.s), (String) null, rVar, rVar, rVar);
        y2.Companion.getClass();
        a0 a0Var = y2.s;
        k71.k.g(a0Var, "type");
        aa.m mVar4 = new aa.m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar3 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        aa.m mVar5 = new aa.m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        a3.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar5, new aa.m("nodes", l0.a(a3.f), (String) null, rVar, rVar, r)});
        aa.m mVar6 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        c3.Companion.getClass();
        q0 q0Var = c3.a;
        k71.k.g(q0Var, "type");
        k3.Companion.getClass();
        List r3 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("CheckSuite", d0.n("CheckSuite"), x61.l.r(new aa.m[]{mVar6, new aa.m("checkRuns", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(k3.a, new u0((Object) null)), new aa.k(k3.b, new u0(s0.p("checkName", new t("checkRunName")))), new aa.k(k3.c, new u0(new t("first")))}), r2)}))});
        wk.Companion.getClass();
        j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new u0(new t("checkSuiteId"))), r3), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
