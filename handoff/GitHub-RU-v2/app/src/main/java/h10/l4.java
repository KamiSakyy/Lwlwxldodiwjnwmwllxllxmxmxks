package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.mr;
import m10.o30;
import m10.p00;
import m10.rf0;
import m10.ux;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l4 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        m10.l.Companion.getClass();
        aa.j0 j0Var = m10.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar2 = new aa.m("author", j0Var, (String) null, rVar, rVar, r2);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        wg.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("User");
        List list2 = rx.h.a;
        List r5 = x61.l.r(new aa.s[]{mVar3, no.a.c(list2, "selections", "User", n, list2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar4 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r4);
        ch.Companion.getClass();
        aa.x xVar3 = ch.a;
        aa.m mVar5 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("nodes", v8.l0.a(rf0.g0), (String) null, rVar, rVar, r5)});
        aa.r b2 = v8.l0.b(xVar3);
        i30.Companion.getClass();
        aa.m mVar6 = new aa.m("planLimit", b2, (String) null, rVar, no.a.s(i30.J, new aa.u0("MANUAL_REVIEW_REQUESTS")), rVar);
        ux.Companion.getClass();
        aa.q0 q0Var = ux.T;
        k71.k.g(q0Var, "type");
        aa.m mVar7 = new aa.m("pullRequest", q0Var, (String) null, rVar, no.a.s(i30.P, new aa.u0(new aa.t("pullNumber"))), r3);
        o30.Companion.getClass();
        aa.q0 q0Var2 = o30.a;
        k71.k.g(q0Var2, "type");
        List r7 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("collaborators", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.a, new aa.u0(new aa.t("after"))), new aa.k(i30.b, new aa.u0(50)), new aa.k(i30.c, new aa.u0(new aa.t("query")))}), r6), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = i30.w0;
        k71.k.g(q0Var3, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repo"))), new aa.k(p00.m, new aa.u0(new aa.t("owner")))}), r7), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
