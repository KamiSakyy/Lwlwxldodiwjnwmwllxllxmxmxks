package hv;

import aa.q0;
import aa.u0;
import aa.x;
import aa.x0;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.d60;
import m10.dz;
import m10.eh;
import m10.hz;
import m10.ux;
import m10.wg;
import m10.x50;
import m10.zy;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        aa.m mVar2 = new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("displayName", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        x xVar3 = cc0.a;
        aa.m mVar4 = new aa.m("avatarUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar4 = wg.a;
        List r = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.n("User", d0Shadow.n("User"), x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("isViewer", l0.b(xVar4), (String) null, rVar, rVar, rVar)})), new aa.n("Bot", d0Shadow.n("Bot"), x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("displayName", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("avatarUrl", l0.b(xVar3), (String) null, rVar, rVar, rVar)}))});
        aa.m mVar5 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        d60.Companion.getClass();
        x0 x0Var = d60.a;
        k71.k.g(x0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar5, new aa.m("requestedByActor", x0Var, (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        List n = d0Shadow.n(new aa.m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar));
        aa.m mVar6 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        dz.Companion.getClass();
        aa.r b2 = l0.b(dz.a);
        zy.Companion.getClass();
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(zy.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar6, new aa.m("comments", b2, (String) null, rVar, no.a.s(zy.a, new u0(1)), n), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        aa.m mVar7 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar8 = new aa.m("viewerDidAuthor", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        x50.Companion.getClass();
        q0 q0Var = x50.a;
        k71.k.g(q0Var, "type");
        aa.m mVar9 = new aa.m("viewerLatestReviewRequest", q0Var, (String) null, rVar, rVar, r2);
        hz.Companion.getClass();
        q0 q0Var2 = hz.a;
        k71.k.g(q0Var2, "type");
        ux.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar7, mVar8, mVar9, new aa.m("reviews", q0Var2, "pendingReviews", rVar, x61.l.r(new aa.k[]{new aa.k(ux.F, new u0(1)), new aa.k(ux.G, new u0(d0Shadow.n("PENDING")))}), n2), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
