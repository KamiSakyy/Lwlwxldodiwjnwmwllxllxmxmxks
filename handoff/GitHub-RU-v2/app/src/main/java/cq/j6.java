package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j6 implements aa.h0 {
    public String a;
    public ArrayList b;
    public o6 c;

    public j6(String str, ArrayList arrayList, o6 o6Var) {
        this.a = str;
        this.b = arrayList;
        this.c = o6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return this.a.equals(j6Var.a) && this.b.equals(j6Var.b) && this.c.equals(j6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("StarredRepositoryFeedItemFragment(__typename=", this.a, ", relatedItems=", this.b, ", starredRepositoryFeedItemFragmentNoRelatedItems=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
