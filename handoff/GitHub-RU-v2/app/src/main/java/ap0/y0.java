package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 implements aa.h0 {
    public final String a;
    public final boolean b;
    public final String c;

    public y0(String str, String str2, boolean z) {
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
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && this.b == y0Var.b && k71.k.b(this.c, y0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.o("FollowUserFragment(id=", this.a, ", viewerIsFollowing=", ", __typename=", this.b), this.c, ")");
    }
}
