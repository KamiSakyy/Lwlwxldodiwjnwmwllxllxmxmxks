package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public p0(int i, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static p0 a(p0 p0Var, int i, boolean z) {
        String str = p0Var.a;
        boolean z2 = p0Var.c;
        p0Var.getClass();
        return new p0(i, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && this.b == p0Var.b && this.c == p0Var.c && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return com.github.rudroid.m0.m(a0.s0.n(this.b, "OnDiscussionComment(id=", this.a, ", upvoteCount=", ", viewerCanUpvote="), this.c, ", viewerHasUpvoted=", this.d, ")");
    }
}
