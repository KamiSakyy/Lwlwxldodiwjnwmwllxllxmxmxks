package uy0;

import aa.m;
import aa.q0;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.hm;
import pz0.jx;
import pz0.mf;
import pz0.pd;
import pz0.qf;
import pz0.su;
import pz0.td;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        m mVar = new m("endCursor", xVar, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar2 = pd.a;
        List r = l.r(new m[]{mVar, new m("hasNextPage", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("hasPreviousPage", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("IssueType");
        List list = zr0.a.a;
        s c = no.a.c(list, "selections", "IssueType", n, list);
        td.Companion.getClass();
        x xVar3 = td.a;
        List r2 = l.r(new s[]{mVar2, c, new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r);
        mf.Companion.getClass();
        List r3 = l.r(new m[]{mVar3, new m("nodes", l0.a(mf.a), (String) null, rVar, rVar, r2)});
        qf.Companion.getClass();
        q0 q0Var = qf.a;
        k.g(q0Var, "type");
        jx.Companion.getClass();
        List r4 = l.r(new m[]{new m("issueTypes", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(jx.r, new u0(new t("after"))), new aa.k(jx.s, new u0(new t("first")))}), r3), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var2 = jx.t0;
        k.g(q0Var2, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("repository", q0Var2, (String) null, rVar, l.r(new aa.k[]{new aa.k(su.l, new u0(new t("name"))), new aa.k(su.m, new u0(new t("owner")))}), r4), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
