package h10;

import java.util.List;
import m10.ah;
import m10.bd;
import m10.eh;
import m10.py;
import m10.ux;
import m10.vp;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class v0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        py.Companion.getClass();
        List n = sy.d0Shadow.n(new aa.m("mergeMethod", v8.l0.b(py.s), (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.x xVar2 = wg.a;
        aa.m mVar3 = new aa.m("viewerCanEnableAutoMerge", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("viewerCanDisableAutoMerge", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m10.f2.Companion.getClass();
        aa.q0 q0Var = m10.f2.a;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("autoMergeRequest", q0Var, (String) null, rVar, rVar, n), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m10.l.Companion.getClass();
        aa.j0 j0Var = m10.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar5 = new aa.m("actor", j0Var, (String) null, rVar, rVar, r2);
        ux.Companion.getClass();
        aa.q0 q0Var2 = ux.T;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("pullRequest", q0Var2, (String) null, rVar, rVar, r3)});
        bd.Companion.getClass();
        aa.q0 q0Var3 = bd.a;
        k71.k.g(q0Var3, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("disablePullRequestAutoMerge", q0Var3, (String) null, rVar, no.a.s(vp.a0, new aa.u0(a0.s0.p("pullRequestId", new aa.t("pullRequestId")))), r4));
    }
}
