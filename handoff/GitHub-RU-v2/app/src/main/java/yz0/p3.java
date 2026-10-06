package yz0;

import java.time.LocalTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p3 {
    public com.github.rudroid.common.f a;
    public LocalTime b;
    public LocalTime c;
    public String d;

    public p3(com.github.rudroid.common.f fVar, String str, LocalTime localTime, LocalTime localTime2) {
        k71.k.g(fVar, "day");
        this.a = fVar;
        this.b = localTime;
        this.c = localTime2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return this.a == p3Var.a && k71.k.b(this.b, p3Var.b) && k71.k.b(this.c, p3Var.c) && k71.k.b(this.d, p3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PushNotificationSchedules(day=" + this.a + ", startTime=" + this.b + ", endTime=" + this.c + ", id=" + this.d + ")";
    }

    public p3(Object... a) {
    }
}
