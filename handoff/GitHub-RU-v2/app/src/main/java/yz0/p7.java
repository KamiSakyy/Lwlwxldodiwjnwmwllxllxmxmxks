package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p7 extends s7 {
    public com.github.service.models.response.a a;
    public ZonedDateTime b;

    public p7(com.github.service.models.response.a aVar, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return k71.k.b(this.a, p7Var.a) && k71.k.b(this.b, p7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineUnlockedEvent(author=" + this.a + ", createdAt=" + this.b + ")";
    }

    public p7(com.github.service.models.response.a aVar) {
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
        this.a = aVar;
        this.b = now;
    }
}
