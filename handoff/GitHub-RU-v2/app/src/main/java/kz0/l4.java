package kz0;

import java.util.List;
import pz0.hm;
import pz0.jx;
import pz0.pd;
import pz0.sf;
import pz0.su;
import pz0.td;
import pz0.uf;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l4 {
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
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("color", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("description", xVar, (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar2 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        sf.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("nodes", v8.l0.a(sf.a), (String) null, rVar, rVar, r2)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        uf.Companion.getClass();
        aa.q0 q0Var = uf.a;
        k71.k.g(q0Var, "type");
        jx.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("labels", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(jx.v, new aa.u0(new aa.t("after"))), new aa.k(jx.w, new aa.u0(50)), new aa.k(jx.x, new aa.u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "NAME")))), new aa.k(jx.y, new aa.u0(new aa.t("query")))}), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var2 = jx.t0;
        k71.k.g(q0Var2, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repo"))), new aa.k(su.m, new aa.u0(new aa.t("owner")))}), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
