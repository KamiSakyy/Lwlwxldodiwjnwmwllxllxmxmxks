package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s6 implements aa.h0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;

    public s6(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
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
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return k71.k.b(this.a, s6Var.a) && this.b == s6Var.b && this.c == s6Var.c && this.d == s6Var.d && this.e == s6Var.e && k71.k.b(this.f, s6Var.f);
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
