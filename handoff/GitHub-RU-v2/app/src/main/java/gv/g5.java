package gv;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g5 {
    public String a;
    public ZonedDateTime b;
    public String c;
    public String d;

    public g5(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj;
        return k71.k.b(this.a, g5Var.a) && k71.k.b(this.b, g5Var.b) && k71.k.b(this.c, g5Var.c) && k71.k.b(this.d, g5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(com.github.rudroid.copilot.h1.s("MergeCommit(abbreviatedOid=", this.a, ", committedDate=", ", id=", this.b), this.c, ", __typename=", this.d, ")");
    }
    public Object i = null;
}
