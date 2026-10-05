package xt0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p4 {
    public final String a;
    public final ZonedDateTime b;
    public final p5 c;
    public final String d;

    public p4(String str, ZonedDateTime zonedDateTime, p5 p5Var, String str2) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = p5Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return k71.k.b(this.a, p4Var.a) && k71.k.b(this.b, p4Var.b) && k71.k.b(this.c, p4Var.c) && k71.k.b(this.d, p4Var.d);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31);
        p5 p5Var = this.c;
        return this.d.hashCode() + ((a + (p5Var == null ? 0 : p5Var.hashCode())) * 31);
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
