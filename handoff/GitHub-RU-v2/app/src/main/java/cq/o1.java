package cq;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o1 implements aa.h0 {
    public String a;
    public ZonedDateTime b;
    public boolean c;
    public String d;
    public m1 e;
    public n1 f;

    public o1(String str, ZonedDateTime zonedDateTime, boolean z, String str2, m1 m1Var, n1 n1Var) {
        this.a = str;
        this.b = zonedDateTime;
        this.c = z;
        this.d = str2;
        this.e = m1Var;
        this.f = n1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.a, o1Var.a) && k71.k.b(this.b, o1Var.b) && this.c == o1Var.c && k71.k.b(this.d, o1Var.d) && k71.k.b(this.e, o1Var.e) && k71.k.b(this.f, o1Var.f);
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
    public o1(Object p1, int p2, String p3) {
    }
}
