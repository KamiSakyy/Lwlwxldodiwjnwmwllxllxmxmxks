package yf0;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements aa.h0 {
    public final String a;
    public final boolean b;
    public final a c;
    public final String d;

    public b(String str, boolean z, a aVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = aVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && this.b == bVar.b && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        a aVar = this.c;
        return this.d.hashCode() + ((e + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = m0.o("DiscussionCommentAnswerAndDiscussionFragment(id=", this.a, ", isAnswer=", ", discussion=", this.b);
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
