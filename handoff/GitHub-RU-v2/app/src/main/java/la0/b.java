package la0;

import a0.s0;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public String a;
    public int b;
    public boolean c;
    public boolean d;

    public b(int i, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static b a(b bVar, int i, boolean z) {
        String str = bVar.a;
        boolean z2 = bVar.c;
        bVar.getClass();
        return new b(i, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + i.e(s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return m0.m(s0.n(this.b, "OnDiscussionComment(id=", this.a, ", upvoteCount=", ", viewerCanUpvote="), this.c, ", viewerHasUpvoted=", this.d, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
