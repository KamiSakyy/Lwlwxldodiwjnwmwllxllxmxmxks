package xc0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import gn0.jj;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import gn0.u10;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Workflow");
        List list = h.a;
        s c = no.a.c(list, "selections", "Workflow", n, list);
        pb.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        lb.Companion.getClass();
        x xVar2 = lb.a;
        List r2 = l.r(new m[]{new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("endCursor", xVar, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        u10.Companion.getClass();
        m mVar2 = new m("nodes", l0.a(u10.c), (String) null, rVar, rVar, r);
        jj.Companion.getClass();
        a = l.r(new m[]{mVar2, new m("pageInfo", l0.b(jj.a), (String) null, rVar, rVar, r2)});
    }
}
