package c30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aa.h0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public n0(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.a, n0Var.a) && this.b == n0Var.b && this.c == n0Var.c && this.d == n0Var.d && this.e == n0Var.e && k71.k.b(this.f, n0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("UnblockUserFragment(id=", this.a, ", viewerCanBlock=", ", viewerCanUnblock=", this.b);
        com.github.rudroid.m0.A(o, this.c, ", viewerIsFollowing=", this.d, ", isFollowingViewer=");
        return com.github.rudroid.m0.l(o, this.e, ", __typename=", this.f, ")");
    }
}
