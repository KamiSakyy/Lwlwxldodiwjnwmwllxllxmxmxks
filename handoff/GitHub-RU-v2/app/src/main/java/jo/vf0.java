package jo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vf0 implements aa.n0 {
    public static final rf0 Companion = new rf0();
    public final ArrayList r;
    public final LocalTime s;
    public final LocalTime t;

    public vf0(ArrayList arrayList, LocalTime localTime, LocalTime localTime2) {
        k71.k.g(localTime, "startTime");
        k71.k.g(localTime2, "endTime");
        this.r = arrayList;
        this.s = localTime;
        this.t = localTime2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.w6.a;
        List list2 = h10.w6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0)) {
            return false;
        }
        vf0 vf0Var = (vf0) obj;
        return this.r.equals(vf0Var.r) && k71.k.b(this.s, vf0Var.s) && k71.k.b(this.t, vf0Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.yz.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.s.hashCode() + (this.r.hashCode() * 31)) * 31);
    }

    public final String i() {
        return "c3e71668a3e3df88e65ef3bad768cdb5e9e2f9e35cc45a1142c5b7714e837cf2";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdatePushNotificationSchedules($days: [DayOfWeek!]!, $startTime: MobilePushScheduleTime!, $endTime: MobilePushScheduleTime!) { updateMobilePushNotificationSchedules(input: { days: $days startTime: $startTime endTime: $endTime } ) { mobilePushNotificationSchedules { __typename ...PushNotificationSchedulesFragment id } } }  fragment PushNotificationSchedulesFragment on MobilePushNotificationSchedule { day id startTime endTime __typename }";
    }

    public final String name() {
        return "UpdatePushNotificationSchedules";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("days");
        aa.c.a(n10.a.w).e(fVar, wVar, this.r);
        fVar.z0("startTime");
        m10.mp.Companion.getClass();
        aa.x xVar = m10.mp.a;
        wVar.e(xVar).b(fVar, wVar, this.s);
        fVar.z0("endTime");
        wVar.e(xVar).b(fVar, wVar, this.t);
    }

    public final String toString() {
        return "UpdatePushNotificationSchedulesMutation(days=" + this.r + ", startTime=" + this.s + ", endTime=" + this.t + ")";
    }
}
