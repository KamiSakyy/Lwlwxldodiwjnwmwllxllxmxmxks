package ap0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 implements aa.h0 {
    public final String a;
    public final ArrayList b;
    public final q1 c;

    public l1(String str, ArrayList arrayList, q1 q1Var) {
        this.a = str;
        this.b = arrayList;
        this.c = q1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.a.equals(l1Var.a) && this.b.equals(l1Var.b) && this.c.equals(l1Var.c);
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
