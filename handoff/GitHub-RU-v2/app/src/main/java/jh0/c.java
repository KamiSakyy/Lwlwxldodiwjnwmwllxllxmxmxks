package jh0;

import aa.a0;
import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.ag;
import gn0.bm;
import gn0.eg;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        rb.Companion.getClass();
        x xVar = rb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        bm.Companion.getClass();
        a0 a0Var = bm.s;
        k.g(a0Var, "type");
        List n2 = d0.n(new m("mergeMethod", a0Var, (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        m mVar = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        eg.Companion.getClass();
        q0 q0Var = eg.a;
        k.g(q0Var, "type");
        m mVar2 = new m("entries", q0Var, (String) null, rVar, rVar, n);
        ag.Companion.getClass();
        q0 q0Var2 = ag.a;
        k.g(q0Var2, "type");
        m mVar3 = new m("configuration", q0Var2, (String) null, rVar, rVar, n2);
        m mVar4 = new m("nextEntryEstimatedTimeToMerge", xVar, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
