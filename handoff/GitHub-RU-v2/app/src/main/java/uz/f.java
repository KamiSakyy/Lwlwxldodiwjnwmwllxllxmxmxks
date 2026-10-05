package uz;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.iw;
import m10.kw;
import m10.pt;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2IterationFieldIteration");
        List list = g.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2IterationFieldIteration", n, list)});
        List r2 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("ProjectV2IterationFieldIteration", d0.n("ProjectV2IterationFieldIteration"), list)});
        ch.Companion.getClass();
        x xVar2 = ch.a;
        m mVar2 = new m("duration", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        kw.Companion.getClass();
        q0 q0Var = kw.a;
        List r3 = l.r(new m[]{mVar2, new m("completedIterations", no.a.d(q0Var), (String) null, rVar, rVar, r), new m("iterations", no.a.d(q0Var), (String) null, rVar, rVar, r2)});
        ah.Companion.getClass();
        m mVar3 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("databaseId", xVar2, (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pt.Companion.getClass();
        m mVar6 = new m("dataType", l0.b(pt.s), (String) null, rVar, rVar, rVar);
        iw.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, new m("configuration", l0.b(iw.a), (String) null, rVar, rVar, r3), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
