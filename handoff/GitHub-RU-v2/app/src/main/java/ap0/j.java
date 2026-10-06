package ap0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements aa.h0 {
    public String a;
    public ArrayList b;
    public o c;

    public j(String str, ArrayList arrayList, o oVar) {
        this.a = str;
        this.b = arrayList;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.a) && this.b.equals(jVar.b) && this.c.equals(jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("CreatedDiscussionFeedItemFragment(__typename=", this.a, ", relatedItems=", this.b, ", createdDiscussionFeedItemFragmentNoRelatedItems=");
        p.append(this.c);
        p.append(")");
        return p.toString();
    }
}
