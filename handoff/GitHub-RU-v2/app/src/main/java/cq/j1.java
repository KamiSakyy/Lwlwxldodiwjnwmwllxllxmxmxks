package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j1 implements aa.h0 {
    public final String a;
    public final ArrayList b;
    public final o1 c;

    public j1(String str, ArrayList arrayList, o1 o1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = o1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.a.equals(j1Var.a) && this.b.equals(j1Var.b) && this.c.equals(j1Var.c);
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
