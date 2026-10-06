package a80;

import aa.q0;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.dl;
import hc0.ew;
import hc0.fb;
import hc0.hl;
import hc0.kz;
import hc0.lk;
import hc0.ll;
import hc0.lr;
import hc0.xa;
import java.util.List;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        aa.m mVar2 = new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        aa.m mVar3 = new aa.m("avatarUrl", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar3 = xa.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("isViewer", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        kz.Companion.getClass();
        q0 q0Var = kz.O;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar4, new aa.m("requestedBy", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        db.Companion.getClass();
        List n = d0Shadow.n(new aa.m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar));
        aa.m mVar5 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hl.Companion.getClass();
        aa.r b2 = l0.b(hl.a);
        dl.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(dl.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar5, new aa.m("comments", b2, (String) null, rVar, no.a.s(dl.a, new u0(1)), n), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        aa.m mVar6 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("viewerDidAuthor", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        lr.Companion.getClass();
        q0 q0Var2 = lr.a;
        k71.k.g(q0Var2, "type");
        aa.m mVar8 = new aa.m("viewerLatestReviewRequest", q0Var2, (String) null, rVar, rVar, r2);
        ll.Companion.getClass();
        q0 q0Var3 = ll.a;
        k71.k.g(q0Var3, "type");
        lk.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, new aa.m("reviews", q0Var3, "pendingReviews", rVar, x61.l.r(new aa.k[]{new aa.k(lk.x, new u0(1)), new aa.k(lk.y, new u0(d0Shadow.n("PENDING")))}), n2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
