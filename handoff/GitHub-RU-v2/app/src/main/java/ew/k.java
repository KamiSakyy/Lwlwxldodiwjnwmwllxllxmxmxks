package ew;

import aa.a0;
import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.j10;
import m10.l40;
import m10.l5;
import m10.n40;
import m10.oj;
import m10.py;
import m10.wg;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        aa.s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, no.a.c(list, "selections", "Actor", r, list)});
        ch.Companion.getClass();
        x xVar3 = ch.a;
        List n = d0.n(new aa.m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar));
        List r3 = x61.l.r(new aa.m[]{new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        List n2 = d0.n(new aa.m("totalCount", l0.b(xVar3), (String) null, rVar, rVar, rVar));
        aa.m mVar4 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar5 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        aa.m mVar6 = new aa.m("url", l0.b(cc0.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar4 = wg.a;
        aa.m mVar7 = new aa.m("isInOrganization", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        aa.m mVar8 = new aa.m("owner", l0.b(l40.e), (String) null, rVar, rVar, r2);
        aa.m mVar9 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        n40.Companion.getClass();
        a0 a0Var = n40.s;
        k71.k.g(a0Var, "type");
        aa.m mVar10 = new aa.m("viewerPermission", a0Var, (String) null, rVar, rVar, rVar);
        aa.m mVar11 = new aa.m("squashMergeAllowed", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.m mVar12 = new aa.m("rebaseMergeAllowed", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.m mVar13 = new aa.m("mergeCommitAllowed", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        aa.m mVar14 = new aa.m("viewerDefaultCommitEmail", xVar, (String) null, rVar, rVar, rVar);
        py.Companion.getClass();
        aa.m mVar15 = new aa.m("viewerDefaultMergeMethod", l0.b(py.s), (String) null, rVar, rVar, rVar);
        aa.m mVar16 = new aa.m("viewerPossibleCommitEmails", l0.a(l0.b(xVar)), (String) null, rVar, rVar, rVar);
        aa.r b2 = l0.b(xVar4);
        i30.Companion.getClass();
        aa.m mVar17 = new aa.m("planSupports", b2, (String) null, rVar, no.a.s(i30.K, new u0("TEAM_REVIEW_REQUESTS")), rVar);
        aa.m mVar18 = new aa.m("allowUpdateBranch", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        oj.Companion.getClass();
        q0 q0Var = oj.a;
        k71.k.g(q0Var, "type");
        aa.m mVar19 = new aa.m("issueTypes", q0Var, (String) null, rVar, rVar, n);
        j10.Companion.getClass();
        q0 q0Var2 = j10.e;
        k71.k.g(q0Var2, "type");
        aa.m mVar20 = new aa.m("defaultBranchRef", q0Var2, (String) null, rVar, rVar, r3);
        l5.Companion.getClass();
        q0 q0Var3 = l5.a;
        k71.k.g(q0Var3, "type");
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, mVar17, mVar18, mVar19, mVar20, new aa.m("viewerCodingAgents", q0Var3, (String) null, rVar, no.a.s(i30.q0, new u0(0)), n2)});
    }
}
