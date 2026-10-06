package x80;

import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import hc0.kp;
import hc0.kz;
import hc0.nc;
import hc0.qz;
import hc0.tc;
import hc0.vc;
import hc0.xa;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar3 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        s mVar4 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.b.a;
        List r2 = x61.l.r(new s[]{mVar, mVar2, mVar3, mVar4, no.a.c(list, "selections", "Actor", r, list)});
        kz.Companion.getClass();
        List n = d0Shadow.n(new aa.m("nodes", l0.a(kz.O), (String) null, rVar, rVar, r2));
        s mVar5 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("Label");
        List list2 = b60.a.a;
        List r3 = x61.l.r(new s[]{mVar5, no.a.c(list2, "selections", "Label", n2, list2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        tc.Companion.getClass();
        List n3 = d0Shadow.n(new aa.m("nodes", l0.a(tc.a), (String) null, rVar, rVar, r3));
        aa.m mVar6 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("about", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("title", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar9 = new aa.m("body", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar10 = new aa.m("filename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        qz.Companion.getClass();
        r b2 = l0.b(qz.a);
        List t = no.a.t("includeIssueTemplateProperties", false);
        nc.Companion.getClass();
        aa.m mVar11 = new aa.m("assignees", b2, (String) null, t, no.a.s(nc.a, new u0(30)), n);
        vc.Companion.getClass();
        q0 q0Var = vc.a;
        k71.k.g(q0Var, "type");
        List r4 = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new aa.m("labels", q0Var, (String) null, d0Shadow.n(new aa.l("includeIssueTemplateProperties", false)), no.a.s(nc.b, new u0(30)), n3)});
        aa.m mVar12 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar13 = new aa.m("about", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        x xVar3 = ew.a;
        List r5 = x61.l.r(new aa.m[]{mVar12, mVar13, new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r6 = x61.l.r(new aa.m[]{new aa.m("about", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.m mVar14 = new aa.m("issueTemplates", l0.a(l0.b(nc.c)), (String) null, rVar, rVar, r4);
        kp.Companion.getClass();
        q0 q0Var2 = kp.a;
        aa.m mVar15 = new aa.m("contactLinks", l0.a(l0.b(q0Var2)), (String) null, rVar, rVar, r5);
        aa.m mVar16 = new aa.m("issueFormLinks", l0.a(l0.b(q0Var2)), (String) null, rVar, rVar, r6);
        xa.Companion.getClass();
        x xVar4 = xa.a;
        a = x61.l.r(new aa.m[]{mVar14, mVar15, mVar16, new aa.m("isBlankIssuesEnabled", l0.b(xVar4), (String) null, rVar, rVar, rVar), new aa.m("isSecurityPolicyEnabled", xVar4, (String) null, rVar, rVar, rVar), new aa.m("securityPolicyUrl", xVar3, (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
