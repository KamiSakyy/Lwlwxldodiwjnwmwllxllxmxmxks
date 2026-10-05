package xx0;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import pz0.ko;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.xq;
import pz0.zq;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2IterationFieldIteration");
        List list = g.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2IterationFieldIteration", n, list)});
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2IterationFieldIteration", d0.n("ProjectV2IterationFieldIteration"), list)});
        vd.Companion.getClass();
        x xVar2 = vd.a;
        m mVar2 = new m("duration", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        zq.Companion.getClass();
        q0 q0Var = zq.a;
        List r3 = l.r(new m[]{mVar2, new m("completedIterations", no.a.d(q0Var), (String) null, rVar, rVar, r), new m("iterations", no.a.d(q0Var), (String) null, rVar, rVar, r2)});
        td.Companion.getClass();
        m mVar3 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("databaseId", xVar2, (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ko.Companion.getClass();
        m mVar6 = new m("dataType", l0.b(ko.s), (String) null, rVar, rVar, rVar);
        xq.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, new m("configuration", l0.b(xq.a), (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
