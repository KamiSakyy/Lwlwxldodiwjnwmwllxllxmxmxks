package l00;

import a0.s0;
import aa.m;
import aa.q0;
import aa.r;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.je0;
import m10.kp;
import m10.rf0;
import m10.vp;
import m10.wg;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        wg.Companion.getClass();
        r b = l0.b(wg.a);
        x61.r rVar = x61.r.r;
        List n = d0.n(new m("getsReviewRequests", b, (String) null, rVar, rVar, rVar));
        kp.Companion.getClass();
        q0 q0Var = kp.a;
        k71.k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, n);
        ah.Companion.getClass();
        m mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        List r = x61.l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("clientMutationId", xVar, (String) null, rVar, rVar, rVar);
        rf0.Companion.getClass();
        q0 q0Var2 = rf0.g0;
        k71.k.g(q0Var2, "type");
        List r2 = x61.l.r(new m[]{mVar3, new m("user", q0Var2, (String) null, rVar, rVar, r)});
        je0.Companion.getClass();
        q0 q0Var3 = je0.a;
        k71.k.g(q0Var3, "type");
        vp.Companion.getClass();
        a = d0.n(new m("updateMobilePushNotificationSettings", q0Var3, (String) null, rVar, no.a.s(vp.k1, new u0(s0.p("getReviewRequests", new t("enabled")))), r2));
    }
}
