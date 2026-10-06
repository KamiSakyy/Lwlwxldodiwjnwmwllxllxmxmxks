package z70;

import hc0.vl;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i5 {
    public vl a;
    public ZonedDateTime b;
    public String c;
    public String d;

    public i5(vl vlVar, ZonedDateTime zonedDateTime, String str, String str2) {
        this.a = vlVar;
        this.b = zonedDateTime;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return this.a == i5Var.a && k71.k.b(this.b, i5Var.b) && k71.k.b(this.c, i5Var.c) && k71.k.b(this.d, i5Var.d);
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
