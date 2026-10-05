package cq;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i3 implements aa.h0 {
    public final g3 a;
    public final ZonedDateTime b;
    public final boolean c;
    public final String d;
    public final h3 e;

    public i3(g3 g3Var, ZonedDateTime zonedDateTime, boolean z, String str, h3 h3Var) {
        this.a = g3Var;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str;
        this.e = h3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return k71.k.b(this.a, i3Var.a) && k71.k.b(this.b, i3Var.b) && this.c == i3Var.c && k71.k.b(this.d, i3Var.d) && k71.k.b(this.e, i3Var.e);
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
