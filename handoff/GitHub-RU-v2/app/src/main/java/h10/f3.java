package h10;

import java.util.List;
import m10.ah;
import m10.cc0;
import m10.eh;
import m10.gr;
import m10.ib0;
import m10.kb0;
import m10.mr;
import m10.p00;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f3 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.r b = v8.l0.b(wg.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.x xVar3 = cc0.a;
        k71.k.g(xVar3, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("avatarUrl", xVar3, (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar5 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        ib0.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar5, new aa.m("nodes", v8.l0.a(ib0.a), (String) null, rVar, rVar, r2)});
        kb0.Companion.getClass();
        aa.r b2 = v8.l0.b(kb0.a);
        gr.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("teams", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(gr.k, new aa.u0(new aa.t("after"))), new aa.k(gr.l, new aa.u0(50)), new aa.k(gr.m, new aa.u0(x61.x.u(new w61.k[]{new w61.k("direction", "ASC"), new w61.k("field", "NAME")}))), new aa.k(gr.n, new aa.u0(new aa.t("query")))}), r3), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var = gr.o;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("organization", q0Var, (String) null, rVar, no.a.s(p00.j, new aa.u0(new aa.t("login"))), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
