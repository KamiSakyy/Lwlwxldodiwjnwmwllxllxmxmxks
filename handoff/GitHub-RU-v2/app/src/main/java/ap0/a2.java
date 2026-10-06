package ap0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a2 implements aa.h0 {
    public final y1 a;
    public final ZonedDateTime b;
    public final boolean c;
    public final String d;
    public final z1 e;

    public a2(y1 y1Var, ZonedDateTime zonedDateTime, boolean z, String str, z1 z1Var) {
        this.a = y1Var;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return k71.k.b(this.a, a2Var.a) && k71.k.b(this.b, a2Var.b) && this.c == a2Var.c && k71.k.b(this.d, a2Var.d) && k71.k.b(this.e, a2Var.e);
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
