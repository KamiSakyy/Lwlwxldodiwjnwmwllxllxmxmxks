package yz0;

import com.github.service.models.response.TimelineItem$TimelineLockedEvent$Reason;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t6 extends s7 {
    public final TimelineItem$TimelineLockedEvent$Reason a;
    public com.github.service.models.response.a b;
    public ZonedDateTime c;

    public t6(TimelineItem$TimelineLockedEvent$Reason timelineItem$TimelineLockedEvent$Reason, com.github.service.models.response.a aVar, ZonedDateTime zonedDateTime) {
        k71.k.g(timelineItem$TimelineLockedEvent$Reason, "lockReason");
        this.a = timelineItem$TimelineLockedEvent$Reason;
        this.b = aVar;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return this.a == t6Var.a && k71.k.b(this.b, t6Var.b) && k71.k.b(this.c, t6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jo.f4Shadow.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineLockedEvent(lockReason=");
        sb.append(this.a);
        sb.append(", author=");
        sb.append(this.b);
        sb.append(", createdAt=");
        return com.github.rudroid.copilot.h1.q(sb, this.c, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ t6(TimelineItem$TimelineLockedEvent$Reason timelineItem$TimelineLockedEvent$Reason, com.github.service.models.response.a aVar) {
        this(timelineItem$TimelineLockedEvent$Reason, aVar, r0);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
    }
}
