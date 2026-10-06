package wo;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch0;
import m10.eh;
import m10.mr;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        k71.k.g(xVar2, "type");
        List r = l.r(new m[]{mVar, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("WorkflowRun");
        List list = k.a;
        s c = no.a.c(list, "selections", "WorkflowRun", n, list);
        ah.Companion.getClass();
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        ch0.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("nodes", l0.a(ch0.b), (String) null, rVar, rVar, r2)});
    }

    public j(Object... a) {
    }
}
