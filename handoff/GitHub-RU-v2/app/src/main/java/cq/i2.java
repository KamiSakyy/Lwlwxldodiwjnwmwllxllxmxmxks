package cq;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i2 implements aa.h0 {
    public g2 a;
    public ZonedDateTime b;
    public boolean c;
    public String d;
    public h2 e;

    public i2(g2 g2Var, ZonedDateTime zonedDateTime, boolean z, String str, h2 h2Var) {
        this.a = g2Var;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = h2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return k71.k.b(this.a, i2Var.a) && k71.k.b(this.b, i2Var.b) && this.c == i2Var.c && k71.k.b(this.d, i2Var.d) && k71.k.b(this.e, i2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergedPullRequestFeedItemFragmentNoRelatedItems(actor=");
        sb.append(this.a);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append(", dismissable=");
        com.github.rudroid.m0.z(sb, this.c, ", identifier=", this.d, ", pullRequest=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
