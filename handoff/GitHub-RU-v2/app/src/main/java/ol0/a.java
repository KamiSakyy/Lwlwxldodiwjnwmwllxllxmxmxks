package ol0;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.cg;
import gn0.l8;
import gn0.lb;
import gn0.ll;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import gn0.yf;
import java.util.List;
import jh0.c;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("MergeQueue");
        List list = c.a;
        s c = no.a.c(list, "selections", "MergeQueue", n, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("MergeQueueEntry");
        List list2 = jh0.b.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list2, "selections", "MergeQueueEntry", n2, list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        m mVar4 = new m("isInMergeQueue", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        yf.Companion.getClass();
        q0 q0Var = yf.c;
        k.g(q0Var, "type");
        m mVar5 = new m("mergeQueue", q0Var, (String) null, rVar, rVar, r);
        cg.Companion.getClass();
        q0 q0Var2 = cg.a;
        k.g(q0Var2, "type");
        List r3 = l.r(new m[]{mVar3, mVar4, mVar5, new m("mergeQueueEntry", q0Var2, (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar6 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        q0 q0Var3 = ll.K;
        k.g(q0Var3, "type");
        List n3 = d0.n(new m("mergeQueueEntry", q0Var2, (String) null, rVar, rVar, l.r(new m[]{mVar6, new m("pullRequest", q0Var3, (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})));
        l8.Companion.getClass();
        q0 q0Var4 = l8.a;
        k.g(q0Var4, "type");
        wh.Companion.getClass();
        a = d0.n(new m("dequeuePullRequest", q0Var4, (String) null, rVar, no.a.s(wh.O, new u0(s0.p("id", new t("id")))), n3));
    }
}
