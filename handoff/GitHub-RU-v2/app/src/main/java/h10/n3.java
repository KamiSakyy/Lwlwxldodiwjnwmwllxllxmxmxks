package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.gp;
import m10.ip;
import m10.rf0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n3 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("MobilePushNotificationSchedule");
        List list = mu.a.a;
        aa.s c = no.a.c(list, "selections", "MobilePushNotificationSchedule", n, list);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        gp.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(gp.a), (String) null, rVar, rVar, r));
        ip.Companion.getClass();
        aa.r b2 = v8.l0.b(ip.a);
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("mobilePushNotificationSchedules", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(rf0.o, new aa.u0(new aa.t("after"))), new aa.k(rf0.p, new aa.u0(new aa.t("before"))), new aa.k(rf0.q, new aa.u0(new aa.t("first")))}), n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
