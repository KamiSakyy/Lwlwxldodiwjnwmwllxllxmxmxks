package cq;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 implements aa.h0 {
    public w1 a;
    public ZonedDateTime b;
    public boolean c;
    public String d;
    public x1 e;

    public y1(w1 w1Var, ZonedDateTime zonedDateTime, boolean z, String str, x1 x1Var) {
        this.a = w1Var;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = x1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return k71.k.b(this.a, y1Var.a) && k71.k.b(this.b, y1Var.b) && this.c == y1Var.c && k71.k.b(this.d, y1Var.d) && k71.k.b(this.e, y1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForkedRepositoryFeedItemFragmentNoRelatedItems(actor=");
        sb.append(this.a);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append(", dismissable=");
        com.github.rudroid.m0.z(sb, this.c, ", identifier=", this.d, ", repository=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
