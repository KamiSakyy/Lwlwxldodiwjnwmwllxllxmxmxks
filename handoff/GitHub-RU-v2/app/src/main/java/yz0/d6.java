package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d6 extends s7 {
    public String a;
    public ZonedDateTime b;

    public d6(String str, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "authorDisplayName");
        this.a = str;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return k71.k.b(this.a, d6Var.a) && k71.k.b(this.b, d6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineConvertToDraftEvent(authorDisplayName=" + this.a + ", createdAt=" + this.b + ")";
    }
}
