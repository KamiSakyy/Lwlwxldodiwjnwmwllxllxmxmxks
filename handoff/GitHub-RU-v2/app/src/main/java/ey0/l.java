package ey0;

import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.td;
import pz0.w80;
import pz0.xd;
import pz0.zn;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class l {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2Connection");
        List list = xx0.a.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2Connection", n, list)});
        zn.Companion.getClass();
        r b2 = l0.b(zn.a);
        w80.Companion.getClass();
        aa.m mVar2 = new aa.m("allProjectsV2", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(w80.c, new u0(new t("after"))), new aa.k(w80.d, new u0(new t("first"))), new aa.k(w80.e, new u0(x61.x.u(new w61.k("direction", new t("orderDirection")), new w61.k("field", new t("orderField"))))), new aa.k(w80.f, new u0(new t("query")))}), r);
        td.Companion.getClass();
        x xVar2 = td.a;
        a = x61.l.r(new aa.m[]{new aa.m("viewer", l0.b(w80.W), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar2, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
