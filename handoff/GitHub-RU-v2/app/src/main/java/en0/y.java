package en0;

import gn0.jj;
import gn0.lb;
import gn0.nb;
import gn0.rb;
import gn0.rn;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y {
    public static final List a;

    static {
        lb.Companion.getClass();
        aa.r b = v8.l0.b(lb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        List r2 = x61.l.r(new aa.m[]{new aa.m("color", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        aa.x xVar2 = rb.a;
        aa.m mVar2 = new aa.m("startingLineNumber", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("endingLineNumber", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("jumpToLineNumber", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("lines", v8.l0.b(v8.l0.a(v8.l0.b(xVar))), (String) null, rVar, rVar, rVar);
        nb.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, new aa.m("score", v8.l0.b(nb.a), (String) null, rVar, rVar, rVar)});
        gn0.r3.Companion.getClass();
        aa.q0 q0Var = gn0.r3.a;
        k71.k.g(q0Var, "type");
        aa.m mVar6 = new aa.m("language", q0Var, (String) null, rVar, rVar, r2);
        aa.m mVar7 = new aa.m("path", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("matchCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gn0.v3.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, new aa.m("snippets", no.a.d(gn0.v3.a), (String) null, rVar, rVar, r3)});
        jj.Companion.getClass();
        aa.m mVar9 = new aa.m("pageInfo", v8.l0.b(jj.a), (String) null, rVar, rVar, r);
        gn0.t3.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar9, new aa.m("nodes", v8.l0.a(gn0.t3.a), (String) null, rVar, rVar, r4)});
        gn0.p3.Companion.getClass();
        aa.r b2 = v8.l0.b(gn0.p3.a);
        rn.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("codeSearch", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rn.a, new aa.u0(new aa.t("after"))), new aa.k(rn.b, new aa.u0(25)), new aa.k(rn.c, new aa.u0(new aa.t("query")))}), r5));
    }
}
