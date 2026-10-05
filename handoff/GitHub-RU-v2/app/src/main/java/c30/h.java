package c30;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.h0 {
    public final String a;
    public final boolean b;
    public final String c;

    public h(String str, String str2, boolean z) {
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && this.b == hVar.b && k71.k.b(this.c, hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return h1.p(com.github.rudroid.m0.o("FollowUserFragment(id=", this.a, ", viewerIsFollowing=", ", __typename=", this.b), this.c, ")");
    }
}
