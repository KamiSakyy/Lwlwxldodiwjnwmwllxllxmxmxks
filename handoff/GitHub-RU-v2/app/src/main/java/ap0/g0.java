package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public String a;
    public int b;
    public boolean c;
    public boolean d;

    public g0(int i, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static g0 a(g0 g0Var, int i, boolean z) {
        String str = g0Var.a;
        boolean z2 = g0Var.c;
        g0Var.getClass();
        return new g0(i, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && this.b == g0Var.b && this.c == g0Var.c && this.d == g0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return com.github.rudroid.m0.m(a0.s0.n(this.b, "OnDiscussion(id=", this.a, ", upvoteCount=", ", viewerCanUpvote="), this.c, ", viewerHasUpvoted=", this.d, ")");
    }
}
