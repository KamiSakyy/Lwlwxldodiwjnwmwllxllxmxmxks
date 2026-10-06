package ny;

import aa.k;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import ew.j;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.fg0;
import m10.jg0;
import m10.lg0;
import m10.mr;
import m10.p00;
import m10.rf0;
import m10.wg;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r2 = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        wg.Companion.getClass();
        List r3 = l.r(new m[]{new m("hasNextPage", l0.b(wg.a), (String) null, rVar, rVar, rVar), new m("endCursor", xVar, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Repository");
        List list2 = j.a;
        s c2 = no.a.c(list2, "selections", "Repository", n, list2);
        List n2 = d0Shadow.n("Repository");
        List list3 = ew.b.a;
        List r4 = l.r(new s[]{mVar2, c2, no.a.c(list3, "selections", "Repository", n2, list3)});
        mr.Companion.getClass();
        m mVar3 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r3);
        jg0.Companion.getClass();
        m mVar4 = new m("nodes", l0.a(jg0.a), (String) null, rVar, rVar, r4);
        ch.Companion.getClass();
        List r5 = l.r(new m[]{mVar3, mVar4, new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        m mVar8 = new m("user", l0.b(rf0.g0), (String) null, rVar, rVar, r2);
        lg0.Companion.getClass();
        r b2 = l0.b(lg0.a);
        fg0.Companion.getClass();
        List r6 = l.r(new m[]{mVar5, mVar6, mVar7, mVar8, new m("items", b2, (String) null, rVar, l.r(new k[]{new k(fg0.a, new u0(new t("after"))), new k(fg0.b, new u0(new t("first")))}), r5), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        q0 q0Var = fg0.c;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("list", q0Var, (String) null, rVar, l.r(new k[]{new k(p00.g, new u0(new t("login"))), new k(p00.h, new u0(new t("slug")))}), r6), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
