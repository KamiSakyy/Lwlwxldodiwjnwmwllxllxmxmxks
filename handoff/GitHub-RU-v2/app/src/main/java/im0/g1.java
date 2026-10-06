package im0;

import gn0.wh;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g1 implements aa.n0 {
    public static final b1 Companion = new b1();
    public aa.u0 r;

    public g1(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        wh.Companion.getClass();
        aa.q0 q0Var = wh.e1;
        k71.k.g(q0Var, "type");
        List list = km0.j.a;
        List list2 = km0.j.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && this.r.equals(((g1) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(jm0.j0.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "7cf5b140e15f62be2c0e5cdde4569d15a01881da2dcd87a2bc60c44823126f4f";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateScheduledNotificationsSettings($enabled: Boolean) { updateMobilePushNotificationSettings(input: { scheduledNotifications: $enabled } ) { clientMutationId user { mobilePushNotificationSettings { scheduledNotifications } id __typename } } }";
    }

    public final String name() {
        return "UpdateScheduledNotificationsSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("enabled");
        aa.c.d(aa.c.k).d(fVar, wVar, this.r);
    }

    public final String toString() {
        return f4.j(this.r, "UpdateScheduledNotificationsSettingsMutation(enabled=", ")");
    }
}
