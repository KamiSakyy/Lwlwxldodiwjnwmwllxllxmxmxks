package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g7 extends s7 {
    public final com.github.service.models.response.a a;
    public final ZonedDateTime b;

    public g7(com.github.service.models.response.a aVar, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        return k71.k.b(this.a, g7Var.a) && k71.k.b(this.b, g7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineReopenedEvent(author=" + this.a + ", createdAt=" + this.b + ")";
    }

    public g7(com.github.service.models.response.a aVar) {
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
        this.a = aVar;
        this.b = now;
    }
}
