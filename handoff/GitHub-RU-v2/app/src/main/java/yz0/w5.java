package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w5 extends s7 {
    public final com.github.service.models.response.a a;
    public final ZonedDateTime b;

    public w5(com.github.service.models.response.a aVar, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj;
        return k71.k.b(this.a, w5Var.a) && k71.k.b(this.b, w5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineAutoMergeEnabledEvent(author=" + this.a + ", createdAt=" + this.b + ")";
    }

    public w5(com.github.service.models.response.a aVar) {
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
        this.a = aVar;
        this.b = now;
    }
}
