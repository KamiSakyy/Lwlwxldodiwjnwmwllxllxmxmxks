package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q7 extends s7 {
    public String a;
    public ZonedDateTime b;

    public q7(String str, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "actorDisplayName");
        this.a = str;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return k71.k.b(this.a, q7Var.a) && k71.k.b(this.b, q7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineUnpinnedEvent(actorDisplayName=" + this.a + ", createdAt=" + this.b + ")";
    }
}
