package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.mr;
import m10.p00;
import m10.wg;
import m10.yg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a0 {
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
        List r2 = x61.l.r(new aa.m[]{new aa.m("color", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        aa.x xVar2 = ch.a;
        aa.m mVar2 = new aa.m("startingLineNumber", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("endingLineNumber", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("jumpToLineNumber", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("lines", v8.l0.b(v8.l0.a(v8.l0.b(xVar))), (String) null, rVar, rVar, rVar);
        yg.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, new aa.m("score", v8.l0.b(yg.a), (String) null, rVar, rVar, rVar)});
        m10.d5.Companion.getClass();
        aa.q0 q0Var = m10.d5.a;
        k71.k.g(q0Var, "type");
        aa.m mVar6 = new aa.m("language", q0Var, (String) null, rVar, rVar, r2);
        aa.m mVar7 = new aa.m("path", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("matchCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m10.h5.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, new aa.m("snippets", no.a.d(m10.h5.a), (String) null, rVar, rVar, r3)});
        mr.Companion.getClass();
        aa.m mVar9 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        m10.f5.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar9, new aa.m("nodes", v8.l0.a(m10.f5.a), (String) null, rVar, rVar, r4)});
        m10.b5.Companion.getClass();
        aa.r b2 = v8.l0.b(m10.b5.a);
        p00.Companion.getClass();
        aa.m mVar10 = new aa.m("codeSearch", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.a, new aa.u0(new aa.t("after"))), new aa.k(p00.b, new aa.u0(25)), new aa.k(p00.c, new aa.u0(new aa.t("query")))}), r5);
        ah.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar10, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
