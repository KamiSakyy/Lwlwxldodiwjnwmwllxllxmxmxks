package kz0;

import java.util.List;
import pz0.e90;
import pz0.qb;
import pz0.td;
import pz0.ub;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j1 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("FeedFilter");
        List list = lr0.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "FeedFilter", n, list)});
        ub.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("filters", v8.l0.a(v8.l0.b(ub.a)), (String) null, rVar, rVar, r));
        qb.Companion.getClass();
        aa.m mVar2 = new aa.m("feed", v8.l0.b(qb.d), (String) null, rVar, rVar, n2);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        e90.Companion.getClass();
        aa.q0 q0Var = e90.c;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("dashboard", q0Var, (String) null, rVar, rVar, r2)});
        w80.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
