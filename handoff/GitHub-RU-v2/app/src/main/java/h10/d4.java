package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.mr;
import m10.p00;
import m10.q30;
import m10.wg;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d4 {
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
        List n = sy.d0.n("Repository");
        List list = ew.j.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0.n("Repository");
        List list2 = ew.b.a;
        aa.s c2 = no.a.c(list2, "selections", "Repository", n2, list2);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, c2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        i30.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(i30.w0), (String) null, rVar, rVar, r2)});
        q30.Companion.getClass();
        List r4 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0.n("Repository"), sy.d0.n(new aa.m("forks", v8.l0.b(q30.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.l, new aa.u0(new aa.t("after"))), new aa.k(i30.m, new aa.u0(new aa.t("first")))}), r3))), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        aa.j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("id"))), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
