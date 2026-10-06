package ap0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n5 implements aa.h0 {
    public String a;
    public ArrayList b;
    public s5 c;

    public n5(String str, ArrayList arrayList, s5 s5Var) {
        this.a = str;
        this.b = arrayList;
        this.c = s5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return this.a.equals(n5Var.a) && this.b.equals(n5Var.b) && this.c.equals(n5Var.c);
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
