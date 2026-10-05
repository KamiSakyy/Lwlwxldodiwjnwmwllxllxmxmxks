package ng0;

import aa.a0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import gn0.eq;
import gn0.hc;
import gn0.hr;
import gn0.j6;
import gn0.kw;
import gn0.lb;
import gn0.mx;
import gn0.nc;
import gn0.pb;
import gn0.r6;
import gn0.rb;
import gn0.s00;
import gn0.tb;
import gn0.xc;
import gn0.y00;
import gn0.zc;
import gn0.zl;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        rb.Companion.getClass();
        x xVar = rb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        x xVar2 = pb.a;
        m mVar = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar3 = tb.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar4 = lb.a;
        m mVar4 = new m("isPrivate", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        kw.Companion.getClass();
        a0 a0Var = kw.s;
        k.g(a0Var, "type");
        m mVar5 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        j6.Companion.getClass();
        m mVar6 = new m("viewerSubscriptionTypes", l0.a(l0.b(j6.s)), (String) null, rVar, rVar, rVar);
        hr.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("owner", l0.b(hr.a), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        s mVar7 = new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List r3 = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r4 = l.r(new s[]{mVar7, no.a.c(list, "selections", "Actor", r3, list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar8 = new m("totalCount", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        List r5 = l.r(new m[]{mVar8, new m("nodes", l0.a(s00.P), (String) null, rVar, rVar, r4)});
        List n2 = d0.n(new m("totalCount", l0.b(xVar), (String) null, rVar, rVar, rVar));
        s mVar9 = new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar10 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar11 = new m("title", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar12 = new m("titleHTML", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar13 = new m("number", l0.b(xVar), (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        s mVar14 = new m("createdAt", l0.b(r6.a), (String) null, rVar, rVar, rVar);
        s mVar15 = new m("isReadByViewer", xVar4, (String) null, rVar, rVar, rVar);
        nc.Companion.getClass();
        s mVar16 = new m("comments", l0.b(nc.a), (String) null, rVar, rVar, n);
        List r6 = l.r(new String[]{"Discussion", "Issue", "PullRequest"});
        List list2 = tg0.a.a;
        s c = no.a.c(list2, "selections", "Labelable", r6, list2);
        xc.Companion.getClass();
        s mVar17 = new m("state", l0.b(xc.s), "issueState", rVar, rVar, rVar);
        eq.Companion.getClass();
        s mVar18 = new m("repository", l0.b(eq.m0), (String) null, rVar, rVar, r2);
        s mVar19 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        s mVar20 = new m("url", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        y00.Companion.getClass();
        r b2 = l0.b(y00.a);
        hc.Companion.getClass();
        s mVar21 = new m("assignees", b2, (String) null, rVar, no.a.s(hc.a, new u0(25)), r5);
        zl.Companion.getClass();
        q0 q0Var = zl.a;
        k.g(q0Var, "type");
        s mVar22 = new m("closedByPullRequestsReferences", q0Var, (String) null, rVar, rVar, n2);
        zc.Companion.getClass();
        a0 a0Var2 = zc.s;
        k.g(a0Var2, "type");
        a = l.r(new s[]{mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, c, mVar17, mVar18, mVar19, mVar20, mVar21, mVar22, new m("stateReason", a0Var2, (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
