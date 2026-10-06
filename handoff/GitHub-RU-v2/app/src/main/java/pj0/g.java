package pj0;

import aa.a0;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.bm;
import gn0.eq;
import gn0.hr;
import gn0.jr;
import gn0.lb;
import gn0.mo;
import gn0.mx;
import gn0.pb;
import gn0.tb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.b.a;
        List r2 = x61.l.r(new s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        List r3 = x61.l.r(new aa.m[]{new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        aa.m mVar6 = new aa.m("url", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar3 = lb.a;
        aa.m mVar7 = new aa.m("isInOrganization", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        hr.Companion.getClass();
        aa.m mVar8 = new aa.m("owner", l0.b(hr.a), (String) null, rVar, rVar, r2);
        aa.m mVar9 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        jr.Companion.getClass();
        a0 a0Var = jr.s;
        k71.k.g(a0Var, "type");
        aa.m mVar10 = new aa.m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        aa.m mVar11 = new aa.m("squashMergeAllowed", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar12 = new aa.m("rebaseMergeAllowed", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar13 = new aa.m("mergeCommitAllowed", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.m mVar14 = new aa.m("viewerDefaultCommitEmail", xVar, (String) null, rVar, rVar, rVar);
        bm.Companion.getClass();
        aa.m mVar15 = new aa.m("viewerDefaultMergeMethod", l0.b(bm.s), (String) null, rVar, rVar, rVar);
        aa.m mVar16 = new aa.m("viewerPossibleCommitEmails", l0.a(l0.b(xVar)), (String) null, rVar, rVar, rVar);
        r b2 = l0.b(xVar3);
        eq.Companion.getClass();
        aa.m mVar17 = new aa.m("planSupports", b2, (String) null, rVar, no.a.s(eq.K, new u0("TEAM_REVIEW_REQUESTS")), rVar);
        aa.m mVar18 = new aa.m("allowUpdateBranch", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        mo.Companion.getClass();
        q0 q0Var = mo.b;
        k71.k.g(q0Var, "type");
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, mVar18, new aa.m("defaultBranchRef", q0Var, (String) null, rVar, rVar, r3)});
    }
}
