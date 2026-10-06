package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z0 implements aa.h0 {
    public final String a;
    public final ArrayList b;
    public final d1 c;

    public z0(String str, ArrayList arrayList, d1 d1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.a.equals(z0Var.a) && this.b.equals(z0Var.b) && this.c.equals(z0Var.c);
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
