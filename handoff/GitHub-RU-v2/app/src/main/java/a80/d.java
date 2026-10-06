package a80;

import aa.q0;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.bm;
import hc0.fb;
import hc0.fl;
import hc0.hl;
import hc0.kz;
import hc0.lk;
import hc0.ta;
import hc0.xa;
import hc0.xl;
import hc0.zl;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("login", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("PullRequestReviewComment");
        List list = p.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "PullRequestReviewComment", n, list), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        fl.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(fl.a), (String) null, rVar, rVar, r2));
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bm.Companion.getClass();
        aa.s mVar4 = new aa.m("subjectType", l0.b(bm.s), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar3 = xa.a;
        aa.s mVar6 = new aa.m("isResolved", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("isOutdated", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("viewerCanResolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar9 = new aa.m("viewerCanUnresolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        aa.s mVar10 = new aa.m("resolvedBy", q0Var, (String) null, rVar, rVar, r);
        aa.s mVar11 = new aa.m("viewerCanReply", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("PullRequestReviewThread");
        List list2 = h80.a.a;
        aa.s c = no.a.c(list2, "selections", "PullRequestReviewThread", n3, list2);
        hl.Companion.getClass();
        aa.r b2 = l0.b(hl.a);
        xl.Companion.getClass();
        List n4 = d0Shadow.n(new aa.m("nodes", l0.a(xl.d), (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, c, new aa.m("comments", b2, (String) null, rVar, no.a.s(xl.a, new u0(50)), n2)})));
        aa.m mVar12 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ta.Companion.getClass();
        aa.m mVar13 = new aa.m("headRefOid", l0.b(ta.a), (String) null, rVar, rVar, rVar);
        zl.Companion.getClass();
        aa.r b3 = l0.b(zl.a);
        lk.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar12, mVar13, new aa.m("reviewThreads", b3, (String) null, rVar, no.a.s(lk.w, new u0(50)), n4), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
