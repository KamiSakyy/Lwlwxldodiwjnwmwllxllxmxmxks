package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 implements aa.h0 {
    public String a;
    public boolean b;
    public String c;

    public g1(String str, String str2, boolean z) {
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
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return k71.k.b(this.a, g1Var.a) && this.b == g1Var.b && k71.k.b(this.c, g1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.o("FollowUserFragment(id=", this.a, ", viewerIsFollowing=", ", __typename=", this.b), this.c, ")");
    }
}
