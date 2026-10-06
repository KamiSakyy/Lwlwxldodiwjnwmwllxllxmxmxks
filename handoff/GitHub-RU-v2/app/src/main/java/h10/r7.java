package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.mr;
import m10.q30;
import m10.rf0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r7 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("PageInfo");
        List list = yx.a.a;
        List r = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "PageInfo", n, list)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0Shadow.n("Repository");
        List list2 = ew.q.a;
        aa.s c = no.a.c(list2, "selections", "Repository", n2, list2);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        i30.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(i30.w0), (String) null, rVar, rVar, r2)});
        q30.Companion.getClass();
        aa.r b2 = v8.l0.b(q30.a);
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.E, new aa.u0(new aa.t("after"))), new aa.k(rf0.F, new aa.u0(new aa.t("first"))), new aa.k(rf0.H, new aa.u0(x61.x.u(new w61.k[]{new w61.k("direction", "ASC"), new w61.k("field", "NAME")}))), new aa.k(rf0.J, new aa.u0(new aa.t("query"))), new aa.k(rf0.K, new aa.u0("TEMPLATE"))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
