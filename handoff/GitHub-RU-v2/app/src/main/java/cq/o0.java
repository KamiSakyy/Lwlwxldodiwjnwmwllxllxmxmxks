package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public o0(int i, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static o0 a(o0 o0Var, int i, boolean z) {
        String str = o0Var.a;
        boolean z2 = o0Var.c;
        o0Var.getClass();
        return new o0(i, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && this.b == o0Var.b && this.c == o0Var.c && this.d == o0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return com.github.rudroid.m0.m(a0.s0.n(this.b, "OnDiscussion(id=", this.a, ", upvoteCount=", ", viewerCanUpvote="), this.c, ", viewerHasUpvoted=", this.d, ")");
    }
}
