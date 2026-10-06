package ap0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q1 implements aa.h0 {
    public final o1 a;
    public final ZonedDateTime b;
    public final boolean c;
    public final String d;
    public final p1 e;

    public q1(o1 o1Var, ZonedDateTime zonedDateTime, boolean z, String str, p1 p1Var) {
        this.a = o1Var;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return k71.k.b(this.a, q1Var.a) && k71.k.b(this.b, q1Var.b) && this.c == q1Var.c && k71.k.b(this.d, q1Var.d) && k71.k.b(this.e, q1Var.e);
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
