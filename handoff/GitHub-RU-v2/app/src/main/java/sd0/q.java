package sd0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements aa.h0 {
    public String a;
    public boolean b;
    public String c;

    public q(String str, String str2, boolean z) {
        k71.k.g(str, "id");
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && this.b == qVar.b && k71.k.b(this.c, qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return h1.p(com.github.rudroid.m0.o("FollowUserFragment(id=", this.a, ", viewerIsFollowing=", ", __typename=", this.b), this.c, ")");
    }
}
