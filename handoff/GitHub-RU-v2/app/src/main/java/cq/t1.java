package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aa.h0 {
    public final String a;
    public final ArrayList b;
    public final y1 c;

    public t1(String str, ArrayList arrayList, y1 y1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = y1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.a.equals(t1Var.a) && this.b.equals(t1Var.b) && this.c.equals(t1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("ForkedRepositoryFeedItemFragment(__typename=", this.a, ", relatedItems=", this.b, ", forkedRepositoryFeedItemFragmentNoRelatedItems=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
