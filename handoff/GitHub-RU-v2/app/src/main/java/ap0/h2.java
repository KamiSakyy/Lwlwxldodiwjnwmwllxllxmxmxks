package ap0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h2 implements aa.h0 {
    public final String a;
    public final ArrayList b;
    public final m2 c;

    public h2(String str, ArrayList arrayList, m2 m2Var) {
        this.a = str;
        this.b = arrayList;
        this.c = m2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.a.equals(h2Var.a) && this.b.equals(h2Var.b) && this.c.equals(h2Var.c);
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
