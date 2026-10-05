package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d3 implements aa.h0 {
    public final String a;
    public final ArrayList b;
    public final i3 c;

    public d3(String str, ArrayList arrayList, i3 i3Var) {
        this.a = str;
        this.b = arrayList;
        this.c = i3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.a.equals(d3Var.a) && this.b.equals(d3Var.b) && this.c.equals(d3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("PublishedReleaseFeedItemFragment(__typename=", this.a, ", relatedItems=", this.b, ", publishedReleaseFeedItemFragmentNoRelatedItems=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
