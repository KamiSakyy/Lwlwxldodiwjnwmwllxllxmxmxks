package ri0;

import gn0.xm;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v5 {
    public xm a;
    public ZonedDateTime b;
    public String c;
    public String d;

    public v5(xm xmVar, ZonedDateTime zonedDateTime, String str, String str2) {
        this.a = xmVar;
        this.b = zonedDateTime;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        return this.a == v5Var.a && k71.k.b(this.b, v5Var.b) && k71.k.b(this.c, v5Var.c) && k71.k.b(this.d, v5Var.d);
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
