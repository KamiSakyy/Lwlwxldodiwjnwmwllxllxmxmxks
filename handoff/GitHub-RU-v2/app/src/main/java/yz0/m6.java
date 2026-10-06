package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m6 extends s7 {
    public String a;
    public String b;
    public String c;
    public String d;
    public ZonedDateTime e;

    public m6(String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "actorDisplayName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return k71.k.b(this.a, m6Var.a) && k71.k.b(this.b, m6Var.b) && k71.k.b(this.c, m6Var.c) && k71.k.b(this.d, m6Var.d) && k71.k.b(this.e, m6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        String a = qb.b.a(this.b);
        String a2 = qb.b.a(this.c);
        StringBuilder o = a0.s0.o("TimelineHeadRefForcePushedEvent(actorDisplayName=", this.a, ", beforeCommitAbbreviatedOid=", a, ", afterCommitAbbreviatedOid=");
        f1.e.x(o, a2, ", branchName=", this.d, ", createdAt=");
        return com.github.rudroid.copilot.h1.q(o, this.e, ")");
    }
}
