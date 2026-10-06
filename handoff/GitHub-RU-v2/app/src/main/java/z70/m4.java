package z70;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m4 {
    public String a;
    public ZonedDateTime b;
    public String c;
    public String d;

    public m4(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return k71.k.b(this.a, m4Var.a) && k71.k.b(this.b, m4Var.b) && k71.k.b(this.c, m4Var.c) && k71.k.b(this.d, m4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(com.github.rudroid.copilot.h1.s("MergeCommit(abbreviatedOid=", this.a, ", committedDate=", ", id=", this.b), this.c, ", __typename=", this.d, ")");
    }
}
