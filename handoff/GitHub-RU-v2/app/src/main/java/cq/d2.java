package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d2 implements aa.h0 {
    public String a;
    public ArrayList b;
    public i2 c;

    public d2(String str, ArrayList arrayList, i2 i2Var) {
        this.a = str;
        this.b = arrayList;
        this.c = i2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.a.equals(d2Var.a) && this.b.equals(d2Var.b) && this.c.equals(d2Var.c);
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
