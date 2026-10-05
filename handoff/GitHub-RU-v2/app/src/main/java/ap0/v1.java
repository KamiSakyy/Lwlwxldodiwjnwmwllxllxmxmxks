package ap0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v1 implements aa.h0 {
    public final String a;
    public final ArrayList b;
    public final a2 c;

    public v1(String str, ArrayList arrayList, a2 a2Var) {
        this.a = str;
        this.b = arrayList;
        this.c = a2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return this.a.equals(v1Var.a) && this.b.equals(v1Var.b) && this.c.equals(v1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("MergedPullRequestFeedItemFragment(__typename=", this.a, ", relatedItems=", this.b, ", mergedPullRequestFeedItemFragmentNoRelatedItems=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
