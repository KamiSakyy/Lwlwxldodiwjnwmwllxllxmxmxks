package ww0;

import aa.k;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.hm;
import pz0.k90;
import pz0.o90;
import pz0.pd;
import pz0.q90;
import pz0.su;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import sy.d0;
import v8.l0;
import vu0.j;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        pd.Companion.getClass();
        List r3 = l.r(new m[]{new m("hasNextPage", l0.b(pd.a), (String) null, rVar, rVar, rVar), new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list2 = j.a;
        s c2 = no.a.c(list2, "selections", "Repository", n, list2);
        List n2 = d0.n("Repository");
        List list3 = vu0.b.a;
        List r4 = l.r(new s[]{mVar2, c2, no.a.c(list3, "selections", "Repository", n2, list3)});
        hm.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(hm.a), (String) null, rVar, rVar, r3);
        o90.Companion.getClass();
        m mVar4 = new m("nodes", l0.a(o90.a), (String) null, rVar, rVar, r4);
        vd.Companion.getClass();
        List r5 = l.r(new m[]{mVar3, mVar4, new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        m mVar8 = new m("user", l0.b(w80.W), (String) null, rVar, rVar, r2);
        q90.Companion.getClass();
        r b2 = l0.b(q90.a);
        k90.Companion.getClass();
        List r6 = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, new m("items", b2, (String) null, rVar, l.r(new k[]{new k(k90.a, new u0(new t("after"))), new k(k90.b, new u0(new t("first")))}), r5), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = k90.c;
        k71.k.g(q0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("list", q0Var, (String) null, rVar, l.r(new k[]{new k(su.g, new u0(new t("login"))), new k(su.h, new u0(new t("slug")))}), r6), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
