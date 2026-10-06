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
import m10.cc0;
import m10.ch0;
import m10.eh;
import m10.h1;
import m10.p00;
import m10.tg0;
import m10.zp;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        tg0.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("workflow", l0.b(tg0.e), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("logoUrl", l0.b(cc0.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar5 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("CheckSuite");
        List list = wo.b.a;
        s c = no.a.c(list, "selections", "CheckSuite", n, list);
        ch0.Companion.getClass();
        q0 q0Var = ch0.b;
        k71.k.g(q0Var, "type");
        s mVar6 = new aa.m("workflowRun", q0Var, (String) null, rVar, rVar, r2);
        h1.Companion.getClass();
        q0 q0Var2 = h1.a;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new s[]{new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("CheckSuite", d0Shadow.n("CheckSuite"), x61.l.r(new s[]{mVar5, c, mVar6, new aa.m("app", q0Var2, (String) null, rVar, rVar, r3)}))});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("id"))), r4), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
