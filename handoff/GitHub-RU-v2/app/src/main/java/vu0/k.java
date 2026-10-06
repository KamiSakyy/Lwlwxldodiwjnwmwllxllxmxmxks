package vu0;

import aa.a0;
import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.h50;
import pz0.jx;
import pz0.mv;
import pz0.ny;
import pz0.pd;
import pz0.py;
import pz0.qf;
import pz0.td;
import pz0.vd;
import pz0.xd;
import pz0.zs;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        aa.s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        vd.Companion.getClass();
        List n = d0Shadow.n(new aa.m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar));
        List r3 = x61.l.r(new aa.m[]{new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.m mVar6 = new aa.m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        aa.m mVar7 = new aa.m("isInOrganization", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        aa.m mVar8 = new aa.m("owner", l0.b(ny.e), (String) null, rVar, rVar, r2);
        aa.m mVar9 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        py.Companion.getClass();
        a0 a0Var = py.s;
        k71.k.g(a0Var, "type");
        aa.m mVar10 = new aa.m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        aa.m mVar11 = new aa.m("squashMergeAllowed", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar12 = new aa.m("rebaseMergeAllowed", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar13 = new aa.m("mergeCommitAllowed", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar14 = new aa.m("viewerDefaultCommitEmail", xVar, (String) null, rVar, rVar, rVar);
        zs.Companion.getClass();
        aa.m mVar15 = new aa.m("viewerDefaultMergeMethod", l0.b(zs.s), (String) null, rVar, rVar, rVar);
        aa.m mVar16 = new aa.m("viewerPossibleCommitEmails", l0.a(l0.b(xVar)), (String) null, rVar, rVar, rVar);
        aa.r b2 = l0.b(xVar3);
        jx.Companion.getClass();
        aa.m mVar17 = new aa.m("planSupports", b2, (String) null, rVar, no.a.s(jx.N, new u0("TEAM_REVIEW_REQUESTS")), rVar);
        aa.m mVar18 = new aa.m("allowUpdateBranch", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        qf.Companion.getClass();
        q0 q0Var = qf.a;
        k71.k.g(q0Var, "type");
        aa.m mVar19 = new aa.m("issueTypes", q0Var, (String) null, rVar, rVar, n);
        mv.Companion.getClass();
        q0 q0Var2 = mv.e;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, mVar18, mVar19, new aa.m("defaultBranchRef", q0Var2, (String) null, rVar, rVar, r3)});
    }
}
