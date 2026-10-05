package yt0;

import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.au;
import pz0.cu;
import pz0.ft;
import pz0.hs;
import pz0.ht;
import pz0.ld;
import pz0.pd;
import pz0.td;
import pz0.w80;
import pz0.xd;
import pz0.yt;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("login", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("PullRequestReviewComment");
        List list = p.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "PullRequestReviewComment", n, list), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ft.Companion.getClass();
        List n2 = d0.n(new aa.m("nodes", l0.a(ft.a), (String) null, rVar, rVar, r2));
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cu.Companion.getClass();
        aa.s mVar4 = new aa.m("subjectType", l0.b(cu.s), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        aa.s mVar6 = new aa.m("isResolved", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("isOutdated", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("viewerCanResolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar9 = new aa.m("viewerCanUnresolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        q0 q0Var = w80.W;
        k71.k.g(q0Var, "type");
        aa.s mVar10 = new aa.m("resolvedBy", q0Var, (String) null, rVar, rVar, r);
        aa.s mVar11 = new aa.m("viewerCanReply", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n3 = d0.n("PullRequestReviewThread");
        List list2 = fu0.a.a;
        aa.s c = no.a.c(list2, "selections", "PullRequestReviewThread", n3, list2);
        ht.Companion.getClass();
        aa.r b2 = l0.b(ht.a);
        yt.Companion.getClass();
        List n4 = d0.n(new aa.m("nodes", l0.a(yt.d), (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, c, new aa.m("comments", b2, (String) null, rVar, no.a.s(yt.a, new u0(50)), n2)})));
        aa.m mVar12 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ld.Companion.getClass();
        aa.m mVar13 = new aa.m("headRefOid", l0.b(ld.a), (String) null, rVar, rVar, rVar);
        au.Companion.getClass();
        aa.r b3 = l0.b(au.a);
        hs.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar12, mVar13, new aa.m("reviewThreads", b3, (String) null, rVar, no.a.s(hs.z, new u0(50)), n4), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
