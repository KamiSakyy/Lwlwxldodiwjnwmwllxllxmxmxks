package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v5 extends s7 {
    public com.github.service.models.response.a a;
    public String b;
    public ZonedDateTime c;

    public v5(com.github.service.models.response.a aVar, String str, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = str;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        return k71.k.b(this.a, v5Var.a) && k71.k.b(this.b, v5Var.b) && k71.k.b(this.c, v5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineAutoMergeDisabledEvent(author=");
        sb.append(this.a);
        sb.append(", reasonCode=");
        sb.append(this.b);
        sb.append(", createdAt=");
        return com.github.rudroid.copilot.h1.q(sb, this.c, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ v5(com.github.service.models.response.a aVar) {
        this(aVar, "", r0);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
    }

    public v5(Object... a) {
    }
}
