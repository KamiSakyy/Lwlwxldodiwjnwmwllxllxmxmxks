package ta0;

import aa.k;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.c00;
import hc0.db;
import hc0.e00;
import hc0.fb;
import hc0.ji;
import hc0.kz;
import hc0.pm;
import hc0.xa;
import hc0.yz;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r2 = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        xa.Companion.getClass();
        List r3 = l.r(new m[]{new m("hasNextPage", l0.b(xa.a), (String) null, rVar, rVar, rVar), new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("Repository");
        List list2 = x80.f.a;
        s c2 = no.a.c(list2, "selections", "Repository", n, list2);
        List n2 = d0.n("Repository");
        List list3 = x80.a.a;
        List r4 = l.r(new s[]{mVar2, c2, no.a.c(list3, "selections", "Repository", n2, list3)});
        ji.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(ji.a), (String) null, rVar, rVar, r3);
        c00.Companion.getClass();
        m mVar4 = new m("nodes", l0.a(c00.a), (String) null, rVar, rVar, r4);
        db.Companion.getClass();
        List r5 = l.r(new m[]{mVar3, mVar4, new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        m mVar8 = new m("user", l0.b(kz.O), (String) null, rVar, rVar, r2);
        e00.Companion.getClass();
        r b2 = l0.b(e00.a);
        yz.Companion.getClass();
        List r6 = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, new m("items", b2, (String) null, rVar, l.r(new k[]{new k(yz.a, new u0(new t("after"))), new k(yz.b, new u0(new t("first")))}), r5), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = yz.c;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = d0.n(new m("list", q0Var, (String) null, rVar, l.r(new k[]{new k(pm.d, new u0(new t("login"))), new k(pm.e, new u0(new t("slug")))}), r6));
    }
}
