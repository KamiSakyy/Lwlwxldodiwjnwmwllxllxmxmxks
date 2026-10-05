package x50;

import aa.a0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import hc0.ap;
import hc0.bb;
import hc0.db;
import hc0.dq;
import hc0.ev;
import hc0.ew;
import hc0.fb;
import hc0.h6;
import hc0.jc;
import hc0.kz;
import hc0.lc;
import hc0.qz;
import hc0.tb;
import hc0.xa;
import hc0.xk;
import hc0.z5;
import hc0.zb;
import java.util.List;
import k71.k;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        db.Companion.getClass();
        x xVar = db.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("totalCount", b, (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        x xVar2 = bb.a;
        m mVar = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar3 = fb.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar4 = xa.a;
        m mVar4 = new m("isPrivate", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        ev.Companion.getClass();
        a0 a0Var = ev.s;
        k.g(a0Var, "type");
        m mVar5 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        z5.Companion.getClass();
        m mVar6 = new m("viewerSubscriptionTypes", l0.a(l0.b(z5.s)), (String) null, rVar, rVar, rVar);
        dq.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, mVar5, mVar6, new m("owner", l0.b(dq.a), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        s mVar7 = new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List r3 = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r4 = l.r(new s[]{mVar7, no.a.c(list, "selections", "Actor", r3, list), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar8 = new m("totalCount", l0.b(xVar), (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        List r5 = l.r(new m[]{mVar8, new m("nodes", l0.a(kz.O), (String) null, rVar, rVar, r4)});
        List n2 = d0.n(new m("totalCount", l0.b(xVar), (String) null, rVar, rVar, rVar));
        s mVar9 = new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar10 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        s mVar11 = new m("title", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar12 = new m("titleHTML", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s mVar13 = new m("number", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h6.Companion.getClass();
        s mVar14 = new m("createdAt", l0.b(h6.a), (String) null, rVar, rVar, rVar);
        s mVar15 = new m("isReadByViewer", xVar4, (String) null, rVar, rVar, rVar);
        zb.Companion.getClass();
        s mVar16 = new m("comments", l0.b(zb.a), (String) null, rVar, rVar, n);
        List r6 = l.r(new String[]{"Discussion", "Issue", "PullRequest"});
        List list2 = d60.a.a;
        s c = no.a.c(list2, "selections", "Labelable", r6, list2);
        jc.Companion.getClass();
        s mVar17 = new m("state", l0.b(jc.s), "issueState", rVar, rVar, rVar);
        ap.Companion.getClass();
        s mVar18 = new m("repository", l0.b(ap.k0), (String) null, rVar, rVar, r2);
        s mVar19 = new m("viewerSubscription", a0Var, (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        s mVar20 = new m("url", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        qz.Companion.getClass();
        r b2 = l0.b(qz.a);
        tb.Companion.getClass();
        s mVar21 = new m("assignees", b2, (String) null, rVar, no.a.s(tb.a, new u0(25)), r5);
        xk.Companion.getClass();
        q0 q0Var = xk.a;
        k.g(q0Var, "type");
        s mVar22 = new m("closedByPullRequestsReferences", q0Var, (String) null, rVar, rVar, n2);
        lc.Companion.getClass();
        a0 a0Var2 = lc.s;
        k.g(a0Var2, "type");
        a = l.r(new s[]{mVar9, mVar10, mVar11, mVar12, mVar13, mVar14, mVar15, mVar16, c, mVar17, mVar18, mVar19, mVar20, mVar21, mVar22, new m("stateReason", a0Var2, (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
