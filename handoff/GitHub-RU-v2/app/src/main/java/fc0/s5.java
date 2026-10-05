package fc0;

import hc0.bb;
import hc0.fb;
import hc0.gy;
import hc0.jg;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s5 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("MobilePushNotificationSchedule");
        List list = b70.a.a;
        aa.s c = no.a.c(list, "selections", "MobilePushNotificationSchedule", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        jg.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("mobilePushNotificationSchedules", v8.l0.a(v8.l0.b(jg.a)), (String) null, rVar, rVar, r));
        gy.Companion.getClass();
        aa.q0 q0Var = gy.a;
        k71.k.g(q0Var, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("updateMobilePushNotificationSchedules", q0Var, (String) null, rVar, no.a.s(wg.O0, new aa.u0(x61.x.u(new w61.k("days", new aa.t("days")), new w61.k("endTime", new aa.t("endTime")), new w61.k("startTime", new aa.t("startTime"))))), n2));
    }
}
