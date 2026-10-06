package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x5 extends s7 {
    public com.github.service.models.response.a a;
    public ZonedDateTime b;

    public x5(com.github.service.models.response.a aVar, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return k71.k.b(this.a, x5Var.a) && k71.k.b(this.b, x5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineAutoRebaseEnabledEvent(author=" + this.a + ", createdAt=" + this.b + ")";
    }

    public x5(com.github.service.models.response.a aVar) {
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
        this.a = aVar;
        this.b = now;
    }
}
