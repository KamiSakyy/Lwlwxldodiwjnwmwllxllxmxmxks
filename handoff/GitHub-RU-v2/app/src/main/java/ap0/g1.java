package ap0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g1 implements aa.h0 {
    public String a;
    public ZonedDateTime b;
    public boolean c;
    public String d;
    public e1 e;
    public f1 f;

    public g1(String str, ZonedDateTime zonedDateTime, boolean z, String str2, e1 e1Var, f1 f1Var) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str2;
        this.e = e1Var;
        this.f = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return k71.k.b(this.a, g1Var.a) && k71.k.b(this.b, g1Var.b) && this.c == g1Var.c && k71.k.b(this.d, g1Var.d) && k71.k.b(this.e, g1Var.e) && k71.k.b(this.f, g1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.m0.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31)) * 31);
    }

    public final String toString() {
        StringBuilder s = com.github.rudroid.copilot.h1.s("FollowedUserFeedItemFragmentNoRelatedItems(__typename=", this.a, ", createdAt=", ", dismissable=", this.b);
        com.github.rudroid.m0.z(s, this.c, ", identifier=", this.d, ", followee=");
        s.append(this.e);
        s.append(", follower=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
