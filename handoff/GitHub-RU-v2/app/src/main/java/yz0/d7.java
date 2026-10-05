package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d7 extends s7 {
    public final String a;
    public final String b;
    public final ZonedDateTime c;

    public d7(String str, String str2, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "enqueuerDisplayName");
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        return k71.k.b(this.a, d7Var.a) && k71.k.b(this.b, d7Var.b) && k71.k.b(this.c, d7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.q(a0.s0.o("TimelineRemovedFromMergeQueueEvent(enqueuerDisplayName=", this.a, ", reason=", this.b, ", createdAt="), this.c, ")");
    }
}
