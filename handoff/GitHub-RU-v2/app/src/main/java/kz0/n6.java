package kz0;

import java.util.List;
import pz0.fk;
import pz0.m70;
import pz0.sk;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n6 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("MobilePushNotificationSchedule");
        List list = dt0.a.a;
        aa.s c = no.a.c(list, "selections", "MobilePushNotificationSchedule", n, list);
        td.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar)});
        fk.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("mobilePushNotificationSchedules", v8.l0.a(v8.l0.b(fk.a)), (String) null, rVar, rVar, r));
        m70.Companion.getClass();
        aa.q0 q0Var = m70.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0.n(new aa.m("updateMobilePushNotificationSchedules", q0Var, (String) null, rVar, no.a.s(sk.e1, new aa.u0(x61.x.u(new w61.k("days", new aa.t("days")), new w61.k("endTime", new aa.t("endTime")), new w61.k("startTime", new aa.t("startTime"))))), n2));
    }
}
