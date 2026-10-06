package vu0;

import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.c90;
import pz0.ff;
import pz0.h50;
import pz0.mf;
import pz0.pd;
import pz0.sf;
import pz0.td;
import pz0.tx;
import pz0.uf;
import pz0.w80;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
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
        aa.s mVar3 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        List r2 = x61.l.r(new aa.s[]{mVar, mVar2, mVar3, mVar4, no.a.c(list, "selections", "Actor", r, list)});
        w80.Companion.getClass();
        List n = d0Shadow.n(new aa.m("nodes", l0.a(w80.W), (String) null, rVar, rVar, r2));
        aa.s mVar5 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("Label");
        List list2 = bs0.a.a;
        List r3 = x61.l.r(new aa.s[]{mVar5, no.a.c(list2, "selections", "Label", n2, list2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        sf.Companion.getClass();
        List n3 = d0Shadow.n(new aa.m("nodes", l0.a(sf.a), (String) null, rVar, rVar, r3));
        aa.s mVar6 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n4 = d0Shadow.n("IssueType");
        List list3 = zr0.a.a;
        List r4 = x61.l.r(new aa.s[]{mVar6, no.a.c(list3, "selections", "IssueType", n4, list3), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar7 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("about", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar9 = new aa.m("title", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar10 = new aa.m("body", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar11 = new aa.m("filename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        c90.Companion.getClass();
        aa.r b2 = l0.b(c90.a);
        List t = no.a.t("includeIssueTemplateProperties", false);
        ff.Companion.getClass();
        aa.m mVar12 = new aa.m("assignees", b2, (String) null, t, no.a.s(ff.a, new u0(30)), n);
        uf.Companion.getClass();
        q0 q0Var = uf.a;
        k71.k.g(q0Var, "type");
        aa.m mVar13 = new aa.m("labels", q0Var, (String) null, d0Shadow.n(new aa.l("includeIssueTemplateProperties", false)), no.a.s(ff.b, new u0(30)), n3);
        mf.Companion.getClass();
        q0 q0Var2 = mf.a;
        k71.k.g(q0Var2, "type");
        List r5 = x61.l.r(new aa.m[]{mVar7, mVar8, mVar9, mVar10, mVar11, mVar12, mVar13, new aa.m("type", q0Var2, (String) null, rVar, rVar, r4)});
        aa.m mVar14 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar15 = new aa.m("about", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        x xVar3 = h50.a;
        List r6 = x61.l.r(new aa.m[]{mVar14, mVar15, new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r7 = x61.l.r(new aa.m[]{new aa.m("about", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.m mVar16 = new aa.m("issueTemplates", l0.a(l0.b(ff.c)), (String) null, rVar, rVar, r5);
        tx.Companion.getClass();
        q0 q0Var3 = tx.a;
        aa.m mVar17 = new aa.m("contactLinks", l0.a(l0.b(q0Var3)), (String) null, rVar, rVar, r6);
        aa.m mVar18 = new aa.m("issueFormLinks", l0.a(l0.b(q0Var3)), (String) null, rVar, rVar, r7);
        pd.Companion.getClass();
        x xVar4 = pd.a;
        a = x61.l.r(new aa.m[]{mVar16, mVar17, mVar18, new aa.m("isBlankIssuesEnabled", l0.b(xVar4), (String) null, rVar, rVar, rVar), new aa.m("isSecurityPolicyEnabled", xVar4, (String) null, rVar, rVar, rVar), new aa.m("securityPolicyUrl", xVar3, (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
