package cq;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 implements aa.h0 {
    public final String a;
    public final ZonedDateTime b;
    public final boolean c;
    public final String d;
    public final String e;
    public final c1 f;

    public d1(String str, ZonedDateTime zonedDateTime, boolean z, String str2, String str3, c1 c1Var) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && k71.k.b(this.b, d1Var.b) && this.c == d1Var.c && k71.k.b(this.d, d1Var.d) && k71.k.b(this.e, d1Var.e) && k71.k.b(this.f, d1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder s = com.github.rudroid.copilot.h1.s("FollowRecommendationFeedItemFragmentNoRelatedItems(__typename=", this.a, ", createdAt=", ", dismissable=", this.b);
        com.github.rudroid.m0.z(s, this.c, ", identifier=", this.d, ", reason=");
        s.append(this.e);
        s.append(", followee=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
