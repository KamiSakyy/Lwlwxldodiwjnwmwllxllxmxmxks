package yt0;

import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.dt;
import pz0.h50;
import pz0.hs;
import pz0.ht;
import pz0.mt;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import pz0.zz;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        aa.m mVar2 = new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.m mVar3 = new aa.m("avatarUrl", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("isViewer", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        q0 q0Var = w80.W;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar4, new aa.m("requestedBy", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        vd.Companion.getClass();
        List n = d0.n(new aa.m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar));
        aa.m mVar5 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ht.Companion.getClass();
        aa.r b2 = l0.b(ht.a);
        dt.Companion.getClass();
        List n2 = d0.n(new aa.m("nodes", l0.a(dt.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar5, new aa.m("comments", b2, (String) null, rVar, no.a.s(dt.a, new u0(1)), n), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        aa.m mVar6 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("viewerDidAuthor", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        zz.Companion.getClass();
        q0 q0Var2 = zz.a;
        k71.k.g(q0Var2, "type");
        aa.m mVar8 = new aa.m("viewerLatestReviewRequest", q0Var2, (String) null, rVar, rVar, r2);
        mt.Companion.getClass();
        q0 q0Var3 = mt.a;
        k71.k.g(q0Var3, "type");
        hs.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar6, mVar7, mVar8, new aa.m("reviews", q0Var3, "pendingReviews", rVar, x61.l.r(new aa.k[]{new aa.k(hs.A, new u0(1)), new aa.k(hs.B, new u0(d0.n("PENDING")))}), n2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
