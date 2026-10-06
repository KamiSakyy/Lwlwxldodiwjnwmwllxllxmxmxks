package ry;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import cu.c;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.me;
import m10.om;
import m10.sm;
import m10.ux;
import m10.vp;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("MergeQueue");
        List list = c.a;
        s c = no.a.c(list, "selections", "MergeQueue", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("MergeQueueEntry");
        List list2 = cu.b.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list2, "selections", "MergeQueueEntry", n2, list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar4 = new m("isInMergeQueue", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        om.Companion.getClass();
        q0 q0Var = om.d;
        k.g(q0Var, "type");
        m mVar5 = new m("mergeQueue", q0Var, (String) null, rVar, rVar, r);
        sm.Companion.getClass();
        q0 q0Var2 = sm.a;
        k.g(q0Var2, "type");
        List r3 = l.r(new m[]{mVar3, mVar4, mVar5, new m("mergeQueueEntry", q0Var2, (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        q0 q0Var3 = ux.T;
        k.g(q0Var3, "type");
        List n3 = d0Shadow.n(new m("mergeQueueEntry", q0Var2, (String) null, rVar, rVar, l.r(new m[]{mVar6, new m("pullRequest", q0Var3, (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        me.Companion.getClass();
        q0 q0Var4 = me.a;
        k.g(q0Var4, "type");
        vp.Companion.getClass();
        a = d0Shadow.n(new m("enqueuePullRequest", q0Var4, (String) null, rVar, no.a.s(vp.e0, new u0(x61.x.u(new w61.k[]{new w61.k("expectedHeadOid", new t("expectedHeadOid")), new w61.k("pullRequestId", new t("id"))}))), n3));
    }
}
