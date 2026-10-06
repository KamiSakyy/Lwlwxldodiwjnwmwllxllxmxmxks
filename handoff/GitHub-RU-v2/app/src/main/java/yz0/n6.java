package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n6 extends s7 {
    public final String a;
    public final String b;
    public final ZonedDateTime c;

    public n6(String str, String str2, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "actorDisplayName");
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return k71.k.b(this.a, n6Var.a) && k71.k.b(this.b, n6Var.b) && k71.k.b(this.c, n6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.q(a0.s0.o("TimelineHeadRefRestoredEvent(actorDisplayName=", this.a, ", branchName=", this.b, ", createdAt="), this.c, ")");
    }
}
