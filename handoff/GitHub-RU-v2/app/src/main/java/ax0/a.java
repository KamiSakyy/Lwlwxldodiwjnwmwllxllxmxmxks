package ax0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.hs;
import pz0.ki;
import pz0.m9;
import pz0.oi;
import pz0.pd;
import pz0.sk;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import ts0.c;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("MergeQueue");
        List list = c.a;
        s c = no.a.c(list, "selections", "MergeQueue", n, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("MergeQueueEntry");
        List list2 = ts0.b.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list2, "selections", "MergeQueueEntry", n2, list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        m mVar4 = new m("isInMergeQueue", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        ki.Companion.getClass();
        q0 q0Var = ki.c;
        k.g(q0Var, "type");
        m mVar5 = new m("mergeQueue", q0Var, (String) null, rVar, rVar, r);
        oi.Companion.getClass();
        q0 q0Var2 = oi.a;
        k.g(q0Var2, "type");
        List r3 = l.r(new m[]{mVar3, mVar4, mVar5, new m("mergeQueueEntry", q0Var2, (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hs.Companion.getClass();
        q0 q0Var3 = hs.N;
        k.g(q0Var3, "type");
        List n3 = d0Shadow.n(new m("mergeQueueEntry", q0Var2, (String) null, rVar, rVar, l.r(new m[]{mVar6, new m("pullRequest", q0Var3, (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        m9.Companion.getClass();
        q0 q0Var4 = m9.a;
        k.g(q0Var4, "type");
        sk.Companion.getClass();
        a = d0Shadow.n(new m("dequeuePullRequest", q0Var4, (String) null, rVar, no.a.s(sk.W, new u0(s0.p("id", new t("id")))), n3));
    }
}
