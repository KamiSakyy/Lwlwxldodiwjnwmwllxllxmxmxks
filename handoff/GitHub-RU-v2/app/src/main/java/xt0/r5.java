package xt0;

import java.time.ZonedDateTime;
import pz0.wt;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r5 {
    public wt a;
    public ZonedDateTime b;
    public String c;
    public String d;

    public r5(wt wtVar, ZonedDateTime zonedDateTime, String str, String str2) {
        this.a = wtVar;
        this.b = zonedDateTime;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return this.a == r5Var.a && k71.k.b(this.b, r5Var.b) && k71.k.b(this.c, r5Var.c) && k71.k.b(this.d, r5Var.d);
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
