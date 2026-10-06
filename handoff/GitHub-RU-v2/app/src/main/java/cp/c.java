package cp;

import aa.j0;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch0;
import m10.d4;
import m10.eh;
import m10.f4;
import m10.h4;
import m10.p00;
import m10.tg0;
import m10.v3;
import m10.zp;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        tg0.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("workflow", l0.b(tg0.e), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ch0.Companion.getClass();
        q0 q0Var = ch0.b;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("workflowRun", q0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar4 = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("CheckStep");
        List list = wo.a.a;
        List r4 = x61.l.r(new s[]{mVar4, no.a.c(list, "selections", "CheckStep", n, list)});
        d4.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(d4.a), (String) null, rVar, rVar, r4));
        s mVar5 = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("CheckRun");
        List list2 = wo.f.a;
        s c = no.a.c(list2, "selections", "CheckRun", n3, list2);
        h4.Companion.getClass();
        s mVar6 = new aa.m("checkSuite", l0.b(h4.f), (String) null, rVar, rVar, r3);
        f4.Companion.getClass();
        q0 q0Var2 = f4.a;
        k71.k.g(q0Var2, "type");
        v3.Companion.getClass();
        List r5 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("CheckRun", d0Shadow.n("CheckRun"), x61.l.r(new s[]{mVar5, c, mVar6, new aa.m("steps", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(v3.d, new u0(1)), new aa.k(v3.e, new u0(new t("step")))}), n2)})), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("id"))), r5), new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
