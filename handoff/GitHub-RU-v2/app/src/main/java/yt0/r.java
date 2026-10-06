package yt0;

import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.dt;
import pz0.hs;
import pz0.ht;
import pz0.mt;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r {
    public static final List a;

    static {
        vd.Companion.getClass();
        aa.r b = l0.b(vd.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        x xVar = td.a;
        aa.m mVar = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ht.Companion.getClass();
        aa.r b2 = l0.b(ht.a);
        dt.Companion.getClass();
        aa.m mVar2 = new aa.m("comments", b2, (String) null, rVar, no.a.s(dt.a, new u0(1)), n);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(dt.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.s mVar5 = new aa.m("viewerDidAuthor", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("PullRequest");
        List list = q.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n3, list);
        mt.Companion.getClass();
        q0 q0Var = mt.a;
        k71.k.g(q0Var, "type");
        hs.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, c, new aa.m("reviews", q0Var, "pendingReviews", rVar, x61.l.r(new aa.k[]{new aa.k(hs.A, new u0(1)), new aa.k(hs.B, new u0(d0Shadow.n("PENDING")))}), n2)});
    }
}
