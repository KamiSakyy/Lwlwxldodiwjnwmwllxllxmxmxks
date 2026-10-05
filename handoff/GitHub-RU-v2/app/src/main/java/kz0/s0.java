package kz0;

import java.util.List;
import pz0.hs;
import pz0.pd;
import pz0.sk;
import pz0.td;
import pz0.x9;
import pz0.xd;
import pz0.zs;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s0 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        zs.Companion.getClass();
        List n = sy.d0.n(new aa.m("mergeMethod", v8.l0.b(zs.s), (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        aa.m mVar2 = new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.x xVar2 = pd.a;
        aa.m mVar3 = new aa.m("viewerCanEnableAutoMerge", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar4 = new aa.m("viewerCanDisableAutoMerge", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pz0.s1.Companion.getClass();
        aa.q0 q0Var = pz0.s1.a;
        k71.k.g(q0Var, "type");
        List r3 = x61.l.r(new aa.m[]{mVar2, mVar3, mVar4, new aa.m("autoMergeRequest", q0Var, (String) null, rVar, rVar, n), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        pz0.l.Companion.getClass();
        aa.j0 j0Var = pz0.l.a;
        k71.k.g(j0Var, "type");
        aa.m mVar5 = new aa.m("actor", j0Var, (String) null, rVar, rVar, r2);
        hs.Companion.getClass();
        aa.q0 q0Var2 = hs.N;
        k71.k.g(q0Var2, "type");
        List r4 = x61.l.r(new aa.m[]{mVar5, new aa.m("pullRequest", q0Var2, (String) null, rVar, rVar, r3)});
        x9.Companion.getClass();
        aa.q0 q0Var3 = x9.a;
        k71.k.g(q0Var3, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("disablePullRequestAutoMerge", q0Var3, (String) null, rVar, no.a.s(sk.X, new aa.u0(a0.s0.p("pullRequestId", new aa.t("pullRequestId")))), r4));
    }
}
