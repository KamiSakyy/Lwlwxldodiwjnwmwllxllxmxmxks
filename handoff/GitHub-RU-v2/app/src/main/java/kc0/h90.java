package kc0;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h90 implements aa.n0 {
    public static final d90 Companion = new d90();
    public final ArrayList r;
    public final LocalTime s;
    public final LocalTime t;

    public h90(ArrayList arrayList, LocalTime localTime, LocalTime localTime2) {
        k71.k.g(localTime, "startTime");
        k71.k.g(localTime2, "endTime");
        this.r = arrayList;
        this.s = localTime;
        this.t = localTime2;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.z5.a;
        List list2 = en0.z5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h90)) {
            return false;
        }
        h90 h90Var = (h90) obj;
        return this.r.equals(h90Var.r) && k71.k.b(this.s, h90Var.s) && k71.k.b(this.t, h90Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ev.a, false);
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
        aa.c.a(hn0.a.j).e(fVar, wVar, this.r);
        fVar.z0("startTime");
        gn0.ph.Companion.getClass();
        aa.x xVar = gn0.ph.a;
        wVar.e(xVar).b(fVar, wVar, this.s);
        fVar.z0("endTime");
        wVar.e(xVar).b(fVar, wVar, this.t);
    }

    public final String toString() {
        return "UpdatePushNotificationSchedulesMutation(days=" + this.r + ", startTime=" + this.s + ", endTime=" + this.t + ")";
    }
}
