package wn0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import pz0.ha0;
import pz0.hm;
import pz0.pd;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j {
    public static final List a;

    static {
        pd.Companion.getClass();
        x xVar = pd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        k71.k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRun");
        List list = k.a;
        s c = no.a.c(list, "selections", "WorkflowRun", n, list);
        td.Companion.getClass();
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r);
        ha0.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("nodes", l0.a(ha0.b), (String) null, rVar, rVar, r2)});
    }
}
