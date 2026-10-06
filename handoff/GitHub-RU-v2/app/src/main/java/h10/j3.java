package h10;

import java.util.List;
import m10.ah;
import m10.bz;
import m10.eh;
import m10.qx;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j3 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = v8.l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar)});
        bz.Companion.getClass();
        aa.q0 q0Var = bz.a;
        k71.k.g(q0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("comment", q0Var, (String) null, rVar, rVar, r));
        qx.Companion.getClass();
        aa.q0 q0Var2 = qx.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("provideCopilotCodeReviewFeedback", q0Var2, (String) null, rVar, no.a.s(vp.y0, new aa.u0(x61.x.u(new w61.k[]{new w61.k("commentId", new aa.t("commentId")), new w61.k("feedback", new aa.t("feedback")), new w61.k("feedbackChoice", new aa.t("feedbackChoice")), new w61.k("textResponse", new aa.t("textResponse"))}))), n));
    }
}
