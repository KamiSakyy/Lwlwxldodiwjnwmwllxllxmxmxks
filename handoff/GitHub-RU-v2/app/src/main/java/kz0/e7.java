package kz0;

import java.util.List;
import pz0.bm;
import pz0.dm;
import pz0.hm;
import pz0.pd;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e7 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.r b = v8.l0.b(pd.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Organization");
        List list = lt0.c.a;
        aa.s c = no.a.c(list, "selections", "Organization", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        bm.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(bm.o), (String) null, rVar, rVar, r2)});
        dm.Companion.getClass();
        aa.r b2 = v8.l0.b(dm.a);
        w80.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("organizations", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(w80.y, new aa.u0(new aa.t("after"))), new aa.k(w80.z, new aa.u0(new aa.t("first")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
