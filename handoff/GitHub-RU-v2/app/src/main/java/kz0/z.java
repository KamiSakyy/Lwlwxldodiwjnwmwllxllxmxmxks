package kz0;

import java.util.List;
import pz0.hm;
import pz0.pd;
import pz0.rd;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.r b = v8.l0.b(pd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        k71.k.g(xVar, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        List r2 = x61.l.r(new aa.m[]{new aa.m("color", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("name", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        aa.x xVar2 = vd.a;
        aa.m mVar2 = new aa.m("startingLineNumber", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("endingLineNumber", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("jumpToLineNumber", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("lines", v8.l0.b(v8.l0.a(v8.l0.b(xVar))), (String) null, rVar, rVar, rVar);
        rd.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, mVar5, new aa.m("score", v8.l0.b(rd.a), (String) null, rVar, rVar, rVar)});
        pz0.g4.Companion.getClass();
        aa.q0 q0Var = pz0.g4.a;
        k71.k.g(q0Var, "type");
        aa.m mVar6 = new aa.m("language", q0Var, (String) null, rVar, rVar, r2);
        aa.m mVar7 = new aa.m("path", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("matchCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.k4.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, new aa.m("snippets", no.a.d(pz0.k4.a), (String) null, rVar, rVar, r3)});
        hm.Companion.getClass();
        aa.m mVar9 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        pz0.i4.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar9, new aa.m("nodes", v8.l0.a(pz0.i4.a), (String) null, rVar, rVar, r4)});
        pz0.e4.Companion.getClass();
        aa.r b2 = v8.l0.b(pz0.e4.a);
        su.Companion.getClass();
        aa.m mVar10 = new aa.m("codeSearch", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.a, new aa.u0(new aa.t("after"))), new aa.k(su.b, new aa.u0(25)), new aa.k(su.c, new aa.u0(new aa.t("query")))}), r5);
        td.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar10, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
