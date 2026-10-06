package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w6 extends s7 {
    public com.github.service.models.response.a a;
    public String b;
    public ZonedDateTime c;

    public w6(com.github.service.models.response.a aVar, String str, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "milestoneTitle");
        this.a = aVar;
        this.b = str;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return k71.k.b(this.a, w6Var.a) && k71.k.b(this.b, w6Var.b) && k71.k.b(this.c, w6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineMilestonedEvent(author=");
        sb.append(this.a);
        sb.append(", milestoneTitle=");
        sb.append(this.b);
        sb.append(", createdAt=");
        return com.github.rudroid.copilot.h1.q(sb, this.c, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ w6(com.github.service.models.response.a aVar, String str) {
        this(aVar, str, r0);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
    }
}
