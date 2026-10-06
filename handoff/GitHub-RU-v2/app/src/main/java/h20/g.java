package h20;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.ji;
import hc0.m00;
import hc0.xa;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Workflow");
        List list = h.a;
        s c = no.a.c(list, "selections", "Workflow", n, list);
        bb.Companion.getClass();
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        xa.Companion.getClass();
        x xVar2 = xa.a;
        List r2 = l.r(new m[]{new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("endCursor", xVar, (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m00.Companion.getClass();
        m mVar2 = new m("nodes", l0.a(m00.c), (String) null, rVar, rVar, r);
        ji.Companion.getClass();
        a = l.r(new m[]{mVar2, new m("pageInfo", l0.b(ji.a), (String) null, rVar, rVar, r2)});
    }
}
