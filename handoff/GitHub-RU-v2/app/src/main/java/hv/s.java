package hv;

import aa.q0;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.dz;
import m10.eh;
import m10.hz;
import m10.ux;
import m10.wg;
import m10.zy;
import sy.d0Shadow;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class s {
    public static final List a;

    static {
        ch.Companion.getClass();
        aa.r b = l0.b(ch.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = d0Shadow.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        x xVar = ah.a;
        aa.m mVar = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        dz.Companion.getClass();
        aa.r b2 = l0.b(dz.a);
        zy.Companion.getClass();
        aa.m mVar2 = new aa.m("comments", b2, (String) null, rVar, no.a.s(zy.a, new u0(1)), n);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List n2 = d0Shadow.n(new aa.m("nodes", l0.a(zy.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)})));
        aa.s mVar3 = new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.s mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.s mVar5 = new aa.m("viewerDidAuthor", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("PullRequest");
        List list = r.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n3, list);
        hz.Companion.getClass();
        q0 q0Var = hz.a;
        k71.k.g(q0Var, "type");
        ux.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar3, mVar4, mVar5, c, new aa.m("reviews", q0Var, "pendingReviews", rVar, x61.l.r(new aa.k[]{new aa.k(ux.F, new u0(1)), new aa.k(ux.G, new u0(d0Shadow.n("PENDING")))}), n2)});
    }
}
