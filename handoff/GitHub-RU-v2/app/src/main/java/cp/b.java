package cp;

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
import m10.ah;
import m10.b4;
import m10.ch;
import m10.eh;
import m10.h4;
import m10.p00;
import m10.sa;
import m10.t3;
import m10.v3;
import m10.x3;
import m10.zp;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        sa.Companion.getClass();
        x xVar2 = sa.a;
        k71.k.g(xVar2, "type");
        aa.m mVar2 = new aa.m("startedAt", xVar2, (String) null, rVar, rVar, rVar);
        b4.Companion.getClass();
        aa.m mVar3 = new aa.m("status", l0.b(b4.s), (String) null, rVar, rVar, rVar);
        t3.Companion.getClass();
        a0 a0Var = t3.s;
        k71.k.g(a0Var, "type");
        aa.m mVar4 = new aa.m("conclusion", a0Var, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar3 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        aa.m mVar5 = new aa.m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        v3.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar5, new aa.m("nodes", l0.a(v3.f), (String) null, rVar, rVar, r)});
        aa.m mVar6 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        x3.Companion.getClass();
        q0 q0Var = x3.a;
        k71.k.g(q0Var, "type");
        h4.Companion.getClass();
        List r3 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("CheckSuite", d0.n("CheckSuite"), x61.l.r(new aa.m[]{mVar6, new aa.m("checkRuns", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(h4.a, new u0((Object) null)), new aa.k(h4.b, new u0(s0.p("checkName", new t("checkRunName")))), new aa.k(h4.c, new u0(new t("first")))}), r2)}))});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("checkSuiteId"))), r3), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
