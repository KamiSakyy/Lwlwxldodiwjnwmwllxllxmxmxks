package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m7 extends s7 {
    public String a;
    public String b;
    public ZonedDateTime c;

    public m7(String str, String str2, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "actorDisplayName");
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        return k71.k.b(this.a, m7Var.a) && k71.k.b(this.b, m7Var.b) && k71.k.b(this.c, m7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.q(a0.s0.o("TimelineTransferredEvent(actorDisplayName=", this.a, ", repoName=", this.b, ", createdAt="), this.c, ")");
    }
}
