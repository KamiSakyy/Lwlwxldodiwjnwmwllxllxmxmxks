package fc0;

import hc0.bb;
import hc0.fb;
import hc0.jg;
import hc0.kz;
import hc0.lg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v2 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("MobilePushNotificationSchedule");
        List list = b70.a.a;
        aa.s c = no.a.c(list, "selections", "MobilePushNotificationSchedule", n, list);
        bb.Companion.getClass();
        aa.x xVar2 = bb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jg.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("nodes", v8.l0.a(jg.a), (String) null, rVar, rVar, r));
        lg.Companion.getClass();
        aa.r b2 = v8.l0.b(lg.a);
        kz.Companion.getClass();
        a = sy.d0.n(new aa.m("viewer", v8.l0.b(kz.O), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("mobilePushNotificationSchedules", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(kz.j, new aa.u0(new aa.t("after"))), new aa.k(kz.k, new aa.u0(new aa.t("before"))), new aa.k(kz.l, new aa.u0(new aa.t("first")))}), n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})));
    }
}
