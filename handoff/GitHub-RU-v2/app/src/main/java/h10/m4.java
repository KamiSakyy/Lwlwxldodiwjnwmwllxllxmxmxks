package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.j10;
import m10.mr;
import m10.p00;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m4 {
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
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("Commit");
        List list = fr.c.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, mVar3, no.a.c(list, "selections", "Commit", n, list)});
        mr.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r);
        m10.y5.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar4, new aa.m("nodes", v8.l0.a(m10.y5.j), (String) null, rVar, rVar, r2)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m10.k6.Companion.getClass();
        aa.r b2 = v8.l0.b(m10.k6.a);
        m10.i6.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("commits", b2, "commits", rVar, x61.l.r(new aa.k[]{new aa.k(m10.i6.a, new aa.u0(new aa.t("after"))), new aa.k(m10.i6.b, new aa.u0(new aa.t("first")))}), r3), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var = m10.i6.d;
        k71.k.g(q0Var, "type");
        j10.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar6, new aa.m("compare", q0Var, (String) null, rVar, no.a.s(j10.d, new aa.u0(new aa.t("headRefName"))), r4), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar7 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var2 = j10.e;
        k71.k.g(q0Var2, "type");
        i30.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar7, new aa.m("ref", q0Var2, "comparison", rVar, no.a.s(i30.T, new aa.u0(new aa.t("baseRefName"))), r5), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = i30.w0;
        k71.k.g(q0Var3, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repoName"))), new aa.k(p00.m, new aa.u0(new aa.t("ownerName")))}), r6), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
