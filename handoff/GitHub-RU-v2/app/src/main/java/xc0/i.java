package xc0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import gn0.jj;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import gn0.y10;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i {
    public static final List a;

    static {
        lb.Companion.getClass();
        x xVar = lb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRun");
        List list = j.a;
        s c = no.a.c(list, "selections", "WorkflowRun", n, list);
        pb.Companion.getClass();
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        jj.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(jj.a), (String) null, rVar, rVar, r);
        y10.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("nodes", l0.a(y10.b), (String) null, rVar, rVar, r2)});
    }
}
