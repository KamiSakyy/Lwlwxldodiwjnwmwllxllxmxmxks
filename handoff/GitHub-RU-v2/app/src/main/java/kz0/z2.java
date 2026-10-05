package kz0;

import java.util.List;
import pz0.bm;
import pz0.h50;
import pz0.hm;
import pz0.n40;
import pz0.p40;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z2 {
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
        aa.m mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.x xVar3 = h50.a;
        k71.k.g(xVar3, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("avatarUrl", xVar3, (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar5 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        n40.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar5, new aa.m("nodes", v8.l0.a(n40.a), (String) null, rVar, rVar, r2)});
        p40.Companion.getClass();
        aa.r b2 = v8.l0.b(p40.a);
        bm.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("teams", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(bm.k, new aa.u0(new aa.t("after"))), new aa.k(bm.l, new aa.u0(50)), new aa.k(bm.m, new aa.u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "NAME")))), new aa.k(bm.n, new aa.u0(new aa.t("query")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = bm.o;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("organization", q0Var, (String) null, rVar, no.a.s(su.j, new aa.u0(new aa.t("login"))), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
