package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b7 extends s7 {
    public final String a;
    public final ZonedDateTime b;

    public b7(String str, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "authorDisplayName");
        this.a = str;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        return k71.k.b(this.a, b7Var.a) && k71.k.b(this.b, b7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineReadyForReviewEvent(authorDisplayName=" + this.a + ", createdAt=" + this.b + ")";
    }
}
