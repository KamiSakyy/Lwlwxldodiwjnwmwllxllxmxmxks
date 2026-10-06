package la0;

import a0.s0;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public int b;
    public boolean c;
    public boolean d;

    public a(int i, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static a a(a aVar, int i, boolean z) {
        String str = aVar.a;
        boolean z2 = aVar.c;
        aVar.getClass();
        return new a(i, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + i.e(s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return m0.m(s0.n(this.b, "OnDiscussion(id=", this.a, ", upvoteCount=", ", viewerCanUpvote="), this.c, ", viewerHasUpvoted=", this.d, ")");
    }
    public Object O(Object p1) { return null; }
}
