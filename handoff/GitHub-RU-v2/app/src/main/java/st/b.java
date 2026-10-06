package st;

import a81.t;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hv.g;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.ly;
import m10.ux;
import m10.wh;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        x xVar3 = ch.a;
        m mVar2 = new m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        q0 q0Var = ux.T;
        List r2 = l.r(new m[]{mVar2, new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, r)});
        s mVar3 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PullRequest");
        List list = g.a;
        List r3 = l.r(new m[]{new m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("nodes", l0.a(q0Var), (String) null, rVar, rVar, l.r(new s[]{mVar3, no.a.c(list, "selections", "PullRequest", n, list), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar)}))});
        ly.Companion.getClass();
        q0 q0Var2 = ly.a;
        k.g(q0Var2, "type");
        wh.Companion.getClass();
        t tVar = wh.h;
        aa.k kVar = new aa.k(tVar, new u0(10));
        t tVar2 = wh.i;
        Boolean bool = Boolean.TRUE;
        aa.k kVar2 = new aa.k(tVar2, new u0(bool));
        t tVar3 = wh.j;
        a = l.r(new m[]{new m("closedByPullRequestsReferences", q0Var2, "userLinkedOnlyClosedByPullRequestReferences", rVar, l.r(new aa.k[]{kVar, kVar2, new aa.k(tVar3, new u0(bool))}), r2), new m("closedByPullRequestsReferences", q0Var2, "allClosedByPullRequestReferences", rVar, l.r(new aa.k[]{new aa.k(tVar, new u0(10)), new aa.k(tVar2, new u0(bool)), new aa.k(tVar3, new u0(Boolean.FALSE))}), r3), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
