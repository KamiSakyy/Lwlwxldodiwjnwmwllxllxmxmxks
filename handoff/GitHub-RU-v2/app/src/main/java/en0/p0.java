package en0;

import gn0.bm;
import gn0.lb;
import gn0.ll;
import gn0.pb;
import gn0.tb;
import gn0.w8;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p0 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        bm.Companion.getClass();
        List n = sy.d0.n(new aa.m("mergeMethod", v8.l0.b(bm.s), (String) null, rVar, rVar, rVar));
        pb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        aa.x xVar2 = lb.a;
        aa.m mVar3 = new aa.m("viewerCanEnableAutoMerge", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("viewerCanDisableAutoMerge", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gn0.h1.Companion.getClass();
        aa.q0 q0Var = gn0.h1.a;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("autoMergeRequest", q0Var, (String) null, rVar, rVar, n), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        gn0.l.Companion.getClass();
        aa.j0 j0Var = gn0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar5 = new aa.m("actor", j0Var, (String) null, rVar, rVar, r2);
        ll.Companion.getClass();
        aa.q0 q0Var2 = ll.K;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("pullRequest", q0Var2, (String) null, rVar, rVar, r3)});
        w8.Companion.getClass();
        aa.q0 q0Var3 = w8.a;
        k71.k.g(q0Var3, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("disablePullRequestAutoMerge", q0Var3, (String) null, rVar, no.a.s(wh.P, new aa.u0(a0.s0.p("pullRequestId", new aa.t("pullRequestId")))), r4));
    }
}
