package en0;

import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class m {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("__typename", b, (String) null, rVar, rVar, rVar));
        gn0.p0.Companion.getClass();
        aa.q0 q0Var = gn0.p0.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("applyMobileSuggestedChanges", q0Var, (String) null, rVar, no.a.s(wh.k, new aa.u0(x61.x.u(new w61.k("changes", new aa.t("suggestions")), new w61.k("currentOID", new aa.t("current_oid")), new w61.k("message", new aa.t("commitMessage")), new w61.k("pullRequestId", new aa.t("pull_request_id")), new w61.k("sign", Boolean.TRUE)))), n));
    }
}
