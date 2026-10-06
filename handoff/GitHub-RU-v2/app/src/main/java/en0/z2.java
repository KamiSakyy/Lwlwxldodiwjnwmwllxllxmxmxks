package en0;

import gn0.jh;
import gn0.lh;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class z2 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.x xVar = tb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("MobilePushNotificationSchedule");
        List list = th0.a.a;
        aa.s c = no.a.c(list, "selections", "MobilePushNotificationSchedule", n, list);
        pb.Companion.getClass();
        aa.x xVar2 = pb.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        jh.Companion.getClass();
        List n2 = sy.d0Shadow.n(new aa.m("nodes", v8.l0.a(jh.a), (String) null, rVar, rVar, r));
        lh.Companion.getClass();
        aa.r b2 = v8.l0.b(lh.a);
        s00.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("viewer", v8.l0.b(s00.P), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("mobilePushNotificationSchedules", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(s00.j, new aa.u0(new aa.t("after"))), new aa.k(s00.k, new aa.u0(new aa.t("before"))), new aa.k(s00.l, new aa.u0(new aa.t("first")))}), n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})));
    }
}
