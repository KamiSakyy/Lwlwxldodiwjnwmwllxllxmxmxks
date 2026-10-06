package ap0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f5 implements aa.h0 {
    public String a;
    public ArrayList b;
    public j5 c;

    public f5(String str, ArrayList arrayList, j5 j5Var) {
        this.a = str;
        this.b = arrayList;
        this.c = j5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return this.a.equals(f5Var.a) && this.b.equals(f5Var.b) && this.c.equals(f5Var.c);
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
