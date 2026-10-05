package kz0;

import java.util.List;
import pz0.gu;
import pz0.hs;
import pz0.mh;
import pz0.pd;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n2 {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.r b = v8.l0.b(td.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        gu.Companion.getClass();
        aa.m mVar2 = new aa.m("state", v8.l0.b(gu.s), "pullRequestState", rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar3 = new aa.m("isDraft", v8.l0.b(pd.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", v8.l0.b(xd.a), (String) null, rVar, rVar, rVar)});
        hs.Companion.getClass();
        aa.q0 q0Var = hs.N;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        mh.Companion.getClass();
        aa.q0 q0Var2 = mh.a;
        k71.k.g(q0Var2, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("markPullRequestReadyForReview", q0Var2, (String) null, rVar, no.a.s(sk.r0, new aa.u0(a0.s0.p("pullRequestId", new aa.t("pullRequestId")))), n));
    }
}
