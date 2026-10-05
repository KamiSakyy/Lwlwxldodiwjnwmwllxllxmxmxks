package ap0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 implements aa.h0 {
    public final k2 a;
    public final ZonedDateTime b;
    public final boolean c;
    public final String d;
    public final l2 e;

    public m2(k2 k2Var, ZonedDateTime zonedDateTime, boolean z, String str, l2 l2Var) {
        this.a = k2Var;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = l2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return k71.k.b(this.a, m2Var.a) && k71.k.b(this.b, m2Var.b) && this.c == m2Var.c && k71.k.b(this.d, m2Var.d) && k71.k.b(this.e, m2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublishedReleaseFeedItemFragmentNoRelatedItems(actor=");
        sb.append(this.a);
        sb.append(", createdAt=");
        sb.append(this.b);
        sb.append(", dismissable=");
        com.github.rudroid.m0.z(sb, this.c, ", identifier=", this.d, ", release=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
