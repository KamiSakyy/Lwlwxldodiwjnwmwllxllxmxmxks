package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b6 implements aa.h0 {
    public final String a;
    public final ArrayList b;
    public final f6 c;

    public b6(String str, ArrayList arrayList, f6 f6Var) {
        this.a = str;
        this.b = arrayList;
        this.c = f6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return this.a.equals(b6Var.a) && this.b.equals(b6Var.b) && this.c.equals(b6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("RepositoryRecommendationFeedItemFragment(__typename=", this.a, ", relatedItems=", this.b, ", repositoryRecommendationFeedItemFragmentNoRelatedItems=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
