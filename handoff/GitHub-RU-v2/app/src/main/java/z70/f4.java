package z70;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f4 {
    public String a;
    public ZonedDateTime b;
    public g5 c;
    public String d;

    public f4(String str, ZonedDateTime zonedDateTime, g5 g5Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = g5Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        return k71.k.b(this.a, f4Var.a) && k71.k.b(this.b, f4Var.b) && k71.k.b(this.c, f4Var.c) && k71.k.b(this.d, f4Var.d);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31);
        g5 g5Var = this.c;
        return this.d.hashCode() + ((a + (g5Var == null ? 0 : g5Var.hashCode())) * 31);
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
