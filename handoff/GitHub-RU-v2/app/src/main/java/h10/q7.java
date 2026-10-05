package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.gr;
import m10.ir;
import m10.mr;
import m10.rf0;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class q7 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.r b = v8.l0.b(wg.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Organization");
        List list = uu.c.a;
        aa.s c = no.a.c(list, "selections", "Organization", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        gr.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(gr.o), (String) null, rVar, rVar, r2)});
        ir.Companion.getClass();
        aa.r b2 = v8.l0.b(ir.a);
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("organizations", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.y, new aa.u0(new aa.t("after"))), new aa.k(rf0.z, new aa.u0(new aa.t("first")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
