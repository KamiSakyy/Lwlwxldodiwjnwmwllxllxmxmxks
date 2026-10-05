package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s50 {
    public final String a;
    public final String b;
    public final ZonedDateTime c;
    public final String d;

    public s50(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s50)) {
            return false;
        }
        s50 s50Var = (s50) obj;
        return k71.k.b(this.a, s50Var.a) && k71.k.b(this.b, s50Var.b) && k71.k.b(this.c, s50Var.c) && k71.k.b(this.d, s50Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.m0.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return x.i.h(", __typename=", this.d, ")", a0.s0.o("MergeCommit(id=", this.a, ", abbreviatedOid=", this.b, ", committedDate="), this.c);
    }
}
