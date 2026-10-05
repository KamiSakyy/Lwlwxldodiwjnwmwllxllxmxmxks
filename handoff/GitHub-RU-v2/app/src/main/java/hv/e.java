package hv;

import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.bz;
import m10.dz;
import m10.eh;
import m10.rf0;
import m10.sg;
import m10.tz;
import m10.ux;
import m10.vz;
import m10.wg;
import m10.xz;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("login", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = d0.n("PullRequestReviewComment");
        List list = q.a;
        List r2 = x61.l.r(new aa.s[]{mVar2, no.a.c(list, "selections", "PullRequestReviewComment", n, list), new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        bz.Companion.getClass();
        List n2 = d0.n(new aa.m("nodes", l0.a(bz.a), (String) null, rVar, rVar, r2));
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xz.Companion.getClass();
        aa.s mVar4 = new aa.m("subjectType", l0.b(xz.s), (String) null, rVar, rVar, rVar);
        aa.s mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar3 = wg.a;
        aa.s mVar6 = new aa.m("isResolved", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar7 = new aa.m("isOutdated", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar8 = new aa.m("viewerCanResolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        aa.s mVar9 = new aa.m("viewerCanUnresolve", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        q0 q0Var = rf0.g0;
        k71.k.g(q0Var, "type");
        aa.s mVar10 = new aa.m("resolvedBy", q0Var, (String) null, rVar, rVar, r);
        aa.s mVar11 = new aa.m("viewerCanReply", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        List n3 = d0.n("PullRequestReviewThread");
        List list2 = ov.a.a;
        aa.s c = no.a.c(list2, "selections", "PullRequestReviewThread", n3, list2);
        dz.Companion.getClass();
        aa.r b2 = l0.b(dz.a);
        tz.Companion.getClass();
        List n4 = d0.n(new aa.m("nodes", l0.a(tz.e), (String) null, rVar, rVar, x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, c, new aa.m("comments", b2, (String) null, rVar, no.a.s(tz.a, new u0(50)), n2)})));
        aa.m mVar12 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        sg.Companion.getClass();
        aa.m mVar13 = new aa.m("headRefOid", l0.b(sg.a), (String) null, rVar, rVar, rVar);
        vz.Companion.getClass();
        aa.r b3 = l0.b(vz.a);
        ux.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar12, mVar13, new aa.m("reviewThreads", b3, (String) null, rVar, no.a.s(ux.E, new u0(50)), n4), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
