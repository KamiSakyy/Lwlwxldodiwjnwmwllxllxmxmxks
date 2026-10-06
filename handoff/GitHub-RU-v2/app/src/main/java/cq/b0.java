package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.h0 {
    public String a;
    public ArrayList b;
    public g0 c;

    public b0(String str, ArrayList arrayList, g0 g0Var) {
        this.a = str;
        this.b = arrayList;
        this.c = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.a.equals(b0Var.a) && this.b.equals(b0Var.b) && this.c.equals(b0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("CreatedRepositoryFeedItemFragment(__typename=", this.a, ", relatedItems=", this.b, ", createdRepositoryFeedItemFragmentNoRelatedItems=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
