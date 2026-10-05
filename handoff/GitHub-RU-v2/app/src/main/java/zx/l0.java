package zx;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    public final String a;
    public final ZonedDateTime b;
    public final y0 c;
    public final String d;

    public l0(String str, ZonedDateTime zonedDateTime, y0 y0Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = y0Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && k71.k.b(this.b, l0Var.b) && k71.k.b(this.c, l0Var.c) && k71.k.b(this.d, l0Var.d);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31);
        y0 y0Var = this.c;
        return this.d.hashCode() + ((a + (y0Var == null ? 0 : y0Var.hashCode())) * 31);
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
