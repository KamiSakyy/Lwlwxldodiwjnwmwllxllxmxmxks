package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.j10;
import m10.mr;
import m10.p00;
import m10.sc;
import m10.sr;
import m10.ur;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n4 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        k71.k.g(xVar, "type");
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("hasNextPage", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Patch");
        List list = zu.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, mVar3, no.a.c(list, "selections", "Patch", n, list)});
        mr.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        sr.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("nodes", v8.l0.a(sr.b), (String) null, rVar, rVar, r2)});
        ch.Companion.getClass();
        aa.x xVar3 = ch.a;
        aa.m mVar5 = new aa.m("linesAdded", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("linesDeleted", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("filesChanged", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ur.Companion.getClass();
        aa.r b = v8.l0.b(ur.a);
        sc.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, mVar6, mVar7, new aa.m("patches", b, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(sc.b, new aa.u0(new aa.t("after"))), new aa.k(sc.c, new aa.u0(new aa.t("first")))}), r3)});
        aa.m mVar8 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = sc.d;
        k71.k.g(q0Var, "type");
        List r5 = x61.l.r(new aa.m[]{mVar8, new aa.m("diff", q0Var, (String) null, rVar, rVar, r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar9 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m10.i6.Companion.getClass();
        aa.q0 q0Var2 = m10.i6.d;
        k71.k.g(q0Var2, "type");
        j10.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar9, new aa.m("compare", q0Var2, (String) null, rVar, no.a.s(j10.d, new aa.u0(new aa.t("headRefName"))), r5), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar10 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var3 = j10.e;
        k71.k.g(q0Var3, "type");
        i30.Companion.getClass();
        List r7 = x61.l.r(new aa.m[]{mVar10, new aa.m("ref", q0Var3, "comparison", rVar, no.a.s(i30.T, new aa.u0(new aa.t("baseRefName"))), r6), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var4 = i30.w0;
        k71.k.g(q0Var4, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var4, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repoName"))), new aa.k(p00.m, new aa.u0(new aa.t("ownerName")))}), r7), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
