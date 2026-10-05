package jp;

import aa.m;
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
import m10.eh;
import m10.i30;
import m10.j5;
import m10.l5;
import m10.mr;
import m10.p00;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("CodingAgent");
        List list = ip.b.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "CodingAgent", n, list)});
        wg.Companion.getClass();
        x xVar2 = wg.a;
        List r2 = l.r(new m[]{new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        m mVar2 = new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        j5.Companion.getClass();
        m mVar3 = new m("nodes", l0.a(j5.a), (String) null, rVar, rVar, r);
        mr.Companion.getClass();
        List r3 = l.r(new m[]{mVar2, mVar3, new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r2)});
        ah.Companion.getClass();
        x xVar3 = ah.a;
        m mVar4 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        l5.Companion.getClass();
        q0 q0Var = l5.a;
        k.g(q0Var, "type");
        i30.Companion.getClass();
        List r4 = l.r(new m[]{mVar4, new m("viewerCodingAgents", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(i30.p0, new u0(new t("after"))), new aa.k(i30.q0, new u0(new t("first")))}), r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var2 = i30.w0;
        k.g(q0Var2, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("repository", q0Var2, (String) null, rVar, l.r(new aa.k[]{new aa.k(p00.l, new u0(new t("repoName"))), new aa.k(p00.m, new u0(new t("repoOwner")))}), r4), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
