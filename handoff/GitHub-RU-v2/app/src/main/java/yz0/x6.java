package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x6 extends s7 {
    public String a;
    public String b;
    public String c;
    public String d;
    public ZonedDateTime e;

    public x6(String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime) {
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
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return k71.k.b(this.a, x6Var.a) && k71.k.b(this.b, x6Var.b) && k71.k.b(this.c, x6Var.c) && k71.k.b(this.d, x6Var.d) && k71.k.b(this.e, x6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineMovedColumnsInProjectEvent(actorDisplayName=", this.a, ", oldColumnName=", this.b, ", newColumnName=");
        f1.e.x(o, this.c, ", projectName=", this.d, ", createdAt=");
        return com.github.rudroid.copilot.h1.q(o, this.e, ")");
    }
}
