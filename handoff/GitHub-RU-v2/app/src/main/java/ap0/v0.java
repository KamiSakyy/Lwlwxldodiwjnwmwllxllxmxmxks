package ap0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 implements aa.h0 {
    public String a;
    public ZonedDateTime b;
    public boolean c;
    public String d;
    public String e;
    public u0 f;

    public v0(String str, ZonedDateTime zonedDateTime, boolean z, String str2, String str3, u0 u0Var) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return k71.k.b(this.a, v0Var.a) && k71.k.b(this.b, v0Var.b) && this.c == v0Var.c && k71.k.b(this.d, v0Var.d) && k71.k.b(this.e, v0Var.e) && k71.k.b(this.f, v0Var.f);
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
