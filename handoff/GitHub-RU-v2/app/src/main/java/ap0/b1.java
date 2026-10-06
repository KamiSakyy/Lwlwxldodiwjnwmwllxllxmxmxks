package ap0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 implements aa.h0 {
    public final String a;
    public final ArrayList b;
    public final g1 c;

    public b1(String str, ArrayList arrayList, g1 g1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.a.equals(b1Var.a) && this.b.equals(b1Var.b) && this.c.equals(b1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("FollowedUserFeedItemFragment(__typename=", this.a, ", relatedItems=", this.b, ", followedUserFeedItemFragmentNoRelatedItems=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
