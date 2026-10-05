package en0;

import gn0.bf;
import gn0.hn;
import gn0.lb;
import gn0.ll;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h2 {
    public static final List a;

    static {
        pb.Companion.getClass();
        aa.r b = v8.l0.b(pb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        hn.Companion.getClass();
        aa.m mVar2 = new aa.m("state", v8.l0.b(hn.s), "pullRequestState", rVar, rVar, rVar);
        lb.Companion.getClass();
        aa.m mVar3 = new aa.m("isDraft", v8.l0.b(lb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", v8.l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        ll.Companion.getClass();
        aa.q0 q0Var = ll.K;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("pullRequest", q0Var, (String) null, rVar, rVar, r));
        bf.Companion.getClass();
        aa.q0 q0Var2 = bf.a;
        k71.k.g(q0Var2, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("markPullRequestReadyForReview", q0Var2, (String) null, rVar, no.a.s(wh.i0, new aa.u0(a0.s0.p("pullRequestId", new aa.t("pullRequestId")))), n));
    }
}
