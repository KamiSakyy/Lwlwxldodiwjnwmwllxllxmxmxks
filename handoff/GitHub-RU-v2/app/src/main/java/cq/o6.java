package cq;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o6 implements aa.h0 {
    public m6 a;
    public ZonedDateTime b;
    public boolean c;
    public String d;
    public n6 e;

    public o6(m6 m6Var, ZonedDateTime zonedDateTime, boolean z, String str, n6 n6Var) {
        this.a = m6Var;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = n6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return k71.k.b(this.a, o6Var.a) && k71.k.b(this.b, o6Var.b) && this.c == o6Var.c && k71.k.b(this.d, o6Var.d) && k71.k.b(this.e, o6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StarredRepositoryFeedItemFragmentNoRelatedItems(actor=");
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
