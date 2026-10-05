package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.mr;
import m10.om;
import m10.p00;
import m10.sm;
import m10.um;
import m10.ux;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e4 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequest");
        List list = hv.i.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.x xVar3 = ch.a;
        aa.m mVar3 = new aa.m("position", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ux.Companion.getClass();
        aa.q0 q0Var = ux.T;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        sm.Companion.getClass();
        aa.q0 q0Var2 = sm.a;
        List n2 = sy.d0.n(new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r2));
        List n3 = sy.d0.n(new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar));
        wg.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{new aa.m("hasNextPage", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar), new aa.m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        List r4 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("position", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.n("PullRequest", sy.d0.n("PullRequest"), list), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)})), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("totalCount", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        mr.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar4, new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r3), new aa.m("nodes", v8.l0.a(q0Var2), (String) null, rVar, rVar, r4)});
        aa.m mVar5 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        um.Companion.getClass();
        aa.q0 q0Var3 = um.a;
        k71.k.g(q0Var3, "type");
        om.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar5, new aa.m("mergingEntries", q0Var3, (String) null, rVar, no.a.s(om.c, new aa.u0(new aa.t("first"))), n2), new aa.m("entries", q0Var3, "entriesCount", rVar, rVar, n3), new aa.m("entries", q0Var3, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(om.a, new aa.u0(new aa.t("after"))), new aa.k(om.b, new aa.u0(new aa.t("first")))}), r5), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var4 = om.d;
        k71.k.g(q0Var4, "type");
        i30.Companion.getClass();
        List r7 = x61.l.r(new aa.m[]{mVar6, new aa.m("mergeQueue", q0Var4, (String) null, rVar, no.a.s(i30.A, new aa.u0(new aa.t("branch"))), r6), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var5 = i30.w0;
        k71.k.g(q0Var5, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var5, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(p00.m, new aa.u0(new aa.t("repositoryOwner")))}), r7), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
