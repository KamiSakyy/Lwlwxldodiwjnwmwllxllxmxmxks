package ap0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s5 implements aa.h0 {
    public q5 a;
    public ZonedDateTime b;
    public boolean c;
    public String d;
    public r5 e;

    public s5(q5 q5Var, ZonedDateTime zonedDateTime, boolean z, String str, r5 r5Var) {
        this.a = q5Var;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = r5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return k71.k.b(this.a, s5Var.a) && k71.k.b(this.b, s5Var.b) && this.c == s5Var.c && k71.k.b(this.d, s5Var.d) && k71.k.b(this.e, s5Var.e);
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
