package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.gp;
import m10.he0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w6 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("MobilePushNotificationSchedule");
        List list = mu.a.a;
        aa.s c = no.a.c(list, "selections", "MobilePushNotificationSchedule", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        gp.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("mobilePushNotificationSchedules", v8.l0.a(v8.l0.b(gp.a)), (String) null, rVar, rVar, r));
        he0.Companion.getClass();
        aa.q0 q0Var = he0.a;
        k71.k.g(q0Var, "type");
        vp.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("updateMobilePushNotificationSchedules", q0Var, (String) null, rVar, no.a.s(vp.j1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("days", new aa.t("days")), new w61.k("endTime", new aa.t("endTime")), new w61.k("startTime", new aa.t("startTime"))}))), n2));
    }
}
