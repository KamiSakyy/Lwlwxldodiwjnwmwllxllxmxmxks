package kz0;

import java.util.List;
import pz0.hm;
import pz0.hs;
import pz0.jx;
import pz0.ki;
import pz0.oi;
import pz0.pd;
import pz0.qi;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class x3 {
    public static final List a;

    static {
        vd.Companion.getClass();
        aa.x xVar = vd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        pd.Companion.getClass();
        aa.m mVar = new aa.m("hasNextPage", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("PullRequest");
        List list = yt0.h.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n2, list);
        td.Companion.getClass();
        aa.x xVar3 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, c, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.m mVar3 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("position", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        hs.Companion.getClass();
        aa.q0 q0Var = hs.N;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar3, mVar4, new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r2), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("totalCount", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        hm.Companion.getClass();
        aa.m mVar6 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r);
        oi.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar5, mVar6, new aa.m("nodes", v8.l0.a(oi.a), (String) null, rVar, rVar, r3)});
        aa.m mVar7 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        qi.Companion.getClass();
        aa.q0 q0Var2 = qi.a;
        k71.k.g(q0Var2, "type");
        aa.m mVar8 = new aa.m("entries", q0Var2, "entriesCount", rVar, rVar, n);
        ki.Companion.getClass();
        List r5 = x61.l.r(new aa.m[]{mVar7, mVar8, new aa.m("entries", q0Var2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ki.a, new aa.u0(new aa.t("after"))), new aa.k(ki.b, new aa.u0(new aa.t("first")))}), r4), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar9 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.q0 q0Var3 = ki.c;
        k71.k.g(q0Var3, "type");
        jx.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar9, new aa.m("mergeQueue", q0Var3, (String) null, rVar, no.a.s(jx.D, new aa.u0(new aa.t("branch"))), r5), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.q0 q0Var4 = jx.t0;
        k71.k.g(q0Var4, "type");
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var4, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(su.l, new aa.u0(new aa.t("repositoryName"))), new aa.k(su.m, new aa.u0(new aa.t("repositoryOwner")))}), r6), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
