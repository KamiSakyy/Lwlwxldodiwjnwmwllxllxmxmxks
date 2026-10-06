package ri0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x4 {
    public final String a;
    public final ZonedDateTime b;
    public final String c;
    public final String d;

    public x4(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj;
        return k71.k.b(this.a, x4Var.a) && k71.k.b(this.b, x4Var.b) && k71.k.b(this.c, x4Var.c) && k71.k.b(this.d, x4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(com.github.rudroid.copilot.h1.s("MergeCommit(abbreviatedOid=", this.a, ", committedDate=", ", id=", this.b), this.c, ", __typename=", this.d, ")");
    }
    public Object i = null;
}
