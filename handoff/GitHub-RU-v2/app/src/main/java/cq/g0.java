package cq;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 implements aa.h0 {
    public e0 a;
    public ZonedDateTime b;
    public boolean c;
    public String d;
    public f0 e;

    public g0(e0 e0Var, ZonedDateTime zonedDateTime, boolean z, String str, f0 f0Var) {
        this.a = e0Var;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b) && this.c == g0Var.c && k71.k.b(this.d, g0Var.d) && k71.k.b(this.e, g0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatedRepositoryFeedItemFragmentNoRelatedItems(actor=");
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
