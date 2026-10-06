package h10;

import java.util.List;
import m10.eh;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        List n = sy.d0Shadow.n(new aa.m("__typename", b, (String) null, rVar, rVar, rVar));
        m10.j1.Companion.getClass();
        aa.q0 q0Var = m10.j1.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("applyMobileSuggestedChanges", q0Var, (String) null, rVar, no.a.s(vp.o, new aa.u0(x61.x.u(new w61.k[]{new w61.k("changes", new aa.t("suggestions")), new w61.k("currentOID", new aa.t("current_oid")), new w61.k("message", new aa.t("commitMessage")), new w61.k("pullRequestId", new aa.t("pull_request_id")), new w61.k("sign", Boolean.TRUE)}))), n));
    }
}
