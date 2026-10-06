package jo;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j10 {
    public String a;
    public String b;
    public ZonedDateTime c;
    public String d;

    public j10(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j10)) {
            return false;
        }
        j10 j10Var = (j10) obj;
        return k71.k.b(this.a, j10Var.a) && k71.k.b(this.b, j10Var.b) && k71.k.b(this.c, j10Var.c) && k71.k.b(this.d, j10Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.m0.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return x.i.h(", __typename=", this.d, ")", a0.s0.o("Node1(id=", this.a, ", message=", this.b, ", committedDate="), this.c);
    }
}
