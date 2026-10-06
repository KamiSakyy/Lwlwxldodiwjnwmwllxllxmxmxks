package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d6 implements aa.h0 {
    public final String a;
    public final boolean b;
    public final c6 c;
    public final String d;

    public d6(String str, boolean z, c6 c6Var, String str2) {
        this.a = str;
        this.b = z;
        this.c = c6Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return k71.k.b(this.a, d6Var.a) && this.b == d6Var.b && k71.k.b(this.c, d6Var.c) && k71.k.b(this.d, d6Var.d);
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
