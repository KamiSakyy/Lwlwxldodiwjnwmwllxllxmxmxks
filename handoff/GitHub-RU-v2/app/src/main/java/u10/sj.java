package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sj {
    public String a;
    public ZonedDateTime b;
    public String c;
    public String d;

    public sj(String str, String str2, String str3, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj)) {
            return false;
        }
        sj sjVar = (sj) obj;
        return k71.k.b(this.a, sjVar.a) && k71.k.b(this.b, sjVar.b) && k71.k.b(this.c, sjVar.c) && k71.k.b(this.d, sjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(com.github.rudroid.copilot.h1.s("MergeCommit(abbreviatedOid=", this.a, ", committedDate=", ", id=", this.b), this.c, ", __typename=", this.d, ")");
    }
}
