package ap0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements aa.h0 {
    public String a;
    public ArrayList b;
    public y c;

    public t(String str, ArrayList arrayList, y yVar) {
        this.a = str;
        this.b = arrayList;
        this.c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.a) && this.b.equals(tVar.b) && this.c.equals(tVar.c);
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
