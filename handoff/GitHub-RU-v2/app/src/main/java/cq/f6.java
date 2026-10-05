package cq;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f6 implements aa.h0 {
    public final ZonedDateTime a;
    public final boolean b;
    public final String c;
    public final String d;
    public final e6 e;

    public f6(ZonedDateTime zonedDateTime, boolean z, String str, String str2, e6 e6Var) {
        this.a = zonedDateTime;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = e6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        return k71.k.b(this.a, f6Var.a) && this.b == f6Var.b && k71.k.b(this.c, f6Var.c) && k71.k.b(this.d, f6Var.d) && k71.k.b(this.e, f6Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryRecommendationFeedItemFragmentNoRelatedItems(createdAt=");
        sb.append(this.a);
        sb.append(", dismissable=");
        sb.append(this.b);
        sb.append(", identifier=");
        f1.e.x(sb, this.c, ", reason=", this.d, ", repository=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
