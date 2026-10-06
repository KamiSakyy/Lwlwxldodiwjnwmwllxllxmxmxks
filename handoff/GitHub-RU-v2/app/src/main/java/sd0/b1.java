package sd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 implements aa.h0 {
    public final String a;
    public final boolean b;
    public final a1 c;
    public final String d;

    public b1(String str, boolean z, a1 a1Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = a1Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.a, b1Var.a) && this.b == b1Var.b && k71.k.b(this.c, b1Var.c) && k71.k.b(this.d, b1Var.d);
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
    public Object j(Object p1) { return null; }
}
