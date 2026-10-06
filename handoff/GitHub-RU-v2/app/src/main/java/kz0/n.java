package kz0;

import java.util.List;
import pz0.sk;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("__typename", b, (String) null, rVar, rVar, rVar));
        pz0.y0.Companion.getClass();
        aa.q0 q0Var = pz0.y0.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("applyMobileSuggestedChanges", q0Var, (String) null, rVar, no.a.s(sk.n, new aa.u0(x61.x.u(new w61.k("changes", new aa.t("suggestions")), new w61.k("currentOID", new aa.t("current_oid")), new w61.k("message", new aa.t("commitMessage")), new w61.k("pullRequestId", new aa.t("pull_request_id")), new w61.k("sign", Boolean.TRUE)))), n));
    }
}
