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
import m10.ch;
import m10.d00;
import m10.eh;
import m10.l90;
import m10.mr;
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
public abstract class b {
    public static final List a;

    static {
        ch.Companion.getClass();
        r b = l0.b(ch.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("count", b, (String) null, rVar, rVar, rVar);
        v90.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("state", l0.b(v90.s), (String) null, rVar, rVar, rVar)});
        z3.Companion.getClass();
        List n = d0Shadow.n(new m("summary", no.a.d(z3.a), (String) null, rVar, rVar, r));
        eh.Companion.getClass();
        x xVar = eh.a;
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("PageInfo");
        List list = yx.a.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list, "selections", "PageInfo", n2, list)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("StatusCheck");
        List list2 = vw.a.a;
        s c = no.a.c(list2, "selections", "StatusCheck", n3, list2);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r3 = l.r(new s[]{mVar3, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        m mVar4 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r2);
        l90.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, new m("nodes", l0.a(l90.a), (String) null, rVar, rVar, r3)});
        z90.Companion.getClass();
        m mVar5 = new m("statusRollup", l0.b(z90.a), (String) null, rVar, rVar, n);
        n90.Companion.getClass();
        q0 q0Var = n90.a;
        k.g(q0Var, "type");
        d00.Companion.getClass();
        List r5 = l.r(new m[]{mVar5, new m("statusChecks", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(d00.a, new u0(new t("after"))), new aa.k(d00.b, new u0(new t("first")))}), r4)});
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        q0 q0Var2 = d00.c;
        k.g(q0Var2, "type");
        ux.Companion.getClass();
        List r6 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new m[]{mVar6, new m("pullRequestStatus", q0Var2, (String) null, rVar, no.a.s(ux.B, new u0(Boolean.FALSE)), r5)})), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        j0 j0Var = zp.a;
        k.g(j0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new u0(new t("nodeId"))), r6), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
