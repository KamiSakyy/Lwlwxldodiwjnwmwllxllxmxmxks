package kz0;

import java.util.List;
import pz0.hm;
import pz0.jx;
import pz0.pd;
import pz0.rx;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l5 {
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
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new aa.m("hasPreviousPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = vu0.p.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0Shadow.n("Repository");
        List list2 = vu0.b.a;
        aa.s c2 = no.a.c(list2, "selections", "Repository", n2, list2);
        aa.s mVar3 = new aa.m("hasIssuesEnabled", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("isDiscussionsEnabled", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("isArchived", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar3 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, c2, mVar3, mVar4, mVar5, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar6 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        jx.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar6, new aa.m("nodes", v8.l0.a(jx.t0), (String) null, rVar, rVar, r2)});
        rx.Companion.getClass();
        aa.r b2 = v8.l0.b(rx.a);
        w80.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("topRepositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(w80.S, new aa.u0(new aa.t("after"))), new aa.k(w80.T, new aa.u0(new aa.t("first"))), new aa.k(w80.U, new aa.u0(x61.x.u(new w61.k("direction", "DESC"), new w61.k("field", "PUSHED_AT")))), new aa.k(w80.V, new aa.u0(new aa.t("type")))}), r3), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
