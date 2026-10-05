package kz0;

import java.util.List;
import pz0.sk;
import pz0.td;
import pz0.vz;
import pz0.xd;
import pz0.yt;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t4 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PullRequestReviewThread");
        List list = iv0.a.a;
        aa.s c = no.a.c(list, "selections", "PullRequestReviewThread", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        yt.Companion.getClass();
        aa.q0 q0Var = yt.d;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("thread", q0Var, (String) null, rVar, rVar, r));
        vz.Companion.getClass();
        aa.q0 q0Var2 = vz.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("resolveReviewThread", q0Var2, (String) null, rVar, no.a.s(sk.I0, new aa.u0(a0.s0.p("threadId", new aa.t("nodeId")))), n2));
    }
}
