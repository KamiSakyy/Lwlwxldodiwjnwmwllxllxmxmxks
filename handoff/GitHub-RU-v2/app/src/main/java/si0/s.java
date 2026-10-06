package si0;

import aa.q0;
import aa.u0;
import aa.x;
import gn0.fm;
import gn0.jm;
import gn0.lb;
import gn0.ll;
import gn0.mx;
import gn0.nm;
import gn0.pb;
import gn0.ps;
import gn0.rb;
import gn0.s00;
import gn0.tb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        aa.m mVar2 = new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        aa.m mVar3 = new aa.m("avatarUrl", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar3 = lb.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("isViewer", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s00.Companion.getClass();
        q0 q0Var = s00.P;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar4, new aa.m("requestedBy", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        rb.Companion.getClass();
        List n = d0Shadow.n(new aa.m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar));
        aa.m mVar5 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        jm.Companion.getClass();
        aa.r b2 = l0.b(jm.a);
        fm.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(fm.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar5, new aa.m("comments", b2, (String) null, rVar, no.a.s(fm.a, new u0(1)), n), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        aa.m mVar6 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("viewerDidAuthor", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        ps.Companion.getClass();
        q0 q0Var2 = ps.a;
        k71.k.g(q0Var2, "type");
        aa.m mVar8 = new aa.m("viewerLatestReviewRequest", q0Var2, (String) null, rVar, rVar, r2);
        nm.Companion.getClass();
        q0 q0Var3 = nm.a;
        k71.k.g(q0Var3, "type");
        ll.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, new aa.m("reviews", q0Var3, "pendingReviews", rVar, x61.l.r(new aa.k[]{new aa.k(ll.y, new u0(1)), new aa.k(ll.z, new u0(d0Shadow.n("PENDING")))}), n2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
    public Object a() { return null; }
}
