package b00;

import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ct;
import m10.eh;
import m10.rf0;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("ProjectV2Connection");
        List list = uz.a.a;
        List r = x61.l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2Connection", n, list)});
        ct.Companion.getClass();
        r b2 = l0.b(ct.a);
        rf0.Companion.getClass();
        aa.m mVar2 = new aa.m("allProjectsV2", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.c, new u0(new t("after"))), new aa.k(rf0.d, new u0(new t("first"))), new aa.k(rf0.e, new u0(x61.x.u(new w61.k[]{new w61.k("direction", new t("orderDirection")), new w61.k("field", new t("orderField"))}))), new aa.k(rf0.f, new u0(new t("query")))}), r);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        a = x61.l.r(new aa.m[]{new aa.m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar2, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)})), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
