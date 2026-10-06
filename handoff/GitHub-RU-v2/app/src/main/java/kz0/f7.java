package kz0;

import java.util.List;
import pz0.hm;
import pz0.jx;
import pz0.rx;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f7 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PageInfo");
        List list = nw0.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "PageInfo", n, list)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("Repository");
        List list2 = vu0.p.a;
        aa.s c = no.a.c(list2, "selections", "Repository", n2, list2);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        jx.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(jx.t0), (String) null, rVar, rVar, r2)});
        rx.Companion.getClass();
        aa.r b2 = v8.l0.b(rx.a);
        w80.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(w80.E, new aa.u0(new aa.t("after"))), new aa.k(w80.F, new aa.u0(new aa.t("first"))), new aa.k(w80.H, new aa.u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "NAME")))), new aa.k(w80.J, new aa.u0(new aa.t("query"))), new aa.k(w80.K, new aa.u0("TEMPLATE"))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
