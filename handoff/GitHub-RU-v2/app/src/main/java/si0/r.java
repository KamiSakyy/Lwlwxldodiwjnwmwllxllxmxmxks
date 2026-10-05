package si0;

import aa.q0;
import aa.u0;
import aa.x;
import gn0.fm;
import gn0.jm;
import gn0.lb;
import gn0.ll;
import gn0.nm;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r {
    public static final List a;

    static {
        rb.Companion.getClass();
        aa.r b = l0.b(rb.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        x xVar = pb.a;
        aa.m mVar = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        jm.Companion.getClass();
        aa.r b2 = l0.b(jm.a);
        fm.Companion.getClass();
        aa.m mVar2 = new aa.m("comments", b2, (String) null, rVar, no.a.s(fm.a, new u0(1)), n);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List n2 = d0.n(new aa.m("nodes", l0.a(fm.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        aa.s mVar5 = new aa.m("viewerDidAuthor", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        List n3 = d0.n("PullRequest");
        List list = q.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n3, list);
        nm.Companion.getClass();
        q0 q0Var = nm.a;
        k71.k.g(q0Var, "type");
        ll.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, c, new aa.m("reviews", q0Var, "pendingReviews", rVar, x61.l.r(new aa.k[]{new aa.k(ll.y, new u0(1)), new aa.k(ll.z, new u0(d0.n("PENDING")))}), n2)});
    }
}
