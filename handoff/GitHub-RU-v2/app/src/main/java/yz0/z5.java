package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z5 extends s7 {
    public String a;
    public String b;
    public String c;
    public ZonedDateTime d;

    public z5(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        return k71.k.b(this.a, z5Var.a) && k71.k.b(this.b, z5Var.b) && k71.k.b(this.c, z5Var.c) && k71.k.b(this.d, z5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineAutomaticBaseChangedEvent(id=", this.a, ", oldBase=", this.b, ", newBase=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
