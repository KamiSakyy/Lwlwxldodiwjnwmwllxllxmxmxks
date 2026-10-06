package kz0;

import java.util.List;
import pz0.hm;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class u1 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.r b = v8.l0.b(pd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("CodeSearchResult");
        List list = iz0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "CodeSearchResult", n, list)});
        hm.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        pz0.i4.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(pz0.i4.a), (String) null, rVar, rVar, r2)});
        pz0.e4.Companion.getClass();
        aa.r b2 = v8.l0.b(pz0.e4.a);
        su.Companion.getClass();
        aa.m mVar4 = new aa.m("codeSearch", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.a, new aa.u0(new aa.t("after"))), new aa.k(su.b, new aa.u0(new aa.t("first"))), new aa.k(su.c, new aa.u0(new aa.t("query")))}), r3);
        td.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
