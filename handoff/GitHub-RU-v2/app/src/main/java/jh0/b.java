package jh0;

import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import gn0.lb;
import gn0.ll;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import k71.k;
import si0.h;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PullRequest");
        List list2 = h.a;
        s c = no.a.c(list2, "selections", "PullRequest", n, list2);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r3 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gn0.l.Companion.getClass();
        m mVar4 = new m("enqueuer", l0.b(gn0.l.a), (String) null, rVar, rVar, r2);
        rb.Companion.getClass();
        x xVar3 = rb.a;
        k.g(xVar3, "type");
        m mVar5 = new m("estimatedTimeToMerge", xVar3, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar4 = lb.a;
        m mVar6 = new m("jump", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("solo", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("position", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ll.Companion.getClass();
        q0 q0Var = ll.K;
        k.g(q0Var, "type");
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, new m("pullRequest", q0Var, (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
