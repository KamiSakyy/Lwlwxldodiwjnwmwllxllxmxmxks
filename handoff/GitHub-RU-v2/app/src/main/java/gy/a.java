package gy;

import aa.j0;
import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ba0;
import m10.ch;
import m10.d00;
import m10.eh;
import m10.l90;
import m10.n90;
import m10.p00;
import m10.ux;
import m10.v90;
import m10.z3;
import m10.z90;
import m10.zp;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("StatusCheck");
        List list = vw.a.a;
        s c = no.a.c(list, "selections", "StatusCheck", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        l90.Companion.getClass();
        List n2 = d0Shadow.n(new m("nodes", l0.a(l90.a), (String) null, rVar, rVar, r));
        ch.Companion.getClass();
        m mVar2 = new m("count", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        v90.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("state", l0.b(v90.s), (String) null, rVar, rVar, rVar)});
        ba0.Companion.getClass();
        m mVar3 = new m("combinedState", l0.b(ba0.s), (String) null, rVar, rVar, rVar);
        z3.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("summary", no.a.d(z3.a), (String) null, rVar, rVar, r2)});
        n90.Companion.getClass();
        q0 q0Var = n90.a;
        k.g(q0Var, "type");
        d00.Companion.getClass();
        m mVar4 = new m("statusChecks", q0Var, (String) null, rVar, no.a.s(d00.b, new u0(5)), n2);
        z90.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, new m("statusRollup", l0.b(z90.a), (String) null, rVar, rVar, r3)});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        q0 q0Var2 = d00.c;
        k.g(q0Var2, "type");
        ux.Companion.getClass();
        List r5 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new m[]{mVar5, new m("pullRequestStatus", q0Var2, (String) null, rVar, no.a.s(ux.B, new u0(Boolean.FALSE)), r4)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k.g(j0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("nodeId"))), r5), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
