package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z6 implements aa.h0 {
    public String a;
    public boolean b;
    public y6 c;
    public String d;

    public z6(String str, boolean z, y6 y6Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = y6Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return k71.k.b(this.a, z6Var.a) && this.b == z6Var.b && k71.k.b(this.c, z6Var.c) && k71.k.b(this.d, z6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a0.s0.b(this.c.a, x.i.e(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("UserFollowersFragment(id=", this.a, ", viewerIsFollowing=", ", followers=", this.b);
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
