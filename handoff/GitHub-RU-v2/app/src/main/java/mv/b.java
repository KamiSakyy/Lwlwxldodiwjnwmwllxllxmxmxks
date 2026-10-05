package mv;

import aa.j0;
import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.dz;
import m10.eh;
import m10.ib0;
import m10.kb0;
import m10.rz;
import m10.wg;
import m10.zy;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("id", b, (String) null, rVar, rVar, rVar));
        m mVar = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        m mVar2 = new m("displayName", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        m mVar3 = new m("isCopilot", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar)});
        s mVar4 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r2 = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        List r3 = l.r(new s[]{mVar4, mVar5, no.a.c(list, "selections", "Actor", r2, list), new n("User", d0.n("User"), n), new n("Bot", d0.n("Bot"), r)});
        List r4 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ib0.Companion.getClass();
        List n2 = d0.n(new m("nodes", l0.a(ib0.a), (String) null, rVar, rVar, r4));
        ch.Companion.getClass();
        List n3 = d0.n(new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar));
        m mVar6 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar8 = new m("authorCanPushToRepository", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        m mVar9 = new m("author", j0Var, (String) null, rVar, rVar, r3);
        rz.Companion.getClass();
        m mVar10 = new m("state", l0.b(rz.s), (String) null, rVar, rVar, rVar);
        kb0.Companion.getClass();
        r b2 = l0.b(kb0.a);
        zy.Companion.getClass();
        m mVar11 = new m("onBehalfOf", b2, (String) null, rVar, no.a.s(zy.b, new u0(25)), n2);
        m mVar12 = new m("body", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        dz.Companion.getClass();
        a = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, new m("comments", l0.b(dz.a), (String) null, rVar, no.a.s(zy.a, new u0(1)), n3)});
    }
}
