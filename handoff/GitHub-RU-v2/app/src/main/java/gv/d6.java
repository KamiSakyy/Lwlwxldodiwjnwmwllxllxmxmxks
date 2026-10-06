package gv;

import java.time.ZonedDateTime;
import m10.rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d6 {
    public rz a;
    public ZonedDateTime b;
    public String c;
    public String d;

    public d6(rz rzVar, ZonedDateTime zonedDateTime, String str, String str2) {
        this.a = rzVar;
        this.b = zonedDateTime;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return this.a == d6Var.a && k71.k.b(this.b, d6Var.b) && k71.k.b(this.c, d6Var.c) && k71.k.b(this.d, d6Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewerLatestReview(state=");
        sb.append(this.a);
        sb.append(", submittedAt=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
