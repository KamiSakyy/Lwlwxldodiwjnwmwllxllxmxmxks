package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.j10;
import m10.l10;
import m10.mr;
import m10.p00;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k4 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        wg.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Ref");
        List list = aw.a.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "Ref", n, list), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r2);
        j10.Companion.getClass();
        aa.q0 q0Var = j10.e;
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(q0Var), (String) null, rVar, rVar, r3)});
        aa.m mVar4 = new aa.m("defaultBranchRef", q0Var, (String) null, rVar, rVar, r);
        l10.Companion.getClass();
        aa.q0 q0Var2 = l10.a;
        k71.k.g(q0Var2, "type");
        i30.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar4, new aa.m("refs", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.U, new aa.u0(new aa.t("after"))), new aa.k(i30.V, new aa.u0(50)), new aa.k(i30.X, new aa.u0(new aa.t("query"))), new aa.k(i30.Y, new aa.u0(new aa.t("refPrefix")))}), r4), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var3 = i30.w0;
        k71.k.g(q0Var3, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repo"))), new aa.k(p00.m, new aa.u0(new aa.t("owner")))}), r5), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
