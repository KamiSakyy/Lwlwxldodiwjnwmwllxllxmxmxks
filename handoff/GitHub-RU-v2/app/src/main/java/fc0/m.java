package fc0;

import hc0.fb;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("__typename", b, (String) null, rVar, rVar, rVar));
        hc0.n0.Companion.getClass();
        aa.q0 q0Var = hc0.n0.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("applyMobileSuggestedChanges", q0Var, (String) null, rVar, no.a.s(wg.k, new aa.u0(x61.x.u(new w61.k("changes", new aa.t("suggestions")), new w61.k("currentOID", new aa.t("current_oid")), new w61.k("message", new aa.t("commitMessage")), new w61.k("pullRequestId", new aa.t("pull_request_id")), new w61.k("sign", Boolean.TRUE)))), n));
    }
}
