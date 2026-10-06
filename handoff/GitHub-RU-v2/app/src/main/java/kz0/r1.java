package kz0;

import java.util.List;
import pz0.hm;
import pz0.pd;
import pz0.su;
import pz0.td;
import pz0.vc;
import pz0.w80;
import pz0.wk;
import pz0.xc;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r1 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.x xVar = pd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list = gw0.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        td.Companion.getClass();
        aa.x xVar3 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.q0 q0Var = hm.a;
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        w80.Companion.getClass();
        aa.q0 q0Var2 = w80.W;
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r2)});
        List r4 = x61.l.r(new aa.m[]{new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)})), new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0Shadow.n("User"), list), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        xc.Companion.getClass();
        aa.m mVar4 = new aa.m("following", v8.l0.b(xc.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(w80.k, new aa.u0(new aa.t("after"))), new aa.k(w80.l, new aa.u0(new aa.t("first")))}), r3);
        vc.Companion.getClass();
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0Shadow.n("User"), x61.l.r(new aa.m[]{mVar4, new aa.m("followers", v8.l0.b(vc.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(w80.i, new aa.u0(new aa.t("after"))), new aa.k(w80.j, new aa.u0(new aa.t("first")))}), r4)})), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        wk.Companion.getClass();
        aa.j0 j0Var = wk.a;
        k71.k.g(j0Var, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(su.i, new aa.u0(new aa.t("id"))), r5), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
