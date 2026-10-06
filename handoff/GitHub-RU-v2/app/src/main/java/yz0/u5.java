package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u5 extends s7 {
    public com.github.service.models.response.a a;
    public com.github.service.models.response.a b;
    public ZonedDateTime c;

    public u5(com.github.service.models.response.a aVar, com.github.service.models.response.a aVar2, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = aVar2;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return k71.k.b(this.a, u5Var.a) && k71.k.b(this.b, u5Var.b) && k71.k.b(this.c, u5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + jo.f4Shadow.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineAssignedEvent(author=");
        sb.append(this.a);
        sb.append(", assignee=");
        sb.append(this.b);
        sb.append(", createdAt=");
        return com.github.rudroid.copilot.h1.q(sb, this.c, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ u5(com.github.service.models.response.a aVar, com.github.service.models.response.a aVar2) {
        this(aVar, aVar2, r0);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
    }
    public u5(Object p1, Object p2, java.time.ZonedDateTime p3) {
    }
}
