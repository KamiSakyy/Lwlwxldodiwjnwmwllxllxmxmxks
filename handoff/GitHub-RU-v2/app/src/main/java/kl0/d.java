package kl0;

import aa.k;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import gn0.g10;
import gn0.jj;
import gn0.k10;
import gn0.lb;
import gn0.m10;
import gn0.pb;
import gn0.rb;
import gn0.rn;
import gn0.s00;
import gn0.tb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r2 = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        lb.Companion.getClass();
        List r3 = l.r(new m[]{new m("hasNextPage", l0.b(lb.a), (String) null, rVar, rVar, rVar), new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Repository");
        List list2 = pj0.f.a;
        s c2 = no.a.c(list2, "selections", "Repository", n, list2);
        List n2 = d0Shadow.n("Repository");
        List list3 = pj0.a.a;
        List r4 = l.r(new s[]{mVar2, c2, no.a.c(list3, "selections", "Repository", n2, list3)});
        jj.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(jj.a), (String) null, rVar, rVar, r3);
        k10.Companion.getClass();
        m mVar4 = new m("nodes", l0.a(k10.a), (String) null, rVar, rVar, r4);
        rb.Companion.getClass();
        List r5 = l.r(new m[]{mVar3, mVar4, new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        m mVar8 = new m("user", l0.b(s00.P), (String) null, rVar, rVar, r2);
        m10.Companion.getClass();
        r b2 = l0.b(m10.a);
        g10.Companion.getClass();
        List r6 = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, new m("items", b2, (String) null, rVar, l.r(new k[]{new k(g10.a, new u0(new t("after"))), new k(g10.b, new u0(new t("first")))}), r5), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = g10.c;
        k71.k.g(q0Var, "type");
        rn.Companion.getClass();
        a = d0Shadow.n(new m("list", q0Var, (String) null, rVar, l.r(new k[]{new k(rn.g, new u0(new t("login"))), new k(rn.h, new u0(new t("slug")))}), r6));
    }
}
