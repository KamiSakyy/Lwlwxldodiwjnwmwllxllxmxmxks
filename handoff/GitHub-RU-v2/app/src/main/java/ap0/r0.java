package ap0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 implements aa.h0 {
    public String a;
    public ArrayList b;
    public v0 c;

    public r0(String str, ArrayList arrayList, v0 v0Var) {
        this.a = str;
        this.b = arrayList;
        this.c = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.a.equals(r0Var.a) && this.b.equals(r0Var.b) && this.c.equals(r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("FollowRecommendationFeedItemFragment(__typename=", this.a, ", relatedItems=", this.b, ", followRecommendationFeedItemFragmentNoRelatedItems=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
