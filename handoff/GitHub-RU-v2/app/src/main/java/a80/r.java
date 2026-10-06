package a80;

import aa.q0;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.dl;
import hc0.fb;
import hc0.hl;
import hc0.lk;
import hc0.ll;
import hc0.xa;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r {
    public static final List a;

    static {
        db.Companion.getClass();
        aa.r b = l0.b(db.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        x xVar = bb.a;
        aa.m mVar = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hl.Companion.getClass();
        aa.r b2 = l0.b(hl.a);
        dl.Companion.getClass();
        aa.m mVar2 = new aa.m("comments", b2, (String) null, rVar, no.a.s(dl.a, new u0(1)), n);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(dl.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        aa.s mVar5 = new aa.m("viewerDidAuthor", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("PullRequest");
        List list = q.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n3, list);
        ll.Companion.getClass();
        q0 q0Var = ll.a;
        k71.k.g(q0Var, "type");
        lk.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, c, new aa.m("reviews", q0Var, "pendingReviews", rVar, x61.l.r(new aa.k[]{new aa.k(lk.x, new u0(1)), new aa.k(lk.y, new u0(d0Shadow.n("PENDING")))}), n2)});
    }
}
