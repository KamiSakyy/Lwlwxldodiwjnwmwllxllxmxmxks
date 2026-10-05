package vu0;

import aa.a0;
import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.bf;
import pz0.c90;
import pz0.df;
import pz0.jx;
import pz0.le;
import pz0.mf;
import pz0.ny;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import pz0.xs;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        aa.s c = no.a.c(list, "selections", "Actor", r, list);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r2 = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        x xVar3 = vd.a;
        aa.m mVar2 = new aa.m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        List r3 = x61.l.r(new aa.m[]{mVar2, new aa.m("nodes", l0.a(w80.W), (String) null, rVar, rVar, r2)});
        List n = d0.n(new aa.m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar));
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("IssueType");
        List list2 = zr0.a.a;
        List r4 = x61.l.r(new aa.s[]{mVar3, no.a.c(list2, "selections", "IssueType", n2, list2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        List r5 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        List r6 = x61.l.r(new aa.m[]{mVar4, mVar5, new aa.m("owner", l0.b(ny.e), (String) null, rVar, rVar, r5), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List r7 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar6 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n3 = d0.n("Issue");
        List list3 = s.a;
        aa.s c2 = no.a.c(list3, "selections", "Issue", n3, list3);
        aa.s mVar8 = new aa.m("titleHTML", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar9 = new aa.m("number", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        bf.Companion.getClass();
        aa.s mVar10 = new aa.m("state", l0.b(bf.s), "issueState", rVar, rVar, rVar);
        c90.Companion.getClass();
        aa.r b2 = l0.b(c90.a);
        le.Companion.getClass();
        aa.s mVar11 = new aa.m("assignees", b2, (String) null, rVar, no.a.s(le.a, new u0(25)), r3);
        xs.Companion.getClass();
        q0 q0Var = xs.a;
        k71.k.g(q0Var, "type");
        aa.s mVar12 = new aa.m("closedByPullRequestsReferences", q0Var, (String) null, rVar, rVar, n);
        df.Companion.getClass();
        a0 a0Var = df.s;
        k71.k.g(a0Var, "type");
        aa.s mVar13 = new aa.m("stateReason", a0Var, (String) null, rVar, rVar, rVar);
        mf.Companion.getClass();
        q0 q0Var2 = mf.a;
        k71.k.g(q0Var2, "type");
        aa.s mVar14 = new aa.m("issueType", q0Var2, (String) null, rVar, rVar, r4);
        jx.Companion.getClass();
        aa.s mVar15 = new aa.m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r6);
        q0 q0Var3 = le.A;
        k71.k.g(q0Var3, "type");
        a = x61.l.r(new aa.s[]{mVar6, mVar7, c2, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, new aa.m("parent", q0Var3, (String) null, rVar, rVar, r7)});
    }
}
