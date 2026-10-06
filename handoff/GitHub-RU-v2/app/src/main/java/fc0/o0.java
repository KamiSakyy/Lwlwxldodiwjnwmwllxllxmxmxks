package fc0;

import hc0.bb;
import hc0.fb;
import hc0.k8;
import hc0.lk;
import hc0.wg;
import hc0.xa;
import hc0.zk;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        zk.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("mergeMethod", v8.l0.b(zk.s), (String) null, rVar, rVar, rVar));
        bb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        aa.x xVar2 = xa.a;
        aa.m mVar3 = new aa.m("viewerCanEnableAutoMerge", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("viewerCanDisableAutoMerge", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hc0.f1Shadow.Companion.getClass();
        aa.q0 q0Var = hc0.f1Shadow.a;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("autoMergeRequest", q0Var, (String) null, rVar, rVar, n), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        hc0.l.Companion.getClass();
        aa.j0 j0Var = hc0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar5 = new aa.m("actor", j0Var, (String) null, rVar, rVar, r2);
        lk.Companion.getClass();
        aa.q0 q0Var2 = lk.J;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("pullRequest", q0Var2, (String) null, rVar, rVar, r3)});
        k8.Companion.getClass();
        aa.q0 q0Var3 = k8.a;
        k71.k.g(q0Var3, "type");
        wg.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("disablePullRequestAutoMerge", q0Var3, (String) null, rVar, no.a.s(wg.O, new aa.u0(a0.s0.p("pullRequestId", new aa.t("pullRequestId")))), r4));
    }
}
