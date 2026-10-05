package gv;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z4 {
    public final String a;
    public final ZonedDateTime b;
    public final b6 c;
    public final String d;

    public z4(String str, ZonedDateTime zonedDateTime, b6 b6Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = b6Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4)) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return k71.k.b(this.a, z4Var.a) && k71.k.b(this.b, z4Var.b) && k71.k.b(this.c, z4Var.c) && k71.k.b(this.d, z4Var.d);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31);
        b6 b6Var = this.c;
        return this.d.hashCode() + ((a + (b6Var == null ? 0 : b6Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder s = com.github.rudroid.copilot.h1.s("Commit(id=", this.a, ", committedDate=", ", statusCheckRollup=", this.b);
        s.append(this.c);
        s.append(", __typename=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
