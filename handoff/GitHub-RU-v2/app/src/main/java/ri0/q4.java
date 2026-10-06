package ri0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q4 {
    public String a;
    public ZonedDateTime b;
    public t5 c;
    public String d;

    public q4(String str, ZonedDateTime zonedDateTime, t5 t5Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = t5Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return k71.k.b(this.a, q4Var.a) && k71.k.b(this.b, q4Var.b) && k71.k.b(this.c, q4Var.c) && k71.k.b(this.d, q4Var.d);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31);
        t5 t5Var = this.c;
        return this.d.hashCode() + ((a + (t5Var == null ? 0 : t5Var.hashCode())) * 31);
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
