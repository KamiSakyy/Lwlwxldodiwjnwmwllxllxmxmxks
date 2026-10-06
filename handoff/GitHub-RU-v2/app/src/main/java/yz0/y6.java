package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y6 extends s7 {
    public String a;
    public ZonedDateTime b;

    public y6(String str, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "actorDisplayName");
        this.a = str;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return k71.k.b(this.a, y6Var.a) && k71.k.b(this.b, y6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelinePinnedEvent(actorDisplayName=" + this.a + ", createdAt=" + this.b + ")";
    }
}
