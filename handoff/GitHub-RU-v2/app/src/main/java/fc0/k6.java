package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.ip;
import hc0.ji;
import hc0.kz;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k6 {
    public static final List a;

    static {
        xa.Companion.getClass();
        aa.x xVar = xa.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("hasPreviousPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        aa.x xVar2 = fb.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = x80.l.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        bb.Companion.getClass();
        aa.x xVar3 = bb.a;
        List r2 = x61.l.r(new aa.s[]{mVar3, c, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        ji.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(ji.a), (String) null, rVar, rVar, r);
        ap.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("nodes", v8.l0.a(ap.k0), (String) null, rVar, rVar, r2)});
        ip.Companion.getClass();
        aa.r b2 = v8.l0.b(ip.a);
        kz.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("viewer", v8.l0.b(kz.O), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(kz.x, new aa.u0(new aa.t("after"))), new aa.k(kz.y, new aa.u0(new aa.t("first"))), new aa.k(kz.A, new aa.u0(x61.x.u(new w61.k("direction", "ASC"), new w61.k("field", "NAME")))), new aa.k(kz.C, new aa.u0(new aa.t("query"))), new aa.k(kz.D, new aa.u0("TEMPLATE"))}), r3), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
    }
}
