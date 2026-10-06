package si0;

import aa.q0;
import aa.u0;
import aa.x;
import gn0.bn;
import gn0.dn;
import gn0.hb;
import gn0.hm;
import gn0.jm;
import gn0.lb;
import gn0.ll;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import gn0.zm;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("login", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        x xVar2 = pb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PullRequestReviewComment");
        List list = p.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "PullRequestReviewComment", n, list), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        hm.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(hm.a), (String) null, rVar, rVar, r2));
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        dn.Companion.getClass();
        aa.s mVar4 = new aa.m("subjectType", l0.b(dn.s), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar3 = lb.a;
        aa.s mVar6 = new aa.m("isResolved", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("isOutdated", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("viewerCanResolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar9 = new aa.m("viewerCanUnresolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        aa.s mVar10 = new aa.m("resolvedBy", q0Var, (String) null, rVar, rVar, r);
        aa.s mVar11 = new aa.m("viewerCanReply", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("PullRequestReviewThread");
        List list2 = zi0.a.a;
        aa.s c = no.a.c(list2, "selections", "PullRequestReviewThread", n3, list2);
        jm.Companion.getClass();
        aa.r b2 = l0.b(jm.a);
        zm.Companion.getClass();
        List n4 = d0Shadow.n(new aa.m("nodes", l0.a(zm.d), (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, c, new aa.m("comments", b2, (String) null, rVar, no.a.s(zm.a, new u0(50)), n2)})));
        aa.m mVar12 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        aa.m mVar13 = new aa.m("headRefOid", l0.b(hb.a), (String) null, rVar, rVar, rVar);
        bn.Companion.getClass();
        aa.r b3 = l0.b(bn.a);
        ll.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar12, mVar13, new aa.m("reviewThreads", b3, (String) null, rVar, no.a.s(ll.x, new u0(50)), n4), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
