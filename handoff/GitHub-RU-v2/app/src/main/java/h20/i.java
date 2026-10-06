package h20;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.ji;
import hc0.q00;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        xa.Companion.getClass();
        x xVar = xa.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRun");
        List list = j.a;
        s c = no.a.c(list, "selections", "WorkflowRun", n, list);
        bb.Companion.getClass();
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(ji.a), (String) null, rVar, rVar, r);
        q00.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("nodes", l0.a(q00.b), (String) null, rVar, rVar, r2)});
    }
}
