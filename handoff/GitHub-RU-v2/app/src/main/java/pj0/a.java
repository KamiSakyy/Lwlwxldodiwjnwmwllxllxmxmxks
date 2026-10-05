package pj0;

import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.bd;
import gn0.hd;
import gn0.jd;
import gn0.lb;
import gn0.mx;
import gn0.oq;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import gn0.y00;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        s mVar2 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar3 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        s mVar4 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.b.a;
        List r2 = x61.l.r(new s[]{mVar, mVar2, mVar3, mVar4, no.a.c(list, "selections", "Actor", r, list)});
        s00.Companion.getClass();
        List n = d0.n(new aa.m("nodes", l0.a(s00.P), (String) null, rVar, rVar, r2));
        s mVar5 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0.n("Label");
        List list2 = rg0.a.a;
        List r3 = x61.l.r(new s[]{mVar5, no.a.c(list2, "selections", "Label", n2, list2), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hd.Companion.getClass();
        List n3 = d0.n(new aa.m("nodes", l0.a(hd.a), (String) null, rVar, rVar, r3));
        aa.m mVar6 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("about", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("title", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar9 = new aa.m("body", xVar, (String) null, rVar, rVar, rVar);
        aa.m mVar10 = new aa.m("filename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        y00.Companion.getClass();
        r b2 = l0.b(y00.a);
        List t = no.a.t("includeIssueTemplateProperties", false);
        bd.Companion.getClass();
        aa.m mVar11 = new aa.m("assignees", b2, (String) null, t, no.a.s(bd.a, new u0(30)), n);
        jd.Companion.getClass();
        q0 q0Var = jd.a;
        k71.k.g(q0Var, "type");
        List r4 = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, new aa.m("labels", q0Var, (String) null, d0.n(new aa.l("includeIssueTemplateProperties", false)), no.a.s(bd.b, new u0(30)), n3)});
        aa.m mVar12 = new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar13 = new aa.m("about", l0.b(xVar), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        x xVar3 = mx.a;
        List r5 = x61.l.r(new aa.m[]{mVar12, mVar13, new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r6 = x61.l.r(new aa.m[]{new aa.m("about", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("url", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        aa.m mVar14 = new aa.m("issueTemplates", l0.a(l0.b(bd.c)), (String) null, rVar, rVar, r4);
        oq.Companion.getClass();
        q0 q0Var2 = oq.a;
        aa.m mVar15 = new aa.m("contactLinks", l0.a(l0.b(q0Var2)), (String) null, rVar, rVar, r5);
        aa.m mVar16 = new aa.m("issueFormLinks", l0.a(l0.b(q0Var2)), (String) null, rVar, rVar, r6);
        lb.Companion.getClass();
        x xVar4 = lb.a;
        a = x61.l.r(new aa.m[]{mVar14, mVar15, mVar16, new aa.m("isBlankIssuesEnabled", l0.b(xVar4), (String) null, rVar, rVar, rVar), new aa.m("isSecurityPolicyEnabled", xVar4, (String) null, rVar, rVar, rVar), new aa.m("securityPolicyUrl", xVar3, (String) null, rVar, rVar, rVar), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
