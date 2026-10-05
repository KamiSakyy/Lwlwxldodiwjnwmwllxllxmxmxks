package kz0;

import java.util.List;
import pz0.fk;
import pz0.hk;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g3 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("MobilePushNotificationSchedule");
        List list = dt0.a.a;
        aa.s c = no.a.c(list, "selections", "MobilePushNotificationSchedule", n, list);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        fk.Companion.getClass();
        List n2 = sy.d0.n(new aa.m("nodes", v8.l0.a(fk.a), (String) null, rVar, rVar, r));
        hk.Companion.getClass();
        aa.r b2 = v8.l0.b(hk.a);
        w80.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, x61.l.r(new aa.m[]{new aa.m("mobilePushNotificationSchedules", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(w80.o, new aa.u0(new aa.t("after"))), new aa.k(w80.p, new aa.u0(new aa.t("before"))), new aa.k(w80.q, new aa.u0(new aa.t("first")))}), n2), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)})), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
