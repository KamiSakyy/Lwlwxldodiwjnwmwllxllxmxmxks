package dy;

import aa.m;
import aa.n;
import aa.q0;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.mr;
import m10.p00;
import m10.wg;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("hasNextPage", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        k71.k.g(xVar2, "type");
        List r = x61.l.r(new m[]{mVar, new m("endCursor", xVar2, (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar3 = ah.a;
        s mVar3 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar4 = new m("displayName", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar6 = new m("isCopilot", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar7 = new m("isAgent", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r2 = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        List r3 = x61.l.r(new s[]{mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, no.a.c(list, "selections", "Actor", r2, list)});
        List n = d0.n(new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar));
        List n2 = d0.n(new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar));
        List n3 = d0.n(new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar));
        s mVar8 = new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n4 = d0.n("User");
        List list2 = rx.h.a;
        List r4 = x61.l.r(new s[]{mVar8, no.a.c(list2, "selections", "User", n4, list2), new n("Bot", d0.n("Bot"), r3), new n("Mannequin", d0.n("Mannequin"), n), new n("Organization", d0.n("Organization"), n2), new n("EnterpriseUserAccount", d0.n("EnterpriseUserAccount"), n3)});
        mr.Companion.getClass();
        m mVar9 = new m("pageInfo", l0.b(mr.a), (String) null, rVar, rVar, r);
        ch.Companion.getClass();
        x xVar4 = ch.a;
        m mVar10 = new m("totalCount", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        List r5 = x61.l.r(new m[]{mVar9, mVar10, new m("nodes", l0.a(m10.l.a), (String) null, rVar, rVar, r4)});
        m mVar11 = new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        r b2 = l0.b(xVar4);
        i30.Companion.getClass();
        m mVar12 = new m("planLimit", b2, (String) null, rVar, no.a.s(i30.J, new u0("ISSUE_PR_ASSIGNEES")), rVar);
        m10.n.Companion.getClass();
        List r6 = x61.l.r(new m[]{mVar11, mVar12, new m("suggestedActors", l0.b(m10.n.a), (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(i30.i0, new u0(new t("after"))), new aa.k(i30.j0, new u0(d0.n("CAN_BE_ASSIGNED"))), new aa.k(i30.k0, new u0(50)), new aa.k(i30.l0, new u0(new t("query")))}), r5), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new m[]{new m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new u0(new t("repo"))), new aa.k(p00.m, new u0(new t("owner")))}), r6), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
