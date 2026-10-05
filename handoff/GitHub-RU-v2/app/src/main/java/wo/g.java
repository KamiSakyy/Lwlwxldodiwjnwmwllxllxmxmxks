package wo;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.mr;
import m10.tg0;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("Workflow");
        List list = h.a;
        s c = no.a.c(list, "selections", "Workflow", n, list);
        ah.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        wg.Companion.getClass();
        x xVar2 = wg.a;
        List r2 = l.r(new m[]{new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("endCursor", xVar, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        tg0.Companion.getClass();
        m mVar2 = new m("nodes", l0.a(tg0.e), (String) null, rVar, rVar, r);
        mr.Companion.getClass();
        a = l.r(new m[]{mVar2, new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r2)});
    }
}
