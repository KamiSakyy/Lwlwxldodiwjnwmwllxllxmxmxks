package en0;

import gn0.jh;
import gn0.oz;
import gn0.pb;
import gn0.tb;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z5 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("MobilePushNotificationSchedule");
        List list = th0.a.a;
        aa.s c = no.a.c(list, "selections", "MobilePushNotificationSchedule", n, list);
        pb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(pb.a), (String) null, rVar, rVar, rVar)});
        jh.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("mobilePushNotificationSchedules", v8.l0.a(v8.l0.b(jh.a)), (String) null, rVar, rVar, r));
        oz.Companion.getClass();
        aa.q0 q0Var = oz.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("updateMobilePushNotificationSchedules", q0Var, (String) null, rVar, no.a.s(wh.Q0, new aa.u0(x61.x.u(new w61.k("days", new aa.t("days")), new w61.k("endTime", new aa.t("endTime")), new w61.k("startTime", new aa.t("startTime"))))), n2));
    }
}
