package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.gr;
import m10.i30;
import m10.l40;
import m10.mr;
import m10.p00;
import m10.q30;
import m10.rf0;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h4 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.x xVar = wg.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Repository");
        List list = ew.j.a;
        aa.s c = no.a.c(list, "selections", "Repository", n, list);
        List n2 = sy.d0Shadow.n("Repository");
        List list2 = ew.b.a;
        aa.s c2 = no.a.c(list2, "selections", "Repository", n2, list2);
        ah.Companion.getClass();
        aa.x xVar3 = ah.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, c2, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.q0 q0Var = mr.a;
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, r);
        i30.Companion.getClass();
        aa.q0 q0Var2 = i30.w0;
        List r3 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r2)});
        q30.Companion.getClass();
        aa.q0 q0Var3 = q30.a;
        aa.r b2 = v8.l0.b(q0Var3);
        rf0.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("repositories", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.E, new aa.u0(new aa.t("after"))), new aa.k(rf0.F, new aa.u0(new aa.t("first"))), new aa.k(rf0.G, new aa.u0(new aa.t("language"))), new aa.k(rf0.H, new aa.u0(x61.x.u(new w61.k[]{new w61.k("direction", new aa.t("orderDirection")), new w61.k("field", new aa.t("orderField"))}))), new aa.k(rf0.I, new aa.u0(sy.d0Shadow.n("OWNER"))), new aa.k(rf0.J, new aa.u0(new aa.t("query"))), new aa.k(rf0.K, new aa.u0(new aa.t("type")))}), r3), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.m[]{new aa.m("pageInfo", v8.l0.b(q0Var), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)})), new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("Repository", sy.d0Shadow.n("Repository"), list), new aa.n("Repository", sy.d0Shadow.n("Repository"), list2), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        aa.r b3 = v8.l0.b(q0Var3);
        gr.Companion.getClass();
        List r6 = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", sy.d0Shadow.n("User"), r4), new aa.n("Organization", sy.d0Shadow.n("Organization"), x61.l.r(new aa.m[]{new aa.m("repositories", b3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(gr.d, new aa.u0(new aa.t("after"))), new aa.k(gr.e, new aa.u0(new aa.t("first"))), new aa.k(gr.f, new aa.u0(new aa.t("language"))), new aa.k(gr.g, new aa.u0(x61.x.u(new w61.k[]{new w61.k("direction", new aa.t("orderDirection")), new w61.k("field", new aa.t("orderField"))}))), new aa.k(gr.h, new aa.u0(sy.d0Shadow.n("OWNER"))), new aa.k(gr.i, new aa.u0(new aa.t("query"))), new aa.k(gr.j, new aa.u0(new aa.t("type")))}), r5), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        l40.Companion.getClass();
        aa.j0 j0Var = l40.e;
        k71.k.g(j0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repositoryOwner", j0Var, (String) null, rVar, no.a.s(p00.t, new aa.u0(new aa.t("login"))), r6), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
