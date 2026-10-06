package j00;

import java.util.List;
import jo.f4;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 implements aa.n0 {
    public static final m1 Companion = new m1();
    public final aa.u0 r;

    public r1(aa.u0 u0Var) {
        this.r = u0Var;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        aa.q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = l00.l.a;
        List list2 = l00.l.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && this.r.equals(((r1) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(k00.q0.a, false);
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
