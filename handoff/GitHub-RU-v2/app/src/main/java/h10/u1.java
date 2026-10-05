package h10;

import java.util.List;
import m10.ah;
import m10.cg;
import m10.eg;
import m10.eh;
import m10.mr;
import m10.p00;
import m10.rf0;
import m10.wg;
import m10.zp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class u1 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.x xVar = wg.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("User");
        List list = rx.h.a;
        aa.s c = no.a.c(list, "selections", "User", n, list);
        ah.Companion.getClass();
        aa.x xVar3 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.q0 q0Var = mr.a;
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        rf0.Companion.getClass();
        aa.q0 q0Var2 = rf0.g0;
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r2)});
        List r4 = x61.l.r(new aa.m[]{new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)})), new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0.n("User"), list), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        eg.Companion.getClass();
        aa.m mVar4 = new aa.m("following", v8.l0.b(eg.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.k, new aa.u0(new aa.t("after"))), new aa.k(rf0.l, new aa.u0(new aa.t("first")))}), r3);
        cg.Companion.getClass();
        List r5 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0.n("User"), x61.l.r(new aa.m[]{mVar4, new aa.m("followers", v8.l0.b(cg.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.i, new aa.u0(new aa.t("after"))), new aa.k(rf0.j, new aa.u0(new aa.t("first")))}), r4)})), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        zp.Companion.getClass();
        aa.j0 j0Var = zp.a;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("node", j0Var, (String) null, rVar, no.a.s(p00.i, new aa.u0(new aa.t("id"))), r5), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
