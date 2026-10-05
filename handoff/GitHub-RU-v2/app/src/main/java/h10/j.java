package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.ux;
import m10.vp;
import m10.zy;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequest");
        List list = hv.l.a;
        aa.s c = no.a.c(list, "selections", "PullRequest", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.s mVar3 = new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("PullRequestReview");
        List list2 = mv.a.a;
        aa.s c2 = no.a.c(list2, "selections", "PullRequestReview", n2, list2);
        ux.Companion.getClass();
        List r2 = x61.l.r(new aa.s[]{mVar2, mVar3, c2, new aa.m("pullRequest", v8.l0.b(ux.T), (String) null, rVar, rVar, r)});
        zy.Companion.getClass();
        aa.q0 q0Var = zy.d;
        k71.k.g(q0Var, "type");
        List n3 = sy.d0.n(new aa.m("pullRequestReview", q0Var, (String) null, rVar, rVar, r2));
        m10.d0.Companion.getClass();
        aa.q0 q0Var2 = m10.d0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("addPullRequestReview", q0Var2, (String) null, rVar, no.a.s(vp.h, new aa.u0(x61.x.u(new w61.k[]{new w61.k("body", new aa.t("body")), new w61.k("commitOID", new aa.t("commitOid")), new w61.k("event", new aa.t("event")), new w61.k("pullRequestId", new aa.t("id"))}))), n3));
    }
}
