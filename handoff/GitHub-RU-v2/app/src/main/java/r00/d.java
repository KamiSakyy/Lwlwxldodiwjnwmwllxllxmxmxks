package r00;

import aa.m;
import aa.q0;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.gj;
import m10.i30;
import m10.mr;
import m10.oj;
import m10.p00;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("endCursor", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar2 = wg.a;
        List r = l.r(new m[]{mVar, new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("IssueType");
        List list = ht.a.a;
        s c = no.a.c(list, "selections", "IssueType", n, list);
        ah.Companion.getClass();
        x xVar3 = ah.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        mr.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        gj.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("nodes", l0.a(gj.a), (String) null, rVar, rVar, r2)});
        oj.Companion.getClass();
        q0 q0Var = oj.a;
        k.g(q0Var, "type");
        i30.Companion.getClass();
        List r4 = l.r(new m[]{new m("issueTypes", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(i30.o, new u0(new t("after"))), new aa.k(i30.p, new u0(new t("first")))}), r3), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var2 = i30.w0;
        k.g(q0Var2, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("repository", q0Var2, (String) null, rVar, l.r(new aa.k[]{new aa.k(p00.l, new u0(new t("name"))), new aa.k(p00.m, new u0(new t("owner")))}), r4), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
