package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ub0 {
    public String a;
    public String b;
    public ZonedDateTime c;
    public String d;

    public ub0(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0Var = (ub0) obj;
        return k71.k.b(this.a, ub0Var.a) && k71.k.b(this.b, ub0Var.b) && k71.k.b(this.c, ub0Var.c) && k71.k.b(this.d, ub0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.m0.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return x.i.h(", __typename=", this.d, ")", a0.s0.o("MergeCommit(id=", this.a, ", abbreviatedOid=", this.b, ", committedDate="), this.c);
    }
}
