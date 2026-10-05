package l00;

import aa.m;
import aa.q0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.kp;
import m10.rf0;
import m10.wg;
import sy.d0;
import v8.l0;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        k71.k.g(xVar, "type");
        r rVar = r.r;
        List n = d0.n(new m("getsLiveActivityCopilotCodingAgentV2", xVar, (String) null, rVar, rVar, rVar));
        kp.Companion.getClass();
        q0 q0Var = kp.a;
        k71.k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, n);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar3 = eh.a;
        List r = x61.l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = x61.l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
