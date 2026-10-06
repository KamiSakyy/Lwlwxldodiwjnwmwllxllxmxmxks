package cq;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements aa.h0 {
    public String a;
    public ArrayList b;
    public w c;

    public r(String str, ArrayList arrayList, w wVar) {
        this.a = str;
        this.b = arrayList;
        this.c = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a.equals(rVar.a) && this.b.equals(rVar.b) && this.c.equals(rVar.c);
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
