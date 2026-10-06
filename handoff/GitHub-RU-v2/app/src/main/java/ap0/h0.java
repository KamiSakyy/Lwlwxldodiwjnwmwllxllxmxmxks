package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 {
    public String a;
    public int b;
    public boolean c;
    public boolean d;

    public h0(int i, String str, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static h0 a(h0 h0Var, int i, boolean z) {
        String str = h0Var.a;
        boolean z2 = h0Var.c;
        h0Var.getClass();
        return new h0(i, str, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && this.b == h0Var.b && this.c == h0Var.c && this.d == h0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + x.i.e(a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return com.github.rudroid.m0.m(a0.s0.n(this.b, "OnDiscussionComment(id=", this.a, ", upvoteCount=", ", viewerCanUpvote="), this.c, ", viewerHasUpvoted=", this.d, ")");
    }
}
